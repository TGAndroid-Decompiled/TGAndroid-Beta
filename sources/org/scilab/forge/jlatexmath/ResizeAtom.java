package org.scilab.forge.jlatexmath;
public class ResizeAtom extends Atom {
    private Atom base;
    private float h;
    private int hunit;
    private boolean keepaspectratio;
    private float f19596w;
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
            this.f19596w = length[1];
        }
        if (length2.length != 2) {
            this.hunit = -1;
            return;
        }
        this.hunit = (int) length2[0];
        this.h = length2[1];
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        float factor;
        float f9;
        double d;
        double d10;
        double d11;
        Box createBox = this.base.createBox(teXEnvironment);
        int i10 = this.wunit;
        if (i10 == -1 && this.hunit == -1) {
            return createBox;
        }
        if (i10 != -1 && this.hunit != -1) {
            double factor2 = (SpaceAtom.getFactor(i10, teXEnvironment) * this.f19596w) / createBox.width;
            double factor3 = (SpaceAtom.getFactor(this.hunit, teXEnvironment) * this.h) / createBox.height;
            if (this.keepaspectratio) {
                d = Math.min(factor2, factor3);
            } else {
                d10 = factor3;
                d11 = factor2;
                return new ScaleBox(createBox, d11, d10);
            }
        } else {
            if (i10 != -1 && this.hunit == -1) {
                factor = SpaceAtom.getFactor(i10, teXEnvironment) * this.f19596w;
                f9 = createBox.width;
            } else {
                factor = SpaceAtom.getFactor(this.hunit, teXEnvironment) * this.h;
                f9 = createBox.height;
            }
            d = factor / f9;
        }
        d11 = d;
        d10 = d11;
        return new ScaleBox(createBox, d11, d10);
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
