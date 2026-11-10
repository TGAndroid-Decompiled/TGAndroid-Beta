package e2;
public class a0 {
    public static final a0 f10165i = new a0(new z());
    public static final String f10166j = Integer.toString(0, 36);
    public static final String f10167k = Integer.toString(1, 36);
    public static final String f10168l = Integer.toString(2, 36);
    public static final String f10169m = Integer.toString(3, 36);
    public static final String f10170n = Integer.toString(4, 36);
    public static final String f10171o = Integer.toString(5, 36);
    public static final String f10172p = Integer.toString(6, 36);
    public static final String f10173q = Integer.toString(7, 36);
    public final long f10174a;
    public final long f10175b;
    public final long f10176c;
    public final long d;
    public final boolean f10177e;
    public final boolean f10178f;
    public final boolean f10179g;
    public final boolean h;

    public a0(z zVar) {
        this.f10174a = h2.m0.h0(zVar.f10662a);
        this.f10176c = h2.m0.h0(zVar.f10663b);
        this.f10175b = zVar.f10662a;
        this.d = zVar.f10663b;
        this.f10177e = zVar.f10664c;
        this.f10178f = zVar.d;
        this.f10179g = zVar.f10665e;
        this.h = zVar.f10666f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f10175b == a0Var.f10175b && this.d == a0Var.d && this.f10177e == a0Var.f10177e && this.f10178f == a0Var.f10178f && this.f10179g == a0Var.f10179g && this.h == a0Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f10175b;
        long j10 = this.d;
        return (((((((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31) + (this.f10177e ? 1 : 0)) * 31) + (this.f10178f ? 1 : 0)) * 31) + (this.f10179g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
