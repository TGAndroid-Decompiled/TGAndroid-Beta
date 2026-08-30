package j3;
public final class x0 implements g {
    public static final x0 f8875f = new x0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
    public static final String h;
    public static final String f8876n;
    public static final String f8877r;
    public static final String f8878s;
    public static final String v;
    public static final q0 f8879w;
    public final long f8880a;
    public final long f8881b;
    public final long f8882c;
    public final float d;
    public final float e;

    static {
        int i10 = h5.d0.f6937a;
        h = Integer.toString(0, 36);
        f8876n = Integer.toString(1, 36);
        f8877r = Integer.toString(2, 36);
        f8878s = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f8879w = new q0(3);
    }

    public x0(long j10, long j11, long j12, float f10, float f11) {
        this.f8880a = j10;
        this.f8881b = j11;
        this.f8882c = j12;
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
        if (this.f8880a == x0Var.f8880a && this.f8881b == x0Var.f8881b && this.f8882c == x0Var.f8882c && this.d == x0Var.d && this.e == x0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.f8880a;
        long j11 = this.f8881b;
        long j12 = this.f8882c;
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
