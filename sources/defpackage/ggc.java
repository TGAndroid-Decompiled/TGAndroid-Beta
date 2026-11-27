package defpackage;
public final class ggc {
    public static final ggc d = new ggc(0, 0);
    public static final String e;
    public static final String f;
    public static final String g;
    public final int a;
    public final int b;
    public final float c;

    static {
        String str = gcc.a;
        e = "0";
        f = "1";
        g = "3";
    }

    public ggc(float f2, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ggc) {
            ggc ggcVar = (ggc) obj;
            if (this.a == ggcVar.a && this.b == ggcVar.b && this.c == ggcVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((217 + this.a) * 31) + this.b) * 31);
    }

    public ggc(int i, int i2) {
        this(1.0f, i, i2);
    }
}
