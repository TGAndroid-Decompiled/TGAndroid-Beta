package gb;
public final class f0 {
    public final String f13675a;
    public final int f13676b;
    public final int f13677c;
    public final boolean d;

    public f0(int i7, int i10, String str, boolean z9) {
        this.f13675a = str;
        this.f13676b = i7;
        this.f13677c = i10;
        this.d = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (kotlin.jvm.internal.j.a(this.f13675a, f0Var.f13675a) && this.f13676b == f0Var.f13676b && this.f13677c == f0Var.f13677c && this.d == f0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = ((((this.f13675a.hashCode() * 31) + this.f13676b) * 31) + this.f13677c) * 31;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode + i7;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f13675a + ", pid=" + this.f13676b + ", importance=" + this.f13677c + ", isDefaultProcess=" + this.d + ')';
    }
}
