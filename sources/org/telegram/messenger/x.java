package org.telegram.messenger;

import android.view.animation.Interpolator;
public final class x implements Interpolator {
    public final double f26422a;
    public final double f26423b;
    public final double f26424c;
    public final double d;

    public x(double d, double d2, double d10, double d11) {
        this.f26422a = d;
        this.f26423b = d2;
        this.f26424c = d10;
        this.d = d11;
    }

    @Override
    public final float getInterpolation(float f10) {
        double exp;
        double d = this.f26422a;
        int i7 = (d > 1.0d ? 1 : (d == 1.0d ? 0 : -1));
        double d2 = this.d;
        double d10 = this.f26423b;
        if (i7 < 0) {
            double exp2 = Math.exp((-f10) * d * d10);
            double d11 = this.f26424c * f10;
            exp = 1.0d - (((Math.sin(d11) * d2) + (Math.cos(d11) * 1.0d)) * exp2);
        } else {
            exp = 1.0d - (Math.exp((-f10) * d10) * ((d2 * f10) + 1.0d));
        }
        return (float) exp;
    }
}
