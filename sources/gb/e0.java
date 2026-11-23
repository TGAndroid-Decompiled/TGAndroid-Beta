package gb;
public final class e0 {
    public final String f13326a;
    public final int f13327b;
    public final int f13328c;
    public final boolean d;

    public e0(int i7, int i10, String str, boolean z10) {
        this.f13326a = str;
        this.f13327b = i7;
        this.f13328c = i10;
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
        if (kotlin.jvm.internal.j.a(this.f13326a, e0Var.f13326a) && this.f13327b == e0Var.f13327b && this.f13328c == e0Var.f13328c && this.d == e0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = ((((this.f13326a.hashCode() * 31) + this.f13327b) * 31) + this.f13328c) * 31;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode + i7;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f13326a + ", pid=" + this.f13327b + ", importance=" + this.f13328c + ", isDefaultProcess=" + this.d + ')';
    }
}
