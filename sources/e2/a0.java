package e2;
public class a0 {
    public static final a0 f10160i = new a0(new z());
    public static final String f10161j = Integer.toString(0, 36);
    public static final String f10162k = Integer.toString(1, 36);
    public static final String f10163l = Integer.toString(2, 36);
    public static final String f10164m = Integer.toString(3, 36);
    public static final String f10165n = Integer.toString(4, 36);
    public static final String f10166o = Integer.toString(5, 36);
    public static final String f10167p = Integer.toString(6, 36);
    public static final String f10168q = Integer.toString(7, 36);
    public final long f10169a;
    public final long f10170b;
    public final long f10171c;
    public final long d;
    public final boolean f10172e;
    public final boolean f10173f;
    public final boolean f10174g;
    public final boolean h;

    public a0(z zVar) {
        this.f10169a = h2.m0.h0(zVar.f10657a);
        this.f10171c = h2.m0.h0(zVar.f10658b);
        this.f10170b = zVar.f10657a;
        this.d = zVar.f10658b;
        this.f10172e = zVar.f10659c;
        this.f10173f = zVar.d;
        this.f10174g = zVar.f10660e;
        this.h = zVar.f10661f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f10170b == a0Var.f10170b && this.d == a0Var.d && this.f10172e == a0Var.f10172e && this.f10173f == a0Var.f10173f && this.f10174g == a0Var.f10174g && this.h == a0Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f10170b;
        long j10 = this.d;
        return (((((((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31) + (this.f10172e ? 1 : 0)) * 31) + (this.f10173f ? 1 : 0)) * 31) + (this.f10174g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
