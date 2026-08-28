package h3;

import fh.y5;
public final class b1 implements g {
    public static final b1 f9342f = new b1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
    public static final String h;
    public static final String f9343n;
    public static final String f9344r;
    public static final String f9345s;
    public static final String v;
    public static final y5 f9346w;
    public final long f9347a;
    public final long f9348b;
    public final long f9349c;
    public final float d;
    public final float f9350e;

    static {
        int i9 = d5.f0.f4349a;
        h = Integer.toString(0, 36);
        f9343n = Integer.toString(1, 36);
        f9344r = Integer.toString(2, 36);
        f9345s = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f9346w = new y5(18);
    }

    public b1(long j10, long j11, long j12, float f10, float f11) {
        this.f9347a = j10;
        this.f9348b = j11;
        this.f9349c = j12;
        this.d = f10;
        this.f9350e = f11;
    }

    public final a1 a() {
        ?? obj = new Object();
        obj.f9335a = this.f9347a;
        obj.f9336b = this.f9348b;
        obj.f9337c = this.f9349c;
        obj.d = this.d;
        obj.f9338e = this.f9350e;
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
        if (this.f9347a == b1Var.f9347a && this.f9348b == b1Var.f9348b && this.f9349c == b1Var.f9349c && this.d == b1Var.d && this.f9350e == b1Var.f9350e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        long j10 = this.f9347a;
        long j11 = this.f9348b;
        long j12 = this.f9349c;
        int i10 = ((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        int i11 = 0;
        float f10 = this.d;
        if (f10 != 0.0f) {
            i9 = Float.floatToIntBits(f10);
        } else {
            i9 = 0;
        }
        int i12 = (i10 + i9) * 31;
        float f11 = this.f9350e;
        if (f11 != 0.0f) {
            i11 = Float.floatToIntBits(f11);
        }
        return i12 + i11;
    }
}
