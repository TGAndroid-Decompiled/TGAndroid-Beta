package cg;
public final class h1 {
    public final double f2415a;
    public final double f2416b;
    public final double f2417c;
    public boolean d;

    public h1(double d, double d10, double d11) {
        this.f2415a = d;
        this.f2416b = d10;
        this.f2417c = d11;
    }

    public final float a(h1 h1Var) {
        return (float) Math.sqrt(Math.pow(this.f2417c - h1Var.f2417c, 2.0d) + Math.pow(this.f2416b - h1Var.f2416b, 2.0d) + Math.pow(this.f2415a - h1Var.f2415a, 2.0d));
    }

    public final h1 b(h1 h1Var) {
        return new h1((this.f2415a + h1Var.f2415a) * 0.5d, (this.f2416b + h1Var.f2416b) * 0.5d, (this.f2417c + h1Var.f2417c) * 0.5d);
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
        if (this.f2415a != h1Var.f2415a || this.f2416b != h1Var.f2416b || this.f2417c != h1Var.f2417c) {
            return false;
        }
        return true;
    }

    public h1(double d, double d10, double d11, int i10) {
        this.f2415a = d;
        this.f2416b = d10;
        this.f2417c = d11;
        this.d = true;
    }
}
