package m2;

import j$.util.Objects;
public final class b {
    public final String f15658a;
    public final String f15659b;
    public final int f15660c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f15658a = str;
        this.f15659b = str2;
        this.f15660c = i10;
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
        if (this.f15660c == bVar.f15660c && this.d == bVar.d && Objects.equals(this.f15658a, bVar.f15658a) && Objects.equals(this.f15659b, bVar.f15659b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15658a, this.f15659b, Integer.valueOf(this.f15660c), Integer.valueOf(this.d));
    }
}
