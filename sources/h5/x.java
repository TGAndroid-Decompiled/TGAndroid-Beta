package h5;
public final class x {
    public static final x f7311c = new x(-1, -1);
    public final int f7312a;
    public final int f7313b;

    static {
        new x(0, 0);
    }

    public x(int i10, int i11) {
        boolean z4;
        if ((i10 != -1 && i10 < 0) || (i11 != -1 && i11 < 0)) {
            z4 = false;
        } else {
            z4 = true;
        }
        a.f(z4);
        this.f7312a = i10;
        this.f7313b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f7312a == xVar.f7312a && this.f7313b == xVar.f7313b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f7312a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f7313b;
    }

    public final String toString() {
        return this.f7312a + "x" + this.f7313b;
    }
}
