package ca;
public final class k1 extends n2 {
    public final String f4424a;
    public final String f4425b;

    public k1(String str, String str2) {
        this.f4424a = str;
        this.f4425b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n2) {
            k1 k1Var = (k1) ((n2) obj);
            if (this.f4424a.equals(k1Var.f4424a) && this.f4425b.equals(k1Var.f4425b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f4424a.hashCode() ^ 1000003) * 1000003) ^ this.f4425b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f4424a);
        sb2.append(", variantId=");
        return a1.g.s(sb2, this.f4425b, "}");
    }
}
