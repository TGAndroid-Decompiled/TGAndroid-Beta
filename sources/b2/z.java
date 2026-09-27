package b2;
public class z {
    public static final z f3354i = new z(new y());
    public static final String f3355j = Integer.toString(0, 36);
    public static final String f3356k = Integer.toString(1, 36);
    public static final String f3357l = Integer.toString(2, 36);
    public static final String f3358m = Integer.toString(3, 36);
    public static final String f3359n = Integer.toString(4, 36);
    public static final String f3360o = Integer.toString(5, 36);
    public static final String f3361p = Integer.toString(6, 36);
    public static final String f3362q = Integer.toString(7, 36);
    public final long f3363a;
    public final long f3364b;
    public final long f3365c;
    public final long d;
    public final boolean e;
    public final boolean f3366f;
    public final boolean f3367g;
    public final boolean h;

    public z(y yVar) {
        this.f3363a = e2.d0.e0(yVar.f3349a);
        this.f3365c = e2.d0.e0(yVar.f3350b);
        this.f3364b = yVar.f3349a;
        this.d = yVar.f3350b;
        this.e = yVar.f3351c;
        this.f3366f = yVar.d;
        this.f3367g = yVar.e;
        this.h = yVar.f3352f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f3364b == zVar.f3364b && this.d == zVar.d && this.e == zVar.e && this.f3366f == zVar.f3366f && this.f3367g == zVar.f3367g && this.h == zVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f3364b;
        long j10 = this.d;
        return (((((((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f3366f ? 1 : 0)) * 31) + (this.f3367g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
