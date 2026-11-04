package g2;

import b8.zb;
public final class z {
    public static final z f11926c = new z(-1, -1);
    public final int f11927a;
    public final int f11928b;

    static {
        new z(0, 0);
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public z(int i3, int i10) {
        boolean z10;
        if ((i3 != -1 && i3 < 0) || (i10 != -1 && i10 < 0)) {
            z10 = false;
        } else {
            z10 = true;
        }
        zb.f(z10);
        this.f11927a = i3;
        this.f11928b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f11927a == zVar.f11927a && this.f11928b == zVar.f11928b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.f11927a;
        return ((i3 >>> 16) | (i3 << 16)) ^ this.f11928b;
    }

    public final String toString() {
        return this.f11927a + "x" + this.f11928b;
    }
}
