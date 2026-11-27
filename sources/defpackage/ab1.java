package defpackage;

import android.animation.TimeInterpolator;
public final class ab1 implements TimeInterpolator {
    public final byte a;

    @Override
    public final float getInterpolation(float f) {
        switch (this.a) {
            case 0:
                return ((((6.0f * f) - 15.0f) * f) + 10.0f) * f * f * f;
            default:
                return f;
        }
    }
}
