package org.scilab.forge.jlatexmath;
public class FcscoreAtom extends Atom {
    private int N;

    public FcscoreAtom(int i9) {
        this.N = i9;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        int i9;
        boolean z10;
        float factor = SpaceAtom.getFactor(5, teXEnvironment) * 12.0f;
        int i10 = this.N;
        if (i10 == 5) {
            i9 = 4;
        } else {
            i9 = i10;
        }
        float f10 = 1.0f * factor;
        float f11 = 0.07f * factor;
        float f12 = factor * 0.125f;
        if (i10 == 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new FcscoreBox(i9, f10, f11, f12, z10);
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
