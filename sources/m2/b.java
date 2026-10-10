package m2;

import j$.util.Objects;
public final class b {
    public final String f15912a;
    public final String f15913b;
    public final int f15914c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f15912a = str;
        this.f15913b = str2;
        this.f15914c = i10;
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
        if (this.f15914c == bVar.f15914c && this.d == bVar.d && Objects.equals(this.f15912a, bVar.f15912a) && Objects.equals(this.f15913b, bVar.f15913b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15912a, this.f15913b, Integer.valueOf(this.f15914c), Integer.valueOf(this.d));
    }
}
