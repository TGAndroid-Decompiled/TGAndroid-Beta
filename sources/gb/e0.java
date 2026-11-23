package gb;
public final class e0 {
    public final String f13363a;
    public final int f13364b;
    public final int f13365c;
    public final boolean d;

    public e0(int i7, int i10, String str, boolean z10) {
        this.f13363a = str;
        this.f13364b = i7;
        this.f13365c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (kotlin.jvm.internal.j.a(this.f13363a, e0Var.f13363a) && this.f13364b == e0Var.f13364b && this.f13365c == e0Var.f13365c && this.d == e0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = ((((this.f13363a.hashCode() * 31) + this.f13364b) * 31) + this.f13365c) * 31;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode + i7;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f13363a + ", pid=" + this.f13364b + ", importance=" + this.f13365c + ", isDefaultProcess=" + this.d + ')';
    }
}
