package org.scilab.forge.jlatexmath;
public class OverlinedAtom extends Atom {
    private final Atom base;

    public OverlinedAtom(Atom atom) {
        this.base = atom;
        this.type = 0;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box createBox;
        float defaultRuleThickness = teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
        Atom atom = this.base;
        if (atom == null) {
            createBox = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            createBox = atom.createBox(teXEnvironment.crampStyle());
        }
        OverBar overBar = new OverBar(createBox, 3.0f * defaultRuleThickness, defaultRuleThickness);
        overBar.setDepth(createBox.getDepth());
        overBar.setHeight((defaultRuleThickness * 5.0f) + createBox.getHeight());
        return overBar;
    }
}
