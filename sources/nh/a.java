package nh;

import android.animation.TimeInterpolator;
public final class a implements TimeInterpolator {
    public final int f13801a;

    @Override
    public final float getInterpolation(float f7) {
        switch (this.f13801a) {
            case 0:
                return f7;
            default:
                return ((((6.0f * f7) - 15.0f) * f7) + 10.0f) * f7 * f7 * f7;
        }
    }
}
