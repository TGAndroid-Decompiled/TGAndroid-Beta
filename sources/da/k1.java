package da;
public final class k1 extends n2 {
    public final String f7788a;
    public final String f7789b;

    public k1(String str, String str2) {
        this.f7788a = str;
        this.f7789b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n2) {
            k1 k1Var = (k1) ((n2) obj);
            if (this.f7788a.equals(k1Var.f7788a) && this.f7789b.equals(k1Var.f7789b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f7788a.hashCode() ^ 1000003) * 1000003) ^ this.f7789b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f7788a);
        sb2.append(", variantId=");
        return a8.p0.s(sb2, this.f7789b, "}");
    }
}
