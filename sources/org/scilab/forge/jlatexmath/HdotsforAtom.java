package org.scilab.forge.jlatexmath;

public class HdotsforAtom extends MulticolumnAtom {
    private static final Atom ldotp = SymbolAtom.get("ldotp");
    private static final Atom thin = new SpaceAtom(1);
    private float coeff;

    public HdotsforAtom(int i, float f) {
        super(i, "c", ldotp);
        this.coeff = f;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        StrutBox strutBox = new StrutBox(thin.createBox(teXEnvironment).getWidth() * this.coeff, 0.0f, 0.0f, 0.0f);
        HorizontalBox horizontalBox = new HorizontalBox(strutBox);
        horizontalBox.add(ldotp.createBox(teXEnvironment));
        horizontalBox.add(strutBox);
        if (this.w != 0.0f) {
            float width = horizontalBox.getWidth();
            float f = this.w;
            if (width <= 0.0f || Float.isInfinite(width) || Float.isNaN(width) || f > 65536.0f) {
                f = 0.0f;
            }
            HorizontalBox horizontalBox2 = new HorizontalBox(horizontalBox);
            int i = 0;
            while (horizontalBox2.getWidth() < f) {
                int i2 = i + 1;
                if (i >= 65536) {
                    break;
                }
                horizontalBox2.add(horizontalBox);
                i = i2;
            }
            horizontalBox = f != 0.0f ? new HorizontalBox(horizontalBox2, f, 2) : horizontalBox2;
        }
        horizontalBox.type = 12;
        return horizontalBox;
    }
}
