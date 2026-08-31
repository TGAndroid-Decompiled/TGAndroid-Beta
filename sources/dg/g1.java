package dg;
public final class g1 {
    public final double f4543a;
    public final double f4544b;
    public final double f4545c;
    public boolean d;

    public g1(double d, double d10, double d11) {
        this.f4543a = d;
        this.f4544b = d10;
        this.f4545c = d11;
    }

    public final float a(g1 g1Var) {
        return (float) Math.sqrt(Math.pow(this.f4545c - g1Var.f4545c, 2.0d) + Math.pow(this.f4544b - g1Var.f4544b, 2.0d) + Math.pow(this.f4543a - g1Var.f4543a, 2.0d));
    }

    public final g1 b(g1 g1Var) {
        return new g1((this.f4543a + g1Var.f4543a) * 0.5d, (this.f4544b + g1Var.f4544b) * 0.5d, (this.f4545c + g1Var.f4545c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        if (this.f4543a != g1Var.f4543a || this.f4544b != g1Var.f4544b || this.f4545c != g1Var.f4545c) {
            return false;
        }
        return true;
    }

    public g1(double d, double d10, double d11, int i10) {
        this.f4543a = d;
        this.f4544b = d10;
        this.f4545c = d11;
        this.d = true;
    }
}
