package b2;
public class z {
    public static final z f3357i = new z(new y());
    public static final String f3358j = Integer.toString(0, 36);
    public static final String f3359k = Integer.toString(1, 36);
    public static final String f3360l = Integer.toString(2, 36);
    public static final String f3361m = Integer.toString(3, 36);
    public static final String f3362n = Integer.toString(4, 36);
    public static final String f3363o = Integer.toString(5, 36);
    public static final String f3364p = Integer.toString(6, 36);
    public static final String f3365q = Integer.toString(7, 36);
    public final long f3366a;
    public final long f3367b;
    public final long f3368c;
    public final long d;
    public final boolean e;
    public final boolean f3369f;
    public final boolean f3370g;
    public final boolean h;

    public z(y yVar) {
        this.f3366a = e2.d0.e0(yVar.f3352a);
        this.f3368c = e2.d0.e0(yVar.f3353b);
        this.f3367b = yVar.f3352a;
        this.d = yVar.f3353b;
        this.e = yVar.f3354c;
        this.f3369f = yVar.d;
        this.f3370g = yVar.e;
        this.h = yVar.f3355f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f3367b == zVar.f3367b && this.d == zVar.d && this.e == zVar.e && this.f3369f == zVar.f3369f && this.f3370g == zVar.f3370g && this.h == zVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f3367b;
        long j10 = this.d;
        return (((((((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f3369f ? 1 : 0)) * 31) + (this.f3370g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
