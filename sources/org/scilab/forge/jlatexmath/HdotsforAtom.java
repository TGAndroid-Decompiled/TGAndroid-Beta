package org.scilab.forge.jlatexmath;
public class HdotsforAtom extends MulticolumnAtom {
    private static final Atom ldotp = SymbolAtom.get("ldotp");
    private static final Atom thin = new SpaceAtom(1);
    private float coeff;

    public HdotsforAtom(int i10, float f7) {
        super(i10, "c", ldotp);
        this.coeff = f7;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        StrutBox strutBox = new StrutBox(thin.createBox(teXEnvironment).getWidth() * this.coeff, 0.0f, 0.0f, 0.0f);
        HorizontalBox horizontalBox = new HorizontalBox(strutBox);
        horizontalBox.add(ldotp.createBox(teXEnvironment));
        horizontalBox.add(strutBox);
        if (this.f14617w != 0.0f) {
            float width = horizontalBox.getWidth();
            float f7 = (width <= 0.0f || Float.isInfinite(width) || Float.isNaN(width) || this.f14617w > 65536.0f) ? 0.0f : 0.0f;
            HorizontalBox horizontalBox2 = new HorizontalBox(horizontalBox);
            int i10 = 0;
            while (horizontalBox2.getWidth() < f7) {
                int i11 = i10 + 1;
                if (i10 >= 65536) {
                    break;
                }
                horizontalBox2.add(horizontalBox);
                i10 = i11;
            }
            if (f7 != 0.0f) {
                horizontalBox = new HorizontalBox(horizontalBox2, f7, 2);
            } else {
                horizontalBox = horizontalBox2;
            }
        }
        horizontalBox.type = 12;
        return horizontalBox;
    }
}
