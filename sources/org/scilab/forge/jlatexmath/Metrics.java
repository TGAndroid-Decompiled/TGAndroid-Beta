package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f17220i;
    private final float f17221s;
    private final float f17222w;

    public Metrics(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.f17222w = f7 * f13;
        this.h = f10 * f13;
        this.d = f11 * f13;
        this.f17220i = f12 * f13;
        this.f17221s = f14;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f17220i;
    }

    public float getSize() {
        return this.f17221s;
    }

    public float getWidth() {
        return this.f17222w;
    }
}
