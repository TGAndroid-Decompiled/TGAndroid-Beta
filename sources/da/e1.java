package da;
public final class e1 extends j2 {
    public final String f7727a;
    public final int f7728b;
    public final int f7729c;
    public final boolean d;

    public e1(int i7, int i10, String str, boolean z10) {
        this.f7727a = str;
        this.f7728b = i7;
        this.f7729c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            e1 e1Var = (e1) ((j2) obj);
            if (this.f7727a.equals(e1Var.f7727a) && this.f7728b == e1Var.f7728b && this.f7729c == e1Var.f7729c && this.d == e1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f7727a.hashCode() ^ 1000003) * 1000003) ^ this.f7728b) * 1000003) ^ this.f7729c) * 1000003;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f7727a + ", pid=" + this.f7728b + ", importance=" + this.f7729c + ", defaultProcess=" + this.d + "}";
    }
}
