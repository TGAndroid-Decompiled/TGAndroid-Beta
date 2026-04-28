package org.scilab.forge.jlatexmath;

public class ResourceParseException extends JMathTeXException {
    private static final long serialVersionUID = -7083164592631533649L;

    protected ResourceParseException(String str) {
        super(str);
    }

    protected ResourceParseException(String str, Throwable th) {
        super(str, th);
    }
}
