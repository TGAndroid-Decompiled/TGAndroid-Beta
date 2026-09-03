package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f18025i;
    private final float f18026s;
    private final float f18027w;

    public Metrics(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f18027w = f10 * f14;
        this.h = f11 * f14;
        this.d = f12 * f14;
        this.f18025i = f13 * f14;
        this.f18026s = f15;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f18025i;
    }

    public float getSize() {
        return this.f18026s;
    }

    public float getWidth() {
        return this.f18027w;
    }
}
