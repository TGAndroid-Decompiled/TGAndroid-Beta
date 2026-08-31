package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f18023i;
    private final float f18024s;
    private final float f18025w;

    public Metrics(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f18025w = f10 * f14;
        this.h = f11 * f14;
        this.d = f12 * f14;
        this.f18023i = f13 * f14;
        this.f18024s = f15;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f18023i;
    }

    public float getSize() {
        return this.f18024s;
    }

    public float getWidth() {
        return this.f18025w;
    }
}
