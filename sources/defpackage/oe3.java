package defpackage;

import android.view.animation.Interpolator;
public final class oe3 implements Interpolator {
    public final byte a;

    public oe3(byte b) {
        this.a = b;
    }

    @Override
    public final float getInterpolation(float f) {
        switch (this.a) {
            case 0:
                if (f < 0.33f) {
                    return (f / 0.33f) * 0.1f;
                }
                float f2 = f - 0.33f;
                if (f2 < 0.33f) {
                    return de9.x(f2, 0.34f, 0.15f, 0.1f);
                }
                return (((f2 - 0.34f) / 0.33f) * 0.05f) - 0.05f;
            case 1:
                return f * f * f * f * f;
            case 2:
            case 3:
            default:
                float f3 = f - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
            case 4:
                return (float) Math.pow(f, 2.0d);
        }
    }
}
