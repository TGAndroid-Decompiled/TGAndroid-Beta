package org.scilab.forge.jlatexmath;

public class Metrics {
    private final float d;
    private final float h;

    private final float f19590i;

    private final float f19591s;

    private final float f19592w;

    public Metrics(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f19592w = f10 * f14;
        this.h = f11 * f14;
        this.d = f12 * f14;
        this.f19590i = f13 * f14;
        this.f19591s = f15;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f19590i;
    }

    public float getSize() {
        return this.f19591s;
    }

    public float getWidth() {
        return this.f19592w;
    }
}
