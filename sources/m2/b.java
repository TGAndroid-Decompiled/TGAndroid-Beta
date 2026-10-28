package m2;

import j$.util.Objects;
public final class b {
    public final String f17931a;
    public final String f17932b;
    public final int f17933c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f17931a = str;
        this.f17932b = str2;
        this.f17933c = i10;
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
        if (this.f17933c == bVar.f17933c && this.d == bVar.d && Objects.equals(this.f17931a, bVar.f17931a) && Objects.equals(this.f17932b, bVar.f17932b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f17931a, this.f17932b, Integer.valueOf(this.f17933c), Integer.valueOf(this.d));
    }
}
