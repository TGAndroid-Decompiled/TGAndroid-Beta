package e2;
public class a0 {
    public static final a0 f10314i = new a0(new z());
    public static final String f10315j = Integer.toString(0, 36);
    public static final String f10316k = Integer.toString(1, 36);
    public static final String f10317l = Integer.toString(2, 36);
    public static final String f10318m = Integer.toString(3, 36);
    public static final String f10319n = Integer.toString(4, 36);
    public static final String f10320o = Integer.toString(5, 36);
    public static final String f10321p = Integer.toString(6, 36);
    public static final String f10322q = Integer.toString(7, 36);
    public final long f10323a;
    public final long f10324b;
    public final long f10325c;
    public final long d;
    public final boolean f10326e;
    public final boolean f10327f;
    public final boolean f10328g;
    public final boolean h;

    public a0(z zVar) {
        this.f10323a = h2.l0.h0(zVar.f10811a);
        this.f10325c = h2.l0.h0(zVar.f10812b);
        this.f10324b = zVar.f10811a;
        this.d = zVar.f10812b;
        this.f10326e = zVar.f10813c;
        this.f10327f = zVar.d;
        this.f10328g = zVar.f10814e;
        this.h = zVar.f10815f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f10324b == a0Var.f10324b && this.d == a0Var.d && this.f10326e == a0Var.f10326e && this.f10327f == a0Var.f10327f && this.f10328g == a0Var.f10328g && this.h == a0Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f10324b;
        long j10 = this.d;
        return (((((((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31) + (this.f10326e ? 1 : 0)) * 31) + (this.f10327f ? 1 : 0)) * 31) + (this.f10328g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
