package defpackage;

import android.view.animation.Interpolator;
public final class g19 implements Interpolator {
    public final boolean a;
    public final float b;
    public final float c;
    public final Interpolator d;

    public g19(boolean z, float f, float f2, Interpolator interpolator) {
        this.a = z;
        this.b = f;
        this.c = f2;
        this.d = interpolator;
    }

    @Override
    public final float getInterpolation(float f) {
        boolean z = this.a;
        float f2 = this.b;
        float f3 = this.c;
        Interpolator interpolator = this.d;
        float f4 = (f - f2) / (f3 - f2);
        if (z) {
            return 1.0f - interpolator.getInterpolation(1.0f - ete.a(f4, 0.0f, 1.0f));
        }
        return interpolator.getInterpolation(ete.a(f4, 0.0f, 1.0f));
    }
}
