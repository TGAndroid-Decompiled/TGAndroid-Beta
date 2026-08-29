package gh;

import android.animation.TimeInterpolator;
public final class a implements TimeInterpolator {
    public final int f7358a;

    @Override
    public final float getInterpolation(float f9) {
        switch (this.f7358a) {
            case 0:
                return f9;
            default:
                return ((((6.0f * f9) - 15.0f) * f9) + 10.0f) * f9 * f9 * f9;
        }
    }
}
