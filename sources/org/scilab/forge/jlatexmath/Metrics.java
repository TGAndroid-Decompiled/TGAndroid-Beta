package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f17772i;
    private final float f17773s;
    private final float f17774w;

    public Metrics(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.f17774w = f7 * f13;
        this.h = f10 * f13;
        this.d = f11 * f13;
        this.f17772i = f12 * f13;
        this.f17773s = f14;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f17772i;
    }

    public float getSize() {
        return this.f17773s;
    }

    public float getWidth() {
        return this.f17774w;
    }
}
