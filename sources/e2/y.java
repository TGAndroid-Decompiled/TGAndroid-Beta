package e2;

import v7.u6;
public final class y {
    public static final y f8297c = new y(-1, -1);
    public final int f8298a;
    public final int f8299b;

    static {
        new y(0, 0);
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public y(int i10, int i11) {
        boolean z10;
        if ((i10 != -1 && i10 < 0) || (i11 != -1 && i11 < 0)) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.g(z10);
        this.f8298a = i10;
        this.f8299b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f8298a == yVar.f8298a && this.f8299b == yVar.f8299b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f8298a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f8299b;
    }

    public final String toString() {
        return this.f8298a + "x" + this.f8299b;
    }
}
