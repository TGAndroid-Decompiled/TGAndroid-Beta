package m2;

import j$.util.Objects;
public final class b {
    public final String f15969a;
    public final String f15970b;
    public final int f15971c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f15969a = str;
        this.f15970b = str2;
        this.f15971c = i10;
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
        if (this.f15971c == bVar.f15971c && this.d == bVar.d && Objects.equals(this.f15969a, bVar.f15969a) && Objects.equals(this.f15970b, bVar.f15970b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15969a, this.f15970b, Integer.valueOf(this.f15971c), Integer.valueOf(this.d));
    }
}
