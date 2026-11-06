package org.scilab.forge.jlatexmath;
public class FcscoreAtom extends Atom {
    private int N;

    public FcscoreAtom(int i7) {
        this.N = i7;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        int i7;
        boolean z9;
        float factor = SpaceAtom.getFactor(5, teXEnvironment) * 12.0f;
        int i10 = this.N;
        if (i10 == 5) {
            i7 = 4;
        } else {
            i7 = i10;
        }
        float f10 = 1.0f * factor;
        float f11 = 0.07f * factor;
        float f12 = factor * 0.125f;
        if (i10 == 5) {
            z9 = true;
        } else {
            z9 = false;
        }
        return new FcscoreBox(i7, f10, f11, f12, z9);
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
