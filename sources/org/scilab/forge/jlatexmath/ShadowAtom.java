package org.scilab.forge.jlatexmath;

public class ShadowAtom extends FBoxAtom {
    public ShadowAtom(Atom atom) {
        super(atom);
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        return new ShadowBox((FramedBox) super.createBox(teXEnvironment), teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle()) * 4.0f);
    }
}
