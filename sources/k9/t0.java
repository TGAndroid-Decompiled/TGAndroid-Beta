package k9;
public final class t0 extends t1 {
    public final String f10247a;
    public final int f10248b;
    public final int f10249c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z4) {
        this.f10247a = str;
        this.f10248b = i10;
        this.f10249c = i11;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f10247a.equals(t0Var.f10247a) && this.f10248b == t0Var.f10248b && this.f10249c == t0Var.f10249c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f10247a.hashCode() ^ 1000003) * 1000003) ^ this.f10248b) * 1000003) ^ this.f10249c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f10247a + ", pid=" + this.f10248b + ", importance=" + this.f10249c + ", defaultProcess=" + this.d + "}";
    }
}
