package da;
public final class h0 extends v1 {
    public final String f7755a;
    public final String f7756b;

    public h0(String str, String str2) {
        this.f7755a = str;
        this.f7756b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            h0 h0Var = (h0) ((v1) obj);
            if (this.f7755a.equals(h0Var.f7755a) && this.f7756b.equals(h0Var.f7756b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f7755a.hashCode() ^ 1000003) * 1000003) ^ this.f7756b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f7755a);
        sb2.append(", value=");
        return a8.p0.s(sb2, this.f7756b, "}");
    }
}
