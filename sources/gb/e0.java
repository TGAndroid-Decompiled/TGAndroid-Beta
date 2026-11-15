package gb;
public final class e0 {
    public final String f13017a;
    public final int f13018b;
    public final int f13019c;
    public final boolean d;

    public e0(int i7, int i10, String str, boolean z10) {
        this.f13017a = str;
        this.f13018b = i7;
        this.f13019c = i10;
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
        if (kotlin.jvm.internal.j.a(this.f13017a, e0Var.f13017a) && this.f13018b == e0Var.f13018b && this.f13019c == e0Var.f13019c && this.d == e0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = ((((this.f13017a.hashCode() * 31) + this.f13018b) * 31) + this.f13019c) * 31;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode + i7;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f13017a + ", pid=" + this.f13018b + ", importance=" + this.f13019c + ", isDefaultProcess=" + this.d + ')';
    }
}
