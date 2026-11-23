package gb;
public final class f0 {
    public final String f13332a;
    public final int f13333b;
    public final int f13334c;
    public final boolean d;

    public f0(int i7, int i10, String str, boolean z10) {
        this.f13332a = str;
        this.f13333b = i7;
        this.f13334c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (kotlin.jvm.internal.j.a(this.f13332a, f0Var.f13332a) && this.f13333b == f0Var.f13333b && this.f13334c == f0Var.f13334c && this.d == f0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = ((((this.f13332a.hashCode() * 31) + this.f13333b) * 31) + this.f13334c) * 31;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode + i7;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f13332a + ", pid=" + this.f13333b + ", importance=" + this.f13334c + ", isDefaultProcess=" + this.d + ')';
    }
}
