package e2;
public final class x1 {
    public static final x1 d = new x1(0, 0);
    public static final String f10646e;
    public static final String f10647f;
    public static final String f10648g;
    public final int f10649a;
    public final int f10650b;
    public final float f10651c;

    static {
        String str = h2.m0.f14112a;
        f10646e = Integer.toString(0, 36);
        f10647f = Integer.toString(1, 36);
        f10648g = Integer.toString(3, 36);
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
            if (this.f10649a == x1Var.f10649a && this.f10650b == x1Var.f10650b && this.f10651c == x1Var.f10651c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f10651c) + ((((217 + this.f10649a) * 31) + this.f10650b) * 31);
    }

    public x1(float f10, int i7, int i10) {
        this.f10649a = i7;
        this.f10650b = i10;
        this.f10651c = f10;
    }
}
