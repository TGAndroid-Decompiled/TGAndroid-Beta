package defpackage;
public final class yka {
    public static final yka c = new yka(-1, -1);
    public final int a;
    public final int b;

    static {
        new yka(0, 0);
        String str = hac.a;
    }

    public yka(int i, int i2) {
        boolean z;
        if ((i != -1 && i < 0) || (i2 != -1 && i2 < 0)) {
            z = false;
        } else {
            z = true;
        }
        jte.f(z);
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof yka) {
            yka ykaVar = (yka) obj;
            if (this.a == ykaVar.a && this.b == ykaVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return this.b ^ ((i << 16) | (i >>> 16));
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
