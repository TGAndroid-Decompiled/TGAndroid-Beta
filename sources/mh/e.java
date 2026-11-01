package mh;

import android.view.animation.Interpolator;
import w7.u;
public final class e implements Interpolator {
    public final boolean f13328a;
    public final float f13329b;
    public final float f13330c;
    public final Interpolator d;

    public e(boolean z10, float f7, float f10, Interpolator interpolator) {
        this.f13328a = z10;
        this.f13329b = f7;
        this.f13330c = f10;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f7) {
        boolean z10 = this.f13328a;
        float f10 = this.f13329b;
        float f11 = this.f13330c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - u.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(u.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
    }
}
