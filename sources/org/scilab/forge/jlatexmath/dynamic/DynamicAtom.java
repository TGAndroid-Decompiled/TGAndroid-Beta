package org.scilab.forge.jlatexmath.dynamic;

import org.scilab.forge.jlatexmath.Atom;
import org.scilab.forge.jlatexmath.Box;
import org.scilab.forge.jlatexmath.EmptyAtom;
import org.scilab.forge.jlatexmath.StrutBox;
import org.scilab.forge.jlatexmath.TeXEnvironment;
import org.scilab.forge.jlatexmath.TeXFormula;

public class DynamicAtom extends Atom {
    private String externalCode;
    private TeXFormula formula = new TeXFormula();
    private boolean insert;
    private boolean refreshed;

    public static boolean hasAnExternalConverterFactory() {
        return false;
    }

    public DynamicAtom(String str, String str2) {
        this.externalCode = str;
        if (str2 == null || !str2.equals("i")) {
            return;
        }
        this.insert = true;
    }

    public boolean getInsertMode() {
        return this.insert;
    }

    public Atom getAtom() {
        if (!this.refreshed) {
            throw null;
        }
        Atom atom = this.formula.root;
        return atom == null ? new EmptyAtom() : atom;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        return new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
