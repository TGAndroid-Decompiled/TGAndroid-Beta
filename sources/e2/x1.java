package e2;
public final class x1 {
    public static final x1 d = new x1(0, 0);
    public static final String f10792e;
    public static final String f10793f;
    public static final String f10794g;
    public final int f10795a;
    public final int f10796b;
    public final float f10797c;

    static {
        String str = h2.l0.f13778a;
        f10792e = Integer.toString(0, 36);
        f10793f = Integer.toString(1, 36);
        f10794g = Integer.toString(3, 36);
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
            if (this.f10795a == x1Var.f10795a && this.f10796b == x1Var.f10796b && this.f10797c == x1Var.f10797c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f10797c) + ((((217 + this.f10795a) * 31) + this.f10796b) * 31);
    }

    public x1(float f10, int i7, int i10) {
        this.f10795a = i7;
        this.f10796b = i10;
        this.f10797c = f10;
    }
}
