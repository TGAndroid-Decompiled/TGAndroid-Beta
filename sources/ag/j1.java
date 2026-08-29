package ag;
public final class j1 {
    public final double f554a;
    public final double f555b;
    public final double f556c;
    public boolean d;

    public j1(double d, double d10, double d11) {
        this.f554a = d;
        this.f555b = d10;
        this.f556c = d11;
    }

    public final float a(j1 j1Var) {
        return (float) Math.sqrt(Math.pow(this.f556c - j1Var.f556c, 2.0d) + Math.pow(this.f555b - j1Var.f555b, 2.0d) + Math.pow(this.f554a - j1Var.f554a, 2.0d));
    }

    public final j1 b(j1 j1Var) {
        return new j1((this.f554a + j1Var.f554a) * 0.5d, (this.f555b + j1Var.f555b) * 0.5d, (this.f556c + j1Var.f556c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        if (this.f554a != j1Var.f554a || this.f555b != j1Var.f555b || this.f556c != j1Var.f556c) {
            return false;
        }
        return true;
    }

    public j1(double d, double d10, double d11, int i10) {
        this.f554a = d;
        this.f555b = d10;
        this.f556c = d11;
        this.d = true;
    }
}
