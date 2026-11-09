package da;
public final class h0 extends v1 {
    public final String f8366a;
    public final String f8367b;

    public h0(String str, String str2) {
        this.f8366a = str;
        this.f8367b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            h0 h0Var = (h0) ((v1) obj);
            if (this.f8366a.equals(h0Var.f8366a) && this.f8367b.equals(h0Var.f8367b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8366a.hashCode() ^ 1000003) * 1000003) ^ this.f8367b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f8366a);
        sb2.append(", value=");
        return a8.p0.s(sb2, this.f8367b, "}");
    }
}
