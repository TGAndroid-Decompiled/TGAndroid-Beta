package k9;
public final class t0 extends t1 {
    public final String f11009a;
    public final int f11010b;
    public final int f11011c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z4) {
        this.f11009a = str;
        this.f11010b = i10;
        this.f11011c = i11;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f11009a.equals(t0Var.f11009a) && this.f11010b == t0Var.f11010b && this.f11011c == t0Var.f11011c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f11009a.hashCode() ^ 1000003) * 1000003) ^ this.f11010b) * 1000003) ^ this.f11011c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f11009a + ", pid=" + this.f11010b + ", importance=" + this.f11011c + ", defaultProcess=" + this.d + "}";
    }
}
