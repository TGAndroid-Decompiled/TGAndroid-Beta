package m2;

import j$.util.Objects;
public final class b {
    public final String f15978a;
    public final String f15979b;
    public final int f15980c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f15978a = str;
        this.f15979b = str2;
        this.f15980c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f15980c == bVar.f15980c && this.d == bVar.d && Objects.equals(this.f15978a, bVar.f15978a) && Objects.equals(this.f15979b, bVar.f15979b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15978a, this.f15979b, Integer.valueOf(this.f15980c), Integer.valueOf(this.d));
    }
}
