package org.scilab.forge.jlatexmath;

public abstract class XLeftRightArrowFactory {
    private static final Atom MINUS = SymbolAtom.get("minus");
    private static final Atom LEFT = SymbolAtom.get("leftarrow");
    private static final Atom RIGHT = SymbolAtom.get("rightarrow");

    public static Box create(boolean z, TeXEnvironment teXEnvironment, float f) {
        float f2;
        Box boxCreateBox = (z ? LEFT : RIGHT).createBox(teXEnvironment);
        float height = boxCreateBox.getHeight();
        float depth = boxCreateBox.getDepth();
        float width = boxCreateBox.getWidth();
        if (f <= width) {
            boxCreateBox.setDepth(depth / 2.0f);
            return boxCreateBox;
        }
        Box boxCreateBox2 = new SmashedAtom(MINUS, "").createBox(teXEnvironment);
        Box boxCreateBox3 = new SpaceAtom(5, -4.0f, 0.0f, 0.0f).createBox(teXEnvironment);
        float width2 = boxCreateBox2.getWidth() + boxCreateBox3.getWidth();
        float width3 = width + boxCreateBox3.getWidth();
        HorizontalBox horizontalBox = new HorizontalBox();
        float f3 = 0.0f;
        while (true) {
            f2 = f - width3;
            if (f3 >= f2 - width2) {
                break;
            }
            horizontalBox.add(boxCreateBox2);
            horizontalBox.add(boxCreateBox3);
            f3 += width2;
        }
        float width4 = (f2 - f3) / boxCreateBox2.getWidth();
        float f4 = (-2.0f) * width4;
        horizontalBox.add(new SpaceAtom(5, f4, 0.0f, 0.0f).createBox(teXEnvironment));
        horizontalBox.add(new ScaleAtom(MINUS, width4, 1.0d).createBox(teXEnvironment));
        if (z) {
            horizontalBox.add(0, new SpaceAtom(5, -3.5f, 0.0f, 0.0f).createBox(teXEnvironment));
            horizontalBox.add(0, boxCreateBox);
        } else {
            horizontalBox.add(new SpaceAtom(5, f4 - 2.0f, 0.0f, 0.0f).createBox(teXEnvironment));
            horizontalBox.add(boxCreateBox);
        }
        horizontalBox.setDepth(depth / 2.0f);
        horizontalBox.setHeight(height);
        return horizontalBox;
    }

    public static Box create(TeXEnvironment teXEnvironment, float f) {
        Box boxCreateBox = LEFT.createBox(teXEnvironment);
        Box boxCreateBox2 = RIGHT.createBox(teXEnvironment);
        float width = boxCreateBox.getWidth() + boxCreateBox2.getWidth();
        float f2 = 0.0f;
        if (f < width) {
            HorizontalBox horizontalBox = new HorizontalBox(boxCreateBox);
            horizontalBox.add(new StrutBox(-Math.min(width - f, boxCreateBox.getWidth()), 0.0f, 0.0f, 0.0f));
            horizontalBox.add(boxCreateBox2);
            return horizontalBox;
        }
        Box boxCreateBox3 = new SmashedAtom(MINUS, "").createBox(teXEnvironment);
        Box boxCreateBox4 = new SpaceAtom(5, -3.4f, 0.0f, 0.0f).createBox(teXEnvironment);
        float width2 = boxCreateBox3.getWidth() + boxCreateBox4.getWidth();
        float width3 = width + (boxCreateBox4.getWidth() * 2.0f);
        HorizontalBox horizontalBox2 = new HorizontalBox();
        while (true) {
            if (f2 < (f - width3) - width2) {
                horizontalBox2.add(boxCreateBox3);
                horizontalBox2.add(boxCreateBox4);
                f2 += width2;
            } else {
                horizontalBox2.add(new ScaleBox(boxCreateBox3, (r6 - f2) / boxCreateBox3.getWidth(), 1.0d));
                horizontalBox2.add(0, boxCreateBox4);
                horizontalBox2.add(0, boxCreateBox);
                horizontalBox2.add(boxCreateBox4);
                horizontalBox2.add(boxCreateBox2);
                return horizontalBox2;
            }
        }
    }
}
