package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f14326i;
    private final float f14327s;
    private final float f14328w;

    public Metrics(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.f14328w = f7 * f13;
        this.h = f10 * f13;
        this.d = f11 * f13;
        this.f14326i = f12 * f13;
        this.f14327s = f14;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f14326i;
    }

    public float getSize() {
        return this.f14327s;
    }

    public float getWidth() {
        return this.f14328w;
    }
}
