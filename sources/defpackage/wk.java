package defpackage;

import android.view.animation.Interpolator;
public final class wk implements Interpolator {
    public final double a;
    public final double b;
    public final double c;
    public final double d;

    public wk(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    @Override
    public final float getInterpolation(float f) {
        double exp;
        double d = this.a;
        int i = (d > 1.0d ? 1 : (d == 1.0d ? 0 : -1));
        double d2 = this.d;
        double d3 = this.b;
        if (i < 0) {
            double exp2 = Math.exp((-f) * d * d3);
            double d4 = this.c * f;
            exp = ((Math.sin(d4) * d2) + (Math.cos(d4) * 1.0d)) * exp2;
        } else {
            exp = Math.exp((-f) * d3) * ((d2 * f) + 1.0d);
        }
        return (float) (1.0d - exp);
    }
}
