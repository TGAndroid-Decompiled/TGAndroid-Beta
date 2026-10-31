package bb;
public final class q {
    public final String f2613a;
    public final int f2614b;
    public final int f2615c;
    public final boolean d;

    public q(int i10, int i11, String str, boolean z10) {
        this.f2613a = str;
        this.f2614b = i10;
        this.f2615c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f2613a, qVar.f2613a) && this.f2614b == qVar.f2614b && this.f2615c == qVar.f2615c && this.d == qVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f2613a.hashCode() * 31) + this.f2614b) * 31) + this.f2615c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f2613a + ", pid=" + this.f2614b + ", importance=" + this.f2615c + ", isDefaultProcess=" + this.d + ')';
    }
}
