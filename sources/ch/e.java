package ch;

import android.view.animation.Interpolator;
import g7.n;
public final class e implements Interpolator {
    public final boolean f2448a;
    public final float f2449b;
    public final float f2450c;
    public final Interpolator d;

    public e(boolean z10, float f10, float f11, Interpolator interpolator) {
        this.f2448a = z10;
        this.f2449b = f10;
        this.f2450c = f11;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f10) {
        boolean z10 = this.f2448a;
        float f11 = this.f2449b;
        float f12 = this.f2450c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - n.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(n.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
    }
}
