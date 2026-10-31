package m2;

import j$.util.Objects;
public final class b {
    public final String f12627a;
    public final String f12628b;
    public final int f12629c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f12627a = str;
        this.f12628b = str2;
        this.f12629c = i10;
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
        if (this.f12629c == bVar.f12629c && this.d == bVar.d && Objects.equals(this.f12627a, bVar.f12627a) && Objects.equals(this.f12628b, bVar.f12628b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12627a, this.f12628b, Integer.valueOf(this.f12629c), Integer.valueOf(this.d));
    }
}
