package b2;
public class z {
    public static final z f2426i = new z(new y());
    public static final String f2427j = Integer.toString(0, 36);
    public static final String f2428k = Integer.toString(1, 36);
    public static final String f2429l = Integer.toString(2, 36);
    public static final String f2430m = Integer.toString(3, 36);
    public static final String f2431n = Integer.toString(4, 36);
    public static final String f2432o = Integer.toString(5, 36);
    public static final String f2433p = Integer.toString(6, 36);
    public static final String f2434q = Integer.toString(7, 36);
    public final long f2435a;
    public final long f2436b;
    public final long f2437c;
    public final long d;
    public final boolean f2438e;
    public final boolean f2439f;
    public final boolean f2440g;
    public final boolean h;

    public z(y yVar) {
        this.f2435a = e2.d0.e0(yVar.f2420a);
        this.f2437c = e2.d0.e0(yVar.f2421b);
        this.f2436b = yVar.f2420a;
        this.d = yVar.f2421b;
        this.f2438e = yVar.f2422c;
        this.f2439f = yVar.d;
        this.f2440g = yVar.f2423e;
        this.h = yVar.f2424f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f2436b == zVar.f2436b && this.d == zVar.d && this.f2438e == zVar.f2438e && this.f2439f == zVar.f2439f && this.f2440g == zVar.f2440g && this.h == zVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f2436b;
        long j10 = this.d;
        return (((((((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f2438e ? 1 : 0)) * 31) + (this.f2439f ? 1 : 0)) * 31) + (this.f2440g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
