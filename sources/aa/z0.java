package aa;
public final class z0 extends z1 {
    public final String f1234a;
    public final String f1235b;

    public z0(String str, String str2) {
        this.f1234a = str;
        this.f1235b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z1) {
            z0 z0Var = (z0) ((z1) obj);
            if (this.f1234a.equals(z0Var.f1234a) && this.f1235b.equals(z0Var.f1235b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f1234a.hashCode() ^ 1000003) * 1000003) ^ this.f1235b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f1234a);
        sb2.append(", variantId=");
        return a1.g.s(sb2, this.f1235b, "}");
    }
}
