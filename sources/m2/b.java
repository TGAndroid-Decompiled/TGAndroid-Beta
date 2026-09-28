package m2;

import j$.util.Objects;
public final class b {
    public final String f14631a;
    public final String f14632b;
    public final int f14633c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f14631a = str;
        this.f14632b = str2;
        this.f14633c = i10;
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
        if (this.f14633c == bVar.f14633c && this.d == bVar.d && Objects.equals(this.f14631a, bVar.f14631a) && Objects.equals(this.f14632b, bVar.f14632b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14631a, this.f14632b, Integer.valueOf(this.f14633c), Integer.valueOf(this.d));
    }
}
