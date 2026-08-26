package org.scilab.forge.jlatexmath;

public class DelimiterFactory {
    private static final float MAX_LENGTH = 4096.0f;

    public static Box create(String str, TeXEnvironment teXEnvironment, float f) {
        float f2;
        if (Float.isInfinite(f) || Float.isNaN(f) || f < 0.0f) {
            f = 0.0f;
        }
        float fMin = Math.min(f, 4096.0f);
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        Char nextLarger = teXFont.getChar(str, style);
        Metrics metrics = nextLarger.getMetrics();
        float height = metrics.getHeight();
        float depth = metrics.getDepth();
        while (true) {
            f2 = depth + height;
            if (f2 >= fMin || !teXFont.hasNextLarger(nextLarger)) {
                break;
            }
            nextLarger = teXFont.getNextLarger(nextLarger, style);
            Metrics metrics2 = nextLarger.getMetrics();
            height = metrics2.getHeight();
            depth = metrics2.getDepth();
        }
        if (f2 >= fMin) {
            return new CharBox(nextLarger);
        }
        if (!teXFont.isExtensionChar(nextLarger)) {
            return new CharBox(nextLarger);
        }
        VerticalBox verticalBox = new VerticalBox();
        Extension extension = teXFont.getExtension(nextLarger, style);
        if (extension.hasTop()) {
            verticalBox.add(new CharBox(extension.getTop()));
        }
        boolean zHasMiddle = extension.hasMiddle();
        if (zHasMiddle) {
            verticalBox.add(new CharBox(extension.getMiddle()));
        }
        if (extension.hasBottom()) {
            verticalBox.add(new CharBox(extension.getBottom()));
        }
        CharBox charBox = new CharBox(extension.getRepeat());
        while (verticalBox.getDepth() + verticalBox.getHeight() <= fMin) {
            if (extension.hasTop() && extension.hasBottom()) {
                verticalBox.add(1, charBox);
                if (zHasMiddle) {
                    verticalBox.add(verticalBox.getSize() - 1, charBox);
                }
            } else if (extension.hasBottom()) {
                verticalBox.add(0, charBox);
            } else {
                verticalBox.add(charBox);
            }
        }
        return verticalBox;
    }

    public static Box create(SymbolAtom symbolAtom, TeXEnvironment teXEnvironment, int i) {
        if (i > 4) {
            return symbolAtom.createBox(teXEnvironment);
        }
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        Char nextLarger = teXFont.getChar(symbolAtom.getName(), style);
        int i2 = 1;
        while (i2 <= i && teXFont.hasNextLarger(nextLarger)) {
            nextLarger = teXFont.getNextLarger(nextLarger, style);
            i2++;
        }
        if (i2 <= i && !teXFont.hasNextLarger(nextLarger)) {
            CharBox charBox = new CharBox(teXFont.getChar('A', "mathnormal", style));
            return create(symbolAtom.getName(), teXEnvironment, (charBox.getDepth() + charBox.getHeight()) * i);
        }
        return new CharBox(nextLarger);
    }
}
