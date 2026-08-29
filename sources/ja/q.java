package ja;
public final class q {
    public final String f11396a;
    public final int f11397b;
    public final int f11398c;
    public final boolean d;

    public q(String str, int i10, int i11, boolean z10) {
        this.f11396a = str;
        this.f11397b = i10;
        this.f11398c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (kotlin.jvm.internal.j.a(this.f11396a, qVar.f11396a) && this.f11397b == qVar.f11397b && this.f11398c == qVar.f11398c && this.d == qVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f11396a.hashCode() * 31) + this.f11397b) * 31) + this.f11398c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f11396a + ", pid=" + this.f11397b + ", importance=" + this.f11398c + ", isDefaultProcess=" + this.d + ')';
    }
}
