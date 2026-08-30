package j3;
public abstract class t0 implements g {
    public static final u0 f8819f = new t0(new s0());
    public static final String h;
    public static final String f8820n;
    public static final String f8821r;
    public static final String f8822s;
    public static final String v;
    public static final q0 f8823w;
    public final long f8824a;
    public final long f8825b;
    public final boolean f8826c;
    public final boolean d;
    public final boolean e;

    static {
        int i10 = h5.d0.f6937a;
        h = Integer.toString(0, 36);
        f8820n = Integer.toString(1, 36);
        f8821r = Integer.toString(2, 36);
        f8822s = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f8823w = new q0(1);
    }

    public t0(s0 s0Var) {
        this.f8824a = s0Var.f8814a;
        this.f8825b = s0Var.f8815b;
        this.f8826c = s0Var.f8816c;
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
        if (this.f8824a == t0Var.f8824a && this.f8825b == t0Var.f8825b && this.f8826c == t0Var.f8826c && this.d == t0Var.d && this.e == t0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f8824a;
        long j11 = this.f8825b;
        return (((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f8826c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0);
    }
}
