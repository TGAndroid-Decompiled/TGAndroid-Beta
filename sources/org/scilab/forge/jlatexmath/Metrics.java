package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f22581i;
    private final float f22582s;
    private final float f22583w;

    public Metrics(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f22583w = f10 * f14;
        this.h = f11 * f14;
        this.d = f12 * f14;
        this.f22581i = f13 * f14;
        this.f22582s = f15;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f22581i;
    }

    public float getSize() {
        return this.f22582s;
    }

    public float getWidth() {
        return this.f22583w;
    }
}
