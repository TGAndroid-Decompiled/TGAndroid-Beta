package org.scilab.forge.jlatexmath;
public class VlineAtom extends Atom {
    private float height;
    private int f16654n;
    private float shift;

    public VlineAtom(int i10) {
        this.f16654n = i10;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        int i10;
        if (this.f16654n != 0) {
            float defaultRuleThickness = teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
            HorizontalRule horizontalRule = new HorizontalRule(this.height, defaultRuleThickness, this.shift);
            StrutBox strutBox = new StrutBox(defaultRuleThickness * 2.0f, 0.0f, 0.0f, 0.0f);
            HorizontalBox horizontalBox = new HorizontalBox();
            int i11 = 0;
            while (true) {
                i10 = this.f16654n;
                if (i11 >= i10 - 1) {
                    break;
                }
                horizontalBox.add(horizontalRule);
                horizontalBox.add(strutBox);
                i11++;
            }
            if (i10 > 0) {
                horizontalBox.add(horizontalRule);
            }
            return horizontalBox;
        }
        return new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public float getWidth(TeXEnvironment teXEnvironment) {
        if (this.f16654n != 0) {
            return teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle()) * ((this.f16654n * 3) - 2);
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
