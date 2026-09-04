package org.scilab.forge.jlatexmath;
public class FcscoreAtom extends Atom {
    private int N;

    public FcscoreAtom(int i10) {
        this.N = i10;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        int i10;
        boolean z10;
        float factor = SpaceAtom.getFactor(5, teXEnvironment) * 12.0f;
        int i11 = this.N;
        if (i11 == 5) {
            i10 = 4;
        } else {
            i10 = i11;
        }
        float f7 = 1.0f * factor;
        float f10 = 0.07f * factor;
        float f11 = factor * 0.125f;
        if (i11 == 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new FcscoreBox(i10, f7, f10, f11, z10);
    }

    @Override
    public int getLeftType() {
        return 0;
    }

    @Override
    public int getRightType() {
        return 0;
    }
}
