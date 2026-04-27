package org.scilab.forge.jlatexmath;

public abstract class JMathTeXException extends RuntimeException {
    protected JMathTeXException(String str) {
        super(str);
    }

    protected JMathTeXException(String str, Throwable th) {
        super(str, th);
    }
}
