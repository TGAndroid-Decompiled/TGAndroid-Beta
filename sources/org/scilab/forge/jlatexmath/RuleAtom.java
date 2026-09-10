package org.scilab.forge.jlatexmath;
public class RuleAtom extends Atom {
    private static final float MAX_LENGTH = 4096.0f;
    private float h;
    private int hunit;
    private float f14624r;
    private int runit;
    private float f14625w;
    private int wunit;

    public RuleAtom(int i10, float f7, int i11, float f10, int i12, float f11) {
        this.wunit = i10;
        this.hunit = i11;
        this.runit = i12;
        this.f14625w = f7;
        this.h = f10;
        this.f14624r = f11;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        float factor = SpaceAtom.getFactor(this.wunit, teXEnvironment) * this.f14625w;
        float factor2 = SpaceAtom.getFactor(this.hunit, teXEnvironment) * this.h;
        float factor3 = SpaceAtom.getFactor(this.runit, teXEnvironment) * this.f14624r;
        return new HorizontalRule((Float.isInfinite(factor2) || Float.isNaN(factor2) || factor2 > 4096.0f) ? 4096.0f : 4096.0f, (Float.isInfinite(factor) || Float.isNaN(factor) || factor > 4096.0f) ? 4096.0f : 4096.0f, factor3);
    }
}
