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
        StrutBox strutBox = new StrutBox(this.coeff * thin.createBox(teXEnvironment).getWidth(), 0.0f, 0.0f, 0.0f);
        HorizontalBox horizontalBox = new HorizontalBox(strutBox);
        horizontalBox.add(ldotp.createBox(teXEnvironment));
        horizontalBox.add(strutBox);
        if (this.w != 0.0f) {
            horizontalBox.getWidth();
            HorizontalBox horizontalBox2 = new HorizontalBox(horizontalBox);
            while (horizontalBox2.getWidth() < this.w) {
                horizontalBox2.add(horizontalBox);
            }
            horizontalBox = new HorizontalBox(horizontalBox2, this.w, 2);
        }
        horizontalBox.type = 12;
        return horizontalBox;
    }
}
