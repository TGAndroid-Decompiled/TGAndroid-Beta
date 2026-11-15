package da;
public final class e1 extends j2 {
    public final String f7724a;
    public final int f7725b;
    public final int f7726c;
    public final boolean d;

    public e1(int i7, int i10, String str, boolean z10) {
        this.f7724a = str;
        this.f7725b = i7;
        this.f7726c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            e1 e1Var = (e1) ((j2) obj);
            if (this.f7724a.equals(e1Var.f7724a) && this.f7725b == e1Var.f7725b && this.f7726c == e1Var.f7726c && this.d == e1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f7724a.hashCode() ^ 1000003) * 1000003) ^ this.f7725b) * 1000003) ^ this.f7726c) * 1000003;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f7724a + ", pid=" + this.f7725b + ", importance=" + this.f7726c + ", defaultProcess=" + this.d + "}";
    }
}
