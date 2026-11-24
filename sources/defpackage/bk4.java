package defpackage;

import android.view.animation.Interpolator;
public final class bk4 implements Interpolator {
    public final float a = 1.0f / ((float) (1.0d - Math.pow(100.0d, -1.0d)));

    @Override
    public final float getInterpolation(float f) {
        return 1.0f - (((float) (1.0d - Math.pow(100.0d, -(1.0f - f)))) * this.a);
    }
}
