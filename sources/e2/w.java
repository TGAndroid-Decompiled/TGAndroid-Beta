package e2;
public final class w {
    public static final w f8584c = new w(-1, -1);
    public final int f8585a;
    public final int f8586b;

    static {
        new w(0, 0);
    }

    public w(int i10, int i11) {
        boolean z10;
        if ((i10 != -1 && i10 < 0) || (i11 != -1 && i11 < 0)) {
            z10 = false;
        } else {
            z10 = true;
        }
        d.b(z10);
        this.f8585a = i10;
        this.f8586b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f8585a == wVar.f8585a && this.f8586b == wVar.f8586b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f8585a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f8586b;
    }

    public final String toString() {
        return this.f8585a + "x" + this.f8586b;
    }
}
