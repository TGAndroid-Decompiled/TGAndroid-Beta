package i0;

import android.graphics.Insets;
public final class c {
    public static final c e = new c(0, 0, 0, 0);
    public final int f12284a;
    public final int f12285b;
    public final int f12286c;
    public final int d;

    public c(int i10, int i11, int i12, int i13) {
        this.f12284a = i10;
        this.f12285b = i11;
        this.f12286c = i12;
        this.d = i13;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f12284a, cVar2.f12284a), Math.max(cVar.f12285b, cVar2.f12285b), Math.max(cVar.f12286c, cVar2.f12286c), Math.max(cVar.d, cVar2.d));
    }

    public static c b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return e;
        }
        return new c(i10, i11, i12, i13);
    }

    public static c c(Insets insets) {
        return b(fh.b.c(insets), fh.b.i(insets), fh.b.j(insets), fh.b.k(insets));
    }

    public final Insets d() {
        return b2.d.h(this.f12284a, this.f12285b, this.f12286c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.d == cVar.d && this.f12284a == cVar.f12284a && this.f12286c == cVar.f12286c && this.f12285b == cVar.f12285b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f12284a * 31) + this.f12285b) * 31) + this.f12286c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f12284a + ", top=" + this.f12285b + ", right=" + this.f12286c + ", bottom=" + this.d + '}';
    }
}
