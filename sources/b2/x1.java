package b2;
public final class x1 {
    public static final x1 d = new x1(0, 0);
    public static final String e;
    public static final String f3349f;
    public static final String f3350g;
    public final int f3351a;
    public final int f3352b;
    public final float f3353c;

    static {
        String str = e2.d0.f7887a;
        e = Integer.toString(0, 36);
        f3349f = Integer.toString(1, 36);
        f3350g = Integer.toString(3, 36);
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
            if (this.f3351a == x1Var.f3351a && this.f3352b == x1Var.f3352b && this.f3353c == x1Var.f3353c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3353c) + ((((217 + this.f3351a) * 31) + this.f3352b) * 31);
    }

    public x1(float f7, int i10, int i11) {
        this.f3351a = i10;
        this.f3352b = i11;
        this.f3353c = f7;
    }
}
