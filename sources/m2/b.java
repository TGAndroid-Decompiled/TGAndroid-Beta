package m2;

import j$.util.Objects;
public final class b {
    public final String f15753a;
    public final String f15754b;
    public final int f15755c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f15753a = str;
        this.f15754b = str2;
        this.f15755c = i10;
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
        if (this.f15755c == bVar.f15755c && this.d == bVar.d && Objects.equals(this.f15753a, bVar.f15753a) && Objects.equals(this.f15754b, bVar.f15754b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15753a, this.f15754b, Integer.valueOf(this.f15755c), Integer.valueOf(this.d));
    }
}
