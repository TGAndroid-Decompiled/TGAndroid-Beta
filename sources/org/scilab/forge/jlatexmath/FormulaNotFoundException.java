package org.scilab.forge.jlatexmath;

public class FormulaNotFoundException extends JMathTeXException {
    protected FormulaNotFoundException(String str) {
        super("There's no predefined TeXFormula with the name '" + str + "' defined in 'PredefinedTeXFormulas.xml'!");
    }
}
