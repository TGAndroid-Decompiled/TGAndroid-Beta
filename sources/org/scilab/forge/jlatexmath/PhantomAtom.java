package org.scilab.forge.jlatexmath;
public class PhantomAtom extends Atom implements Row {
    private boolean d;
    private RowAtom elements;
    private boolean h;
    private boolean w;

    public PhantomAtom(Atom atom) {
        this.w = true;
        this.h = true;
        this.d = true;
        if (atom == null) {
            this.elements = new RowAtom();
        } else {
            this.elements = new RowAtom(atom);
        }
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        float f;
        float f2;
        Box createBox = this.elements.createBox(teXEnvironment);
        float f3 = 0.0f;
        if (this.w) {
            f = createBox.getWidth();
        } else {
            f = 0.0f;
        }
        if (this.h) {
            f2 = createBox.getHeight();
        } else {
            f2 = 0.0f;
        }
        if (this.d) {
            f3 = createBox.getDepth();
        }
        return new StrutBox(f, f2, f3, createBox.getShift());
    }

    @Override
    public int getLeftType() {
        return this.elements.getLeftType();
    }

    @Override
    public int getRightType() {
        return this.elements.getRightType();
    }

    @Override
    public void setPreviousAtom(Dummy dummy) {
        this.elements.setPreviousAtom(dummy);
    }

    public PhantomAtom(Atom atom, boolean z, boolean z2, boolean z3) {
        this(atom);
        this.w = z;
        this.h = z2;
        this.d = z3;
    }
}
