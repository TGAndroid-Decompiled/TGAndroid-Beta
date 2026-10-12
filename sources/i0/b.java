package i0;

import android.graphics.Insets;
import fi.c2;
public final class b {
    public static final b e = new b(0, 0, 0, 0);
    public final int f10888a;
    public final int f10889b;
    public final int f10890c;
    public final int d;

    public b(int i10, int i11, int i12, int i13) {
        this.f10888a = i10;
        this.f10889b = i11;
        this.f10890c = i12;
        this.d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f10888a, bVar2.f10888a), Math.max(bVar.f10889b, bVar2.f10889b), Math.max(bVar.f10890c, bVar2.f10890c), Math.max(bVar.d, bVar2.d));
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
        return b2.d.h(this.f10888a, this.f10889b, this.f10890c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f10888a == bVar.f10888a && this.f10890c == bVar.f10890c && this.f10889b == bVar.f10889b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f10888a * 31) + this.f10889b) * 31) + this.f10890c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f10888a + ", top=" + this.f10889b + ", right=" + this.f10890c + ", bottom=" + this.d + '}';
    }
}
