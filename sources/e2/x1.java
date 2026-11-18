package e2;
public final class x1 {
    public static final x1 d = new x1(0, 0);
    public static final String f10800e;
    public static final String f10801f;
    public static final String f10802g;
    public final int f10803a;
    public final int f10804b;
    public final float f10805c;

    static {
        String str = h2.l0.f13786a;
        f10800e = Integer.toString(0, 36);
        f10801f = Integer.toString(1, 36);
        f10802g = Integer.toString(3, 36);
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
            if (this.f10803a == x1Var.f10803a && this.f10804b == x1Var.f10804b && this.f10805c == x1Var.f10805c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f10805c) + ((((217 + this.f10803a) * 31) + this.f10804b) * 31);
    }

    public x1(float f10, int i7, int i10) {
        this.f10803a = i7;
        this.f10804b = i10;
        this.f10805c = f10;
    }
}
