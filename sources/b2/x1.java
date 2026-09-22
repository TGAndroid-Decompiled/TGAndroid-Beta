package b2;
public final class x1 {
    public static final x1 d = new x1(0, 0);
    public static final String e;
    public static final String f3347f;
    public static final String f3348g;
    public final int f3349a;
    public final int f3350b;
    public final float f3351c;

    static {
        String str = e2.d0.f7885a;
        e = Integer.toString(0, 36);
        f3347f = Integer.toString(1, 36);
        f3348g = Integer.toString(3, 36);
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
            if (this.f3349a == x1Var.f3349a && this.f3350b == x1Var.f3350b && this.f3351c == x1Var.f3351c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3351c) + ((((217 + this.f3349a) * 31) + this.f3350b) * 31);
    }

    public x1(float f7, int i10, int i11) {
        this.f3349a = i10;
        this.f3350b = i11;
        this.f3351c = f7;
    }
}
