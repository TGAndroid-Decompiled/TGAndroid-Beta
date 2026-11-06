package h2;

import a8.ia;
public final class y {
    public static final y f14165c = new y(-1, -1);
    public final int f14166a;
    public final int f14167b;

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
        this.f14166a = i7;
        this.f14167b = i10;
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
            if (this.f14166a == yVar.f14166a && this.f14167b == yVar.f14167b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f14166a;
        return ((i7 >>> 16) | (i7 << 16)) ^ this.f14167b;
    }

    public final String toString() {
        return this.f14166a + "x" + this.f14167b;
    }
}
