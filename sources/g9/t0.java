package g9;
public final class t0 extends t1 {
    public final String f7654a;
    public final int f7655b;
    public final int f7656c;
    public final boolean d;

    public t0(String str, int i9, int i10, boolean z10) {
        this.f7654a = str;
        this.f7655b = i9;
        this.f7656c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f7654a.equals(t0Var.f7654a) && this.f7655b == t0Var.f7655b && this.f7656c == t0Var.f7656c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = (((((this.f7654a.hashCode() ^ 1000003) * 1000003) ^ this.f7655b) * 1000003) ^ this.f7656c) * 1000003;
        if (this.d) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return hashCode ^ i9;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f7654a + ", pid=" + this.f7655b + ", importance=" + this.f7656c + ", defaultProcess=" + this.d + "}";
    }
}
