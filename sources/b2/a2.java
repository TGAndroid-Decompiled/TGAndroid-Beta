package b2;
public final class a2 {
    public static final a2 d = new a2(0, 0);
    public static final String e;
    public static final String f3693f;
    public static final String f3694g;
    public final int f3695a;
    public final int f3696b;
    public final float f3697c;

    static {
        String str = e2.m0.f8254a;
        e = Integer.toString(0, 36);
        f3693f = Integer.toString(1, 36);
        f3694g = Integer.toString(3, 36);
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
            if (this.f3695a == a2Var.f3695a && this.f3696b == a2Var.f3696b && this.f3697c == a2Var.f3697c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3697c) + ((((217 + this.f3695a) * 31) + this.f3696b) * 31);
    }

    public a2(float f7, int i10, int i11) {
        this.f3695a = i10;
        this.f3696b = i11;
        this.f3697c = f7;
    }
}
