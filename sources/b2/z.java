package b2;
public class z {
    public static final z f3699i = new z(new y());
    public static final String f3700j = Integer.toString(0, 36);
    public static final String f3701k = Integer.toString(1, 36);
    public static final String f3702l = Integer.toString(2, 36);
    public static final String f3703m = Integer.toString(3, 36);
    public static final String f3704n = Integer.toString(4, 36);
    public static final String f3705o = Integer.toString(5, 36);
    public static final String f3706p = Integer.toString(6, 36);
    public static final String f3707q = Integer.toString(7, 36);
    public final long f3708a;
    public final long f3709b;
    public final long f3710c;
    public final long d;
    public final boolean f3711e;
    public final boolean f3712f;
    public final boolean f3713g;
    public final boolean h;

    public z(y yVar) {
        this.f3708a = e2.d0.d0(yVar.f3693a);
        this.f3710c = e2.d0.d0(yVar.f3694b);
        this.f3709b = yVar.f3693a;
        this.d = yVar.f3694b;
        this.f3711e = yVar.f3695c;
        this.f3712f = yVar.d;
        this.f3713g = yVar.f3696e;
        this.h = yVar.f3697f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f3709b == zVar.f3709b && this.d == zVar.d && this.f3711e == zVar.f3711e && this.f3712f == zVar.f3712f && this.f3713g == zVar.f3713g && this.h == zVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f3709b;
        long j10 = this.d;
        return (((((((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31) + (this.f3711e ? 1 : 0)) * 31) + (this.f3712f ? 1 : 0)) * 31) + (this.f3713g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
