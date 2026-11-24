package defpackage;
public final class dr2 extends cr2 {
    public double d;
    public double e;
    public double f;
    public double g;

    public final er2 u(qr2 qr2Var) {
        boolean z;
        double d = this.d;
        if (d >= this.e && d <= this.f) {
            z = true;
        } else {
            z = false;
        }
        r(z, Double.valueOf(d));
        er2 er2Var = new er2(s(), this.d, this.e, this.f, this.g, this.a);
        q(qr2Var, er2Var);
        return er2Var;
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
