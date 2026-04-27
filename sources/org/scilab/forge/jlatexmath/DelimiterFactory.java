package org.scilab.forge.jlatexmath;

public abstract class DelimiterFactory {
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
            return create(symbolAtom.getName(), teXEnvironment, i * (charBox.getHeight() + charBox.getDepth()));
        }
        return new CharBox(nextLarger);
    }

    public static Box create(String str, TeXEnvironment teXEnvironment, float f) {
        float f2;
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        Char nextLarger = teXFont.getChar(str, style);
        Metrics metrics = nextLarger.getMetrics();
        float height = metrics.getHeight();
        float depth = metrics.getDepth();
        while (true) {
            f2 = height + depth;
            if (f2 >= f || !teXFont.hasNextLarger(nextLarger)) {
                break;
            }
            nextLarger = teXFont.getNextLarger(nextLarger, style);
            Metrics metrics2 = nextLarger.getMetrics();
            height = metrics2.getHeight();
            depth = metrics2.getDepth();
        }
        if (f2 >= f) {
            return new CharBox(nextLarger);
        }
        if (teXFont.isExtensionChar(nextLarger)) {
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
            while (verticalBox.getHeight() + verticalBox.getDepth() <= f) {
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
        return new CharBox(nextLarger);
    }
}
