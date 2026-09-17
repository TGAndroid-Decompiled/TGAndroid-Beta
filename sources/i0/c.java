package i0;

import android.graphics.Insets;
public final class c {
    public static final c f11424e = new c(0, 0, 0, 0);
    public final int f11425a;
    public final int f11426b;
    public final int f11427c;
    public final int d;

    public c(int i10, int i11, int i12, int i13) {
        this.f11425a = i10;
        this.f11426b = i11;
        this.f11427c = i12;
        this.d = i13;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f11425a, cVar2.f11425a), Math.max(cVar.f11426b, cVar2.f11426b), Math.max(cVar.f11427c, cVar2.f11427c), Math.max(cVar.d, cVar2.d));
    }

    public static c b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f11424e;
        }
        return new c(i10, i11, i12, i13);
    }

    public static c c(Insets insets) {
        return b(b.b(insets), b.d(insets), b.e(insets), b.f(insets));
    }

    public final Insets d() {
        return b2.c.i(this.f11425a, this.f11426b, this.f11427c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.d == cVar.d && this.f11425a == cVar.f11425a && this.f11427c == cVar.f11427c && this.f11426b == cVar.f11426b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f11425a * 31) + this.f11426b) * 31) + this.f11427c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f11425a + ", top=" + this.f11426b + ", right=" + this.f11427c + ", bottom=" + this.d + '}';
    }
}
