package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f17768i;
    private final float f17769s;
    private final float f17770w;

    public Metrics(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.f17770w = f7 * f13;
        this.h = f10 * f13;
        this.d = f11 * f13;
        this.f17768i = f12 * f13;
        this.f17769s = f14;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f17768i;
    }

    public float getSize() {
        return this.f17769s;
    }

    public float getWidth() {
        return this.f17770w;
    }
}
