package m2;

import j$.util.Objects;
public final class b {
    public final String f16406a;
    public final String f16407b;
    public final int f16408c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f16406a = str;
        this.f16407b = str2;
        this.f16408c = i10;
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
        if (this.f16408c == bVar.f16408c && this.d == bVar.d && Objects.equals(this.f16406a, bVar.f16406a) && Objects.equals(this.f16407b, bVar.f16407b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16406a, this.f16407b, Integer.valueOf(this.f16408c), Integer.valueOf(this.d));
    }
}
