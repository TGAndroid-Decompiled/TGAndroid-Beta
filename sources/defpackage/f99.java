package defpackage;
public final class f99 {
    public static final f99 c = new f99(0, false);
    public final byte a;
    public final boolean b;

    public f99(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f99.class == obj.getClass()) {
                f99 f99Var = (f99) obj;
                if (this.a == f99Var.a && this.b == f99Var.b) {
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
