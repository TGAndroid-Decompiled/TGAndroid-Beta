package org.scilab.forge.jlatexmath;

public class InvalidDelimiterException extends JMathTeXException {
    private static final long serialVersionUID = 212553180078002724L;

    protected InvalidDelimiterException(String str) {
        super("The symbol with the name '" + str + "' is not defined as a delimiter (del='true') in 'TeXSymbols.xml'!");
    }

    protected InvalidDelimiterException(char c, String str) {
        super("The character '" + c + "' is mapped to a symbol with the name '" + str + "', but that symbol is not defined as a delimiter (del='true') in 'TeXSymbols.xml'!");
    }
}
