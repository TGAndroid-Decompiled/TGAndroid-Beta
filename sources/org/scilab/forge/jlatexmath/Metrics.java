package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f17226i;
    private final float f17227s;
    private final float f17228w;

    public Metrics(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.f17228w = f7 * f13;
        this.h = f10 * f13;
        this.d = f11 * f13;
        this.f17226i = f12 * f13;
        this.f17227s = f14;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f17226i;
    }

    public float getSize() {
        return this.f17227s;
    }

    public float getWidth() {
        return this.f17228w;
    }
}
