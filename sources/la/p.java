package la;
public final class p {
    public final String f11811a;
    public final int f11812b;
    public final int f11813c;
    public final boolean d;

    public p(String str, int i10, int i11, boolean z4) {
        this.f11811a = str;
        this.f11812b = i10;
        this.f11813c = i11;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (kotlin.jvm.internal.j.a(this.f11811a, pVar.f11811a) && this.f11812b == pVar.f11812b && this.f11813c == pVar.f11813c && this.d == pVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f11811a.hashCode() * 31) + this.f11812b) * 31) + this.f11813c) * 31;
        boolean z4 = this.d;
        int i10 = z4;
        if (z4 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f11811a + ", pid=" + this.f11812b + ", importance=" + this.f11813c + ", isDefaultProcess=" + this.d + ')';
    }
}
