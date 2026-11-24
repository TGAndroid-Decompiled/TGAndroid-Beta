package defpackage;
public final class f80 extends iy2 {
    public final String a;
    public final String b;

    public f80(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof iy2) {
                f80 f80Var = (f80) ((iy2) obj);
                if (this.a.equals(f80Var.a) && this.b.equals(f80Var.b)) {
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
        return b00.j(sb, this.b, "}");
    }
}
