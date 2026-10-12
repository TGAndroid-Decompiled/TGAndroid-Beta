package b2;
public final class x1 {
    public static final x1 d = new x1(0, 0);
    public static final String f3685e;
    public static final String f3686f;
    public static final String f3687g;
    public final int f3688a;
    public final int f3689b;
    public final float f3690c;

    static {
        String str = e2.d0.f8529a;
        f3685e = Integer.toString(0, 36);
        f3686f = Integer.toString(1, 36);
        f3687g = Integer.toString(3, 36);
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
            if (this.f3688a == x1Var.f3688a && this.f3689b == x1Var.f3689b && this.f3690c == x1Var.f3690c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3690c) + ((((217 + this.f3688a) * 31) + this.f3689b) * 31);
    }

    public x1(float f7, int i10, int i11) {
        this.f3688a = i10;
        this.f3689b = i11;
        this.f3690c = f7;
    }
}
