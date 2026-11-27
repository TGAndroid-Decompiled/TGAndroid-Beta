package defpackage;
public final class j90 extends vz2 {
    public final String a;
    public final String b;

    public j90(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vz2) {
            j90 j90Var = (j90) ((vz2) obj);
            if (this.a.equals(j90Var.a) && this.b.equals(j90Var.b)) {
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
        return c00.k(sb, this.b, "}");
    }
}
