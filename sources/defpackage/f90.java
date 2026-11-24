package defpackage;
public final class f90 extends tz2 {
    public final String a;
    public final String b;

    public f90(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof tz2) {
                f90 f90Var = (f90) ((tz2) obj);
                if (this.a.equals(f90Var.a) && this.b.equals(f90Var.b)) {
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
        return b10.j(sb, this.b, "}");
    }
}
