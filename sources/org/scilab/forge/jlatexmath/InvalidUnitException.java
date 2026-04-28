package org.scilab.forge.jlatexmath;

public class InvalidUnitException extends JMathTeXException {
    private static final long serialVersionUID = 860909774647515072L;

    protected InvalidUnitException() {
        super("The delimiter type was not valid! Use one of the unit constants from the class 'TeXConstants'.");
    }
}
