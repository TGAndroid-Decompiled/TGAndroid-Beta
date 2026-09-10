package b2;
public final class x1 {
    public static final x1 d = new x1(0, 0);
    public static final String e;
    public static final String f2043f;
    public static final String f2044g;
    public final int f2045a;
    public final int f2046b;
    public final float f2047c;

    static {
        String str = e2.d0.f7188a;
        e = Integer.toString(0, 36);
        f2043f = Integer.toString(1, 36);
        f2044g = Integer.toString(3, 36);
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
            if (this.f2045a == x1Var.f2045a && this.f2046b == x1Var.f2046b && this.f2047c == x1Var.f2047c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f2047c) + ((((217 + this.f2045a) * 31) + this.f2046b) * 31);
    }

    public x1(float f7, int i10, int i11) {
        this.f2045a = i10;
        this.f2046b = i11;
        this.f2047c = f7;
    }
}
