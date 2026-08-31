package jh;

import android.animation.TimeInterpolator;
public final class a implements TimeInterpolator {
    public final int f10088a;

    @Override
    public final float getInterpolation(float f10) {
        switch (this.f10088a) {
            case 0:
                return f10;
            default:
                return ((((6.0f * f10) - 15.0f) * f10) + 10.0f) * f10 * f10 * f10;
        }
    }
}
