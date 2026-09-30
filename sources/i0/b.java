package i0;

import android.graphics.Insets;
import hg.r;
public final class b {
    public static final b e = new b(0, 0, 0, 0);
    public final int f10576a;
    public final int f10577b;
    public final int f10578c;
    public final int d;

    public b(int i10, int i11, int i12, int i13) {
        this.f10576a = i10;
        this.f10577b = i11;
        this.f10578c = i12;
        this.d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f10576a, bVar2.f10576a), Math.max(bVar.f10577b, bVar2.f10577b), Math.max(bVar.f10578c, bVar2.f10578c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return e;
        }
        return new b(i10, i11, i12, i13);
    }

    public static b c(Insets insets) {
        return b(r.b(insets), r.d(insets), r.g(insets), r.h(insets));
    }

    public final Insets d() {
        return b2.c.i(this.f10576a, this.f10577b, this.f10578c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f10576a == bVar.f10576a && this.f10578c == bVar.f10578c && this.f10577b == bVar.f10577b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f10576a * 31) + this.f10577b) * 31) + this.f10578c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f10576a + ", top=" + this.f10577b + ", right=" + this.f10578c + ", bottom=" + this.d + '}';
    }
}
