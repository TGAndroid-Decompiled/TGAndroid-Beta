package b2;
public final class a2 {
    public static final a2 d = new a2(0, 0);
    public static final String e;
    public static final String f3694f;
    public static final String f3695g;
    public final int f3696a;
    public final int f3697b;
    public final float f3698c;

    static {
        String str = e2.m0.f8254a;
        e = Integer.toString(0, 36);
        f3694f = Integer.toString(1, 36);
        f3695g = Integer.toString(3, 36);
    }

    public a2(int i10, int i11) {
        this(1.0f, i10, i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a2) {
            a2 a2Var = (a2) obj;
            if (this.f3696a == a2Var.f3696a && this.f3697b == a2Var.f3697b && this.f3698c == a2Var.f3698c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3698c) + ((((217 + this.f3696a) * 31) + this.f3697b) * 31);
    }

    public a2(float f7, int i10, int i11) {
        this.f3696a = i10;
        this.f3697b = i11;
        this.f3698c = f7;
    }
}
