package k9;
public final class d0 extends h1 {
    public final String f10853a;
    public final String f10854b;

    public d0(String str, String str2) {
        this.f10853a = str;
        this.f10854b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f10853a.equals(d0Var.f10853a) && this.f10854b.equals(d0Var.f10854b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10853a.hashCode() ^ 1000003) * 1000003) ^ this.f10854b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.f10853a);
        sb.append(", value=");
        return android.support.v4.media.a.r(sb, this.f10854b, "}");
    }
}
