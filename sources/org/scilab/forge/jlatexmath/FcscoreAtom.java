package org.scilab.forge.jlatexmath;

public class FcscoreAtom extends Atom {
    private int N;

    @Override
    public int getLeftType() {
        return 0;
    }

    @Override
    public int getRightType() {
        return 0;
    }

    public FcscoreAtom(int i) {
        this.N = i;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        float factor = SpaceAtom.getFactor(5, teXEnvironment) * 12.0f;
        int i = this.N;
        return new FcscoreBox(i == 5 ? 4 : i, 1.0f * factor, 0.07f * factor, 0.125f * factor, i == 5);
    }
}
