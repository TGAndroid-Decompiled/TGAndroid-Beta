package i0;

import android.graphics.Insets;
public final class b {
    public static final b f11525e = new b(0, 0, 0, 0);
    public final int f11526a;
    public final int f11527b;
    public final int f11528c;
    public final int d;

    public b(int i10, int i11, int i12, int i13) {
        this.f11526a = i10;
        this.f11527b = i11;
        this.f11528c = i12;
        this.d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f11526a, bVar2.f11526a), Math.max(bVar.f11527b, bVar2.f11527b), Math.max(bVar.f11528c, bVar2.f11528c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f11525e;
        }
        return new b(i10, i11, i12, i13);
    }

    public static b c(Insets insets) {
        return b(ga.a.b(insets), ga.a.d(insets), ga.a.f(insets), ga.a.h(insets));
    }

    public final Insets d() {
        return b2.c.i(this.f11526a, this.f11527b, this.f11528c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f11526a == bVar.f11526a && this.f11528c == bVar.f11528c && this.f11527b == bVar.f11527b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f11526a * 31) + this.f11527b) * 31) + this.f11528c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f11526a + ", top=" + this.f11527b + ", right=" + this.f11528c + ", bottom=" + this.d + '}';
    }
}
