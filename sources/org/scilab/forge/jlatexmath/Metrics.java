package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f15569i;
    private final float f15570s;
    private final float f15571w;

    public Metrics(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.f15571w = f7 * f13;
        this.h = f10 * f13;
        this.d = f11 * f13;
        this.f15569i = f12 * f13;
        this.f15570s = f14;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f15569i;
    }

    public float getSize() {
        return this.f15570s;
    }

    public float getWidth() {
        return this.f15571w;
    }
}
