package da;
public final class e1 extends j2 {
    public final String f8009a;
    public final int f8010b;
    public final int f8011c;
    public final boolean d;

    public e1(int i7, int i10, String str, boolean z10) {
        this.f8009a = str;
        this.f8010b = i7;
        this.f8011c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            e1 e1Var = (e1) ((j2) obj);
            if (this.f8009a.equals(e1Var.f8009a) && this.f8010b == e1Var.f8010b && this.f8011c == e1Var.f8011c && this.d == e1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f8009a.hashCode() ^ 1000003) * 1000003) ^ this.f8010b) * 1000003) ^ this.f8011c) * 1000003;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f8009a + ", pid=" + this.f8010b + ", importance=" + this.f8011c + ", defaultProcess=" + this.d + "}";
    }
}
