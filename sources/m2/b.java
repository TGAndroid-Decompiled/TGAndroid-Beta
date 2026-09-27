package m2;

import j$.util.Objects;
public final class b {
    public final String f14658a;
    public final String f14659b;
    public final int f14660c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f14658a = str;
        this.f14659b = str2;
        this.f14660c = i10;
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
        if (this.f14660c == bVar.f14660c && this.d == bVar.d && Objects.equals(this.f14658a, bVar.f14658a) && Objects.equals(this.f14659b, bVar.f14659b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14658a, this.f14659b, Integer.valueOf(this.f14660c), Integer.valueOf(this.d));
    }
}
