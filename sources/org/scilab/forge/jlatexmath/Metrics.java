package org.scilab.forge.jlatexmath;

public class Metrics {
    private final float d;
    private final float h;
    private final float i;
    private final float s;
    private final float w;

    public Metrics(float f, float f2, float f3, float f4, float f5, float f6) {
        this.w = f * f5;
        this.h = f2 * f5;
        this.d = f3 * f5;
        this.i = f4 * f5;
        this.s = f6;
    }

    public float getWidth() {
        return this.w;
    }

    public float getHeight() {
        return this.h;
    }

    public float getDepth() {
        return this.d;
    }

    public float getItalic() {
        return this.i;
    }

    public float getSize() {
        return this.s;
    }
}
