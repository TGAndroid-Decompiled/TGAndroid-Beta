package org.telegram.messenger;

import android.view.animation.Interpolator;
public final class x implements Interpolator {
    public final double f26426a;
    public final double f26427b;
    public final double f26428c;
    public final double d;

    public x(double d, double d2, double d10, double d11) {
        this.f26426a = d;
        this.f26427b = d2;
        this.f26428c = d10;
        this.d = d11;
    }

    @Override
    public final float getInterpolation(float f10) {
        double exp;
        double d = this.f26426a;
        int i7 = (d > 1.0d ? 1 : (d == 1.0d ? 0 : -1));
        double d2 = this.d;
        double d10 = this.f26427b;
        if (i7 < 0) {
            double exp2 = Math.exp((-f10) * d * d10);
            double d11 = this.f26428c * f10;
            exp = 1.0d - (((Math.sin(d11) * d2) + (Math.cos(d11) * 1.0d)) * exp2);
        } else {
            exp = 1.0d - (Math.exp((-f10) * d10) * ((d2 * f10) + 1.0d));
        }
        return (float) exp;
    }
}
