package b2;
public final class b2 {
    public static final b2 d = new b2(0, 0);
    public static final String e;
    public static final String f1985f;
    public static final String f1986g;
    public final int f1987a;
    public final int f1988b;
    public final float f1989c;

    static {
        String str = e2.l0.f6165a;
        e = Integer.toString(0, 36);
        f1985f = Integer.toString(1, 36);
        f1986g = Integer.toString(3, 36);
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
            if (this.f1987a == b2Var.f1987a && this.f1988b == b2Var.f1988b && this.f1989c == b2Var.f1989c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f1989c) + ((((217 + this.f1987a) * 31) + this.f1988b) * 31);
    }

    public b2(float f7, int i10, int i11) {
        this.f1987a = i10;
        this.f1988b = i11;
        this.f1989c = f7;
    }
}
