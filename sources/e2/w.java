package e2;
public final class w {
    public static final w f7934c = new w(-1, -1);
    public final int f7935a;
    public final int f7936b;

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
        this.f7935a = i10;
        this.f7936b = i11;
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
            if (this.f7935a == wVar.f7935a && this.f7936b == wVar.f7936b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f7935a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f7936b;
    }

    public final String toString() {
        return this.f7935a + "x" + this.f7936b;
    }
}
