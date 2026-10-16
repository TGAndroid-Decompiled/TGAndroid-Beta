package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f16370i;
    private final float f16371s;
    private final float f16372w;

    public Metrics(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.f16372w = f7 * f13;
        this.h = f10 * f13;
        this.d = f11 * f13;
        this.f16370i = f12 * f13;
        this.f16371s = f14;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f16370i;
    }

    public float getSize() {
        return this.f16371s;
    }

    public float getWidth() {
        return this.f16372w;
    }
}
