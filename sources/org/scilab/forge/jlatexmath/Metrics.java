package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f15801i;
    private final float f15802s;
    private final float f15803w;

    public Metrics(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.f15803w = f7 * f13;
        this.h = f10 * f13;
        this.d = f11 * f13;
        this.f15801i = f12 * f13;
        this.f15802s = f14;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f15801i;
    }

    public float getSize() {
        return this.f15802s;
    }

    public float getWidth() {
        return this.f15803w;
    }
}
