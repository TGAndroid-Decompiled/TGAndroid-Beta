package h5;
public final class x {
    public static final x f7003c = new x(-1, -1);
    public final int f7004a;
    public final int f7005b;

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
        this.f7004a = i10;
        this.f7005b = i11;
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
            if (this.f7004a == xVar.f7004a && this.f7005b == xVar.f7005b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f7004a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f7005b;
    }

    public final String toString() {
        return this.f7004a + "x" + this.f7005b;
    }
}
