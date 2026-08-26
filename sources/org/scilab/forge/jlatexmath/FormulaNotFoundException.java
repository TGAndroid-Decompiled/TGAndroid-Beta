package org.scilab.forge.jlatexmath;

import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;

public class FormulaNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 7660105446051204466L;

    public FormulaNotFoundException(String str) {
        super(Fragment$$ExternalSyntheticOutline0.m("There's no predefined TeXFormula with the name '", str, "' defined in 'PredefinedTeXFormulas.xml'!"));
    }
}
