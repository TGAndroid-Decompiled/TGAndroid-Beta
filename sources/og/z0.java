package og;
public final class z0 {
    public final double f14577a;
    public final double f14578b;
    public final double f14579c;
    public boolean d;

    public z0(double d, double d10, double d11) {
        this.f14577a = d;
        this.f14578b = d10;
        this.f14579c = d11;
    }

    public final float a(z0 z0Var) {
        return (float) Math.sqrt(Math.pow(this.f14579c - z0Var.f14579c, 2.0d) + Math.pow(this.f14578b - z0Var.f14578b, 2.0d) + Math.pow(this.f14577a - z0Var.f14577a, 2.0d));
    }

    public final z0 b(z0 z0Var) {
        return new z0((this.f14577a + z0Var.f14577a) * 0.5d, (this.f14578b + z0Var.f14578b) * 0.5d, (this.f14579c + z0Var.f14579c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (this.f14577a != z0Var.f14577a || this.f14578b != z0Var.f14578b || this.f14579c != z0Var.f14579c) {
            return false;
        }
        return true;
    }

    public z0(double d, double d10, double d11, int i10) {
        this.f14577a = d;
        this.f14578b = d10;
        this.f14579c = d11;
        this.d = true;
    }
}
