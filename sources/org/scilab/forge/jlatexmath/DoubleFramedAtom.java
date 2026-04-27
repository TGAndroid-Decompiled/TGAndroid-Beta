package org.scilab.forge.jlatexmath;

public class DoubleFramedAtom extends FBoxAtom {
    public DoubleFramedAtom(Atom atom) {
        super(atom);
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box boxCreateBox = this.base.createBox(teXEnvironment);
        float defaultRuleThickness = teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
        float factor = this.INTERSPACE * SpaceAtom.getFactor(0, teXEnvironment);
        float f = 1.5f * defaultRuleThickness;
        return new FramedBox(new FramedBox(boxCreateBox, defaultRuleThickness * 0.75f, factor), f, (SpaceAtom.getFactor(3, teXEnvironment) * 0.5f) + f);
    }
}
