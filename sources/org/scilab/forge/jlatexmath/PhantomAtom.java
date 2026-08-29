package org.scilab.forge.jlatexmath;
public class PhantomAtom extends Atom implements Row {
    private boolean d;
    private RowAtom elements;
    private boolean h;
    private boolean f19593w;

    public PhantomAtom(Atom atom) {
        this.f19593w = true;
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
        float f9;
        float f10;
        Box createBox = this.elements.createBox(teXEnvironment);
        float f11 = 0.0f;
        if (this.f19593w) {
            f9 = createBox.getWidth();
        } else {
            f9 = 0.0f;
        }
        if (this.h) {
            f10 = createBox.getHeight();
        } else {
            f10 = 0.0f;
        }
        if (this.d) {
            f11 = createBox.getDepth();
        }
        return new StrutBox(f9, f10, f11, createBox.getShift());
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

    public PhantomAtom(Atom atom, boolean z10, boolean z11, boolean z12) {
        this(atom);
        this.f19593w = z10;
        this.h = z11;
        this.d = z12;
    }
}
