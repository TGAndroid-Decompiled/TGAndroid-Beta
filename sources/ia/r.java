package ia;

public final class r {

    public final String f11073a;

    public final int f11074b;

    public final int f11075c;
    public final boolean d;

    public r(String str, int i10, int i11, boolean z10) {
        this.f11073a = str;
        this.f11074b = i10;
        this.f11075c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.j.a(this.f11073a, rVar.f11073a) && this.f11074b == rVar.f11074b && this.f11075c == rVar.f11075c && this.d == rVar.d;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f11073a.hashCode() * 31) + this.f11074b) * 31) + this.f11075c) * 31;
        boolean z10 = this.d;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f11073a + ", pid=" + this.f11074b + ", importance=" + this.f11075c + ", isDefaultProcess=" + this.d + ')';
    }
}
