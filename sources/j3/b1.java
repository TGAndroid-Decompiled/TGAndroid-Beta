package j3;
public final class b1 implements g {
    public static final b1 f10381f = new b1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
    public static final String h;
    public static final String f10382n;
    public static final String f10383r;
    public static final String f10384s;
    public static final String v;
    public static final d0 f10385w;
    public final long f10386a;
    public final long f10387b;
    public final long f10388c;
    public final float d;
    public final float f10389e;

    static {
        int i10 = f5.d0.f6579a;
        h = Integer.toString(0, 36);
        f10382n = Integer.toString(1, 36);
        f10383r = Integer.toString(2, 36);
        f10384s = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f10385w = new d0(5);
    }

    public b1(long j10, long j11, long j12, float f9, float f10) {
        this.f10386a = j10;
        this.f10387b = j11;
        this.f10388c = j12;
        this.d = f9;
        this.f10389e = f10;
    }

    public final a1 a() {
        ?? obj = new Object();
        obj.f10374a = this.f10386a;
        obj.f10375b = this.f10387b;
        obj.f10376c = this.f10388c;
        obj.d = this.d;
        obj.f10377e = this.f10389e;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (this.f10386a == b1Var.f10386a && this.f10387b == b1Var.f10387b && this.f10388c == b1Var.f10388c && this.d == b1Var.d && this.f10389e == b1Var.f10389e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.f10386a;
        long j11 = this.f10387b;
        long j12 = this.f10388c;
        int i11 = ((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        int i12 = 0;
        float f9 = this.d;
        if (f9 != 0.0f) {
            i10 = Float.floatToIntBits(f9);
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        float f10 = this.f10389e;
        if (f10 != 0.0f) {
            i12 = Float.floatToIntBits(f10);
        }
        return i13 + i12;
    }
}
