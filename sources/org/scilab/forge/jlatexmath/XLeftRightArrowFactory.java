package org.scilab.forge.jlatexmath;
public class XLeftRightArrowFactory {
    private static final Atom MINUS = SymbolAtom.get("minus");
    private static final Atom LEFT = SymbolAtom.get("leftarrow");
    private static final Atom RIGHT = SymbolAtom.get("rightarrow");

    public static Box create(TeXEnvironment teXEnvironment, float f10) {
        float f11 = 0.0f;
        float min = Math.min((Float.isInfinite(f10) || Float.isNaN(f10) || f10 < 0.0f) ? 0.0f : 0.0f, 4096.0f);
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
            float f12 = min - width3;
            if (f11 < f12 - width2) {
                horizontalBox2.add(createBox3);
                horizontalBox2.add(createBox4);
                f11 += width2;
            } else {
                horizontalBox2.add(new ScaleBox(createBox3, (f12 - f11) / createBox3.getWidth(), 1.0d));
                horizontalBox2.add(0, createBox4);
                horizontalBox2.add(0, createBox);
                horizontalBox2.add(createBox4);
                horizontalBox2.add(createBox2);
                return horizontalBox2;
            }
        }
    }

    public static Box create(boolean z10, TeXEnvironment teXEnvironment, float f10) {
        float f11;
        float min = Math.min((Float.isInfinite(f10) || Float.isNaN(f10) || f10 < 0.0f) ? 0.0f : f10, 4096.0f);
        Box createBox = (z10 ? LEFT : RIGHT).createBox(teXEnvironment);
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
        float f12 = 0.0f;
        while (true) {
            f11 = min - width3;
            if (f12 >= f11 - width2) {
                break;
            }
            horizontalBox.add(createBox2);
            horizontalBox.add(createBox3);
            f12 += width2;
        }
        float width4 = (f11 - f12) / createBox2.getWidth();
        float f13 = (-2.0f) * width4;
        horizontalBox.add(new SpaceAtom(5, f13, 0.0f, 0.0f).createBox(teXEnvironment));
        horizontalBox.add(new ScaleAtom(MINUS, width4, 1.0d).createBox(teXEnvironment));
        if (z10) {
            horizontalBox.add(0, new SpaceAtom(5, -3.5f, 0.0f, 0.0f).createBox(teXEnvironment));
            horizontalBox.add(0, createBox);
        } else {
            horizontalBox.add(new SpaceAtom(5, f13 - 2.0f, 0.0f, 0.0f).createBox(teXEnvironment));
            horizontalBox.add(createBox);
        }
        horizontalBox.setDepth(depth / 2.0f);
        horizontalBox.setHeight(height);
        return horizontalBox;
    }
}
