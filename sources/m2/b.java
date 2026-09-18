package m2;

import j$.util.Objects;
public final class b {
    public final String f14575a;
    public final String f14576b;
    public final int f14577c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f14575a = str;
        this.f14576b = str2;
        this.f14577c = i10;
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
        if (this.f14577c == bVar.f14577c && this.d == bVar.d && Objects.equals(this.f14575a, bVar.f14575a) && Objects.equals(this.f14576b, bVar.f14576b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14575a, this.f14576b, Integer.valueOf(this.f14577c), Integer.valueOf(this.d));
    }
}
