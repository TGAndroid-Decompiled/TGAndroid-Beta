package e2;
public final class w {
    public static final w f7919c = new w(-1, -1);
    public final int f7920a;
    public final int f7921b;

    static {
        new w(0, 0);
    }

    public w(int i10, int i11) {
        boolean z10;
        if ((i10 != -1 && i10 < 0) || (i11 != -1 && i11 < 0)) {
            z10 = false;
        } else {
            z10 = true;
        }
        d.b(z10);
        this.f7920a = i10;
        this.f7921b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f7920a == wVar.f7920a && this.f7921b == wVar.f7921b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f7920a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f7921b;
    }

    public final String toString() {
        return this.f7920a + "x" + this.f7921b;
    }
}
