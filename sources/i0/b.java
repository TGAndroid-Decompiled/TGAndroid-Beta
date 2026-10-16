package i0;

import android.graphics.Insets;
import fi.c2;
public final class b {
    public static final b e = new b(0, 0, 0, 0);
    public final int f10892a;
    public final int f10893b;
    public final int f10894c;
    public final int d;

    public b(int i10, int i11, int i12, int i13) {
        this.f10892a = i10;
        this.f10893b = i11;
        this.f10894c = i12;
        this.d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f10892a, bVar2.f10892a), Math.max(bVar.f10893b, bVar2.f10893b), Math.max(bVar.f10894c, bVar2.f10894c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return e;
        }
        return new b(i10, i11, i12, i13);
    }

    public static b c(Insets insets) {
        return b(c2.c(insets), c2.h(insets), c2.i(insets), c2.j(insets));
    }

    public final Insets d() {
        return b2.d.h(this.f10892a, this.f10893b, this.f10894c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f10892a == bVar.f10892a && this.f10894c == bVar.f10894c && this.f10893b == bVar.f10893b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f10892a * 31) + this.f10893b) * 31) + this.f10894c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f10892a + ", top=" + this.f10893b + ", right=" + this.f10894c + ", bottom=" + this.d + '}';
    }
}
