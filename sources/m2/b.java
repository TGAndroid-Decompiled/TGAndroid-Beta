package m2;

import j$.util.Objects;
public final class b {
    public final String f14388a;
    public final String f14389b;
    public final int f14390c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f14388a = str;
        this.f14389b = str2;
        this.f14390c = i10;
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
        if (this.f14390c == bVar.f14390c && this.d == bVar.d && Objects.equals(this.f14388a, bVar.f14388a) && Objects.equals(this.f14389b, bVar.f14389b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14388a, this.f14389b, Integer.valueOf(this.f14390c), Integer.valueOf(this.d));
    }
}
