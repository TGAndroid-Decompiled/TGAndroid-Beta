package m2;

import j$.util.Objects;
public final class b {
    public final String f14378a;
    public final String f14379b;
    public final int f14380c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f14378a = str;
        this.f14379b = str2;
        this.f14380c = i10;
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
        if (this.f14380c == bVar.f14380c && this.d == bVar.d && Objects.equals(this.f14378a, bVar.f14378a) && Objects.equals(this.f14379b, bVar.f14379b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14378a, this.f14379b, Integer.valueOf(this.f14380c), Integer.valueOf(this.d));
    }
}
