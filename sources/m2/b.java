package m2;

import j$.util.Objects;
public final class b {
    public final String f15933a;
    public final String f15934b;
    public final int f15935c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f15933a = str;
        this.f15934b = str2;
        this.f15935c = i10;
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
        if (this.f15935c == bVar.f15935c && this.d == bVar.d && Objects.equals(this.f15933a, bVar.f15933a) && Objects.equals(this.f15934b, bVar.f15934b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15933a, this.f15934b, Integer.valueOf(this.f15935c), Integer.valueOf(this.d));
    }
}
