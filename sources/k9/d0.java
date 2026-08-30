package k9;
public final class d0 extends h1 {
    public final String f10112a;
    public final String f10113b;

    public d0(String str, String str2) {
        this.f10112a = str;
        this.f10113b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f10112a.equals(d0Var.f10112a) && this.f10113b.equals(d0Var.f10113b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10112a.hashCode() ^ 1000003) * 1000003) ^ this.f10113b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.f10112a);
        sb.append(", value=");
        return android.support.v4.media.a.r(sb, this.f10113b, "}");
    }
}
