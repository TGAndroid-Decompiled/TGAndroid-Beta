package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f19518i;
    private final float f19519s;
    private final float f19520w;

    public Metrics(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.f19520w = f7 * f13;
        this.h = f10 * f13;
        this.d = f11 * f13;
        this.f19518i = f12 * f13;
        this.f19519s = f14;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f19518i;
    }

    public float getSize() {
        return this.f19519s;
    }

    public float getWidth() {
        return this.f19520w;
    }
}
