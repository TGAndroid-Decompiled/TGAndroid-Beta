package org.scilab.forge.jlatexmath;
public class PhantomAtom extends Atom implements Row {
    private boolean d;
    private RowAtom elements;
    private boolean h;
    private boolean f16642w;

    public PhantomAtom(Atom atom) {
        this.f16642w = true;
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
        float f10;
        float f11;
        Box createBox = this.elements.createBox(teXEnvironment);
        float f12 = 0.0f;
        if (this.f16642w) {
            f10 = createBox.getWidth();
        } else {
            f10 = 0.0f;
        }
        if (this.h) {
            f11 = createBox.getHeight();
        } else {
            f11 = 0.0f;
        }
        if (this.d) {
            f12 = createBox.getDepth();
        }
        return new StrutBox(f10, f11, f12, createBox.getShift());
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

    public PhantomAtom(Atom atom, boolean z4, boolean z10, boolean z11) {
        this(atom);
        this.f16642w = z4;
        this.h = z10;
        this.d = z11;
    }
}
