package i9;
public final class t0 extends t1 {
    public final String f8789a;
    public final int f8790b;
    public final int f8791c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f8789a = str;
        this.f8790b = i10;
        this.f8791c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f8789a.equals(t0Var.f8789a) && this.f8790b == t0Var.f8790b && this.f8791c == t0Var.f8791c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f8789a.hashCode() ^ 1000003) * 1000003) ^ this.f8790b) * 1000003) ^ this.f8791c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f8789a + ", pid=" + this.f8790b + ", importance=" + this.f8791c + ", defaultProcess=" + this.d + "}";
    }
}
