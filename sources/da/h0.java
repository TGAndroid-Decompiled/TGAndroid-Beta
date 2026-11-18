package da;
public final class h0 extends v1 {
    public final String f8040a;
    public final String f8041b;

    public h0(String str, String str2) {
        this.f8040a = str;
        this.f8041b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            h0 h0Var = (h0) ((v1) obj);
            if (this.f8040a.equals(h0Var.f8040a) && this.f8041b.equals(h0Var.f8041b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8040a.hashCode() ^ 1000003) * 1000003) ^ this.f8041b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f8040a);
        sb2.append(", value=");
        return a8.p0.s(sb2, this.f8041b, "}");
    }
}
