package org.scilab.forge.jlatexmath;

public class RuleAtom extends Atom {
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
        return new HorizontalRule(this.h * SpaceAtom.getFactor(this.hunit, teXEnvironment), this.w * SpaceAtom.getFactor(this.wunit, teXEnvironment), this.r * SpaceAtom.getFactor(this.runit, teXEnvironment));
    }
}
