package org.scilab.forge.jlatexmath;
public class ResizeAtom extends Atom {
    private Atom base;
    private float h;
    private int hunit;
    private boolean keepaspectratio;
    private float f19625w;
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
            this.f19625w = length[1];
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
        float f10;
        double d;
        double d9;
        double d10;
        Box createBox = this.base.createBox(teXEnvironment);
        int i9 = this.wunit;
        if (i9 == -1 && this.hunit == -1) {
            return createBox;
        }
        if (i9 != -1 && this.hunit != -1) {
            double factor2 = (SpaceAtom.getFactor(i9, teXEnvironment) * this.f19625w) / createBox.width;
            double factor3 = (SpaceAtom.getFactor(this.hunit, teXEnvironment) * this.h) / createBox.height;
            if (this.keepaspectratio) {
                d = Math.min(factor2, factor3);
            } else {
                d9 = factor3;
                d10 = factor2;
                return new ScaleBox(createBox, d10, d9);
            }
        } else {
            if (i9 != -1 && this.hunit == -1) {
                factor = SpaceAtom.getFactor(i9, teXEnvironment) * this.f19625w;
                f10 = createBox.width;
            } else {
                factor = SpaceAtom.getFactor(this.hunit, teXEnvironment) * this.h;
                f10 = createBox.height;
            }
            d = factor / f10;
        }
        d10 = d;
        d9 = d10;
        return new ScaleBox(createBox, d10, d9);
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
