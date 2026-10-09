package m2;

import j$.util.Objects;
public final class b {
    public final String f15908a;
    public final String f15909b;
    public final int f15910c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f15908a = str;
        this.f15909b = str2;
        this.f15910c = i10;
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
        if (this.f15910c == bVar.f15910c && this.d == bVar.d && Objects.equals(this.f15908a, bVar.f15908a) && Objects.equals(this.f15909b, bVar.f15909b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15908a, this.f15909b, Integer.valueOf(this.f15910c), Integer.valueOf(this.d));
    }
}
