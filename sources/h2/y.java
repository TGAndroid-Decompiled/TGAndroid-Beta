package h2;

import a8.la;
public final class y {
    public static final y f13836c = new y(-1, -1);
    public final int f13837a;
    public final int f13838b;

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
        this.f13837a = i7;
        this.f13838b = i10;
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
            if (this.f13837a == yVar.f13837a && this.f13838b == yVar.f13838b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f13837a;
        return ((i7 >>> 16) | (i7 << 16)) ^ this.f13838b;
    }

    public final String toString() {
        return this.f13837a + "x" + this.f13838b;
    }
}
