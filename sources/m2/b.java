package m2;

import j$.util.Objects;
public final class b {
    public final String f12628a;
    public final String f12629b;
    public final int f12630c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f12628a = str;
        this.f12629b = str2;
        this.f12630c = i10;
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
        if (this.f12630c == bVar.f12630c && this.d == bVar.d && Objects.equals(this.f12628a, bVar.f12628a) && Objects.equals(this.f12629b, bVar.f12629b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12628a, this.f12629b, Integer.valueOf(this.f12630c), Integer.valueOf(this.d));
    }
}
