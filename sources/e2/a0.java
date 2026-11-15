package e2;
public class a0 {
    public static final a0 f9996i = new a0(new z());
    public static final String f9997j = Integer.toString(0, 36);
    public static final String f9998k = Integer.toString(1, 36);
    public static final String f9999l = Integer.toString(2, 36);
    public static final String f10000m = Integer.toString(3, 36);
    public static final String f10001n = Integer.toString(4, 36);
    public static final String f10002o = Integer.toString(5, 36);
    public static final String f10003p = Integer.toString(6, 36);
    public static final String f10004q = Integer.toString(7, 36);
    public final long f10005a;
    public final long f10006b;
    public final long f10007c;
    public final long d;
    public final boolean f10008e;
    public final boolean f10009f;
    public final boolean f10010g;
    public final boolean h;

    public a0(z zVar) {
        this.f10005a = h2.l0.h0(zVar.f10493a);
        this.f10007c = h2.l0.h0(zVar.f10494b);
        this.f10006b = zVar.f10493a;
        this.d = zVar.f10494b;
        this.f10008e = zVar.f10495c;
        this.f10009f = zVar.d;
        this.f10010g = zVar.f10496e;
        this.h = zVar.f10497f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f10006b == a0Var.f10006b && this.d == a0Var.d && this.f10008e == a0Var.f10008e && this.f10009f == a0Var.f10009f && this.f10010g == a0Var.f10010g && this.h == a0Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f10006b;
        long j10 = this.d;
        return (((((((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31) + (this.f10008e ? 1 : 0)) * 31) + (this.f10009f ? 1 : 0)) * 31) + (this.f10010g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
