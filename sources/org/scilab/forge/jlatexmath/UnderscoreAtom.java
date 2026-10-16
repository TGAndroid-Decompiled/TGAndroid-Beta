package org.scilab.forge.jlatexmath;
public class UnderscoreAtom extends Atom {
    public static SpaceAtom f16385w = new SpaceAtom(0, 0.7f, 0.0f, 0.0f);
    public static SpaceAtom f16384s = new SpaceAtom(0, 0.06f, 0.0f, 0.0f);

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        float defaultRuleThickness = teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
        HorizontalBox horizontalBox = new HorizontalBox(f16384s.createBox(teXEnvironment));
        horizontalBox.add(new HorizontalRule(defaultRuleThickness, f16385w.createBox(teXEnvironment).getWidth(), 0.0f));
        return horizontalBox;
    }
}
