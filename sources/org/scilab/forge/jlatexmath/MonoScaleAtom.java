package org.scilab.forge.jlatexmath;

public class MonoScaleAtom extends ScaleAtom {
    private float factor;

    public MonoScaleAtom(Atom atom, float f10) {
        double d = f10;
        super(atom, d, d);
        this.factor = f10;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXEnvironment teXEnvironmentCopy = teXEnvironment.copy();
        float scaleFactor = teXEnvironmentCopy.getScaleFactor();
        teXEnvironmentCopy.setScaleFactor(this.factor);
        return new ScaleBox(this.base.createBox(teXEnvironmentCopy), this.factor / scaleFactor);
    }
}
