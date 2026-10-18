package m2;

import j$.util.Objects;
public final class b {
    public final String f16413a;
    public final String f16414b;
    public final int f16415c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f16413a = str;
        this.f16414b = str2;
        this.f16415c = i10;
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
        if (this.f16415c == bVar.f16415c && this.d == bVar.d && Objects.equals(this.f16413a, bVar.f16413a) && Objects.equals(this.f16414b, bVar.f16414b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16413a, this.f16414b, Integer.valueOf(this.f16415c), Integer.valueOf(this.d));
    }
}
