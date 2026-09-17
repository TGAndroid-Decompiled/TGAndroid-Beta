package m2;

import j$.util.Objects;
public final class b {
    public final String f14400a;
    public final String f14401b;
    public final int f14402c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f14400a = str;
        this.f14401b = str2;
        this.f14402c = i10;
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
        if (this.f14402c == bVar.f14402c && this.d == bVar.d && Objects.equals(this.f14400a, bVar.f14400a) && Objects.equals(this.f14401b, bVar.f14401b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14400a, this.f14401b, Integer.valueOf(this.f14402c), Integer.valueOf(this.d));
    }
}
