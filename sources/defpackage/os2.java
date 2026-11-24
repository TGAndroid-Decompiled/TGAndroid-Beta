package defpackage;
public final class os2 extends ns2 {
    public double d;
    public double e;
    public double f;
    public double g;

    public final ps2 u(bt2 bt2Var) {
        boolean z;
        double d = this.d;
        if (d >= this.e && d <= this.f) {
            z = true;
        } else {
            z = false;
        }
        r(z, Double.valueOf(d));
        ps2 ps2Var = new ps2(s(), this.d, this.e, this.f, this.g, this.a);
        q(bt2Var, ps2Var);
        return ps2Var;
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
