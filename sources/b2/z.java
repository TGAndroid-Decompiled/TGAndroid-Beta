package b2;
public class z {
    public static final z f2453i = new z(new y());
    public static final String f2454j = Integer.toString(0, 36);
    public static final String f2455k = Integer.toString(1, 36);
    public static final String f2456l = Integer.toString(2, 36);
    public static final String f2457m = Integer.toString(3, 36);
    public static final String f2458n = Integer.toString(4, 36);
    public static final String f2459o = Integer.toString(5, 36);
    public static final String f2460p = Integer.toString(6, 36);
    public static final String f2461q = Integer.toString(7, 36);
    public final long f2462a;
    public final long f2463b;
    public final long f2464c;
    public final long d;
    public final boolean f2465e;
    public final boolean f2466f;
    public final boolean f2467g;
    public final boolean h;

    public z(y yVar) {
        this.f2462a = e2.d0.e0(yVar.f2447a);
        this.f2464c = e2.d0.e0(yVar.f2448b);
        this.f2463b = yVar.f2447a;
        this.d = yVar.f2448b;
        this.f2465e = yVar.f2449c;
        this.f2466f = yVar.d;
        this.f2467g = yVar.f2450e;
        this.h = yVar.f2451f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f2463b == zVar.f2463b && this.d == zVar.d && this.f2465e == zVar.f2465e && this.f2466f == zVar.f2466f && this.f2467g == zVar.f2467g && this.h == zVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f2463b;
        long j10 = this.d;
        return (((((((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f2465e ? 1 : 0)) * 31) + (this.f2466f ? 1 : 0)) * 31) + (this.f2467g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
