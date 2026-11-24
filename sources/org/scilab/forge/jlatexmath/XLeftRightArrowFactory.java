package org.scilab.forge.jlatexmath;
public class XLeftRightArrowFactory {
    private static final Atom MINUS = SymbolAtom.get("minus");
    private static final Atom LEFT = SymbolAtom.get("leftarrow");
    private static final Atom RIGHT = SymbolAtom.get("rightarrow");

    public static Box create(boolean z, TeXEnvironment teXEnvironment, float f) {
        float f2;
        Atom atom;
        float f3;
        if (!Float.isInfinite(f) && !Float.isNaN(f) && f >= 0.0f) {
            f2 = f;
        } else {
            f2 = 0.0f;
        }
        float min = Math.min(f2, 4096.0f);
        if (z) {
            atom = LEFT;
        } else {
            atom = RIGHT;
        }
        Box createBox = atom.createBox(teXEnvironment);
        float height = createBox.getHeight();
        float depth = createBox.getDepth();
        float width = createBox.getWidth();
        if (min <= width) {
            createBox.setDepth(depth / 2.0f);
            return createBox;
        }
        Box createBox2 = new SmashedAtom(MINUS, "").createBox(teXEnvironment);
        Box createBox3 = new SpaceAtom(5, -4.0f, 0.0f, 0.0f).createBox(teXEnvironment);
        float width2 = createBox3.getWidth() + createBox2.getWidth();
        float width3 = createBox3.getWidth() + width;
        HorizontalBox horizontalBox = new HorizontalBox();
        float f4 = 0.0f;
        while (true) {
            f3 = min - width3;
            if (f4 >= f3 - width2) {
                break;
            }
            horizontalBox.add(createBox2);
            horizontalBox.add(createBox3);
            f4 += width2;
        }
        float width4 = (f3 - f4) / createBox2.getWidth();
        float f5 = (-2.0f) * width4;
        horizontalBox.add(new SpaceAtom(5, f5, 0.0f, 0.0f).createBox(teXEnvironment));
        horizontalBox.add(new ScaleAtom(MINUS, width4, 1.0d).createBox(teXEnvironment));
        if (z) {
            horizontalBox.add(0, new SpaceAtom(5, -3.5f, 0.0f, 0.0f).createBox(teXEnvironment));
            horizontalBox.add(0, createBox);
        } else {
            horizontalBox.add(new SpaceAtom(5, f5 - 2.0f, 0.0f, 0.0f).createBox(teXEnvironment));
            horizontalBox.add(createBox);
        }
        horizontalBox.setDepth(depth / 2.0f);
        horizontalBox.setHeight(height);
        return horizontalBox;
    }

    public static Box create(TeXEnvironment teXEnvironment, float f) {
        float f2;
        float f3 = 0.0f;
        if (Float.isInfinite(f) || Float.isNaN(f) || f < 0.0f) {
            f = 0.0f;
        }
        float min = Math.min(f, 4096.0f);
        Box createBox = LEFT.createBox(teXEnvironment);
        Box createBox2 = RIGHT.createBox(teXEnvironment);
        float width = createBox2.getWidth() + createBox.getWidth();
        if (min < width) {
            HorizontalBox horizontalBox = new HorizontalBox(createBox);
            horizontalBox.add(new StrutBox(-Math.min(width - min, createBox.getWidth()), 0.0f, 0.0f, 0.0f));
            horizontalBox.add(createBox2);
            return horizontalBox;
        }
        Box createBox3 = new SmashedAtom(MINUS, "").createBox(teXEnvironment);
        Box createBox4 = new SpaceAtom(5, -3.4f, 0.0f, 0.0f).createBox(teXEnvironment);
        float width2 = createBox4.getWidth() + createBox3.getWidth();
        float width3 = (createBox4.getWidth() * 2.0f) + width;
        HorizontalBox horizontalBox2 = new HorizontalBox();
        while (true) {
            if (f3 < (min - width3) - width2) {
                horizontalBox2.add(createBox3);
                horizontalBox2.add(createBox4);
                f3 += width2;
            } else {
                horizontalBox2.add(new ScaleBox(createBox3, (f2 - f3) / createBox3.getWidth(), 1.0d));
                horizontalBox2.add(0, createBox4);
                horizontalBox2.add(0, createBox);
                horizontalBox2.add(createBox4);
                horizontalBox2.add(createBox2);
                return horizontalBox2;
            }
        }
    }
}
