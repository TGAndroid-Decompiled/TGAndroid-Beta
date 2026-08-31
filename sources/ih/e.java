package ih;

import android.view.animation.Interpolator;
import k7.o;
public final class e implements Interpolator {
    public final boolean f8129a;
    public final float f8130b;
    public final float f8131c;
    public final Interpolator d;

    public e(boolean z4, float f10, float f11, Interpolator interpolator) {
        this.f8129a = z4;
        this.f8130b = f10;
        this.f8131c = f11;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f10) {
        boolean z4 = this.f8129a;
        float f11 = this.f8130b;
        float f12 = this.f8131c;
        Interpolator interpolator = this.d;
        if (z4) {
            return 1.0f - interpolator.getInterpolation(1.0f - o.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(o.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
    }
}
