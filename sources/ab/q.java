package ab;
public final class q {
    public final String f451a;
    public final int f452b;
    public final int f453c;
    public final boolean d;

    public q(String str, int i10, int i11, boolean z10) {
        this.f451a = str;
        this.f452b = i10;
        this.f453c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f451a, qVar.f451a) && this.f452b == qVar.f452b && this.f453c == qVar.f453c && this.d == qVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f451a.hashCode() * 31) + this.f452b) * 31) + this.f453c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f451a + ", pid=" + this.f452b + ", importance=" + this.f453c + ", isDefaultProcess=" + this.d + ')';
    }
}
