package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f15571i;
    private final float f15572s;
    private final float f15573w;

    public Metrics(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.f15573w = f7 * f13;
        this.h = f10 * f13;
        this.d = f11 * f13;
        this.f15571i = f12 * f13;
        this.f15572s = f14;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f15571i;
    }

    public float getSize() {
        return this.f15572s;
    }

    public float getWidth() {
        return this.f15573w;
    }
}
