package org.scilab.forge.jlatexmath;
public class RaiseAtom extends Atom {
    private Atom base;
    private float d;
    private int dunit;
    private float h;
    private int hunit;
    private float f18030r;
    private int runit;

    public RaiseAtom(Atom atom, int i10, float f10, int i11, float f11, int i12, float f12) {
        this.base = atom;
        this.runit = i10;
        this.f18030r = f10;
        this.hunit = i11;
        this.h = f11;
        this.dunit = i12;
        this.d = f12;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box createBox = this.base.createBox(teXEnvironment);
        int i10 = this.runit;
        if (i10 == -1) {
            createBox.setShift(0.0f);
        } else {
            createBox.setShift(SpaceAtom.getFactor(i10, teXEnvironment) * (-this.f18030r));
        }
        if (this.hunit == -1) {
            return createBox;
        }
        HorizontalBox horizontalBox = new HorizontalBox(createBox);
        horizontalBox.setHeight(SpaceAtom.getFactor(this.hunit, teXEnvironment) * this.h);
        int i11 = this.dunit;
        if (i11 == -1) {
            horizontalBox.setDepth(0.0f);
            return horizontalBox;
        }
        horizontalBox.setDepth(SpaceAtom.getFactor(i11, teXEnvironment) * this.d);
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
