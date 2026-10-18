package b2;
public final class a2 {
    public static final a2 d = new a2(0, 0);
    public static final String e;
    public static final String f3695f;
    public static final String f3696g;
    public final int f3697a;
    public final int f3698b;
    public final float f3699c;

    static {
        String str = e2.m0.f8253a;
        e = Integer.toString(0, 36);
        f3695f = Integer.toString(1, 36);
        f3696g = Integer.toString(3, 36);
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
            if (this.f3697a == a2Var.f3697a && this.f3698b == a2Var.f3698b && this.f3699c == a2Var.f3699c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3699c) + ((((217 + this.f3697a) * 31) + this.f3698b) * 31);
    }

    public a2(float f7, int i10, int i11) {
        this.f3697a = i10;
        this.f3698b = i11;
        this.f3699c = f7;
    }
}
