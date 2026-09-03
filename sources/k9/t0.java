package k9;
public final class t0 extends t1 {
    public final String f10227a;
    public final int f10228b;
    public final int f10229c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z4) {
        this.f10227a = str;
        this.f10228b = i10;
        this.f10229c = i11;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f10227a.equals(t0Var.f10227a) && this.f10228b == t0Var.f10228b && this.f10229c == t0Var.f10229c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f10227a.hashCode() ^ 1000003) * 1000003) ^ this.f10228b) * 1000003) ^ this.f10229c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f10227a + ", pid=" + this.f10228b + ", importance=" + this.f10229c + ", defaultProcess=" + this.d + "}";
    }
}
