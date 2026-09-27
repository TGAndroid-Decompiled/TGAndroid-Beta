package i0;

import android.graphics.Insets;
public final class b {
    public static final b e = new b(0, 0, 0, 0);
    public final int f10579a;
    public final int f10580b;
    public final int f10581c;
    public final int d;

    public b(int i10, int i11, int i12, int i13) {
        this.f10579a = i10;
        this.f10580b = i11;
        this.f10581c = i12;
        this.d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f10579a, bVar2.f10579a), Math.max(bVar.f10580b, bVar2.f10580b), Math.max(bVar.f10581c, bVar2.f10581c), Math.max(bVar.d, bVar2.d));
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
        return b2.c.i(this.f10579a, this.f10580b, this.f10581c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f10579a == bVar.f10579a && this.f10581c == bVar.f10581c && this.f10580b == bVar.f10580b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f10579a * 31) + this.f10580b) * 31) + this.f10581c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f10579a + ", top=" + this.f10580b + ", right=" + this.f10581c + ", bottom=" + this.d + '}';
    }
}
