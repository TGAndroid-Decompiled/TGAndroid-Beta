package org.scilab.forge.jlatexmath;
public class DelimiterMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 273456491396361682L;

    public DelimiterMappingNotFoundException(char c3) {
        super("No mapping found for the character '" + c3 + "'! Insert a <Map>-element in 'TeXFormulaSettings.xml'.");
    }
}
