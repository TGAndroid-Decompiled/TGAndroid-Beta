package org.scilab.forge.jlatexmath;

public class ParseException extends JMathTeXException {
    private static final long serialVersionUID = -3498558910250213782L;

    public ParseException(String str, Throwable th) {
        super(str, th);
    }

    public ParseException(String str) {
        super(str);
    }
}
