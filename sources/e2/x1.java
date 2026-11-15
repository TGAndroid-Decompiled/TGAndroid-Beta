package e2;
public final class x1 {
    public static final x1 d = new x1(0, 0);
    public static final String f10482e;
    public static final String f10483f;
    public static final String f10484g;
    public final int f10485a;
    public final int f10486b;
    public final float f10487c;

    static {
        String str = h2.l0.f13471a;
        f10482e = Integer.toString(0, 36);
        f10483f = Integer.toString(1, 36);
        f10484g = Integer.toString(3, 36);
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
            if (this.f10485a == x1Var.f10485a && this.f10486b == x1Var.f10486b && this.f10487c == x1Var.f10487c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f10487c) + ((((217 + this.f10485a) * 31) + this.f10486b) * 31);
    }

    public x1(float f10, int i7, int i10) {
        this.f10485a = i7;
        this.f10486b = i10;
        this.f10487c = f10;
    }
}
