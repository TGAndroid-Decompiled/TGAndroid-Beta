package la;
public final class p {
    public final String f11921a;
    public final int f11922b;
    public final int f11923c;
    public final boolean d;

    public p(String str, int i10, int i11, boolean z4) {
        this.f11921a = str;
        this.f11922b = i10;
        this.f11923c = i11;
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
        if (kotlin.jvm.internal.j.a(this.f11921a, pVar.f11921a) && this.f11922b == pVar.f11922b && this.f11923c == pVar.f11923c && this.d == pVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f11921a.hashCode() * 31) + this.f11922b) * 31) + this.f11923c) * 31;
        boolean z4 = this.d;
        int i10 = z4;
        if (z4 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f11921a + ", pid=" + this.f11922b + ", importance=" + this.f11923c + ", isDefaultProcess=" + this.d + ')';
    }
}
