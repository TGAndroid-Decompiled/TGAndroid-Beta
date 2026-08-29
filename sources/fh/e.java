package fh;

import android.view.animation.Interpolator;
import i7.w;
public final class e implements Interpolator {
    public final boolean f6787a;
    public final float f6788b;
    public final float f6789c;
    public final Interpolator d;

    public e(boolean z10, float f9, float f10, Interpolator interpolator) {
        this.f6787a = z10;
        this.f6788b = f9;
        this.f6789c = f10;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f9) {
        boolean z10 = this.f6787a;
        float f10 = this.f6788b;
        float f11 = this.f6789c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - w.a((f9 - f10) / (f11 - f10), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(w.a((f9 - f10) / (f11 - f10), 0.0f, 1.0f));
    }
}
