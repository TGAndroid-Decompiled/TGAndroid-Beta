package b2;
public class z {
    public static final z f3359i = new z(new y());
    public static final String f3360j = Integer.toString(0, 36);
    public static final String f3361k = Integer.toString(1, 36);
    public static final String f3362l = Integer.toString(2, 36);
    public static final String f3363m = Integer.toString(3, 36);
    public static final String f3364n = Integer.toString(4, 36);
    public static final String f3365o = Integer.toString(5, 36);
    public static final String f3366p = Integer.toString(6, 36);
    public static final String f3367q = Integer.toString(7, 36);
    public final long f3368a;
    public final long f3369b;
    public final long f3370c;
    public final long d;
    public final boolean e;
    public final boolean f3371f;
    public final boolean f3372g;
    public final boolean h;

    public z(y yVar) {
        this.f3368a = e2.d0.e0(yVar.f3354a);
        this.f3370c = e2.d0.e0(yVar.f3355b);
        this.f3369b = yVar.f3354a;
        this.d = yVar.f3355b;
        this.e = yVar.f3356c;
        this.f3371f = yVar.d;
        this.f3372g = yVar.e;
        this.h = yVar.f3357f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f3369b == zVar.f3369b && this.d == zVar.d && this.e == zVar.e && this.f3371f == zVar.f3371f && this.f3372g == zVar.f3372g && this.h == zVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f3369b;
        long j10 = this.d;
        return (((((((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f3371f ? 1 : 0)) * 31) + (this.f3372g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
