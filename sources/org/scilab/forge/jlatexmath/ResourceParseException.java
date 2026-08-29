package org.scilab.forge.jlatexmath;
public class ResourceParseException extends JMathTeXException {
    private static final long serialVersionUID = -7083164592631533649L;

    public ResourceParseException(String str) {
        super(str);
    }

    public ResourceParseException(String str, Throwable th2) {
        super(str, th2);
    }
}
