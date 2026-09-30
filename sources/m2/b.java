package m2;

import j$.util.Objects;
public final class b {
    public final String f14647a;
    public final String f14648b;
    public final int f14649c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f14647a = str;
        this.f14648b = str2;
        this.f14649c = i10;
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
        if (this.f14649c == bVar.f14649c && this.d == bVar.d && Objects.equals(this.f14647a, bVar.f14647a) && Objects.equals(this.f14648b, bVar.f14648b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14647a, this.f14648b, Integer.valueOf(this.f14649c), Integer.valueOf(this.d));
    }
}
