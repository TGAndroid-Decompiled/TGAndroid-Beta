package org.scilab.forge.jlatexmath;

public class InvalidTeXFormulaException extends JMathTeXException {
    private static final long serialVersionUID = -1360488533073280569L;

    public InvalidTeXFormulaException(String str) {
        super(str);
    }
}
