package h9;

public final class t0 extends t1 {

    public final String f8825a;

    public final int f8826b;

    public final int f8827c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f8825a = str;
        this.f8826b = i10;
        this.f8827c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f8825a.equals(t0Var.f8825a) && this.f8826b == t0Var.f8826b && this.f8827c == t0Var.f8827c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f8825a.hashCode() ^ 1000003) * 1000003) ^ this.f8826b) * 1000003) ^ this.f8827c) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f8825a + ", pid=" + this.f8826b + ", importance=" + this.f8827c + ", defaultProcess=" + this.d + "}";
    }
}
