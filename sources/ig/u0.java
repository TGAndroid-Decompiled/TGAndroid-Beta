package ig;
public final class u0 {
    public final double f8481a;
    public final double f8482b;
    public final double f8483c;
    public boolean d;

    public u0(double d, double d10, double d11) {
        this.f8481a = d;
        this.f8482b = d10;
        this.f8483c = d11;
    }

    public final float a(u0 u0Var) {
        return (float) Math.sqrt(Math.pow(this.f8483c - u0Var.f8483c, 2.0d) + Math.pow(this.f8482b - u0Var.f8482b, 2.0d) + Math.pow(this.f8481a - u0Var.f8481a, 2.0d));
    }

    public final u0 b(u0 u0Var) {
        return new u0((this.f8481a + u0Var.f8481a) * 0.5d, (this.f8482b + u0Var.f8482b) * 0.5d, (this.f8483c + u0Var.f8483c) * 0.5d);
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
        if (this.f8481a != u0Var.f8481a || this.f8482b != u0Var.f8482b || this.f8483c != u0Var.f8483c) {
            return false;
        }
        return true;
    }

    public u0(double d, double d10, double d11, int i10) {
        this.f8481a = d;
        this.f8482b = d10;
        this.f8483c = d11;
        this.d = true;
    }
}
