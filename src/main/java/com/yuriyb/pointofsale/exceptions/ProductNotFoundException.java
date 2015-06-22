package com.yuriyb.pointofsale.exceptions;

/**
 * UndefinedProductException class. Written checked exception.
 * @version 1.05 22 June 2015
 * @author  Yuriy B.
 */
public class ProductNotFoundException extends Exception {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2892594339356126640L;

	/**
     * Creates UndefinedProductException instance
     */
	public ProductNotFoundException(){		
	}
	
	/**
     * Creates UndefinedProductException instance and put the parameter into super class instance
     */
	public ProductNotFoundException(String message){
		super(message);
	}
}