package org.scilab.forge.jlatexmath;

class UnderlinedAtom extends Atom {
    private final Atom base;

    public UnderlinedAtom(Atom atom) {
        this.base = atom;
        this.type = 0;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        float defaultRuleThickness = teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
        Atom atom = this.base;
        Box strutBox = atom == null ? new StrutBox(0.0f, 0.0f, 0.0f, 0.0f) : atom.createBox(teXEnvironment);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(strutBox);
        verticalBox.add(new StrutBox(0.0f, 3.0f * defaultRuleThickness, 0.0f, 0.0f));
        verticalBox.add(new HorizontalRule(defaultRuleThickness, strutBox.getWidth(), 0.0f));
        verticalBox.setDepth((defaultRuleThickness * 5.0f) + strutBox.getDepth());
        verticalBox.setHeight(strutBox.getHeight());
        return verticalBox;
    }
}
