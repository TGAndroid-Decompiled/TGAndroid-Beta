package f2;

import android.view.animation.Interpolator;
import org.telegram.messenger.x3;
public final class a0 implements Interpolator {
    public final int f6271a;

    public a0(int i10) {
        this.f6271a = i10;
    }

    @Override
    public final float getInterpolation(float f9) {
        switch (this.f6271a) {
            case 0:
                return f9 * f9 * f9 * f9 * f9;
            case 1:
            case 2:
            case 4:
                float f10 = f9 - 1.0f;
                return (f10 * f10 * f10 * f10 * f10) + 1.0f;
            case 3:
                return (float) Math.pow(f9, 2.0d);
            default:
                if (f9 < 0.33f) {
                    return (f9 / 0.33f) * 0.1f;
                }
                float f11 = f9 - 0.33f;
                if (f11 < 0.33f) {
                    return x3.A(f11, 0.34f, 0.15f, 0.1f);
                }
                return (((f11 - 0.34f) / 0.33f) * 0.05f) - 0.05f;
        }
    }
}
