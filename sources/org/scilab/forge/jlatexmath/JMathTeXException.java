package org.scilab.forge.jlatexmath;

public class JMathTeXException extends RuntimeException {
    private static final long serialVersionUID = 6788678896908035811L;

    public JMathTeXException(String str) {
        super(str);
    }

    public JMathTeXException(String str, Throwable th) {
        super(str, th);
    }
}
