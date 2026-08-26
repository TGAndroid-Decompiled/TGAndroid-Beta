package org.scilab.forge.jlatexmath;

public class RaiseAtom extends Atom {
    private Atom base;
    private float d;
    private int dunit;
    private float h;
    private int hunit;
    private float r;
    private int runit;

    public RaiseAtom(Atom atom, int i, float f, int i2, float f2, int i3, float f3) {
        this.base = atom;
        this.runit = i;
        this.r = f;
        this.hunit = i2;
        this.h = f2;
        this.dunit = i3;
        this.d = f3;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box boxCreateBox = this.base.createBox(teXEnvironment);
        int i = this.runit;
        if (i == -1) {
            boxCreateBox.setShift(0.0f);
        } else {
            boxCreateBox.setShift(SpaceAtom.getFactor(i, teXEnvironment) * (-this.r));
        }
        if (this.hunit == -1) {
            return boxCreateBox;
        }
        HorizontalBox horizontalBox = new HorizontalBox(boxCreateBox);
        horizontalBox.setHeight(SpaceAtom.getFactor(this.hunit, teXEnvironment) * this.h);
        int i2 = this.dunit;
        if (i2 == -1) {
            horizontalBox.setDepth(0.0f);
            return horizontalBox;
        }
        horizontalBox.setDepth(SpaceAtom.getFactor(i2, teXEnvironment) * this.d);
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
