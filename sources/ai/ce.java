package ai;

import android.view.animation.Interpolator;
import org.telegram.messenger.tl;
public final class ce implements Interpolator {
    public final int f1114a;

    public ce(int i10) {
        this.f1114a = i10;
    }

    @Override
    public final float getInterpolation(float f7) {
        switch (this.f1114a) {
            case 0:
                return (float) Math.pow(f7, 2.0d);
            case 1:
                if (f7 < 0.33f) {
                    return (f7 / 0.33f) * 0.1f;
                }
                float f10 = f7 - 0.33f;
                if (f10 < 0.33f) {
                    return tl.x(f10, 0.34f, 0.15f, 0.1f);
                }
                return (((f10 - 0.34f) / 0.33f) * 0.05f) - 0.05f;
            case 2:
                return f7 * f7 * f7 * f7 * f7;
            case 3:
            case 4:
            default:
                float f11 = f7 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }
}
