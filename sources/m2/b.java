package m2;

import j$.util.Objects;
public final class b {
    public final String f16411a;
    public final String f16412b;
    public final int f16413c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f16411a = str;
        this.f16412b = str2;
        this.f16413c = i10;
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
        if (this.f16413c == bVar.f16413c && this.d == bVar.d && Objects.equals(this.f16411a, bVar.f16411a) && Objects.equals(this.f16412b, bVar.f16412b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16411a, this.f16412b, Integer.valueOf(this.f16413c), Integer.valueOf(this.d));
    }
}
