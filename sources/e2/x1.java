package e2;
public final class x1 {
    public static final x1 d = new x1(0, 0);
    public static final String f10651e;
    public static final String f10652f;
    public static final String f10653g;
    public final int f10654a;
    public final int f10655b;
    public final float f10656c;

    static {
        String str = h2.m0.f14114a;
        f10651e = Integer.toString(0, 36);
        f10652f = Integer.toString(1, 36);
        f10653g = Integer.toString(3, 36);
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
            if (this.f10654a == x1Var.f10654a && this.f10655b == x1Var.f10655b && this.f10656c == x1Var.f10656c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f10656c) + ((((217 + this.f10654a) * 31) + this.f10655b) * 31);
    }

    public x1(float f10, int i7, int i10) {
        this.f10654a = i7;
        this.f10655b = i10;
        this.f10656c = f10;
    }
}
