package gb;
public final class e0 {
    public final String f13360a;
    public final int f13361b;
    public final int f13362c;
    public final boolean d;

    public e0(int i7, int i10, String str, boolean z10) {
        this.f13360a = str;
        this.f13361b = i7;
        this.f13362c = i10;
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
        if (kotlin.jvm.internal.j.a(this.f13360a, e0Var.f13360a) && this.f13361b == e0Var.f13361b && this.f13362c == e0Var.f13362c && this.d == e0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = ((((this.f13360a.hashCode() * 31) + this.f13361b) * 31) + this.f13362c) * 31;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode + i7;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f13360a + ", pid=" + this.f13361b + ", importance=" + this.f13362c + ", isDefaultProcess=" + this.d + ')';
    }
}
