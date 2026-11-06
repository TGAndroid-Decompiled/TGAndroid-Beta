package gb;
public final class f0 {
    public final String f13673a;
    public final int f13674b;
    public final int f13675c;
    public final boolean d;

    public f0(int i7, int i10, String str, boolean z9) {
        this.f13673a = str;
        this.f13674b = i7;
        this.f13675c = i10;
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
        if (kotlin.jvm.internal.j.a(this.f13673a, f0Var.f13673a) && this.f13674b == f0Var.f13674b && this.f13675c == f0Var.f13675c && this.d == f0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = ((((this.f13673a.hashCode() * 31) + this.f13674b) * 31) + this.f13675c) * 31;
        if (this.d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return hashCode + i7;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f13673a + ", pid=" + this.f13674b + ", importance=" + this.f13675c + ", isDefaultProcess=" + this.d + ')';
    }
}
