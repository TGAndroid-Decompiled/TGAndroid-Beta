package da;
public final class e1 extends j2 {
    public final String f8337a;
    public final int f8338b;
    public final int f8339c;
    public final boolean d;

    public e1(int i7, int i10, String str, boolean z9) {
        this.f8337a = str;
        this.f8338b = i7;
        this.f8339c = i10;
        this.d = z9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            e1 e1Var = (e1) ((j2) obj);
            if (this.f8337a.equals(e1Var.f8337a) && this.f8338b == e1Var.f8338b && this.f8339c == e1Var.f8339c && this.d == e1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f8337a.hashCode() ^ 1000003) * 1000003) ^ this.f8338b) * 1000003) ^ this.f8339c) * 1000003;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f8337a + ", pid=" + this.f8338b + ", importance=" + this.f8339c + ", defaultProcess=" + this.d + "}";
    }
}
