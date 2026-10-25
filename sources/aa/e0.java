package aa;
public final class e0 extends j1 {
    public final String f1068a;
    public final String f1069b;

    public e0(String str, String str2) {
        this.f1068a = str;
        this.f1069b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            e0 e0Var = (e0) ((j1) obj);
            if (this.f1068a.equals(e0Var.f1068a) && this.f1069b.equals(e0Var.f1069b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f1068a.hashCode() ^ 1000003) * 1000003) ^ this.f1069b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f1068a);
        sb2.append(", value=");
        return a1.g.s(sb2, this.f1069b, "}");
    }
}
