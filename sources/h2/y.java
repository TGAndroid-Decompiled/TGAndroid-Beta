package h2;

import a8.la;
public final class y {
    public static final y f13839c = new y(-1, -1);
    public final int f13840a;
    public final int f13841b;

    static {
        new y(0, 0);
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public y(int i7, int i10) {
        boolean z10;
        if ((i7 != -1 && i7 < 0) || (i10 != -1 && i10 < 0)) {
            z10 = false;
        } else {
            z10 = true;
        }
        la.f(z10);
        this.f13840a = i7;
        this.f13841b = i10;
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
            if (this.f13840a == yVar.f13840a && this.f13841b == yVar.f13841b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f13840a;
        return ((i7 >>> 16) | (i7 << 16)) ^ this.f13841b;
    }

    public final String toString() {
        return this.f13840a + "x" + this.f13841b;
    }
}
