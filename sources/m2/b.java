package m2;

import j$.util.Objects;
public final class b {
    public final String f14611a;
    public final String f14612b;
    public final int f14613c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f14611a = str;
        this.f14612b = str2;
        this.f14613c = i10;
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
        if (this.f14613c == bVar.f14613c && this.d == bVar.d && Objects.equals(this.f14611a, bVar.f14611a) && Objects.equals(this.f14612b, bVar.f14612b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14611a, this.f14612b, Integer.valueOf(this.f14613c), Integer.valueOf(this.d));
    }
}
