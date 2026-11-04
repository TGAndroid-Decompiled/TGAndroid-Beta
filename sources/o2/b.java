package o2;

import j$.util.Objects;
public final class b {
    public final String f20509a;
    public final String f20510b;
    public final int f20511c;
    public final int d;

    public b(int i3, int i10, String str, String str2) {
        this.f20509a = str;
        this.f20510b = str2;
        this.f20511c = i3;
        this.d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f20511c == bVar.f20511c && this.d == bVar.d && Objects.equals(this.f20509a, bVar.f20509a) && Objects.equals(this.f20510b, bVar.f20510b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f20509a, this.f20510b, Integer.valueOf(this.f20511c), Integer.valueOf(this.d));
    }
}
