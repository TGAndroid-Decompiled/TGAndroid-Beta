package h2;

import a8.ia;
public final class y {
    public static final y f14167c = new y(-1, -1);
    public final int f14168a;
    public final int f14169b;

    static {
        new y(0, 0);
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public y(int i7, int i10) {
        boolean z9;
        if ((i7 != -1 && i7 < 0) || (i10 != -1 && i10 < 0)) {
            z9 = false;
        } else {
            z9 = true;
        }
        ia.f(z9);
        this.f14168a = i7;
        this.f14169b = i10;
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
            if (this.f14168a == yVar.f14168a && this.f14169b == yVar.f14169b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f14168a;
        return ((i7 >>> 16) | (i7 << 16)) ^ this.f14169b;
    }

    public final String toString() {
        return this.f14168a + "x" + this.f14169b;
    }
}
