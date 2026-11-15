package h2;

import a8.ja;
public final class y {
    public static final y f13524c = new y(-1, -1);
    public final int f13525a;
    public final int f13526b;

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
        ja.f(z10);
        this.f13525a = i7;
        this.f13526b = i10;
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
            if (this.f13525a == yVar.f13525a && this.f13526b == yVar.f13526b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f13525a;
        return ((i7 >>> 16) | (i7 << 16)) ^ this.f13526b;
    }

    public final String toString() {
        return this.f13525a + "x" + this.f13526b;
    }
}
