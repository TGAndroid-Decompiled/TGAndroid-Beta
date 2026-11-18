package da;
public final class k1 extends n2 {
    public final String f8067a;
    public final String f8068b;

    public k1(String str, String str2) {
        this.f8067a = str;
        this.f8068b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n2) {
            k1 k1Var = (k1) ((n2) obj);
            if (this.f8067a.equals(k1Var.f8067a) && this.f8068b.equals(k1Var.f8068b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8067a.hashCode() ^ 1000003) * 1000003) ^ this.f8068b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f8067a);
        sb2.append(", variantId=");
        return a8.p0.s(sb2, this.f8068b, "}");
    }
}
