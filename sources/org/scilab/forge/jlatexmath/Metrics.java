package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f15581i;
    private final float f15582s;
    private final float f15583w;

    public Metrics(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.f15583w = f7 * f13;
        this.h = f10 * f13;
        this.d = f11 * f13;
        this.f15581i = f12 * f13;
        this.f15582s = f14;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f15581i;
    }

    public float getSize() {
        return this.f15582s;
    }

    public float getWidth() {
        return this.f15583w;
    }
}
