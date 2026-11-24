package defpackage;
public final class h90 extends az2 {
    public final String a;
    public final String b;

    public h90(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof az2) {
            h90 h90Var = (h90) ((az2) obj);
            if (this.a.equals(h90Var.a) && this.b.equals(h90Var.b)) {
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
        return b00.j(sb, this.b, "}");
    }
}
