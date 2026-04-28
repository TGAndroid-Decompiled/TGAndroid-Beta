package org.scilab.forge.jlatexmath;

public class FormulaNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 7660105446051204466L;

    protected FormulaNotFoundException(String str) {
        super("There's no predefined TeXFormula with the name '" + str + "' defined in 'PredefinedTeXFormulas.xml'!");
    }
}
