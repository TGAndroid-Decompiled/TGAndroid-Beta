package i5;

import h5.d0;
public final class y implements j3.g {
    public static final y e = new y(0, 0, 1.0f, 0);
    public final int f7342a;
    public final int f7343b;
    public final int f7344c;
    public final float d;

    static {
        int i10 = d0.f6937a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public y(int i10, int i11, float f10, int i12) {
        this.f7342a = i10;
        this.f7343b = i11;
        this.f7344c = i12;
        this.d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f7342a == yVar.f7342a && this.f7343b == yVar.f7343b && this.f7344c == yVar.f7344c && this.d == yVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.d) + ((((((217 + this.f7342a) * 31) + this.f7343b) * 31) + this.f7344c) * 31);
    }
}
