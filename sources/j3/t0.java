package j3;
public abstract class t0 implements g {
    public static final u0 f9412f = new t0(new s0());
    public static final String h;
    public static final String f9413n;
    public static final String f9414r;
    public static final String f9415s;
    public static final String v;
    public static final q0 f9416w;
    public final long f9417a;
    public final long f9418b;
    public final boolean f9419c;
    public final boolean d;
    public final boolean f9420e;

    static {
        int i10 = h5.d0.f7237a;
        h = Integer.toString(0, 36);
        f9413n = Integer.toString(1, 36);
        f9414r = Integer.toString(2, 36);
        f9415s = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f9416w = new q0(1);
    }

    public t0(s0 s0Var) {
        this.f9417a = s0Var.f9405a;
        this.f9418b = s0Var.f9406b;
        this.f9419c = s0Var.f9407c;
        this.d = s0Var.d;
        this.f9420e = s0Var.f9408e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (this.f9417a == t0Var.f9417a && this.f9418b == t0Var.f9418b && this.f9419c == t0Var.f9419c && this.d == t0Var.d && this.f9420e == t0Var.f9420e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f9417a;
        long j11 = this.f9418b;
        return (((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f9419c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f9420e ? 1 : 0);
    }
}
