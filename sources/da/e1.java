package da;
public final class e1 extends j2 {
    public final String f8340a;
    public final int f8341b;
    public final int f8342c;
    public final boolean d;

    public e1(int i7, int i10, String str, boolean z9) {
        this.f8340a = str;
        this.f8341b = i7;
        this.f8342c = i10;
        this.d = z9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            e1 e1Var = (e1) ((j2) obj);
            if (this.f8340a.equals(e1Var.f8340a) && this.f8341b == e1Var.f8341b && this.f8342c == e1Var.f8342c && this.d == e1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f8340a.hashCode() ^ 1000003) * 1000003) ^ this.f8341b) * 1000003) ^ this.f8342c) * 1000003;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f8340a + ", pid=" + this.f8341b + ", importance=" + this.f8342c + ", defaultProcess=" + this.d + "}";
    }
}
