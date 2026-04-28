package org.scilab.forge.jlatexmath;

public class SymbolMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 2659192520874275262L;

    protected SymbolMappingNotFoundException(String str) {
        super("No mapping found for the symbol '" + str + "'! Insert a <SymbolMapping>-element in 'DefaultTeXFont.xml'.");
    }
}
