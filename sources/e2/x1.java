package e2;
public final class x1 {
    public static final x1 d = new x1(0, 0);
    public static final String f10797e;
    public static final String f10798f;
    public static final String f10799g;
    public final int f10800a;
    public final int f10801b;
    public final float f10802c;

    static {
        String str = h2.l0.f13783a;
        f10797e = Integer.toString(0, 36);
        f10798f = Integer.toString(1, 36);
        f10799g = Integer.toString(3, 36);
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
            if (this.f10800a == x1Var.f10800a && this.f10801b == x1Var.f10801b && this.f10802c == x1Var.f10802c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f10802c) + ((((217 + this.f10800a) * 31) + this.f10801b) * 31);
    }

    public x1(float f10, int i7, int i10) {
        this.f10800a = i7;
        this.f10801b = i10;
        this.f10802c = f10;
    }
}
