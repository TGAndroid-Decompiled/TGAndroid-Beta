package m2;

import j$.util.Objects;
public final class b {
    public final String f17932a;
    public final String f17933b;
    public final int f17934c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f17932a = str;
        this.f17933b = str2;
        this.f17934c = i10;
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
        if (this.f17934c == bVar.f17934c && this.d == bVar.d && Objects.equals(this.f17932a, bVar.f17932a) && Objects.equals(this.f17933b, bVar.f17933b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f17932a, this.f17933b, Integer.valueOf(this.f17934c), Integer.valueOf(this.d));
    }
}
