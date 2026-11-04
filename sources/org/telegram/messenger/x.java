package org.telegram.messenger;

import android.view.animation.Interpolator;
public final class x implements Interpolator {
    public final double f26316a;
    public final double f26317b;
    public final double f26318c;
    public final double d;

    public x(double d, double d10, double d11, double d12) {
        this.f26316a = d;
        this.f26317b = d10;
        this.f26318c = d11;
        this.d = d12;
    }

    @Override
    public final float getInterpolation(float f10) {
        double exp;
        double d = this.f26316a;
        int i3 = (d > 1.0d ? 1 : (d == 1.0d ? 0 : -1));
        double d10 = this.d;
        double d11 = this.f26317b;
        if (i3 < 0) {
            double exp2 = Math.exp((-f10) * d * d11);
            double d12 = this.f26318c * f10;
            exp = 1.0d - (((Math.sin(d12) * d10) + (Math.cos(d12) * 1.0d)) * exp2);
        } else {
            exp = 1.0d - (Math.exp((-f10) * d11) * ((d10 * f10) + 1.0d));
        }
        return (float) exp;
    }
}
