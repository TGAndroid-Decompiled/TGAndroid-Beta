package m2;

import j$.util.Objects;
public final class b {
    public final String f15318a;
    public final String f15319b;
    public final int f15320c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f15318a = str;
        this.f15319b = str2;
        this.f15320c = i10;
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
        if (this.f15320c == bVar.f15320c && this.d == bVar.d && Objects.equals(this.f15318a, bVar.f15318a) && Objects.equals(this.f15319b, bVar.f15319b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15318a, this.f15319b, Integer.valueOf(this.f15320c), Integer.valueOf(this.d));
    }
}
