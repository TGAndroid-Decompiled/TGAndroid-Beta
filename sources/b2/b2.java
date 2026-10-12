package b2;
public final class b2 {
    public static final b2 d = new b2(0, 0);
    public static final String e;
    public static final String f2081f;
    public static final String f2082g;
    public final int f2083a;
    public final int f2084b;
    public final float f2085c;

    static {
        String str = e2.m0.f8372a;
        e = Integer.toString(0, 36);
        f2081f = Integer.toString(1, 36);
        f2082g = Integer.toString(3, 36);
    }

    public b2(int i10, int i11) {
        this(1.0f, i10, i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b2) {
            b2 b2Var = (b2) obj;
            if (this.f2083a == b2Var.f2083a && this.f2084b == b2Var.f2084b && this.f2085c == b2Var.f2085c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f2085c) + ((((217 + this.f2083a) * 31) + this.f2084b) * 31);
    }

    public b2(float f7, int i10, int i11) {
        this.f2083a = i10;
        this.f2084b = i11;
        this.f2085c = f7;
    }
}
