package la;
public final class p {
    public final String f12228a;
    public final int f12229b;
    public final int f12230c;
    public final boolean d;

    public p(String str, int i10, int i11, boolean z4) {
        this.f12228a = str;
        this.f12229b = i10;
        this.f12230c = i11;
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
        if (kotlin.jvm.internal.j.a(this.f12228a, pVar.f12228a) && this.f12229b == pVar.f12229b && this.f12230c == pVar.f12230c && this.d == pVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f12228a.hashCode() * 31) + this.f12229b) * 31) + this.f12230c) * 31;
        boolean z4 = this.d;
        int i10 = z4;
        if (z4 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f12228a + ", pid=" + this.f12229b + ", importance=" + this.f12230c + ", isDefaultProcess=" + this.d + ')';
    }
}
