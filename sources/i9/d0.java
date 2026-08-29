package i9;
public final class d0 extends h1 {
    public final String f8633a;
    public final String f8634b;

    public d0(String str, String str2) {
        this.f8633a = str;
        this.f8634b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f8633a.equals(d0Var.f8633a) && this.f8634b.equals(d0Var.f8634b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8633a.hashCode() ^ 1000003) * 1000003) ^ this.f8634b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f8633a);
        sb2.append(", value=");
        return a4.w.q(sb2, this.f8634b, "}");
    }
}
