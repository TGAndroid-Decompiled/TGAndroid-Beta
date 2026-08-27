package org.scilab.forge.jlatexmath;

public class PhantomAtom extends Atom implements Row {
    private boolean d;
    private RowAtom elements;
    private boolean h;

    private boolean f19595w;

    public PhantomAtom(Atom atom) {
        this.f19595w = true;
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
        Box boxCreateBox = this.elements.createBox(teXEnvironment);
        return new StrutBox(this.f19595w ? boxCreateBox.getWidth() : 0.0f, this.h ? boxCreateBox.getHeight() : 0.0f, this.d ? boxCreateBox.getDepth() : 0.0f, boxCreateBox.getShift());
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
        this.f19595w = z10;
        this.h = z11;
        this.d = z12;
    }
}
