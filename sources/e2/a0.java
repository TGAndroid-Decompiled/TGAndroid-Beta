package e2;
public class a0 {
    public static final a0 f10343i = new a0(new z());
    public static final String f10344j = Integer.toString(0, 36);
    public static final String f10345k = Integer.toString(1, 36);
    public static final String f10346l = Integer.toString(2, 36);
    public static final String f10347m = Integer.toString(3, 36);
    public static final String f10348n = Integer.toString(4, 36);
    public static final String f10349o = Integer.toString(5, 36);
    public static final String f10350p = Integer.toString(6, 36);
    public static final String f10351q = Integer.toString(7, 36);
    public final long f10352a;
    public final long f10353b;
    public final long f10354c;
    public final long d;
    public final boolean f10355e;
    public final boolean f10356f;
    public final boolean f10357g;
    public final boolean h;

    public a0(z zVar) {
        this.f10352a = h2.l0.h0(zVar.f10840a);
        this.f10354c = h2.l0.h0(zVar.f10841b);
        this.f10353b = zVar.f10840a;
        this.d = zVar.f10841b;
        this.f10355e = zVar.f10842c;
        this.f10356f = zVar.d;
        this.f10357g = zVar.f10843e;
        this.h = zVar.f10844f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f10353b == a0Var.f10353b && this.d == a0Var.d && this.f10355e == a0Var.f10355e && this.f10356f == a0Var.f10356f && this.f10357g == a0Var.f10357g && this.h == a0Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f10353b;
        long j10 = this.d;
        return (((((((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31) + (this.f10355e ? 1 : 0)) * 31) + (this.f10356f ? 1 : 0)) * 31) + (this.f10357g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
