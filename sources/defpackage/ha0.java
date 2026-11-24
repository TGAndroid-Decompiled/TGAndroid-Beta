package defpackage;
public final class ha0 extends l03 {
    public final String a;
    public final String b;

    public ha0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l03) {
            ha0 ha0Var = (ha0) ((l03) obj);
            if (this.a.equals(ha0Var.a) && this.b.equals(ha0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.a);
        sb.append(", variantId=");
        return b10.j(sb, this.b, "}");
    }
}
