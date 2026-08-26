package org.scilab.forge.jlatexmath;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;

public class FormulaNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 7660105446051204466L;

    public FormulaNotFoundException(String str) {
        super(SurfaceContainer$$ExternalSyntheticOutline0.m("There's no predefined TeXFormula with the name '", str, "' defined in 'PredefinedTeXFormulas.xml'!"));
    }
}
