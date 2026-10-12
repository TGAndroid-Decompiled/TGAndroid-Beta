package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f16973i;
    private final float f16974s;
    private final float f16975w;

    public Metrics(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.f16975w = f7 * f13;
        this.h = f10 * f13;
        this.d = f11 * f13;
        this.f16973i = f12 * f13;
        this.f16974s = f14;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f16973i;
    }

    public float getSize() {
        return this.f16974s;
    }

    public float getWidth() {
        return this.f16975w;
    }
}
