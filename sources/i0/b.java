package i0;

import android.graphics.Insets;
public final class b {
    public static final b e = new b(0, 0, 0, 0);
    public final int f10588a;
    public final int f10589b;
    public final int f10590c;
    public final int d;

    public b(int i10, int i11, int i12, int i13) {
        this.f10588a = i10;
        this.f10589b = i11;
        this.f10590c = i12;
        this.d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f10588a, bVar2.f10588a), Math.max(bVar.f10589b, bVar2.f10589b), Math.max(bVar.f10590c, bVar2.f10590c), Math.max(bVar.d, bVar2.d));
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
        return b2.c.i(this.f10588a, this.f10589b, this.f10590c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f10588a == bVar.f10588a && this.f10590c == bVar.f10590c && this.f10589b == bVar.f10589b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f10588a * 31) + this.f10589b) * 31) + this.f10590c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f10588a + ", top=" + this.f10589b + ", right=" + this.f10590c + ", bottom=" + this.d + '}';
    }
}
