package m2;

import j$.util.Objects;
public final class b {
    public final String f16414a;
    public final String f16415b;
    public final int f16416c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f16414a = str;
        this.f16415b = str2;
        this.f16416c = i10;
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
        if (this.f16416c == bVar.f16416c && this.d == bVar.d && Objects.equals(this.f16414a, bVar.f16414a) && Objects.equals(this.f16415b, bVar.f16415b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16414a, this.f16415b, Integer.valueOf(this.f16416c), Integer.valueOf(this.d));
    }
}
