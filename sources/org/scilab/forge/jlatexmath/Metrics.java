package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f21136i;
    private final float f21137s;
    private final float f21138w;

    public Metrics(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f21138w = f10 * f14;
        this.h = f11 * f14;
        this.d = f12 * f14;
        this.f21136i = f13 * f14;
        this.f21137s = f15;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f21136i;
    }

    public float getSize() {
        return this.f21137s;
    }

    public float getWidth() {
        return this.f21138w;
    }
}
