package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f15795i;
    private final float f15796s;
    private final float f15797w;

    public Metrics(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.f15797w = f7 * f13;
        this.h = f10 * f13;
        this.d = f11 * f13;
        this.f15795i = f12 * f13;
        this.f15796s = f14;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f15795i;
    }

    public float getSize() {
        return this.f15796s;
    }

    public float getWidth() {
        return this.f15797w;
    }
}
