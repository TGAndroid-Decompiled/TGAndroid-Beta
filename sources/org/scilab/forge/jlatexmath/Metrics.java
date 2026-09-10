package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f14613i;
    private final float f14614s;
    private final float f14615w;

    public Metrics(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.f14615w = f7 * f13;
        this.h = f10 * f13;
        this.d = f11 * f13;
        this.f14613i = f12 * f13;
        this.f14614s = f14;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f14613i;
    }

    public float getSize() {
        return this.f14614s;
    }

    public float getWidth() {
        return this.f14615w;
    }
}
