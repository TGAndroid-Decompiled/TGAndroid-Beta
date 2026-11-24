package defpackage;
public final class jec {
    public static final jec d = new jec(0, 0);
    public static final String e;
    public static final String f;
    public static final String g;
    public final int a;
    public final int b;
    public final float c;

    static {
        String str = hac.a;
        e = "0";
        f = "1";
        g = "3";
    }

    public jec(float f2, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jec) {
            jec jecVar = (jec) obj;
            if (this.a == jecVar.a && this.b == jecVar.b && this.c == jecVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((217 + this.a) * 31) + this.b) * 31);
    }

    public jec(int i, int i2) {
        this(1.0f, i, i2);
    }
}
