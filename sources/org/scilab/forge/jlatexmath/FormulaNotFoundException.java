package org.scilab.forge.jlatexmath;

import a4.w;
public class FormulaNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 7660105446051204466L;

    public FormulaNotFoundException(String str) {
        super(w.n("There's no predefined TeXFormula with the name '", str, "' defined in 'PredefinedTeXFormulas.xml'!"));
    }
}
