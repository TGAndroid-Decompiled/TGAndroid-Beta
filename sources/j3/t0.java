package j3;
public abstract class t0 implements g {
    public static final u0 f8801f = new t0(new s0());
    public static final String h;
    public static final String f8802n;
    public static final String f8803r;
    public static final String f8804s;
    public static final String v;
    public static final q0 f8805w;
    public final long f8806a;
    public final long f8807b;
    public final boolean f8808c;
    public final boolean d;
    public final boolean e;

    static {
        int i10 = h5.d0.f6924a;
        h = Integer.toString(0, 36);
        f8802n = Integer.toString(1, 36);
        f8803r = Integer.toString(2, 36);
        f8804s = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f8805w = new q0(1);
    }

    public t0(s0 s0Var) {
        this.f8806a = s0Var.f8796a;
        this.f8807b = s0Var.f8797b;
        this.f8808c = s0Var.f8798c;
        this.d = s0Var.d;
        this.e = s0Var.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (this.f8806a == t0Var.f8806a && this.f8807b == t0Var.f8807b && this.f8808c == t0Var.f8808c && this.d == t0Var.d && this.e == t0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f8806a;
        long j11 = this.f8807b;
        return (((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f8808c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0);
    }
}
