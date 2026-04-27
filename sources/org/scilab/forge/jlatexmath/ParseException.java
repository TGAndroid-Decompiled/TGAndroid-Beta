package org.scilab.forge.jlatexmath;

public class ParseException extends JMathTeXException {
    public ParseException(String str, Throwable th) {
        super(str, th);
    }

    public ParseException(String str) {
        super(str);
    }
}
