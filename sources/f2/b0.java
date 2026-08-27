package f2;

import android.view.animation.Interpolator;
import org.telegram.messenger.rl;

public final class b0 implements Interpolator {

    public final int f5628a;

    public b0(int i10) {
        this.f5628a = i10;
    }

    @Override
    public final float getInterpolation(float f10) {
        switch (this.f5628a) {
            case 0:
                return f10 * f10 * f10 * f10 * f10;
            case 1:
            case 2:
            case 4:
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            case 3:
                return (float) Math.pow(f10, 2.0d);
            default:
                if (f10 < 0.33f) {
                    return (f10 / 0.33f) * 0.1f;
                }
                float f12 = f10 - 0.33f;
                return f12 < 0.33f ? rl.c(f12, 0.34f, 0.15f, 0.1f) : (((f12 - 0.34f) / 0.33f) * 0.05f) - 0.05f;
        }
    }
}
