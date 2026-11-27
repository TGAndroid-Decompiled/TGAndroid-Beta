package defpackage;
public final class h80 extends dz2 {
    public final String a;
    public final String b;

    public h80(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof dz2) {
                h80 h80Var = (h80) ((dz2) obj);
                if (this.a.equals(h80Var.a) && this.b.equals(h80Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.a);
        sb.append(", value=");
        return c00.k(sb, this.b, "}");
    }
}
