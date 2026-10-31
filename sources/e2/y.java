package e2;

import v7.t6;
public final class y {
    public static final y f6210c = new y(-1, -1);
    public final int f6211a;
    public final int f6212b;

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
        t6.f(z10);
        this.f6211a = i10;
        this.f6212b = i11;
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
            if (this.f6211a == yVar.f6211a && this.f6212b == yVar.f6212b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f6211a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f6212b;
    }

    public final String toString() {
        return this.f6211a + "x" + this.f6212b;
    }
}
