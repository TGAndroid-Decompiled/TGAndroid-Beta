package org.scilab.forge.jlatexmath;
public class RaiseAtom extends Atom {
    private Atom base;
    private float d;
    private int dunit;
    private float h;
    private int hunit;
    private float f19624r;
    private int runit;

    public RaiseAtom(Atom atom, int i9, float f10, int i10, float f11, int i11, float f12) {
        this.base = atom;
        this.runit = i9;
        this.f19624r = f10;
        this.hunit = i10;
        this.h = f11;
        this.dunit = i11;
        this.d = f12;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box createBox = this.base.createBox(teXEnvironment);
        int i9 = this.runit;
        if (i9 == -1) {
            createBox.setShift(0.0f);
        } else {
            createBox.setShift(SpaceAtom.getFactor(i9, teXEnvironment) * (-this.f19624r));
        }
        if (this.hunit == -1) {
            return createBox;
        }
        HorizontalBox horizontalBox = new HorizontalBox(createBox);
        horizontalBox.setHeight(SpaceAtom.getFactor(this.hunit, teXEnvironment) * this.h);
        int i10 = this.dunit;
        if (i10 == -1) {
            horizontalBox.setDepth(0.0f);
            return horizontalBox;
        }
        horizontalBox.setDepth(SpaceAtom.getFactor(i10, teXEnvironment) * this.d);
        return horizontalBox;
    }

    @Override
    public int getLeftType() {
        return this.base.getLeftType();
    }

    @Override
    public int getRightType() {
        return this.base.getRightType();
    }
}
