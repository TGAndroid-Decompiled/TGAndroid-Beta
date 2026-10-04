package m2;

import j$.util.Objects;
public final class b {
    public final String f15968a;
    public final String f15969b;
    public final int f15970c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f15968a = str;
        this.f15969b = str2;
        this.f15970c = i10;
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
        if (this.f15970c == bVar.f15970c && this.d == bVar.d && Objects.equals(this.f15968a, bVar.f15968a) && Objects.equals(this.f15969b, bVar.f15969b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15968a, this.f15969b, Integer.valueOf(this.f15970c), Integer.valueOf(this.d));
    }
}
