package org.scilab.forge.jlatexmath;
public class DelimiterFactory {
    private static final float MAX_LENGTH = 4096.0f;

    public static Box create(String str, TeXEnvironment teXEnvironment, float f) {
        float f2;
        if (Float.isInfinite(f) || Float.isNaN(f) || f < 0.0f) {
            f = 0.0f;
        }
        float min = Math.min(f, 4096.0f);
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        Char r4 = teXFont.getChar(str, style);
        Metrics metrics = r4.getMetrics();
        float height = metrics.getHeight();
        float depth = metrics.getDepth();
        while (true) {
            f2 = depth + height;
            if (f2 >= min || !teXFont.hasNextLarger(r4)) {
                break;
            }
            r4 = teXFont.getNextLarger(r4, style);
            Metrics metrics2 = r4.getMetrics();
            height = metrics2.getHeight();
            depth = metrics2.getDepth();
        }
        if (f2 >= min) {
            return new CharBox(r4);
        }
        if (teXFont.isExtensionChar(r4)) {
            VerticalBox verticalBox = new VerticalBox();
            Extension extension = teXFont.getExtension(r4, style);
            if (extension.hasTop()) {
                verticalBox.add(new CharBox(extension.getTop()));
            }
            boolean hasMiddle = extension.hasMiddle();
            if (hasMiddle) {
                verticalBox.add(new CharBox(extension.getMiddle()));
            }
            if (extension.hasBottom()) {
                verticalBox.add(new CharBox(extension.getBottom()));
            }
            CharBox charBox = new CharBox(extension.getRepeat());
            while (verticalBox.getDepth() + verticalBox.getHeight() <= min) {
                if (extension.hasTop() && extension.hasBottom()) {
                    verticalBox.add(1, charBox);
                    if (hasMiddle) {
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
        return new CharBox(r4);
    }

    public static Box create(SymbolAtom symbolAtom, TeXEnvironment teXEnvironment, int i) {
        if (i > 4) {
            return symbolAtom.createBox(teXEnvironment);
        }
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        Char r2 = teXFont.getChar(symbolAtom.getName(), style);
        int i2 = 1;
        while (true) {
            if (i2 > i) {
                break;
            } else if (teXFont.hasNextLarger(r2)) {
                r2 = teXFont.getNextLarger(r2, style);
                i2++;
            } else if (!teXFont.hasNextLarger(r2)) {
                CharBox charBox = new CharBox(teXFont.getChar('A', "mathnormal", style));
                return create(symbolAtom.getName(), teXEnvironment, (charBox.getDepth() + charBox.getHeight()) * i);
            }
        }
        return new CharBox(r2);
    }
}
