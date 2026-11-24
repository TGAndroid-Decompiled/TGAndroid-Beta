package defpackage;
public final class hd8 {
    public final double a;
    public final double b;
    public final double c;
    public boolean d;

    public hd8(double d, double d2, double d3, int i) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = true;
    }

    public final float a(hd8 hd8Var) {
        return (float) Math.sqrt(Math.pow(this.c - hd8Var.c, 2.0d) + Math.pow(this.b - hd8Var.b, 2.0d) + Math.pow(this.a - hd8Var.a, 2.0d));
    }

    public final hd8 b(hd8 hd8Var) {
        return new hd8((this.a + hd8Var.a) * 0.5d, (this.b + hd8Var.b) * 0.5d, (this.c + hd8Var.c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hd8)) {
            return false;
        }
        hd8 hd8Var = (hd8) obj;
        if (this.a != hd8Var.a || this.b != hd8Var.b || this.c != hd8Var.c) {
            return false;
        }
        return true;
    }

    public hd8(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }
}
