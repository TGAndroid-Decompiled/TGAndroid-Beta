package org.scilab.forge.jlatexmath;
public class Metrics {
    private final float d;
    private final float h;
    private final float f16678i;
    private final float f16679s;
    private final float f16680w;

    public Metrics(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.f16680w = f7 * f13;
        this.h = f10 * f13;
        this.d = f11 * f13;
        this.f16678i = f12 * f13;
        this.f16679s = f14;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.f16678i;
    }

    public float getSize() {
        return this.f16679s;
    }

    public float getWidth() {
        return this.f16680w;
    }
}
