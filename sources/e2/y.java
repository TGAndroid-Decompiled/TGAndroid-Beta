package e2;

import a8.yb;
public final class y {
    public static final y f9735c = new y(-1, -1);
    public final int f9736a;
    public final int f9737b;

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
        yb.g(z10);
        this.f9736a = i10;
        this.f9737b = i11;
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
            if (this.f9736a == yVar.f9736a && this.f9737b == yVar.f9737b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f9736a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f9737b;
    }

    public final String toString() {
        return this.f9736a + "x" + this.f9737b;
    }
}
