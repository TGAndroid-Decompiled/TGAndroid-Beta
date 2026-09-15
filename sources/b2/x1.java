package b2;
public final class x1 {
    public static final x1 d = new x1(0, 0);
    public static final String e;
    public static final String f3345f;
    public static final String f3346g;
    public final int f3347a;
    public final int f3348b;
    public final float f3349c;

    static {
        String str = e2.d0.f7883a;
        e = Integer.toString(0, 36);
        f3345f = Integer.toString(1, 36);
        f3346g = Integer.toString(3, 36);
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
            if (this.f3347a == x1Var.f3347a && this.f3348b == x1Var.f3348b && this.f3349c == x1Var.f3349c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3349c) + ((((217 + this.f3347a) * 31) + this.f3348b) * 31);
    }

    public x1(float f7, int i10, int i11) {
        this.f3347a = i10;
        this.f3348b = i11;
        this.f3349c = f7;
    }
}
