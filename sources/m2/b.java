package m2;

import j$.util.Objects;
public final class b {
    public final String f15780a;
    public final String f15781b;
    public final int f15782c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f15780a = str;
        this.f15781b = str2;
        this.f15782c = i10;
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
        if (this.f15782c == bVar.f15782c && this.d == bVar.d && Objects.equals(this.f15780a, bVar.f15780a) && Objects.equals(this.f15781b, bVar.f15781b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15780a, this.f15781b, Integer.valueOf(this.f15782c), Integer.valueOf(this.d));
    }
}
