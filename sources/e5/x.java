package e5;

import d5.g0;

public final class x implements h3.g {

    public static final x f5307e = new x(0, 0, 1.0f, 0);

    public final int f5308a;

    public final int f5309b;

    public final int f5310c;
    public final float d;

    static {
        int i10 = g0.f4795a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public x(int i10, int i11, float f10, int i12) {
        this.f5308a = i10;
        this.f5309b = i11;
        this.f5310c = i12;
        this.d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f5308a == xVar.f5308a && this.f5309b == xVar.f5309b && this.f5310c == xVar.f5310c && this.d == xVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.d) + ((((((217 + this.f5308a) * 31) + this.f5309b) * 31) + this.f5310c) * 31);
    }
}
