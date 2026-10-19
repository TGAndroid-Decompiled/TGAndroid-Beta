package ab;
public final class q {
    public final String f453a;
    public final int f454b;
    public final int f455c;
    public final boolean d;

    public q(String str, int i10, int i11, boolean z10) {
        this.f453a = str;
        this.f454b = i10;
        this.f455c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f453a, qVar.f453a) && this.f454b == qVar.f454b && this.f455c == qVar.f455c && this.d == qVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f453a.hashCode() * 31) + this.f454b) * 31) + this.f455c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f453a + ", pid=" + this.f454b + ", importance=" + this.f455c + ", isDefaultProcess=" + this.d + ')';
    }
}
