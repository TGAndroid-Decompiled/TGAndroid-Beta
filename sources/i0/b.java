package i0;

import android.graphics.Insets;
import hg.r;
public final class b {
    public static final b e = new b(0, 0, 0, 0);
    public final int f10590a;
    public final int f10591b;
    public final int f10592c;
    public final int d;

    public b(int i10, int i11, int i12, int i13) {
        this.f10590a = i10;
        this.f10591b = i11;
        this.f10592c = i12;
        this.d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f10590a, bVar2.f10590a), Math.max(bVar.f10591b, bVar2.f10591b), Math.max(bVar.f10592c, bVar2.f10592c), Math.max(bVar.d, bVar2.d));
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
        return b2.c.i(this.f10590a, this.f10591b, this.f10592c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f10590a == bVar.f10590a && this.f10592c == bVar.f10592c && this.f10591b == bVar.f10591b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f10590a * 31) + this.f10591b) * 31) + this.f10592c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f10590a + ", top=" + this.f10591b + ", right=" + this.f10592c + ", bottom=" + this.d + '}';
    }
}
