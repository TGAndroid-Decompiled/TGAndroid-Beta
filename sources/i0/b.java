package i0;

import android.graphics.Insets;
public final class b {
    public static final b e = new b(0, 0, 0, 0);
    public final int f12283a;
    public final int f12284b;
    public final int f12285c;
    public final int d;

    public b(int i10, int i11, int i12, int i13) {
        this.f12283a = i10;
        this.f12284b = i11;
        this.f12285c = i12;
        this.d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f12283a, bVar2.f12283a), Math.max(bVar.f12284b, bVar2.f12284b), Math.max(bVar.f12285c, bVar2.f12285c), Math.max(bVar.d, bVar2.d));
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
        return b2.d.h(this.f12283a, this.f12284b, this.f12285c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f12283a == bVar.f12283a && this.f12285c == bVar.f12285c && this.f12284b == bVar.f12284b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f12283a * 31) + this.f12284b) * 31) + this.f12285c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f12283a + ", top=" + this.f12284b + ", right=" + this.f12285c + ", bottom=" + this.d + '}';
    }
}
