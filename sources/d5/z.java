package d5;
public final class z {
    public static final z f4413c = new z(-1, -1);
    public final int f4414a;
    public final int f4415b;

    static {
        new z(0, 0);
    }

    public z(int i9, int i10) {
        boolean z10;
        if ((i9 != -1 && i9 < 0) || (i10 != -1 && i10 < 0)) {
            z10 = false;
        } else {
            z10 = true;
        }
        a.f(z10);
        this.f4414a = i9;
        this.f4415b = i10;
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
            if (this.f4414a == zVar.f4414a && this.f4415b == zVar.f4415b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.f4414a;
        return ((i9 >>> 16) | (i9 << 16)) ^ this.f4415b;
    }

    public final String toString() {
        return this.f4414a + "x" + this.f4415b;
    }
}
