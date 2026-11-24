package org.scilab.forge.jlatexmath;
public class FcscoreAtom extends Atom {
    private int N;

    public FcscoreAtom(int i) {
        this.N = i;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        int i;
        boolean z;
        float factor = SpaceAtom.getFactor(5, teXEnvironment) * 12.0f;
        int i2 = this.N;
        if (i2 == 5) {
            i = 4;
        } else {
            i = i2;
        }
        float f = 1.0f * factor;
        float f2 = 0.07f * factor;
        float f3 = 0.125f * factor;
        if (i2 == 5) {
            z = true;
        } else {
            z = false;
        }
        return new FcscoreBox(i, f, f2, f3, z);
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
