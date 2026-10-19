package b2;
public final class a2 {
    public static final a2 d = new a2(0, 0);
    public static final String e;
    public static final String f3691f;
    public static final String f3692g;
    public final int f3693a;
    public final int f3694b;
    public final float f3695c;

    static {
        String str = e2.m0.f8252a;
        e = Integer.toString(0, 36);
        f3691f = Integer.toString(1, 36);
        f3692g = Integer.toString(3, 36);
    }

    public a2(int i10, int i11) {
        this(1.0f, i10, i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a2) {
            a2 a2Var = (a2) obj;
            if (this.f3693a == a2Var.f3693a && this.f3694b == a2Var.f3694b && this.f3695c == a2Var.f3695c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3695c) + ((((217 + this.f3693a) * 31) + this.f3694b) * 31);
    }

    public a2(float f7, int i10, int i11) {
        this.f3693a = i10;
        this.f3694b = i11;
        this.f3695c = f7;
    }
}
