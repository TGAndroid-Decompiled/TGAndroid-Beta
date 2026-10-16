package ab;
public final class q {
    public final String f455a;
    public final int f456b;
    public final int f457c;
    public final boolean d;

    public q(String str, int i10, int i11, boolean z10) {
        this.f455a = str;
        this.f456b = i10;
        this.f457c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f455a, qVar.f455a) && this.f456b == qVar.f456b && this.f457c == qVar.f457c && this.d == qVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f455a.hashCode() * 31) + this.f456b) * 31) + this.f457c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f455a + ", pid=" + this.f456b + ", importance=" + this.f457c + ", isDefaultProcess=" + this.d + ')';
    }
}
