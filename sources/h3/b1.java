package h3;

public final class b1 implements g {

    public static final b1 f7777f = new b1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
    public static final String h;

    public static final String f7778n;

    public static final String f7779r;

    public static final String f7780s;
    public static final String v;

    public static final f9.z f7781w;

    public final long f7782a;

    public final long f7783b;

    public final long f7784c;
    public final float d;

    public final float f7785e;

    static {
        int i10 = d5.g0.f4795a;
        h = Integer.toString(0, 36);
        f7778n = Integer.toString(1, 36);
        f7779r = Integer.toString(2, 36);
        f7780s = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f7781w = new f9.z(22);
    }

    public b1(long j10, long j11, long j12, float f10, float f11) {
        this.f7782a = j10;
        this.f7783b = j11;
        this.f7784c = j12;
        this.d = f10;
        this.f7785e = f11;
    }

    public final a1 a() {
        a1 a1Var = new a1();
        a1Var.f7767a = this.f7782a;
        a1Var.f7768b = this.f7783b;
        a1Var.f7769c = this.f7784c;
        a1Var.d = this.d;
        a1Var.f7770e = this.f7785e;
        return a1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.f7782a == b1Var.f7782a && this.f7783b == b1Var.f7783b && this.f7784c == b1Var.f7784c && this.d == b1Var.d && this.f7785e == b1Var.f7785e;
    }

    public final int hashCode() {
        long j10 = this.f7782a;
        long j11 = this.f7783b;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f7784c;
        int i11 = (i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        float f10 = this.d;
        int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f7785e;
        return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }
}
