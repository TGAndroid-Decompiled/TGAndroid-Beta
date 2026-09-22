package m2;

import j$.util.Objects;
public final class b {
    public final String f14626a;
    public final String f14627b;
    public final int f14628c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f14626a = str;
        this.f14627b = str2;
        this.f14628c = i10;
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
        if (this.f14628c == bVar.f14628c && this.d == bVar.d && Objects.equals(this.f14626a, bVar.f14626a) && Objects.equals(this.f14627b, bVar.f14627b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14626a, this.f14627b, Integer.valueOf(this.f14628c), Integer.valueOf(this.d));
    }
}
