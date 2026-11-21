package da;
public final class e1 extends j2 {
    public final String f8035a;
    public final int f8036b;
    public final int f8037c;
    public final boolean d;

    public e1(int i7, int i10, String str, boolean z10) {
        this.f8035a = str;
        this.f8036b = i7;
        this.f8037c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            e1 e1Var = (e1) ((j2) obj);
            if (this.f8035a.equals(e1Var.f8035a) && this.f8036b == e1Var.f8036b && this.f8037c == e1Var.f8037c && this.d == e1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f8035a.hashCode() ^ 1000003) * 1000003) ^ this.f8036b) * 1000003) ^ this.f8037c) * 1000003;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f8035a + ", pid=" + this.f8036b + ", importance=" + this.f8037c + ", defaultProcess=" + this.d + "}";
    }
}
