package m2;

import j$.util.Objects;
public final class b {
    public final String f15053a;
    public final String f15054b;
    public final int f15055c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f15053a = str;
        this.f15054b = str2;
        this.f15055c = i10;
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
        if (this.f15055c == bVar.f15055c && this.d == bVar.d && Objects.equals(this.f15053a, bVar.f15053a) && Objects.equals(this.f15054b, bVar.f15054b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15053a, this.f15054b, Integer.valueOf(this.f15055c), Integer.valueOf(this.d));
    }
}
