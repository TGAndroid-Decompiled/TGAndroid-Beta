package org.scilab.forge.jlatexmath;
public class BigOperatorAtom extends Atom {
    protected Atom base;
    private boolean limits;
    private boolean limitsSet;
    private Atom over;
    private Atom under;

    public BigOperatorAtom(Atom atom, Atom atom2, Atom atom3) {
        this.limitsSet = false;
        this.limits = false;
        this.base = atom;
        this.under = atom2;
        this.over = atom3;
        this.type = 1;
    }

    private static Box changeWidth(Box box, float f10) {
        if (box != null && Math.abs(f10 - box.getWidth()) > 1.0E-7f) {
            return new HorizontalBox(box, f10, 2);
        }
        return box;
    }

    @Override
    public org.scilab.forge.jlatexmath.Box createBox(org.scilab.forge.jlatexmath.TeXEnvironment r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.scilab.forge.jlatexmath.BigOperatorAtom.createBox(org.scilab.forge.jlatexmath.TeXEnvironment):org.scilab.forge.jlatexmath.Box");
    }

    public BigOperatorAtom(Atom atom, Atom atom2, Atom atom3, boolean z4) {
        this(atom, atom2, atom3);
        this.limits = z4;
        this.limitsSet = true;
    }
}
