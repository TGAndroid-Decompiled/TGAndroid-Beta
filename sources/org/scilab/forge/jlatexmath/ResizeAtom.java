package org.scilab.forge.jlatexmath;

public class ResizeAtom extends Atom {
    private Atom base;
    private float h;
    private int hunit;
    private boolean keepaspectratio;

    private float f19598w;
    private int wunit;

    public ResizeAtom(Atom atom, String str, String str2, boolean z10) {
        this.type = atom.type;
        this.base = atom;
        this.keepaspectratio = z10;
        float[] length = SpaceAtom.getLength(str == null ? "" : str);
        float[] length2 = SpaceAtom.getLength(str2 == null ? "" : str2);
        if (length.length != 2) {
            this.wunit = -1;
        } else {
            this.wunit = (int) length[0];
            this.f19598w = length[1];
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
        float f10;
        double dMin;
        double d;
        double d10;
        Box boxCreateBox = this.base.createBox(teXEnvironment);
        int i10 = this.wunit;
        if (i10 == -1 && this.hunit == -1) {
            return boxCreateBox;
        }
        if (i10 != -1 && this.hunit != -1) {
            double factor2 = (SpaceAtom.getFactor(i10, teXEnvironment) * this.f19598w) / boxCreateBox.width;
            double factor3 = (SpaceAtom.getFactor(this.hunit, teXEnvironment) * this.h) / boxCreateBox.height;
            if (this.keepaspectratio) {
                dMin = Math.min(factor2, factor3);
            } else {
                d = factor3;
                d10 = factor2;
            }
            return new ScaleBox(boxCreateBox, d10, d);
        }
        if (i10 == -1 || this.hunit != -1) {
            factor = SpaceAtom.getFactor(this.hunit, teXEnvironment) * this.h;
            f10 = boxCreateBox.height;
        } else {
            factor = SpaceAtom.getFactor(i10, teXEnvironment) * this.f19598w;
            f10 = boxCreateBox.width;
        }
        dMin = factor / f10;
        d10 = dMin;
        d = d10;
        return new ScaleBox(boxCreateBox, d10, d);
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
