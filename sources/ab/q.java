package ab;
public final class q {
    public final String f454a;
    public final int f455b;
    public final int f456c;
    public final boolean d;

    public q(String str, int i10, int i11, boolean z10) {
        this.f454a = str;
        this.f455b = i10;
        this.f456c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f454a, qVar.f454a) && this.f455b == qVar.f455b && this.f456c == qVar.f456c && this.d == qVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f454a.hashCode() * 31) + this.f455b) * 31) + this.f456c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f454a + ", pid=" + this.f455b + ", importance=" + this.f456c + ", isDefaultProcess=" + this.d + ')';
    }
}
