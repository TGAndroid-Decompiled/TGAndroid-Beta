package org.scilab.forge.jlatexmath;
public class UnderscoreAtom extends Atom {
    public static SpaceAtom f14343w = new SpaceAtom(0, 0.7f, 0.0f, 0.0f);
    public static SpaceAtom f14342s = new SpaceAtom(0, 0.06f, 0.0f, 0.0f);

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        float defaultRuleThickness = teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
        HorizontalBox horizontalBox = new HorizontalBox(f14342s.createBox(teXEnvironment));
        horizontalBox.add(new HorizontalRule(defaultRuleThickness, f14343w.createBox(teXEnvironment).getWidth(), 0.0f));
        return horizontalBox;
    }
}
