package org.scilab.forge.jlatexmath;
public class HdotsforAtom extends MulticolumnAtom {
    private static final Atom ldotp = SymbolAtom.get("ldotp");
    private static final Atom thin = new SpaceAtom(1);
    private float coeff;

    public HdotsforAtom(int i3, float f10) {
        super(i3, "c", ldotp);
        this.coeff = f10;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        StrutBox strutBox = new StrutBox(thin.createBox(teXEnvironment).getWidth() * this.coeff, 0.0f, 0.0f, 0.0f);
        HorizontalBox horizontalBox = new HorizontalBox(strutBox);
        horizontalBox.add(ldotp.createBox(teXEnvironment));
        horizontalBox.add(strutBox);
        if (this.f21190w != 0.0f) {
            float width = horizontalBox.getWidth();
            float f10 = this.f21190w;
            if (width <= 0.0f || Float.isInfinite(width) || Float.isNaN(width) || f10 > 65536.0f) {
                f10 = 0.0f;
            }
            HorizontalBox horizontalBox2 = new HorizontalBox(horizontalBox);
            int i3 = 0;
            while (horizontalBox2.getWidth() < f10) {
                int i10 = i3 + 1;
                if (i3 >= 65536) {
                    break;
                }
                horizontalBox2.add(horizontalBox);
                i3 = i10;
            }
            if (f10 != 0.0f) {
                horizontalBox = new HorizontalBox(horizontalBox2, f10, 2);
            } else {
                horizontalBox = horizontalBox2;
            }
        }
        horizontalBox.type = 12;
        return horizontalBox;
    }
}
