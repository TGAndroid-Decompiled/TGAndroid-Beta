package defpackage;
public final class wr2 extends vr2 {
    public double d;
    public double e;
    public double f;
    public double g;

    public final xr2 u(js2 js2Var) {
        boolean z;
        double d = this.d;
        if (d >= this.e && d <= this.f) {
            z = true;
        } else {
            z = false;
        }
        r(z, Double.valueOf(d));
        xr2 xr2Var = new xr2(s(), this.d, this.e, this.f, this.g, this.a);
        q(js2Var, xr2Var);
        return xr2Var;
    }

    public final void v(double d) {
        if (d >= 0.0d) {
            this.g = d;
            return;
        }
        throw new IllegalArgumentException("precision " + d);
    }

    public final void w() {
        this.e = 0.0d;
        this.f = Double.MAX_VALUE;
    }
}
