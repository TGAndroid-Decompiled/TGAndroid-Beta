package org.scilab.forge.jlatexmath;
public class MonoScaleAtom extends ScaleAtom {
    private float factor;

    public MonoScaleAtom(org.scilab.forge.jlatexmath.Atom r7, float r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.scilab.forge.jlatexmath.MonoScaleAtom.<init>(org.scilab.forge.jlatexmath.Atom, float):void");
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXEnvironment copy = teXEnvironment.copy();
        float scaleFactor = copy.getScaleFactor();
        copy.setScaleFactor(this.factor);
        return new ScaleBox(this.base.createBox(copy), this.factor / scaleFactor);
    }
}
