package e2;
public class a0 {
    public static final a0 f10306i = new a0(new z());
    public static final String f10307j = Integer.toString(0, 36);
    public static final String f10308k = Integer.toString(1, 36);
    public static final String f10309l = Integer.toString(2, 36);
    public static final String f10310m = Integer.toString(3, 36);
    public static final String f10311n = Integer.toString(4, 36);
    public static final String f10312o = Integer.toString(5, 36);
    public static final String f10313p = Integer.toString(6, 36);
    public static final String f10314q = Integer.toString(7, 36);
    public final long f10315a;
    public final long f10316b;
    public final long f10317c;
    public final long d;
    public final boolean f10318e;
    public final boolean f10319f;
    public final boolean f10320g;
    public final boolean h;

    public a0(z zVar) {
        this.f10315a = h2.l0.h0(zVar.f10803a);
        this.f10317c = h2.l0.h0(zVar.f10804b);
        this.f10316b = zVar.f10803a;
        this.d = zVar.f10804b;
        this.f10318e = zVar.f10805c;
        this.f10319f = zVar.d;
        this.f10320g = zVar.f10806e;
        this.h = zVar.f10807f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f10316b == a0Var.f10316b && this.d == a0Var.d && this.f10318e == a0Var.f10318e && this.f10319f == a0Var.f10319f && this.f10320g == a0Var.f10320g && this.h == a0Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f10316b;
        long j10 = this.d;
        return (((((((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31) + (this.f10318e ? 1 : 0)) * 31) + (this.f10319f ? 1 : 0)) * 31) + (this.f10320g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
