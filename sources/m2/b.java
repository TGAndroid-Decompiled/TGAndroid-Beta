package m2;

import j$.util.Objects;
public final class b {
    public final String f15657a;
    public final String f15658b;
    public final int f15659c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f15657a = str;
        this.f15658b = str2;
        this.f15659c = i10;
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
        if (this.f15659c == bVar.f15659c && this.d == bVar.d && Objects.equals(this.f15657a, bVar.f15657a) && Objects.equals(this.f15658b, bVar.f15658b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15657a, this.f15658b, Integer.valueOf(this.f15659c), Integer.valueOf(this.d));
    }
}
