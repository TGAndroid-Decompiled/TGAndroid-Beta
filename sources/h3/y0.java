package h3;

public abstract class y0 implements g {

    public static final z0 f8247f = new z0(new x0());
    public static final String h;

    public static final String f8248n;

    public static final String f8249r;

    public static final String f8250s;
    public static final String v;

    public static final f9.z f8251w;

    public final long f8252a;

    public final long f8253b;

    public final boolean f8254c;
    public final boolean d;

    public final boolean f8255e;

    static {
        int i10 = d5.g0.f4795a;
        h = Integer.toString(0, 36);
        f8248n = Integer.toString(1, 36);
        f8249r = Integer.toString(2, 36);
        f8250s = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f8251w = new f9.z(21);
    }

    public y0(x0 x0Var) {
        this.f8252a = x0Var.f8238a;
        this.f8253b = x0Var.f8239b;
        this.f8254c = x0Var.f8240c;
        this.d = x0Var.d;
        this.f8255e = x0Var.f8241e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.f8252a == y0Var.f8252a && this.f8253b == y0Var.f8253b && this.f8254c == y0Var.f8254c && this.d == y0Var.d && this.f8255e == y0Var.f8255e;
    }

    public final int hashCode() {
        long j10 = this.f8252a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f8253b;
        return ((((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f8254c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f8255e ? 1 : 0);
    }
}
