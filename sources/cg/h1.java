package cg;
public final class h1 {
    public final double f2398a;
    public final double f2399b;
    public final double f2400c;
    public boolean d;

    public h1(double d, double d10, double d11) {
        this.f2398a = d;
        this.f2399b = d10;
        this.f2400c = d11;
    }

    public final float a(h1 h1Var) {
        return (float) Math.sqrt(Math.pow(this.f2400c - h1Var.f2400c, 2.0d) + Math.pow(this.f2399b - h1Var.f2399b, 2.0d) + Math.pow(this.f2398a - h1Var.f2398a, 2.0d));
    }

    public final h1 b(h1 h1Var) {
        return new h1((this.f2398a + h1Var.f2398a) * 0.5d, (this.f2399b + h1Var.f2399b) * 0.5d, (this.f2400c + h1Var.f2400c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (this.f2398a != h1Var.f2398a || this.f2399b != h1Var.f2399b || this.f2400c != h1Var.f2400c) {
            return false;
        }
        return true;
    }

    public h1(double d, double d10, double d11, int i10) {
        this.f2398a = d;
        this.f2399b = d10;
        this.f2400c = d11;
        this.d = true;
    }
}
