package org.scilab.forge.jlatexmath;

public class RuleAtom extends Atom {
    private static final float MAX_LENGTH = 4096.0f;
    private float h;
    private int hunit;
    private float r;
    private int runit;
    private float w;
    private int wunit;

    public RuleAtom(int i, float f, int i2, float f2, int i3, float f3) {
        this.wunit = i;
        this.hunit = i2;
        this.runit = i3;
        this.w = f;
        this.h = f2;
        this.r = f3;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        float factor = this.w * SpaceAtom.getFactor(this.wunit, teXEnvironment);
        float factor2 = this.h * SpaceAtom.getFactor(this.hunit, teXEnvironment);
        float factor3 = this.r * SpaceAtom.getFactor(this.runit, teXEnvironment);
        if (!DelimiterFactory$$ExternalSyntheticBackport0.m(factor) || factor > 4096.0f) {
            factor = 4096.0f;
        }
        if (!DelimiterFactory$$ExternalSyntheticBackport0.m(factor2) || factor2 > 4096.0f) {
            factor2 = 4096.0f;
        }
        return new HorizontalRule(factor2, factor, factor3);
    }
}
