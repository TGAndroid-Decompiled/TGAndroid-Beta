package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f19588i;
    private final float f19589s;
    private final float f19590w;

    public Metrics(float f9, float f10, float f11, float f12, float f13, float f14) {
        this.f19590w = f9 * f13;
        this.h = f10 * f13;
        this.d = f11 * f13;
        this.f19588i = f12 * f13;
        this.f19589s = f14;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f19588i;
    }

    public float getSize() {
        return this.f19589s;
    }

    public float getWidth() {
        return this.f19590w;
    }
}
