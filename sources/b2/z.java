package b2;
public class z {
    public static final z f3355i = new z(new y());
    public static final String f3356j = Integer.toString(0, 36);
    public static final String f3357k = Integer.toString(1, 36);
    public static final String f3358l = Integer.toString(2, 36);
    public static final String f3359m = Integer.toString(3, 36);
    public static final String f3360n = Integer.toString(4, 36);
    public static final String f3361o = Integer.toString(5, 36);
    public static final String f3362p = Integer.toString(6, 36);
    public static final String f3363q = Integer.toString(7, 36);
    public final long f3364a;
    public final long f3365b;
    public final long f3366c;
    public final long d;
    public final boolean e;
    public final boolean f3367f;
    public final boolean f3368g;
    public final boolean h;

    public z(y yVar) {
        this.f3364a = e2.d0.e0(yVar.f3350a);
        this.f3366c = e2.d0.e0(yVar.f3351b);
        this.f3365b = yVar.f3350a;
        this.d = yVar.f3351b;
        this.e = yVar.f3352c;
        this.f3367f = yVar.d;
        this.f3368g = yVar.e;
        this.h = yVar.f3353f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f3365b == zVar.f3365b && this.d == zVar.d && this.e == zVar.e && this.f3367f == zVar.f3367f && this.f3368g == zVar.f3368g && this.h == zVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f3365b;
        long j10 = this.d;
        return (((((((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f3367f ? 1 : 0)) * 31) + (this.f3368g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
