package org.scilab.forge.jlatexmath;

public class TextStyleMappingNotFoundException extends JMathTeXException {
    protected TextStyleMappingNotFoundException(String str) {
        super("No mapping found for the text style '" + str + "'! Insert a <TextStyleMapping>-element in 'DefaultTeXFont.xml'.");
    }
}
