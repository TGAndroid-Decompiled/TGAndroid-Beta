package org.scilab.forge.jlatexmath;

public class XLeftRightArrowFactory {
    private static final Atom MINUS = SymbolAtom.get("minus");
    private static final Atom LEFT = SymbolAtom.get("leftarrow");
    private static final Atom RIGHT = SymbolAtom.get("rightarrow");

    public static Box create(TeXEnvironment teXEnvironment, float f10) {
        float f11 = 0.0f;
        if (Float.isInfinite(f10) || Float.isNaN(f10) || f10 < 0.0f) {
            f10 = 0.0f;
        }
        float fMin = Math.min(f10, 4096.0f);
        Box boxCreateBox = LEFT.createBox(teXEnvironment);
        Box boxCreateBox2 = RIGHT.createBox(teXEnvironment);
        float width = boxCreateBox2.getWidth() + boxCreateBox.getWidth();
        if (fMin < width) {
            HorizontalBox horizontalBox = new HorizontalBox(boxCreateBox);
            horizontalBox.add(new StrutBox(-Math.min(width - fMin, boxCreateBox.getWidth()), 0.0f, 0.0f, 0.0f));
            horizontalBox.add(boxCreateBox2);
            return horizontalBox;
        }
        Box boxCreateBox3 = new SmashedAtom(MINUS, "").createBox(teXEnvironment);
        Box boxCreateBox4 = new SpaceAtom(5, -3.4f, 0.0f, 0.0f).createBox(teXEnvironment);
        float width2 = boxCreateBox4.getWidth() + boxCreateBox3.getWidth();
        float width3 = (boxCreateBox4.getWidth() * 2.0f) + width;
        HorizontalBox horizontalBox2 = new HorizontalBox();
        while (true) {
            float f12 = fMin - width3;
            if (f11 >= f12 - width2) {
                horizontalBox2.add(new ScaleBox(boxCreateBox3, (f12 - f11) / boxCreateBox3.getWidth(), 1.0d));
                horizontalBox2.add(0, boxCreateBox4);
                horizontalBox2.add(0, boxCreateBox);
                horizontalBox2.add(boxCreateBox4);
                horizontalBox2.add(boxCreateBox2);
                return horizontalBox2;
            }
            horizontalBox2.add(boxCreateBox3);
            horizontalBox2.add(boxCreateBox4);
            f11 += width2;
        }
    }

    public static Box create(boolean z10, TeXEnvironment teXEnvironment, float f10) {
        float f11;
        float fMin = Math.min((Float.isInfinite(f10) || Float.isNaN(f10) || f10 < 0.0f) ? 0.0f : f10, 4096.0f);
        Box boxCreateBox = (z10 ? LEFT : RIGHT).createBox(teXEnvironment);
        float height = boxCreateBox.getHeight();
        float depth = boxCreateBox.getDepth();
        float width = boxCreateBox.getWidth();
        if (fMin <= width) {
            boxCreateBox.setDepth(depth / 2.0f);
            return boxCreateBox;
        }
        Box boxCreateBox2 = new SmashedAtom(MINUS, "").createBox(teXEnvironment);
        Box boxCreateBox3 = new SpaceAtom(5, -4.0f, 0.0f, 0.0f).createBox(teXEnvironment);
        float width2 = boxCreateBox3.getWidth() + boxCreateBox2.getWidth();
        float width3 = boxCreateBox3.getWidth() + width;
        HorizontalBox horizontalBox = new HorizontalBox();
        float f12 = 0.0f;
        while (true) {
            f11 = fMin - width3;
            if (f12 >= f11 - width2) {
                break;
            }
            horizontalBox.add(boxCreateBox2);
            horizontalBox.add(boxCreateBox3);
            f12 += width2;
        }
        float width4 = (f11 - f12) / boxCreateBox2.getWidth();
        float f13 = (-2.0f) * width4;
        horizontalBox.add(new SpaceAtom(5, f13, 0.0f, 0.0f).createBox(teXEnvironment));
        horizontalBox.add(new ScaleAtom(MINUS, width4, 1.0d).createBox(teXEnvironment));
        if (z10) {
            horizontalBox.add(0, new SpaceAtom(5, -3.5f, 0.0f, 0.0f).createBox(teXEnvironment));
            horizontalBox.add(0, boxCreateBox);
        } else {
            horizontalBox.add(new SpaceAtom(5, f13 - 2.0f, 0.0f, 0.0f).createBox(teXEnvironment));
            horizontalBox.add(boxCreateBox);
        }
        horizontalBox.setDepth(depth / 2.0f);
        horizontalBox.setHeight(height);
        return horizontalBox;
    }
}
