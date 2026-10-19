package m2;

import j$.util.Objects;
public final class b {
    public final String f16412a;
    public final String f16413b;
    public final int f16414c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f16412a = str;
        this.f16413b = str2;
        this.f16414c = i10;
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
        if (this.f16414c == bVar.f16414c && this.d == bVar.d && Objects.equals(this.f16412a, bVar.f16412a) && Objects.equals(this.f16413b, bVar.f16413b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16412a, this.f16413b, Integer.valueOf(this.f16414c), Integer.valueOf(this.d));
    }
}
