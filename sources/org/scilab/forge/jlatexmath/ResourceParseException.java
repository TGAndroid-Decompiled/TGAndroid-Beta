package org.scilab.forge.jlatexmath;

public abstract class ResourceParseException extends JMathTeXException {
    protected ResourceParseException(String str) {
        super(str);
    }

    protected ResourceParseException(String str, Throwable th) {
        super(str, th);
    }
}
