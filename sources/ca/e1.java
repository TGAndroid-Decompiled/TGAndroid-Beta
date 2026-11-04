package ca;
public final class e1 extends j2 {
    public final String f4363a;
    public final int f4364b;
    public final int f4365c;
    public final boolean d;

    public e1(int i3, int i10, String str, boolean z10) {
        this.f4363a = str;
        this.f4364b = i3;
        this.f4365c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            e1 e1Var = (e1) ((j2) obj);
            if (this.f4363a.equals(e1Var.f4363a) && this.f4364b == e1Var.f4364b && this.f4365c == e1Var.f4365c && this.d == e1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int hashCode = (((((this.f4363a.hashCode() ^ 1000003) * 1000003) ^ this.f4364b) * 1000003) ^ this.f4365c) * 1000003;
        if (this.d) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        return hashCode ^ i3;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f4363a + ", pid=" + this.f4364b + ", importance=" + this.f4365c + ", defaultProcess=" + this.d + "}";
    }
}
