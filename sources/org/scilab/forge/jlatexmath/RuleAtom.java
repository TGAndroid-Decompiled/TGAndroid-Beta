package org.scilab.forge.jlatexmath;
public class RuleAtom extends Atom {
    private static final float MAX_LENGTH = 4096.0f;
    private float h;
    private int hunit;
    private float f16648r;
    private int runit;
    private float f16649w;
    private int wunit;

    public RuleAtom(int i10, float f10, int i11, float f11, int i12, float f12) {
        this.wunit = i10;
        this.hunit = i11;
        this.runit = i12;
        this.f16649w = f10;
        this.h = f11;
        this.f16648r = f12;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        float factor = SpaceAtom.getFactor(this.wunit, teXEnvironment) * this.f16649w;
        float factor2 = SpaceAtom.getFactor(this.hunit, teXEnvironment) * this.h;
        float factor3 = SpaceAtom.getFactor(this.runit, teXEnvironment) * this.f16648r;
        return new HorizontalRule((Float.isInfinite(factor2) || Float.isNaN(factor2) || factor2 > 4096.0f) ? 4096.0f : 4096.0f, (Float.isInfinite(factor) || Float.isNaN(factor) || factor > 4096.0f) ? 4096.0f : 4096.0f, factor3);
    }
}
