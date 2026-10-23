package i0;

import android.graphics.Insets;
public final class b {
    public static final b e = new b(0, 0, 0, 0);
    public final int f12315a;
    public final int f12316b;
    public final int f12317c;
    public final int d;

    public b(int i10, int i11, int i12, int i13) {
        this.f12315a = i10;
        this.f12316b = i11;
        this.f12317c = i12;
        this.d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f12315a, bVar2.f12315a), Math.max(bVar.f12316b, bVar2.f12316b), Math.max(bVar.f12317c, bVar2.f12317c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return e;
        }
        return new b(i10, i11, i12, i13);
    }

    public static b c(Insets insets) {
        return b(fh.b.a(insets), fh.b.j(insets), fh.b.k(insets), fh.b.l(insets));
    }

    public final Insets d() {
        return b2.d.h(this.f12315a, this.f12316b, this.f12317c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f12315a == bVar.f12315a && this.f12317c == bVar.f12317c && this.f12316b == bVar.f12316b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f12315a * 31) + this.f12316b) * 31) + this.f12317c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f12315a + ", top=" + this.f12316b + ", right=" + this.f12317c + ", bottom=" + this.d + '}';
    }
}
