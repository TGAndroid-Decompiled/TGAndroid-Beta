package g9;
public final class x0 extends x1 {
    public final String f7677a;
    public final String f7678b;

    public x0(String str, String str2) {
        this.f7677a = str;
        this.f7678b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f7677a.equals(x0Var.f7677a) && this.f7678b.equals(x0Var.f7678b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f7677a.hashCode() ^ 1000003) * 1000003) ^ this.f7678b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f7677a);
        sb2.append(", variantId=");
        return aa.d.r(sb2, this.f7678b, "}");
    }
}
