package org.scilab.forge.jlatexmath;

public class InvalidSymbolTypeException extends JMathTeXException {
    private static final long serialVersionUID = 6679471054726869590L;

    public InvalidSymbolTypeException(String str) {
        super(str);
    }
}
