package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f19517i;
    private final float f19518s;
    private final float f19519w;

    public Metrics(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.f19519w = f7 * f13;
        this.h = f10 * f13;
        this.d = f11 * f13;
        this.f19517i = f12 * f13;
        this.f19518s = f14;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f19517i;
    }

    public float getSize() {
        return this.f19518s;
    }

    public float getWidth() {
        return this.f19519w;
    }
}
