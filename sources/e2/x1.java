package e2;
public final class x1 {
    public static final x1 d = new x1(0, 0);
    public static final String f10829e;
    public static final String f10830f;
    public static final String f10831g;
    public final int f10832a;
    public final int f10833b;
    public final float f10834c;

    static {
        String str = h2.l0.f13815a;
        f10829e = Integer.toString(0, 36);
        f10830f = Integer.toString(1, 36);
        f10831g = Integer.toString(3, 36);
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
            if (this.f10832a == x1Var.f10832a && this.f10833b == x1Var.f10833b && this.f10834c == x1Var.f10834c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f10834c) + ((((217 + this.f10832a) * 31) + this.f10833b) * 31);
    }

    public x1(float f10, int i7, int i10) {
        this.f10832a = i7;
        this.f10833b = i10;
        this.f10834c = f10;
    }
}
