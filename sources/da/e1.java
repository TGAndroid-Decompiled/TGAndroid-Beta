package da;
public final class e1 extends j2 {
    public final String f8006a;
    public final int f8007b;
    public final int f8008c;
    public final boolean d;

    public e1(int i7, int i10, String str, boolean z10) {
        this.f8006a = str;
        this.f8007b = i7;
        this.f8008c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            e1 e1Var = (e1) ((j2) obj);
            if (this.f8006a.equals(e1Var.f8006a) && this.f8007b == e1Var.f8007b && this.f8008c == e1Var.f8008c && this.d == e1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f8006a.hashCode() ^ 1000003) * 1000003) ^ this.f8007b) * 1000003) ^ this.f8008c) * 1000003;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f8006a + ", pid=" + this.f8007b + ", importance=" + this.f8008c + ", defaultProcess=" + this.d + "}";
    }
}
