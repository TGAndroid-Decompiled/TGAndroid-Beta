package ig;
public final class u0 {
    public final double f8480a;
    public final double f8481b;
    public final double f8482c;
    public boolean d;

    public u0(double d, double d10, double d11) {
        this.f8480a = d;
        this.f8481b = d10;
        this.f8482c = d11;
    }

    public final float a(u0 u0Var) {
        return (float) Math.sqrt(Math.pow(this.f8482c - u0Var.f8482c, 2.0d) + Math.pow(this.f8481b - u0Var.f8481b, 2.0d) + Math.pow(this.f8480a - u0Var.f8480a, 2.0d));
    }

    public final u0 b(u0 u0Var) {
        return new u0((this.f8480a + u0Var.f8480a) * 0.5d, (this.f8481b + u0Var.f8481b) * 0.5d, (this.f8482c + u0Var.f8482c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (this.f8480a != u0Var.f8480a || this.f8481b != u0Var.f8481b || this.f8482c != u0Var.f8482c) {
            return false;
        }
        return true;
    }

    public u0(double d, double d10, double d11, int i10) {
        this.f8480a = d;
        this.f8481b = d10;
        this.f8482c = d11;
        this.d = true;
    }
}
