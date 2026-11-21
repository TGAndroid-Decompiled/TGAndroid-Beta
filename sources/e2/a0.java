package e2;
public class a0 {
    public static final a0 f10340i = new a0(new z());
    public static final String f10341j = Integer.toString(0, 36);
    public static final String f10342k = Integer.toString(1, 36);
    public static final String f10343l = Integer.toString(2, 36);
    public static final String f10344m = Integer.toString(3, 36);
    public static final String f10345n = Integer.toString(4, 36);
    public static final String f10346o = Integer.toString(5, 36);
    public static final String f10347p = Integer.toString(6, 36);
    public static final String f10348q = Integer.toString(7, 36);
    public final long f10349a;
    public final long f10350b;
    public final long f10351c;
    public final long d;
    public final boolean f10352e;
    public final boolean f10353f;
    public final boolean f10354g;
    public final boolean h;

    public a0(z zVar) {
        this.f10349a = h2.l0.h0(zVar.f10837a);
        this.f10351c = h2.l0.h0(zVar.f10838b);
        this.f10350b = zVar.f10837a;
        this.d = zVar.f10838b;
        this.f10352e = zVar.f10839c;
        this.f10353f = zVar.d;
        this.f10354g = zVar.f10840e;
        this.h = zVar.f10841f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f10350b == a0Var.f10350b && this.d == a0Var.d && this.f10352e == a0Var.f10352e && this.f10353f == a0Var.f10353f && this.f10354g == a0Var.f10354g && this.h == a0Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f10350b;
        long j10 = this.d;
        return (((((((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31) + (this.f10352e ? 1 : 0)) * 31) + (this.f10353f ? 1 : 0)) * 31) + (this.f10354g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
