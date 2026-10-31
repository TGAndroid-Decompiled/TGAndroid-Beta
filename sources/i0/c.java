package i0;

import android.graphics.Insets;
public final class c {
    public static final c e = new c(0, 0, 0, 0);
    public final int f7765a;
    public final int f7766b;
    public final int f7767c;
    public final int d;

    public c(int i10, int i11, int i12, int i13) {
        this.f7765a = i10;
        this.f7766b = i11;
        this.f7767c = i12;
        this.d = i13;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f7765a, cVar2.f7765a), Math.max(cVar.f7766b, cVar2.f7766b), Math.max(cVar.f7767c, cVar2.f7767c), Math.max(cVar.d, cVar2.d));
    }

    public static c b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return e;
        }
        return new c(i10, i11, i12, i13);
    }

    public static c c(Insets insets) {
        return b(d2.c.d(insets), d2.c.h(insets), d2.c.i(insets), d2.c.j(insets));
    }

    public final Insets d() {
        return b2.d.h(this.f7765a, this.f7766b, this.f7767c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.d == cVar.d && this.f7765a == cVar.f7765a && this.f7767c == cVar.f7767c && this.f7766b == cVar.f7766b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f7765a * 31) + this.f7766b) * 31) + this.f7767c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f7765a + ", top=" + this.f7766b + ", right=" + this.f7767c + ", bottom=" + this.d + '}';
    }
}
