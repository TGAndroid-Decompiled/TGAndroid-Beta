package org.scilab.forge.jlatexmath;

public class SymbolNotFoundException extends JMathTeXException {
    protected SymbolNotFoundException(String str) {
        super("There's no symbol with the name '" + str + "' defined in 'TeXSymbols.xml'!");
    }
}
