package gb;
public final class e0 {
    public final String f13331a;
    public final int f13332b;
    public final int f13333c;
    public final boolean d;

    public e0(int i7, int i10, String str, boolean z10) {
        this.f13331a = str;
        this.f13332b = i7;
        this.f13333c = i10;
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
        if (kotlin.jvm.internal.j.a(this.f13331a, e0Var.f13331a) && this.f13332b == e0Var.f13332b && this.f13333c == e0Var.f13333c && this.d == e0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = ((((this.f13331a.hashCode() * 31) + this.f13332b) * 31) + this.f13333c) * 31;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode + i7;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f13331a + ", pid=" + this.f13332b + ", importance=" + this.f13333c + ", isDefaultProcess=" + this.d + ')';
    }
}
