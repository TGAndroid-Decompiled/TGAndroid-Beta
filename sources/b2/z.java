package b2;
public class z {
    public static final z f2053i = new z(new y());
    public static final String f2054j = Integer.toString(0, 36);
    public static final String f2055k = Integer.toString(1, 36);
    public static final String f2056l = Integer.toString(2, 36);
    public static final String f2057m = Integer.toString(3, 36);
    public static final String f2058n = Integer.toString(4, 36);
    public static final String f2059o = Integer.toString(5, 36);
    public static final String f2060p = Integer.toString(6, 36);
    public static final String f2061q = Integer.toString(7, 36);
    public final long f2062a;
    public final long f2063b;
    public final long f2064c;
    public final long d;
    public final boolean e;
    public final boolean f2065f;
    public final boolean f2066g;
    public final boolean h;

    public z(y yVar) {
        this.f2062a = e2.d0.e0(yVar.f2048a);
        this.f2064c = e2.d0.e0(yVar.f2049b);
        this.f2063b = yVar.f2048a;
        this.d = yVar.f2049b;
        this.e = yVar.f2050c;
        this.f2065f = yVar.d;
        this.f2066g = yVar.e;
        this.h = yVar.f2051f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f2063b == zVar.f2063b && this.d == zVar.d && this.e == zVar.e && this.f2065f == zVar.f2065f && this.f2066g == zVar.f2066g && this.h == zVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f2063b;
        long j10 = this.d;
        return (((((((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f2065f ? 1 : 0)) * 31) + (this.f2066g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
