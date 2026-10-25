package a5;

import android.view.animation.Interpolator;
import org.telegram.messenger.vh;
public final class c implements Interpolator {
    public final int f283a;

    public c(int i10) {
        this.f283a = i10;
    }

    @Override
    public final float getInterpolation(float f7) {
        switch (this.f283a) {
            case 0:
            case 4:
            default:
                float f10 = f7 - 1.0f;
                return (f10 * f10 * f10 * f10 * f10) + 1.0f;
            case 1:
                return (float) Math.pow(f7, 2.0d);
            case 2:
                if (f7 < 0.33f) {
                    return (f7 / 0.33f) * 0.1f;
                }
                float f11 = f7 - 0.33f;
                if (f11 < 0.33f) {
                    return vh.w(f11, 0.34f, 0.15f, 0.1f);
                }
                return (((f11 - 0.34f) / 0.33f) * 0.05f) - 0.05f;
            case 3:
                return f7 * f7 * f7 * f7 * f7;
        }
    }
}
