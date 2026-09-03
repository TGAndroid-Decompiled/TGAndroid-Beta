package hh;

import android.view.animation.Interpolator;
import k7.n;
public final class e implements Interpolator {
    public final boolean f7112a;
    public final float f7113b;
    public final float f7114c;
    public final Interpolator d;

    public e(boolean z4, float f10, float f11, Interpolator interpolator) {
        this.f7112a = z4;
        this.f7113b = f10;
        this.f7114c = f11;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f10) {
        boolean z4 = this.f7112a;
        float f11 = this.f7113b;
        float f12 = this.f7114c;
        Interpolator interpolator = this.d;
        if (z4) {
            return 1.0f - interpolator.getInterpolation(1.0f - n.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(n.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
    }
}
