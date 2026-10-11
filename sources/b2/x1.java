package b2;
public final class x1 {
    public static final x1 d = new x1(0, 0);
    public static final String f3687e;
    public static final String f3688f;
    public static final String f3689g;
    public final int f3690a;
    public final int f3691b;
    public final float f3692c;

    static {
        String str = e2.d0.f8531a;
        f3687e = Integer.toString(0, 36);
        f3688f = Integer.toString(1, 36);
        f3689g = Integer.toString(3, 36);
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
            if (this.f3690a == x1Var.f3690a && this.f3691b == x1Var.f3691b && this.f3692c == x1Var.f3692c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3692c) + ((((217 + this.f3690a) * 31) + this.f3691b) * 31);
    }

    public x1(float f7, int i10, int i11) {
        this.f3690a = i10;
        this.f3691b = i11;
        this.f3692c = f7;
    }
}
