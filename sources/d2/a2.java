package d2;
public final class a2 {
    public static final a2 d = new a2(0, 0);
    public static final String f8027e;
    public static final String f8028f;
    public static final String f8029g;
    public final int f8030a;
    public final int f8031b;
    public final float f8032c;

    static {
        String str = g2.n0.f11873a;
        f8027e = Integer.toString(0, 36);
        f8028f = Integer.toString(1, 36);
        f8029g = Integer.toString(3, 36);
    }

    public a2(int i3, int i10) {
        this(1.0f, i3, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a2) {
            a2 a2Var = (a2) obj;
            if (this.f8030a == a2Var.f8030a && this.f8031b == a2Var.f8031b && this.f8032c == a2Var.f8032c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f8032c) + ((((217 + this.f8030a) * 31) + this.f8031b) * 31);
    }

    public a2(float f10, int i3, int i10) {
        this.f8030a = i3;
        this.f8031b = i10;
        this.f8032c = f10;
    }
}
