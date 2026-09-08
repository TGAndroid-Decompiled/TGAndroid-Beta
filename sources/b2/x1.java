package b2;
public final class x1 {
    public static final x1 d = new x1(0, 0);
    public static final String f2441e;
    public static final String f2442f;
    public static final String f2443g;
    public final int f2444a;
    public final int f2445b;
    public final float f2446c;

    static {
        String str = e2.d0.f8765a;
        f2441e = Integer.toString(0, 36);
        f2442f = Integer.toString(1, 36);
        f2443g = Integer.toString(3, 36);
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
            if (this.f2444a == x1Var.f2444a && this.f2445b == x1Var.f2445b && this.f2446c == x1Var.f2446c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f2446c) + ((((217 + this.f2444a) * 31) + this.f2445b) * 31);
    }

    public x1(float f7, int i10, int i11) {
        this.f2444a = i10;
        this.f2445b = i11;
        this.f2446c = f7;
    }
}
