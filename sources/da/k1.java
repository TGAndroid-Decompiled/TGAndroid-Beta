package da;
public final class k1 extends n2 {
    public final String f7785a;
    public final String f7786b;

    public k1(String str, String str2) {
        this.f7785a = str;
        this.f7786b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n2) {
            k1 k1Var = (k1) ((n2) obj);
            if (this.f7785a.equals(k1Var.f7785a) && this.f7786b.equals(k1Var.f7786b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f7785a.hashCode() ^ 1000003) * 1000003) ^ this.f7786b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f7785a);
        sb2.append(", variantId=");
        return a8.p0.s(sb2, this.f7786b, "}");
    }
}
