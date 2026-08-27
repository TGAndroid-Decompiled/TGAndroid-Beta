package dh;

import android.view.animation.Interpolator;
import h7.n;

public final class e implements Interpolator {

    public final boolean f4992a;

    public final float f4993b;

    public final float f4994c;
    public final Interpolator d;

    public e(boolean z10, float f10, float f11, Interpolator interpolator) {
        this.f4992a = z10;
        this.f4993b = f10;
        this.f4994c = f11;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f10) {
        boolean z10 = this.f4992a;
        float f11 = this.f4993b;
        float f12 = this.f4994c;
        Interpolator interpolator = this.d;
        return z10 ? 1.0f - interpolator.getInterpolation(1.0f - n.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f)) : interpolator.getInterpolation(n.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
    }
}
