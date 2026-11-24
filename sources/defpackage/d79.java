package defpackage;
public final class d79 {
    public static final d79 c = new d79(0, false);
    public final byte a;
    public final boolean b;

    public d79(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && d79.class == obj.getClass()) {
                d79 d79Var = (d79) obj;
                if (this.a == d79Var.a && this.b == d79Var.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
