package da;
public final class e1 extends j2 {
    public final String f8335a;
    public final int f8336b;
    public final int f8337c;
    public final boolean d;

    public e1(int i7, int i10, String str, boolean z9) {
        this.f8335a = str;
        this.f8336b = i7;
        this.f8337c = i10;
        this.d = z9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            e1 e1Var = (e1) ((j2) obj);
            if (this.f8335a.equals(e1Var.f8335a) && this.f8336b == e1Var.f8336b && this.f8337c == e1Var.f8337c && this.d == e1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f8335a.hashCode() ^ 1000003) * 1000003) ^ this.f8336b) * 1000003) ^ this.f8337c) * 1000003;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f8335a + ", pid=" + this.f8336b + ", importance=" + this.f8337c + ", defaultProcess=" + this.d + "}";
    }
}
