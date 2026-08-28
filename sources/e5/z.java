package e5;

import d5.f0;
public final class z implements h3.g {
    public static final z f4953e = new z(0, 0, 1.0f, 0);
    public final int f4954a;
    public final int f4955b;
    public final int f4956c;
    public final float d;

    static {
        int i9 = f0.f4349a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public z(int i9, int i10, float f10, int i11) {
        this.f4954a = i9;
        this.f4955b = i10;
        this.f4956c = i11;
        this.d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f4954a == zVar.f4954a && this.f4955b == zVar.f4955b && this.f4956c == zVar.f4956c && this.d == zVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.d) + ((((((217 + this.f4954a) * 31) + this.f4955b) * 31) + this.f4956c) * 31);
    }
}
