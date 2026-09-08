package i0;

import android.graphics.Insets;
public final class c {
    public static final c f11450e = new c(0, 0, 0, 0);
    public final int f11451a;
    public final int f11452b;
    public final int f11453c;
    public final int d;

    public c(int i10, int i11, int i12, int i13) {
        this.f11451a = i10;
        this.f11452b = i11;
        this.f11453c = i12;
        this.d = i13;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f11451a, cVar2.f11451a), Math.max(cVar.f11452b, cVar2.f11452b), Math.max(cVar.f11453c, cVar2.f11453c), Math.max(cVar.d, cVar2.d));
    }

    public static c b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f11450e;
        }
        return new c(i10, i11, i12, i13);
    }

    public static c c(Insets insets) {
        return b(b.b(insets), b.d(insets), b.e(insets), b.f(insets));
    }

    public final Insets d() {
        return b2.c.i(this.f11451a, this.f11452b, this.f11453c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.d == cVar.d && this.f11451a == cVar.f11451a && this.f11453c == cVar.f11453c && this.f11452b == cVar.f11452b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f11451a * 31) + this.f11452b) * 31) + this.f11453c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f11451a + ", top=" + this.f11452b + ", right=" + this.f11453c + ", bottom=" + this.d + '}';
    }
}
