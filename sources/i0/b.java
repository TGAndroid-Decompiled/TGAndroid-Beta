package i0;

import android.graphics.Insets;
public final class b {
    public static final b e = new b(0, 0, 0, 0);
    public final int f10591a;
    public final int f10592b;
    public final int f10593c;
    public final int d;

    public b(int i10, int i11, int i12, int i13) {
        this.f10591a = i10;
        this.f10592b = i11;
        this.f10593c = i12;
        this.d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f10591a, bVar2.f10591a), Math.max(bVar.f10592b, bVar2.f10592b), Math.max(bVar.f10593c, bVar2.f10593c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return e;
        }
        return new b(i10, i11, i12, i13);
    }

    public static b c(Insets insets) {
        return b(ga.a.b(insets), ga.a.d(insets), ga.a.g(insets), ga.a.h(insets));
    }

    public final Insets d() {
        return b2.c.i(this.f10591a, this.f10592b, this.f10593c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f10591a == bVar.f10591a && this.f10593c == bVar.f10593c && this.f10592b == bVar.f10592b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f10591a * 31) + this.f10592b) * 31) + this.f10593c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f10591a + ", top=" + this.f10592b + ", right=" + this.f10593c + ", bottom=" + this.d + '}';
    }
}
