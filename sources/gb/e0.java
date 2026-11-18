package gb;
public final class e0 {
    public final String f13334a;
    public final int f13335b;
    public final int f13336c;
    public final boolean d;

    public e0(int i7, int i10, String str, boolean z10) {
        this.f13334a = str;
        this.f13335b = i7;
        this.f13336c = i10;
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
        if (kotlin.jvm.internal.j.a(this.f13334a, e0Var.f13334a) && this.f13335b == e0Var.f13335b && this.f13336c == e0Var.f13336c && this.d == e0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = ((((this.f13334a.hashCode() * 31) + this.f13335b) * 31) + this.f13336c) * 31;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode + i7;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f13334a + ", pid=" + this.f13335b + ", importance=" + this.f13336c + ", isDefaultProcess=" + this.d + ')';
    }
}
