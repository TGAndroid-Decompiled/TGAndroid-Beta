package b2;
public final class x1 {
    public static final x1 d = new x1(0, 0);
    public static final String f2414e;
    public static final String f2415f;
    public static final String f2416g;
    public final int f2417a;
    public final int f2418b;
    public final float f2419c;

    static {
        String str = e2.d0.f8737a;
        f2414e = Integer.toString(0, 36);
        f2415f = Integer.toString(1, 36);
        f2416g = Integer.toString(3, 36);
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
            if (this.f2417a == x1Var.f2417a && this.f2418b == x1Var.f2418b && this.f2419c == x1Var.f2419c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f2419c) + ((((217 + this.f2417a) * 31) + this.f2418b) * 31);
    }

    public x1(float f7, int i10, int i11) {
        this.f2417a = i10;
        this.f2418b = i11;
        this.f2419c = f7;
    }
}
