package b2;
public class e0 {
    public static final e0 f3166i = new e0(new d0());
    public static final String f3167j = Integer.toString(0, 36);
    public static final String f3168k = Integer.toString(1, 36);
    public static final String f3169l = Integer.toString(2, 36);
    public static final String f3170m = Integer.toString(3, 36);
    public static final String f3171n = Integer.toString(4, 36);
    public static final String f3172o = Integer.toString(5, 36);
    public static final String f3173p = Integer.toString(6, 36);
    public static final String f3174q = Integer.toString(7, 36);
    public final long f3175a;
    public final long f3176b;
    public final long f3177c;
    public final long d;
    public final boolean e;
    public final boolean f3178f;
    public final boolean f3179g;
    public final boolean h;

    public e0(d0 d0Var) {
        this.f3175a = e2.n0.h0(d0Var.f3161a);
        this.f3177c = e2.n0.h0(d0Var.f3162b);
        this.f3176b = d0Var.f3161a;
        this.d = d0Var.f3162b;
        this.e = d0Var.f3163c;
        this.f3178f = d0Var.d;
        this.f3179g = d0Var.e;
        this.h = d0Var.f3164f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.f3176b == e0Var.f3176b && this.d == e0Var.d && this.e == e0Var.e && this.f3178f == e0Var.f3178f && this.f3179g == e0Var.f3179g && this.h == e0Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f3176b;
        long j11 = this.d;
        return (((((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f3178f ? 1 : 0)) * 31) + (this.f3179g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
