package org.scilab.forge.jlatexmath;

public class TextStyleMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 4887043712790844966L;

    protected TextStyleMappingNotFoundException(String str) {
        super("No mapping found for the text style '" + str + "'! Insert a <TextStyleMapping>-element in 'DefaultTeXFont.xml'.");
    }
}
