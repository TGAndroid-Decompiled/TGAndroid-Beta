package m2;

import j$.util.Objects;
public final class b {
    public final String f14632a;
    public final String f14633b;
    public final int f14634c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f14632a = str;
        this.f14633b = str2;
        this.f14634c = i10;
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
        if (this.f14634c == bVar.f14634c && this.d == bVar.d && Objects.equals(this.f14632a, bVar.f14632a) && Objects.equals(this.f14633b, bVar.f14633b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14632a, this.f14633b, Integer.valueOf(this.f14634c), Integer.valueOf(this.d));
    }
}
