package da;
public final class h0 extends v1 {
    public final String f8031a;
    public final String f8032b;

    public h0(String str, String str2) {
        this.f8031a = str;
        this.f8032b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            h0 h0Var = (h0) ((v1) obj);
            if (this.f8031a.equals(h0Var.f8031a) && this.f8032b.equals(h0Var.f8032b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8031a.hashCode() ^ 1000003) * 1000003) ^ this.f8032b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f8031a);
        sb2.append(", value=");
        return a8.p0.s(sb2, this.f8032b, "}");
    }
}
