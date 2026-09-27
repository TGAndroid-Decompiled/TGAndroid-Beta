package b2;
public final class x1 {
    public static final x1 d = new x1(0, 0);
    public static final String e;
    public static final String f3344f;
    public static final String f3345g;
    public final int f3346a;
    public final int f3347b;
    public final float f3348c;

    static {
        String str = e2.d0.f7872a;
        e = Integer.toString(0, 36);
        f3344f = Integer.toString(1, 36);
        f3345g = Integer.toString(3, 36);
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
            if (this.f3346a == x1Var.f3346a && this.f3347b == x1Var.f3347b && this.f3348c == x1Var.f3348c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3348c) + ((((217 + this.f3346a) * 31) + this.f3347b) * 31);
    }

    public x1(float f7, int i10, int i11) {
        this.f3346a = i10;
        this.f3347b = i11;
        this.f3348c = f7;
    }
}
