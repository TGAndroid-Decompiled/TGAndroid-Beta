package org.scilab.forge.jlatexmath;
public class DelimiterFactory {
    private static final float MAX_LENGTH = 4096.0f;

    public static Box create(String str, TeXEnvironment teXEnvironment, float f10) {
        float f11;
        float min = Math.min((Float.isInfinite(f10) || Float.isNaN(f10) || f10 < 0.0f) ? 0.0f : 0.0f, 4096.0f);
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        Char r42 = teXFont.getChar(str, style);
        Metrics metrics = r42.getMetrics();
        float height = metrics.getHeight();
        float depth = metrics.getDepth();
        while (true) {
            f11 = depth + height;
            if (f11 >= min || !teXFont.hasNextLarger(r42)) {
                break;
            }
            r42 = teXFont.getNextLarger(r42, style);
            Metrics metrics2 = r42.getMetrics();
            height = metrics2.getHeight();
            depth = metrics2.getDepth();
        }
        if (f11 >= min) {
            return new CharBox(r42);
        }
        if (teXFont.isExtensionChar(r42)) {
            VerticalBox verticalBox = new VerticalBox();
            Extension extension = teXFont.getExtension(r42, style);
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
        return new CharBox(r42);
    }

    public static Box create(SymbolAtom symbolAtom, TeXEnvironment teXEnvironment, int i10) {
        if (i10 > 4) {
            return symbolAtom.createBox(teXEnvironment);
        }
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        Char r22 = teXFont.getChar(symbolAtom.getName(), style);
        int i11 = 1;
        while (i11 <= i10 && teXFont.hasNextLarger(r22)) {
            r22 = teXFont.getNextLarger(r22, style);
            i11++;
        }
        if (i11 <= i10 && !teXFont.hasNextLarger(r22)) {
            CharBox charBox = new CharBox(teXFont.getChar('A', "mathnormal", style));
            return create(symbolAtom.getName(), teXEnvironment, (charBox.getDepth() + charBox.getHeight()) * i10);
        }
        return new CharBox(r22);
    }
}
