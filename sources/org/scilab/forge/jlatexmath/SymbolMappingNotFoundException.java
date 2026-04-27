package org.scilab.forge.jlatexmath;

public class SymbolMappingNotFoundException extends JMathTeXException {
    protected SymbolMappingNotFoundException(String str) {
        super("No mapping found for the symbol '" + str + "'! Insert a <SymbolMapping>-element in 'DefaultTeXFont.xml'.");
    }
}
