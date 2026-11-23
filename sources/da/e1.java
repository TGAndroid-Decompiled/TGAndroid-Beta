package da;
public final class e1 extends j2 {
    public final String f8000a;
    public final int f8001b;
    public final int f8002c;
    public final boolean d;

    public e1(int i7, int i10, String str, boolean z10) {
        this.f8000a = str;
        this.f8001b = i7;
        this.f8002c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            e1 e1Var = (e1) ((j2) obj);
            if (this.f8000a.equals(e1Var.f8000a) && this.f8001b == e1Var.f8001b && this.f8002c == e1Var.f8002c && this.d == e1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f8000a.hashCode() ^ 1000003) * 1000003) ^ this.f8001b) * 1000003) ^ this.f8002c) * 1000003;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode ^ i7;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f8000a + ", pid=" + this.f8001b + ", importance=" + this.f8002c + ", defaultProcess=" + this.d + "}";
    }
}
