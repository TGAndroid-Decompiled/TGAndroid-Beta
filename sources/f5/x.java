package f5;
public final class x {
    public static final x f6643c = new x(-1, -1);
    public final int f6644a;
    public final int f6645b;

    static {
        new x(0, 0);
    }

    public x(int i10, int i11) {
        boolean z10;
        if ((i10 != -1 && i10 < 0) || (i11 != -1 && i11 < 0)) {
            z10 = false;
        } else {
            z10 = true;
        }
        a.f(z10);
        this.f6644a = i10;
        this.f6645b = i11;
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
            if (this.f6644a == xVar.f6644a && this.f6645b == xVar.f6645b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f6644a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f6645b;
    }

    public final String toString() {
        return this.f6644a + "x" + this.f6645b;
    }
}
