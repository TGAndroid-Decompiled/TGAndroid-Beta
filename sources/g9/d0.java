package g9;
public final class d0 extends h1 {
    public final String f7498a;
    public final String f7499b;

    public d0(String str, String str2) {
        this.f7498a = str;
        this.f7499b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f7498a.equals(d0Var.f7498a) && this.f7499b.equals(d0Var.f7499b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f7498a.hashCode() ^ 1000003) * 1000003) ^ this.f7499b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f7498a);
        sb2.append(", value=");
        return aa.d.r(sb2, this.f7499b, "}");
    }
}
