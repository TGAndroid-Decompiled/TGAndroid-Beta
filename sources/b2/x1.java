package b2;
public final class x1 {
    public static final x1 d = new x1(0, 0);
    public static final String e;
    public static final String f3350f;
    public static final String f3351g;
    public final int f3352a;
    public final int f3353b;
    public final float f3354c;

    static {
        String str = e2.d0.f7888a;
        e = Integer.toString(0, 36);
        f3350f = Integer.toString(1, 36);
        f3351g = Integer.toString(3, 36);
    }

    public x1(int i10, int i11) {
        this(1.0f, i10, i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x1) {
            x1 x1Var = (x1) obj;
            if (this.f3352a == x1Var.f3352a && this.f3353b == x1Var.f3353b && this.f3354c == x1Var.f3354c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3354c) + ((((217 + this.f3352a) * 31) + this.f3353b) * 31);
    }

    public x1(float f7, int i10, int i11) {
        this.f3352a = i10;
        this.f3353b = i11;
        this.f3354c = f7;
    }
}
