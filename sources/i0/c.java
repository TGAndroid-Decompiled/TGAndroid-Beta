package i0;

import android.graphics.Insets;
public final class c {
    public static final c e = new c(0, 0, 0, 0);
    public final int f10074a;
    public final int f10075b;
    public final int f10076c;
    public final int d;

    public c(int i10, int i11, int i12, int i13) {
        this.f10074a = i10;
        this.f10075b = i11;
        this.f10076c = i12;
        this.d = i13;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f10074a, cVar2.f10074a), Math.max(cVar.f10075b, cVar2.f10075b), Math.max(cVar.f10076c, cVar2.f10076c), Math.max(cVar.d, cVar2.d));
    }

    public static c b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return e;
        }
        return new c(i10, i11, i12, i13);
    }

    public static c c(Insets insets) {
        return b(dh.a.c(insets), b.b(insets), b.c(insets), b.d(insets));
    }

    public final Insets d() {
        return b2.c.i(this.f10074a, this.f10075b, this.f10076c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.d == cVar.d && this.f10074a == cVar.f10074a && this.f10076c == cVar.f10076c && this.f10075b == cVar.f10075b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f10074a * 31) + this.f10075b) * 31) + this.f10076c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f10074a + ", top=" + this.f10075b + ", right=" + this.f10076c + ", bottom=" + this.d + '}';
    }
}
