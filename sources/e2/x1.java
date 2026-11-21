package e2;
public final class x1 {
    public static final x1 d = new x1(0, 0);
    public static final String f10826e;
    public static final String f10827f;
    public static final String f10828g;
    public final int f10829a;
    public final int f10830b;
    public final float f10831c;

    static {
        String str = h2.l0.f13812a;
        f10826e = Integer.toString(0, 36);
        f10827f = Integer.toString(1, 36);
        f10828g = Integer.toString(3, 36);
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
            if (this.f10829a == x1Var.f10829a && this.f10830b == x1Var.f10830b && this.f10831c == x1Var.f10831c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f10831c) + ((((217 + this.f10829a) * 31) + this.f10830b) * 31);
    }

    public x1(float f10, int i7, int i10) {
        this.f10829a = i7;
        this.f10830b = i10;
        this.f10831c = f10;
    }
}
