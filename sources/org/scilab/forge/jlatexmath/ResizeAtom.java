package org.scilab.forge.jlatexmath;

public class ResizeAtom extends Atom {
    private Atom base;
    private float h;
    private int hunit;
    private boolean keepaspectratio;
    private float w;
    private int wunit;

    public ResizeAtom(Atom atom, String str, String str2, boolean z) {
        this.type = atom.type;
        this.base = atom;
        this.keepaspectratio = z;
        float[] length = SpaceAtom.getLength(str == null ? "" : str);
        float[] length2 = SpaceAtom.getLength(str2 == null ? "" : str2);
        if (length.length != 2) {
            this.wunit = -1;
        } else {
            this.wunit = (int) length[0];
            this.w = length[1];
        }
        if (length2.length != 2) {
            this.hunit = -1;
        } else {
            this.hunit = (int) length2[0];
            this.h = length2[1];
        }
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        float factor;
        float f;
        double dMin;
        double d;
        double d2;
        Box boxCreateBox = this.base.createBox(teXEnvironment);
        int i = this.wunit;
        if (i == -1 && this.hunit == -1) {
            return boxCreateBox;
        }
        if (i != -1 && this.hunit != -1) {
            double factor2 = (SpaceAtom.getFactor(i, teXEnvironment) * this.w) / boxCreateBox.width;
            double factor3 = (SpaceAtom.getFactor(this.hunit, teXEnvironment) * this.h) / boxCreateBox.height;
            if (this.keepaspectratio) {
                dMin = Math.min(factor2, factor3);
            } else {
                d = factor3;
                d2 = factor2;
            }
            return new ScaleBox(boxCreateBox, d2, d);
        }
        if (i == -1 || this.hunit != -1) {
            factor = SpaceAtom.getFactor(this.hunit, teXEnvironment) * this.h;
            f = boxCreateBox.height;
        } else {
            factor = SpaceAtom.getFactor(i, teXEnvironment) * this.w;
            f = boxCreateBox.width;
        }
        dMin = factor / f;
        d2 = dMin;
        d = d2;
        return new ScaleBox(boxCreateBox, d2, d);
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
