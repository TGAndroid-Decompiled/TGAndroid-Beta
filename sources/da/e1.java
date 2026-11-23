package da;
public final class e1 extends j2 {
    public final String f8001a;
    public final int f8002b;
    public final int f8003c;
    public final boolean d;

    public e1(int i7, int i10, String str, boolean z10) {
        this.f8001a = str;
        this.f8002b = i7;
        this.f8003c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            e1 e1Var = (e1) ((j2) obj);
            if (this.f8001a.equals(e1Var.f8001a) && this.f8002b == e1Var.f8002b && this.f8003c == e1Var.f8003c && this.d == e1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f8001a.hashCode() ^ 1000003) * 1000003) ^ this.f8002b) * 1000003) ^ this.f8003c) * 1000003;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f8001a + ", pid=" + this.f8002b + ", importance=" + this.f8003c + ", defaultProcess=" + this.d + "}";
    }
}
