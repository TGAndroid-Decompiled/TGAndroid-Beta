package i0;

import android.graphics.Insets;
public final class b {
    public static final b e = new b(0, 0, 0, 0);
    public final int f10592a;
    public final int f10593b;
    public final int f10594c;
    public final int d;

    public b(int i10, int i11, int i12, int i13) {
        this.f10592a = i10;
        this.f10593b = i11;
        this.f10594c = i12;
        this.d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f10592a, bVar2.f10592a), Math.max(bVar.f10593b, bVar2.f10593b), Math.max(bVar.f10594c, bVar2.f10594c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return e;
        }
        return new b(i10, i11, i12, i13);
    }

    public static b c(Insets insets) {
        return b(ga.a.b(insets), ga.a.d(insets), ga.a.f(insets), ga.a.g(insets));
    }

    public final Insets d() {
        return b2.c.i(this.f10592a, this.f10593b, this.f10594c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f10592a == bVar.f10592a && this.f10594c == bVar.f10594c && this.f10593b == bVar.f10593b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f10592a * 31) + this.f10593b) * 31) + this.f10594c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f10592a + ", top=" + this.f10593b + ", right=" + this.f10594c + ", bottom=" + this.d + '}';
    }
}
