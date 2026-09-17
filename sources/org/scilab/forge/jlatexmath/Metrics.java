package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f17075i;
    private final float f17076s;
    private final float f17077w;

    public Metrics(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.f17077w = f7 * f13;
        this.h = f10 * f13;
        this.d = f11 * f13;
        this.f17075i = f12 * f13;
        this.f17076s = f14;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f17075i;
    }

    public float getSize() {
        return this.f17076s;
    }

    public float getWidth() {
        return this.f17077w;
    }
}
