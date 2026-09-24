package m2;

import j$.util.Objects;
public final class b {
    public final String f14616a;
    public final String f14617b;
    public final int f14618c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f14616a = str;
        this.f14617b = str2;
        this.f14618c = i10;
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
        if (this.f14618c == bVar.f14618c && this.d == bVar.d && Objects.equals(this.f14616a, bVar.f14616a) && Objects.equals(this.f14617b, bVar.f14617b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14616a, this.f14617b, Integer.valueOf(this.f14618c), Integer.valueOf(this.d));
    }
}
