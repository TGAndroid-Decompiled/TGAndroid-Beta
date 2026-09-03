package j3;
public final class x0 implements g {
    public static final x0 f8857f = new x0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
    public static final String h;
    public static final String f8858n;
    public static final String f8859r;
    public static final String f8860s;
    public static final String v;
    public static final q0 f8861w;
    public final long f8862a;
    public final long f8863b;
    public final long f8864c;
    public final float d;
    public final float e;

    static {
        int i10 = h5.d0.f6924a;
        h = Integer.toString(0, 36);
        f8858n = Integer.toString(1, 36);
        f8859r = Integer.toString(2, 36);
        f8860s = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f8861w = new q0(3);
    }

    public x0(long j10, long j11, long j12, float f10, float f11) {
        this.f8862a = j10;
        this.f8863b = j11;
        this.f8864c = j12;
        this.d = f10;
        this.e = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (this.f8862a == x0Var.f8862a && this.f8863b == x0Var.f8863b && this.f8864c == x0Var.f8864c && this.d == x0Var.d && this.e == x0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.f8862a;
        long j11 = this.f8863b;
        long j12 = this.f8864c;
        int i11 = ((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        int i12 = 0;
        float f10 = this.d;
        if (f10 != 0.0f) {
            i10 = Float.floatToIntBits(f10);
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        float f11 = this.e;
        if (f11 != 0.0f) {
            i12 = Float.floatToIntBits(f11);
        }
        return i13 + i12;
    }
}
