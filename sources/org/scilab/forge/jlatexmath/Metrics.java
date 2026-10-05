package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f17235i;
    private final float f17236s;
    private final float f17237w;

    public Metrics(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.f17237w = f7 * f13;
        this.h = f10 * f13;
        this.d = f11 * f13;
        this.f17235i = f12 * f13;
        this.f17236s = f14;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f17235i;
    }

    public float getSize() {
        return this.f17236s;
    }

    public float getWidth() {
        return this.f17237w;
    }
}
