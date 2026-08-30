package k9;
public final class x0 extends x1 {
    public final String f10268a;
    public final String f10269b;

    public x0(String str, String str2) {
        this.f10268a = str;
        this.f10269b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f10268a.equals(x0Var.f10268a) && this.f10269b.equals(x0Var.f10269b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10268a.hashCode() ^ 1000003) * 1000003) ^ this.f10269b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.f10268a);
        sb.append(", variantId=");
        return android.support.v4.media.a.r(sb, this.f10269b, "}");
    }
}
