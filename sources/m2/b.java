package m2;

import j$.util.Objects;
public final class b {
    public final String f16475a;
    public final String f16476b;
    public final int f16477c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f16475a = str;
        this.f16476b = str2;
        this.f16477c = i10;
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
        if (this.f16477c == bVar.f16477c && this.d == bVar.d && Objects.equals(this.f16475a, bVar.f16475a) && Objects.equals(this.f16476b, bVar.f16476b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16475a, this.f16476b, Integer.valueOf(this.f16477c), Integer.valueOf(this.d));
    }
}
