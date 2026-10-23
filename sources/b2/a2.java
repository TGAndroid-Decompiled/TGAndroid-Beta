package b2;
public final class a2 {
    public static final a2 d = new a2(0, 0);
    public static final String e;
    public static final String f3698f;
    public static final String f3699g;
    public final int f3700a;
    public final int f3701b;
    public final float f3702c;

    static {
        String str = e2.m0.f8259a;
        e = Integer.toString(0, 36);
        f3698f = Integer.toString(1, 36);
        f3699g = Integer.toString(3, 36);
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
            if (this.f3700a == a2Var.f3700a && this.f3701b == a2Var.f3701b && this.f3702c == a2Var.f3702c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3702c) + ((((217 + this.f3700a) * 31) + this.f3701b) * 31);
    }

    public a2(float f7, int i10, int i11) {
        this.f3700a = i10;
        this.f3701b = i11;
        this.f3702c = f7;
    }
}
