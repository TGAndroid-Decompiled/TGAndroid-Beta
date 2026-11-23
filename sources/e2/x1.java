package e2;
public final class x1 {
    public static final x1 d = new x1(0, 0);
    public static final String f10790e;
    public static final String f10791f;
    public static final String f10792g;
    public final int f10793a;
    public final int f10794b;
    public final float f10795c;

    static {
        String str = h2.l0.f13778a;
        f10790e = Integer.toString(0, 36);
        f10791f = Integer.toString(1, 36);
        f10792g = Integer.toString(3, 36);
    }

    public x1(int i7, int i10) {
        this(1.0f, i7, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x1) {
            x1 x1Var = (x1) obj;
            if (this.f10793a == x1Var.f10793a && this.f10794b == x1Var.f10794b && this.f10795c == x1Var.f10795c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f10795c) + ((((217 + this.f10793a) * 31) + this.f10794b) * 31);
    }

    public x1(float f10, int i7, int i10) {
        this.f10793a = i7;
        this.f10794b = i10;
        this.f10795c = f10;
    }
}
