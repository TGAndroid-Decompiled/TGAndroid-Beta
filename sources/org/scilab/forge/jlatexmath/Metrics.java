package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f22573i;
    private final float f22574s;
    private final float f22575w;

    public Metrics(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f22575w = f10 * f14;
        this.h = f11 * f14;
        this.d = f12 * f14;
        this.f22573i = f13 * f14;
        this.f22574s = f15;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f22573i;
    }

    public float getSize() {
        return this.f22574s;
    }

    public float getWidth() {
        return this.f22575w;
    }
}
