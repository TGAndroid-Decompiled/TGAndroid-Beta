package e2;

import v7.u6;
public final class y {
    public static final y f8414c = new y(-1, -1);
    public final int f8415a;
    public final int f8416b;

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
        this.f8415a = i10;
        this.f8416b = i11;
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
            if (this.f8415a == yVar.f8415a && this.f8416b == yVar.f8416b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f8415a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f8416b;
    }

    public final String toString() {
        return this.f8415a + "x" + this.f8416b;
    }
}
