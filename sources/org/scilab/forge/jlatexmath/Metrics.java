package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f14327i;
    private final float f14328s;
    private final float f14329w;

    public Metrics(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.f14329w = f7 * f13;
        this.h = f10 * f13;
        this.d = f11 * f13;
        this.f14327i = f12 * f13;
        this.f14328s = f14;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f14327i;
    }

    public float getSize() {
        return this.f14328s;
    }

    public float getWidth() {
        return this.f14329w;
    }
}
