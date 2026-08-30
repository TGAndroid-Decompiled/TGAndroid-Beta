package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f16637i;
    private final float f16638s;
    private final float f16639w;

    public Metrics(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f16639w = f10 * f14;
        this.h = f11 * f14;
        this.d = f12 * f14;
        this.f16637i = f13 * f14;
        this.f16638s = f15;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f16637i;
    }

    public float getSize() {
        return this.f16638s;
    }

    public float getWidth() {
        return this.f16639w;
    }
}
