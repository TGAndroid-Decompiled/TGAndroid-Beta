package e2;
public final class w {
    public static final w f8820c = new w(-1, -1);
    public final int f8821a;
    public final int f8822b;

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
        this.f8821a = i10;
        this.f8822b = i11;
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
            if (this.f8821a == wVar.f8821a && this.f8822b == wVar.f8822b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f8821a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f8822b;
    }

    public final String toString() {
        return this.f8821a + "x" + this.f8822b;
    }
}
