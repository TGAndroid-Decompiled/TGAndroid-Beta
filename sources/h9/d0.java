package h9;

public final class d0 extends h1 {

    public final String f8669a;

    public final String f8670b;

    public d0(String str, String str2) {
        this.f8669a = str;
        this.f8670b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f8669a.equals(d0Var.f8669a) && this.f8670b.equals(d0Var.f8670b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8669a.hashCode() ^ 1000003) * 1000003) ^ this.f8670b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f8669a);
        sb2.append(", value=");
        return a9.p.p(sb2, this.f8670b, "}");
    }
}
