package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f22215i;
    private final float f22216s;
    private final float f22217w;

    public Metrics(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f22217w = f10 * f14;
        this.h = f11 * f14;
        this.d = f12 * f14;
        this.f22215i = f13 * f14;
        this.f22216s = f15;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f22215i;
    }

    public float getSize() {
        return this.f22216s;
    }

    public float getWidth() {
        return this.f22217w;
    }
}
