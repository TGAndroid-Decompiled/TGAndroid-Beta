package defpackage;

import android.view.animation.Interpolator;
public final class ef3 implements Interpolator {
    public final byte a;

    @Override
    public final float getInterpolation(float f) {
        byte b = this.a;
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
