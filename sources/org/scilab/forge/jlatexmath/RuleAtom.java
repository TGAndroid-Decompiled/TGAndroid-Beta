package org.scilab.forge.jlatexmath;
public class RuleAtom extends Atom {
    private static final float MAX_LENGTH = 4096.0f;
    private float h;
    private int hunit;
    private float f17232r;
    private int runit;
    private float f17233w;
    private int wunit;

    public RuleAtom(int i10, float f7, int i11, float f10, int i12, float f11) {
        this.wunit = i10;
        this.hunit = i11;
        this.runit = i12;
        this.f17233w = f7;
        this.h = f10;
        this.f17232r = f11;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        float factor = SpaceAtom.getFactor(this.wunit, teXEnvironment) * this.f17233w;
        float factor2 = SpaceAtom.getFactor(this.hunit, teXEnvironment) * this.h;
        float factor3 = SpaceAtom.getFactor(this.runit, teXEnvironment) * this.f17232r;
        if (Float.isInfinite(factor) || Float.isNaN(factor) || factor > 4096.0f) {
            factor = 4096.0f;
        }
        if (Float.isInfinite(factor2) || Float.isNaN(factor2) || factor2 > 4096.0f) {
            factor2 = 4096.0f;
        }
        return new HorizontalRule(factor2, factor, factor3);
    }
}
