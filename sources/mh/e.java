package mh;

import android.view.animation.Interpolator;
import w7.u;
public final class e implements Interpolator {
    public final boolean f13327a;
    public final float f13328b;
    public final float f13329c;
    public final Interpolator d;

    public e(boolean z10, float f7, float f10, Interpolator interpolator) {
        this.f13327a = z10;
        this.f13328b = f7;
        this.f13329c = f10;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f7) {
        boolean z10 = this.f13327a;
        float f10 = this.f13328b;
        float f11 = this.f13329c;
        Interpolator interpolator = this.d;
        if (z10) {
            return 1.0f - interpolator.getInterpolation(1.0f - u.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(u.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
    }
}
