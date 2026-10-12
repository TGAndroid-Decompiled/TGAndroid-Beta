package b2;
public class z {
    public static final z f3697i = new z(new y());
    public static final String f3698j = Integer.toString(0, 36);
    public static final String f3699k = Integer.toString(1, 36);
    public static final String f3700l = Integer.toString(2, 36);
    public static final String f3701m = Integer.toString(3, 36);
    public static final String f3702n = Integer.toString(4, 36);
    public static final String f3703o = Integer.toString(5, 36);
    public static final String f3704p = Integer.toString(6, 36);
    public static final String f3705q = Integer.toString(7, 36);
    public final long f3706a;
    public final long f3707b;
    public final long f3708c;
    public final long d;
    public final boolean f3709e;
    public final boolean f3710f;
    public final boolean f3711g;
    public final boolean h;

    public z(y yVar) {
        this.f3706a = e2.d0.d0(yVar.f3691a);
        this.f3708c = e2.d0.d0(yVar.f3692b);
        this.f3707b = yVar.f3691a;
        this.d = yVar.f3692b;
        this.f3709e = yVar.f3693c;
        this.f3710f = yVar.d;
        this.f3711g = yVar.f3694e;
        this.h = yVar.f3695f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f3707b == zVar.f3707b && this.d == zVar.d && this.f3709e == zVar.f3709e && this.f3710f == zVar.f3710f && this.f3711g == zVar.f3711g && this.h == zVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f3707b;
        long j10 = this.d;
        return (((((((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31) + (this.f3709e ? 1 : 0)) * 31) + (this.f3710f ? 1 : 0)) * 31) + (this.f3711g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
