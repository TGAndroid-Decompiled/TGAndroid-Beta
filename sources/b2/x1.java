package b2;
public final class x1 {
    public static final x1 d = new x1(0, 0);
    public static final String e;
    public static final String f3342f;
    public static final String f3343g;
    public final int f3344a;
    public final int f3345b;
    public final float f3346c;

    static {
        String str = e2.d0.f7870a;
        e = Integer.toString(0, 36);
        f3342f = Integer.toString(1, 36);
        f3343g = Integer.toString(3, 36);
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
            if (this.f3344a == x1Var.f3344a && this.f3345b == x1Var.f3345b && this.f3346c == x1Var.f3346c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3346c) + ((((217 + this.f3344a) * 31) + this.f3345b) * 31);
    }

    public x1(float f7, int i10, int i11) {
        this.f3344a = i10;
        this.f3345b = i11;
        this.f3346c = f7;
    }
}
