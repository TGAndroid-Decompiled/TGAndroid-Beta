package h9;

public final class x0 extends x1 {

    public final String f8848a;

    public final String f8849b;

    public x0(String str, String str2) {
        this.f8848a = str;
        this.f8849b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x0 x0Var = (x0) ((x1) obj);
            if (this.f8848a.equals(x0Var.f8848a) && this.f8849b.equals(x0Var.f8849b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8848a.hashCode() ^ 1000003) * 1000003) ^ this.f8849b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f8848a);
        sb2.append(", variantId=");
        return a9.p.p(sb2, this.f8849b, "}");
    }
}
