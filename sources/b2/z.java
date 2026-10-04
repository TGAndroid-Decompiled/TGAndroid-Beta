package b2;
public class z {
    public static final z f3620i = new z(new y());
    public static final String f3621j = Integer.toString(0, 36);
    public static final String f3622k = Integer.toString(1, 36);
    public static final String f3623l = Integer.toString(2, 36);
    public static final String f3624m = Integer.toString(3, 36);
    public static final String f3625n = Integer.toString(4, 36);
    public static final String f3626o = Integer.toString(5, 36);
    public static final String f3627p = Integer.toString(6, 36);
    public static final String f3628q = Integer.toString(7, 36);
    public final long f3629a;
    public final long f3630b;
    public final long f3631c;
    public final long d;
    public final boolean f3632e;
    public final boolean f3633f;
    public final boolean f3634g;
    public final boolean h;

    public z(y yVar) {
        this.f3629a = e2.d0.e0(yVar.f3614a);
        this.f3631c = e2.d0.e0(yVar.f3615b);
        this.f3630b = yVar.f3614a;
        this.d = yVar.f3615b;
        this.f3632e = yVar.f3616c;
        this.f3633f = yVar.d;
        this.f3634g = yVar.f3617e;
        this.h = yVar.f3618f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f3630b == zVar.f3630b && this.d == zVar.d && this.f3632e == zVar.f3632e && this.f3633f == zVar.f3633f && this.f3634g == zVar.f3634g && this.h == zVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f3630b;
        long j10 = this.d;
        return (((((((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f3632e ? 1 : 0)) * 31) + (this.f3633f ? 1 : 0)) * 31) + (this.f3634g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
