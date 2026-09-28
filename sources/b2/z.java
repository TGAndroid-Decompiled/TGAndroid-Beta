package b2;
public class z {
    public static final z f3352i = new z(new y());
    public static final String f3353j = Integer.toString(0, 36);
    public static final String f3354k = Integer.toString(1, 36);
    public static final String f3355l = Integer.toString(2, 36);
    public static final String f3356m = Integer.toString(3, 36);
    public static final String f3357n = Integer.toString(4, 36);
    public static final String f3358o = Integer.toString(5, 36);
    public static final String f3359p = Integer.toString(6, 36);
    public static final String f3360q = Integer.toString(7, 36);
    public final long f3361a;
    public final long f3362b;
    public final long f3363c;
    public final long d;
    public final boolean e;
    public final boolean f3364f;
    public final boolean f3365g;
    public final boolean h;

    public z(y yVar) {
        this.f3361a = e2.d0.e0(yVar.f3347a);
        this.f3363c = e2.d0.e0(yVar.f3348b);
        this.f3362b = yVar.f3347a;
        this.d = yVar.f3348b;
        this.e = yVar.f3349c;
        this.f3364f = yVar.d;
        this.f3365g = yVar.e;
        this.h = yVar.f3350f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f3362b == zVar.f3362b && this.d == zVar.d && this.e == zVar.e && this.f3364f == zVar.f3364f && this.f3365g == zVar.f3365g && this.h == zVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f3362b;
        long j10 = this.d;
        return (((((((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f3364f ? 1 : 0)) * 31) + (this.f3365g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
