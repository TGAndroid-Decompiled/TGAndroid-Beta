package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f15786i;
    private final float f15787s;
    private final float f15788w;

    public Metrics(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.f15788w = f7 * f13;
        this.h = f10 * f13;
        this.d = f11 * f13;
        this.f15786i = f12 * f13;
        this.f15787s = f14;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f15786i;
    }

    public float getSize() {
        return this.f15787s;
    }

    public float getWidth() {
        return this.f15788w;
    }
}
