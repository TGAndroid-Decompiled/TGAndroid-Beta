package i0;

import android.graphics.Insets;
public final class b {
    public static final b e = new b(0, 0, 0, 0);
    public final int f12285a;
    public final int f12286b;
    public final int f12287c;
    public final int d;

    public b(int i10, int i11, int i12, int i13) {
        this.f12285a = i10;
        this.f12286b = i11;
        this.f12287c = i12;
        this.d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f12285a, bVar2.f12285a), Math.max(bVar.f12286b, bVar2.f12286b), Math.max(bVar.f12287c, bVar2.f12287c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return e;
        }
        return new b(i10, i11, i12, i13);
    }

    public static b c(Insets insets) {
        return b(fh.b.c(insets), fh.b.i(insets), fh.b.j(insets), fh.b.k(insets));
    }

    public final Insets d() {
        return b2.d.h(this.f12285a, this.f12286b, this.f12287c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f12285a == bVar.f12285a && this.f12287c == bVar.f12287c && this.f12286b == bVar.f12286b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f12285a * 31) + this.f12286b) * 31) + this.f12287c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f12285a + ", top=" + this.f12286b + ", right=" + this.f12287c + ", bottom=" + this.d + '}';
    }
}
