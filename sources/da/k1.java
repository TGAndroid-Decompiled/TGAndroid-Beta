package da;
public final class k1 extends n2 {
    public final String f8401a;
    public final String f8402b;

    public k1(String str, String str2) {
        this.f8401a = str;
        this.f8402b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n2) {
            k1 k1Var = (k1) ((n2) obj);
            if (this.f8401a.equals(k1Var.f8401a) && this.f8402b.equals(k1Var.f8402b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8401a.hashCode() ^ 1000003) * 1000003) ^ this.f8402b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f8401a);
        sb2.append(", variantId=");
        return a8.p0.s(sb2, this.f8402b, "}");
    }
}
