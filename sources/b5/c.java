package b5;

import android.view.animation.Interpolator;
import org.telegram.messenger.camera.q;
public final class c implements Interpolator {
    public final int f2395a;

    public c(int i3) {
        this.f2395a = i3;
    }

    @Override
    public final float getInterpolation(float f10) {
        switch (this.f2395a) {
            case 0:
            case 4:
            default:
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            case 1:
                return (float) Math.pow(f10, 2.0d);
            case 2:
                if (f10 < 0.33f) {
                    return (f10 / 0.33f) * 0.1f;
                }
                float f12 = f10 - 0.33f;
                if (f12 < 0.33f) {
                    return q.v(f12, 0.34f, 0.15f, 0.1f);
                }
                return (((f12 - 0.34f) / 0.33f) * 0.05f) - 0.05f;
            case 3:
                return f10 * f10 * f10 * f10 * f10;
        }
    }
}
