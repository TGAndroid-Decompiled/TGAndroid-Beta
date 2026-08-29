package org.scilab.forge.jlatexmath;
public class HlineAtom extends Atom {
    private float shift;
    private float width;

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        HorizontalRule horizontalRule = new HorizontalRule(teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle()), this.width, this.shift, false);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(horizontalRule);
        verticalBox.type = 13;
        return verticalBox;
    }

    public void setShift(float f9) {
        this.shift = f9;
    }

    public void setWidth(float f9) {
        this.width = f9;
    }
}
