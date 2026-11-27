package defpackage;
public final class sh7 {
    public final byte a;
    public final byte b;
    public final float c;

    public sh7(float f, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public static sh7 a(int i) {
        int i2;
        int i3 = (i >> 13) & 7;
        if (i3 == 0) {
            return null;
        }
        int i4 = (i >> 10) & 7;
        int i5 = i & 511;
        if ((i & 512) != 0) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        return new sh7((i5 * i2) / 10.0f, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sh7) {
            sh7 sh7Var = (sh7) obj;
            if (this.a == sh7Var.a && this.b == sh7Var.b && Float.compare(this.c, sh7Var.c) == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c) + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + ((int) this.a) + ", originator=" + ((int) this.b) + ", gain=" + this.c + '}';
    }
}
