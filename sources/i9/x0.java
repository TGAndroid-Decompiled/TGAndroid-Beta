package i9;
public final class x0 extends x1 {
    public final String f8812a;
    public final String f8813b;

    public x0(String str, String str2) {
        this.f8812a = str;
        this.f8813b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f8812a.equals(x0Var.f8812a) && this.f8813b.equals(x0Var.f8813b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8812a.hashCode() ^ 1000003) * 1000003) ^ this.f8813b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f8812a);
        sb2.append(", variantId=");
        return a4.w.q(sb2, this.f8813b, "}");
    }
}
