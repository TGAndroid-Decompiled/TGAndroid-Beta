package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f17221i;
    private final float f17222s;
    private final float f17223w;

    public Metrics(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.f17223w = f7 * f13;
        this.h = f10 * f13;
        this.d = f11 * f13;
        this.f17221i = f12 * f13;
        this.f17222s = f14;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f17221i;
    }

    public float getSize() {
        return this.f17222s;
    }

    public float getWidth() {
        return this.f17223w;
    }
}
