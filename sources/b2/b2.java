package b2;
public final class b2 {
    public static final b2 d = new b2(0, 0);
    public static final String e;
    public static final String f3148f;
    public static final String f3149g;
    public final int f3150a;
    public final int f3151b;
    public final float f3152c;

    static {
        String str = e2.n0.f9692a;
        e = Integer.toString(0, 36);
        f3148f = Integer.toString(1, 36);
        f3149g = Integer.toString(3, 36);
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
            if (this.f3150a == b2Var.f3150a && this.f3151b == b2Var.f3151b && this.f3152c == b2Var.f3152c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3152c) + ((((217 + this.f3150a) * 31) + this.f3151b) * 31);
    }

    public b2(float f7, int i10, int i11) {
        this.f3150a = i10;
        this.f3151b = i11;
        this.f3152c = f7;
    }
}
