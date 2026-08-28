package ha;
public final class q {
    public final String f10361a;
    public final int f10362b;
    public final int f10363c;
    public final boolean d;

    public q(String str, int i9, int i10, boolean z10) {
        this.f10361a = str;
        this.f10362b = i9;
        this.f10363c = i10;
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
        if (kotlin.jvm.internal.i.a(this.f10361a, qVar.f10361a) && this.f10362b == qVar.f10362b && this.f10363c == qVar.f10363c && this.d == qVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f10361a.hashCode() * 31) + this.f10362b) * 31) + this.f10363c) * 31;
        boolean z10 = this.d;
        int i9 = z10;
        if (z10 != 0) {
            i9 = 1;
        }
        return hashCode + i9;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f10361a + ", pid=" + this.f10362b + ", importance=" + this.f10363c + ", isDefaultProcess=" + this.d + ')';
    }
}
