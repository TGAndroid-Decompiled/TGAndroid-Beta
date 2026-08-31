package i5;

import h5.d0;
public final class y implements j3.g {
    public static final y f7898e = new y(0, 0, 1.0f, 0);
    public final int f7899a;
    public final int f7900b;
    public final int f7901c;
    public final float d;

    static {
        int i10 = d0.f7237a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public y(int i10, int i11, float f10, int i12) {
        this.f7899a = i10;
        this.f7900b = i11;
        this.f7901c = i12;
        this.d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f7899a == yVar.f7899a && this.f7900b == yVar.f7900b && this.f7901c == yVar.f7901c && this.d == yVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.d) + ((((((217 + this.f7899a) * 31) + this.f7900b) * 31) + this.f7901c) * 31);
    }
}
