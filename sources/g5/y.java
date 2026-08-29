package g5;

import f5.d0;
public final class y implements j3.g {
    public static final y f7105e = new y(0, 0, 1.0f, 0);
    public final int f7106a;
    public final int f7107b;
    public final int f7108c;
    public final float d;

    static {
        int i10 = d0.f6579a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public y(int i10, int i11, float f9, int i12) {
        this.f7106a = i10;
        this.f7107b = i11;
        this.f7108c = i12;
        this.d = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f7106a == yVar.f7106a && this.f7107b == yVar.f7107b && this.f7108c == yVar.f7108c && this.d == yVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.d) + ((((((217 + this.f7106a) * 31) + this.f7107b) * 31) + this.f7108c) * 31);
    }
}
