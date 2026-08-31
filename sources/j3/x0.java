package j3;
public final class x0 implements g {
    public static final x0 f9472f = new x0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
    public static final String h;
    public static final String f9473n;
    public static final String f9474r;
    public static final String f9475s;
    public static final String v;
    public static final q0 f9476w;
    public final long f9477a;
    public final long f9478b;
    public final long f9479c;
    public final float d;
    public final float f9480e;

    static {
        int i10 = h5.d0.f7237a;
        h = Integer.toString(0, 36);
        f9473n = Integer.toString(1, 36);
        f9474r = Integer.toString(2, 36);
        f9475s = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f9476w = new q0(3);
    }

    public x0(long j10, long j11, long j12, float f10, float f11) {
        this.f9477a = j10;
        this.f9478b = j11;
        this.f9479c = j12;
        this.d = f10;
        this.f9480e = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (this.f9477a == x0Var.f9477a && this.f9478b == x0Var.f9478b && this.f9479c == x0Var.f9479c && this.d == x0Var.d && this.f9480e == x0Var.f9480e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.f9477a;
        long j11 = this.f9478b;
        long j12 = this.f9479c;
        int i11 = ((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        int i12 = 0;
        float f10 = this.d;
        if (f10 != 0.0f) {
            i10 = Float.floatToIntBits(f10);
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        float f11 = this.f9480e;
        if (f11 != 0.0f) {
            i12 = Float.floatToIntBits(f11);
        }
        return i13 + i12;
    }
}
