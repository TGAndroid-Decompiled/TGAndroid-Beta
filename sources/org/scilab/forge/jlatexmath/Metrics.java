package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f21186i;
    private final float f21187s;
    private final float f21188w;

    public Metrics(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f21188w = f10 * f14;
        this.h = f11 * f14;
        this.d = f12 * f14;
        this.f21186i = f13 * f14;
        this.f21187s = f15;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f21186i;
    }

    public float getSize() {
        return this.f21187s;
    }

    public float getWidth() {
        return this.f21188w;
    }
}
