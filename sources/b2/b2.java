package b2;
public final class b2 {
    public static final b2 d = new b2(0, 0);
    public static final String e;
    public static final String f2085f;
    public static final String f2086g;
    public final int f2087a;
    public final int f2088b;
    public final float f2089c;

    static {
        String str = e2.m0.f8375a;
        e = Integer.toString(0, 36);
        f2085f = Integer.toString(1, 36);
        f2086g = Integer.toString(3, 36);
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
            if (this.f2087a == b2Var.f2087a && this.f2088b == b2Var.f2088b && this.f2089c == b2Var.f2089c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f2089c) + ((((217 + this.f2087a) * 31) + this.f2088b) * 31);
    }

    public b2(float f7, int i10, int i11) {
        this.f2087a = i10;
        this.f2088b = i11;
        this.f2089c = f7;
    }
}
