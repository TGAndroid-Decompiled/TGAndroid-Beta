package m2;

import j$.util.Objects;
public final class b {
    public final String f13228a;
    public final String f13229b;
    public final int f13230c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f13228a = str;
        this.f13229b = str2;
        this.f13230c = i10;
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
        if (this.f13230c == bVar.f13230c && this.d == bVar.d && Objects.equals(this.f13228a, bVar.f13228a) && Objects.equals(this.f13229b, bVar.f13229b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13228a, this.f13229b, Integer.valueOf(this.f13230c), Integer.valueOf(this.d));
    }
}
