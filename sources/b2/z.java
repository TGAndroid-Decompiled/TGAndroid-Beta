package b2;
public class z {
    public static final z f3360i = new z(new y());
    public static final String f3361j = Integer.toString(0, 36);
    public static final String f3362k = Integer.toString(1, 36);
    public static final String f3363l = Integer.toString(2, 36);
    public static final String f3364m = Integer.toString(3, 36);
    public static final String f3365n = Integer.toString(4, 36);
    public static final String f3366o = Integer.toString(5, 36);
    public static final String f3367p = Integer.toString(6, 36);
    public static final String f3368q = Integer.toString(7, 36);
    public final long f3369a;
    public final long f3370b;
    public final long f3371c;
    public final long d;
    public final boolean e;
    public final boolean f3372f;
    public final boolean f3373g;
    public final boolean h;

    public z(y yVar) {
        this.f3369a = e2.d0.e0(yVar.f3355a);
        this.f3371c = e2.d0.e0(yVar.f3356b);
        this.f3370b = yVar.f3355a;
        this.d = yVar.f3356b;
        this.e = yVar.f3357c;
        this.f3372f = yVar.d;
        this.f3373g = yVar.e;
        this.h = yVar.f3358f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f3370b == zVar.f3370b && this.d == zVar.d && this.e == zVar.e && this.f3372f == zVar.f3372f && this.f3373g == zVar.f3373g && this.h == zVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f3370b;
        long j10 = this.d;
        return (((((((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f3372f ? 1 : 0)) * 31) + (this.f3373g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
