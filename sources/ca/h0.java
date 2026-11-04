package ca;
public final class h0 extends v1 {
    public final String f4394a;
    public final String f4395b;

    public h0(String str, String str2) {
        this.f4394a = str;
        this.f4395b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            h0 h0Var = (h0) ((v1) obj);
            if (this.f4394a.equals(h0Var.f4394a) && this.f4395b.equals(h0Var.f4395b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f4394a.hashCode() ^ 1000003) * 1000003) ^ this.f4395b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f4394a);
        sb2.append(", value=");
        return a1.g.s(sb2, this.f4395b, "}");
    }
}
