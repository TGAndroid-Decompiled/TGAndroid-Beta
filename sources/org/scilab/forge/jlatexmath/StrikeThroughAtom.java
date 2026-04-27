package org.scilab.forge.jlatexmath;

public class StrikeThroughAtom extends Atom {
    private Atom at;

    public StrikeThroughAtom(Atom atom) {
        this.at = atom;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        float axisHeight = teXFont.getAxisHeight(style);
        float defaultRuleThickness = teXFont.getDefaultRuleThickness(style);
        Box boxCreateBox = this.at.createBox(teXEnvironment);
        HorizontalRule horizontalRule = new HorizontalRule(defaultRuleThickness, boxCreateBox.getWidth(), (-axisHeight) + defaultRuleThickness, false);
        HorizontalBox horizontalBox = new HorizontalBox();
        horizontalBox.add(boxCreateBox);
        horizontalBox.add(new StrutBox(-boxCreateBox.getWidth(), 0.0f, 0.0f, 0.0f));
        horizontalBox.add(horizontalRule);
        return horizontalBox;
    }
}
