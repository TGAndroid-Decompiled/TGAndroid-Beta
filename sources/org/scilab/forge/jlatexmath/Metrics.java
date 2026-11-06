package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f21133i;
    private final float f21134s;
    private final float f21135w;

    public Metrics(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f21135w = f10 * f14;
        this.h = f11 * f14;
        this.d = f12 * f14;
        this.f21133i = f13 * f14;
        this.f21134s = f15;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f21133i;
    }

    public float getSize() {
        return this.f21134s;
    }

    public float getWidth() {
        return this.f21135w;
    }
}
