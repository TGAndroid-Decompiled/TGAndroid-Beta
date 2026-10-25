package aa;
public final class v0 extends v1 {
    public final String f1213a;
    public final int f1214b;
    public final int f1215c;
    public final boolean d;

    public v0(String str, int i10, int i11, boolean z10) {
        this.f1213a = str;
        this.f1214b = i10;
        this.f1215c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            v0 v0Var = (v0) ((v1) obj);
            if (this.f1213a.equals(v0Var.f1213a) && this.f1214b == v0Var.f1214b && this.f1215c == v0Var.f1215c && this.d == v0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f1213a.hashCode() ^ 1000003) * 1000003) ^ this.f1214b) * 1000003) ^ this.f1215c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f1213a + ", pid=" + this.f1214b + ", importance=" + this.f1215c + ", defaultProcess=" + this.d + "}";
    }
}
