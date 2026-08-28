package dh;

import android.animation.TimeInterpolator;
public final class a implements TimeInterpolator {
    public final int f4567a;

    @Override
    public final float getInterpolation(float f10) {
        switch (this.f4567a) {
            case 0:
                return f10;
            default:
                return ((((6.0f * f10) - 15.0f) * f10) + 10.0f) * f10 * f10 * f10;
        }
    }
}
