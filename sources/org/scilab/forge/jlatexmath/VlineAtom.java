package org.scilab.forge.jlatexmath;
public class VlineAtom extends Atom {
    private float height;
    private int f21150n;
    private float shift;

    public VlineAtom(int i7) {
        this.f21150n = i7;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        int i7;
        if (this.f21150n != 0) {
            float defaultRuleThickness = teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
            HorizontalRule horizontalRule = new HorizontalRule(this.height, defaultRuleThickness, this.shift);
            StrutBox strutBox = new StrutBox(defaultRuleThickness * 2.0f, 0.0f, 0.0f, 0.0f);
            HorizontalBox horizontalBox = new HorizontalBox();
            int i10 = 0;
            while (true) {
                i7 = this.f21150n;
                if (i10 >= i7 - 1) {
                    break;
                }
                horizontalBox.add(horizontalRule);
                horizontalBox.add(strutBox);
                i10++;
            }
            if (i7 > 0) {
                horizontalBox.add(horizontalRule);
            }
            return horizontalBox;
        }
        return new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public float getWidth(TeXEnvironment teXEnvironment) {
        if (this.f21150n != 0) {
            return teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle()) * ((this.f21150n * 3) - 2);
        }
        return 0.0f;
    }

    public void setHeight(float f10) {
        this.height = f10;
    }

    public void setShift(float f10) {
        this.shift = f10;
    }
}
