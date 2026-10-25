package bb;
public final class q {
    public final String f3812a;
    public final int f3813b;
    public final int f3814c;
    public final boolean d;

    public q(String str, int i10, int i11, boolean z10) {
        this.f3812a = str;
        this.f3813b = i10;
        this.f3814c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f3812a, qVar.f3812a) && this.f3813b == qVar.f3813b && this.f3814c == qVar.f3814c && this.d == qVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f3812a.hashCode() * 31) + this.f3813b) * 31) + this.f3814c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f3812a + ", pid=" + this.f3813b + ", importance=" + this.f3814c + ", isDefaultProcess=" + this.d + ')';
    }
}
