package da;
public final class h0 extends v1 {
    public final String f7758a;
    public final String f7759b;

    public h0(String str, String str2) {
        this.f7758a = str;
        this.f7759b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            h0 h0Var = (h0) ((v1) obj);
            if (this.f7758a.equals(h0Var.f7758a) && this.f7759b.equals(h0Var.f7759b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f7758a.hashCode() ^ 1000003) * 1000003) ^ this.f7759b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f7758a);
        sb2.append(", value=");
        return a8.p0.s(sb2, this.f7759b, "}");
    }
}
