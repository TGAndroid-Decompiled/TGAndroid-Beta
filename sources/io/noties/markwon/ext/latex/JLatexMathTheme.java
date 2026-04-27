package io.noties.markwon.ext.latex;

public abstract class JLatexMathTheme {

    public interface BackgroundProvider {
    }

    public static class Padding {
    }

    public abstract boolean blockFitCanvas();

    public static Builder builder(float f) {
        return new Builder(f, 0.0f, 0.0f);
    }

    public static class Builder {
        private boolean blockFitCanvas = true;
        private int blockHorizontalAlignment = 1;
        private int blockTextColor;
        private final float blockTextSize;
        private int inlineTextColor;
        private final float inlineTextSize;
        private int textColor;
        private final float textSize;

        static Padding access$1000(Builder builder) {
            builder.getClass();
            return null;
        }

        static BackgroundProvider access$300(Builder builder) {
            builder.getClass();
            return null;
        }

        static BackgroundProvider access$400(Builder builder) {
            builder.getClass();
            return null;
        }

        static BackgroundProvider access$500(Builder builder) {
            builder.getClass();
            return null;
        }

        static Padding access$800(Builder builder) {
            builder.getClass();
            return null;
        }

        static Padding access$900(Builder builder) {
            builder.getClass();
            return null;
        }

        Builder(float f, float f2, float f3) {
            this.textSize = f;
            this.inlineTextSize = f2;
            this.blockTextSize = f3;
        }

        public JLatexMathTheme build() {
            return new Impl(this);
        }
    }

    static class Impl extends JLatexMathTheme {
        private final boolean blockFitCanvas;
        private int blockHorizontalAlignment;
        private final int blockTextColor;
        private final float blockTextSize;
        private final int inlineTextColor;
        private final float inlineTextSize;
        private final int textColor;
        private final float textSize;

        Impl(Builder builder) {
            this.textSize = builder.textSize;
            this.inlineTextSize = builder.inlineTextSize;
            this.blockTextSize = builder.blockTextSize;
            Builder.access$300(builder);
            Builder.access$400(builder);
            Builder.access$500(builder);
            this.blockFitCanvas = builder.blockFitCanvas;
            this.blockHorizontalAlignment = builder.blockHorizontalAlignment;
            Builder.access$800(builder);
            Builder.access$900(builder);
            Builder.access$1000(builder);
            this.textColor = builder.textColor;
            this.inlineTextColor = builder.inlineTextColor;
            this.blockTextColor = builder.blockTextColor;
        }

        @Override
        public boolean blockFitCanvas() {
            return this.blockFitCanvas;
        }
    }
}
