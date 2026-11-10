package da;
public final class h0 extends v1 {
    public final String f8371a;
    public final String f8372b;

    public h0(String str, String str2) {
        this.f8371a = str;
        this.f8372b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            h0 h0Var = (h0) ((v1) obj);
            if (this.f8371a.equals(h0Var.f8371a) && this.f8372b.equals(h0Var.f8372b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8371a.hashCode() ^ 1000003) * 1000003) ^ this.f8372b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f8371a);
        sb2.append(", value=");
        return a8.p0.s(sb2, this.f8372b, "}");
    }
}
