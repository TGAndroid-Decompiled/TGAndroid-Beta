package e2;
public class a0 {
    public static final a0 f10311i = new a0(new z());
    public static final String f10312j = Integer.toString(0, 36);
    public static final String f10313k = Integer.toString(1, 36);
    public static final String f10314l = Integer.toString(2, 36);
    public static final String f10315m = Integer.toString(3, 36);
    public static final String f10316n = Integer.toString(4, 36);
    public static final String f10317o = Integer.toString(5, 36);
    public static final String f10318p = Integer.toString(6, 36);
    public static final String f10319q = Integer.toString(7, 36);
    public final long f10320a;
    public final long f10321b;
    public final long f10322c;
    public final long d;
    public final boolean f10323e;
    public final boolean f10324f;
    public final boolean f10325g;
    public final boolean h;

    public a0(z zVar) {
        this.f10320a = h2.l0.h0(zVar.f10808a);
        this.f10322c = h2.l0.h0(zVar.f10809b);
        this.f10321b = zVar.f10808a;
        this.d = zVar.f10809b;
        this.f10323e = zVar.f10810c;
        this.f10324f = zVar.d;
        this.f10325g = zVar.f10811e;
        this.h = zVar.f10812f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f10321b == a0Var.f10321b && this.d == a0Var.d && this.f10323e == a0Var.f10323e && this.f10324f == a0Var.f10324f && this.f10325g == a0Var.f10325g && this.h == a0Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f10321b;
        long j10 = this.d;
        return (((((((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31) + (this.f10323e ? 1 : 0)) * 31) + (this.f10324f ? 1 : 0)) * 31) + (this.f10325g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
