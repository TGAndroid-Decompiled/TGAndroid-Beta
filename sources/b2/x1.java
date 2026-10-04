package b2;
public final class x1 {
    public static final x1 d = new x1(0, 0);
    public static final String f3608e;
    public static final String f3609f;
    public static final String f3610g;
    public final int f3611a;
    public final int f3612b;
    public final float f3613c;

    static {
        String str = e2.d0.f8538a;
        f3608e = Integer.toString(0, 36);
        f3609f = Integer.toString(1, 36);
        f3610g = Integer.toString(3, 36);
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
            if (this.f3611a == x1Var.f3611a && this.f3612b == x1Var.f3612b && this.f3613c == x1Var.f3613c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3613c) + ((((217 + this.f3611a) * 31) + this.f3612b) * 31);
    }

    public x1(float f7, int i10, int i11) {
        this.f3611a = i10;
        this.f3612b = i11;
        this.f3613c = f7;
    }
}
