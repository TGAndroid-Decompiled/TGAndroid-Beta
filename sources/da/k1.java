package da;
public final class k1 extends n2 {
    public final String f8396a;
    public final String f8397b;

    public k1(String str, String str2) {
        this.f8396a = str;
        this.f8397b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n2) {
            k1 k1Var = (k1) ((n2) obj);
            if (this.f8396a.equals(k1Var.f8396a) && this.f8397b.equals(k1Var.f8397b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8396a.hashCode() ^ 1000003) * 1000003) ^ this.f8397b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f8396a);
        sb2.append(", variantId=");
        return a8.p0.s(sb2, this.f8397b, "}");
    }
}
