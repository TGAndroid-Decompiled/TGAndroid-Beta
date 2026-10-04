package i0;

import android.graphics.Insets;
public final class b {
    public static final b f11524e = new b(0, 0, 0, 0);
    public final int f11525a;
    public final int f11526b;
    public final int f11527c;
    public final int d;

    public b(int i10, int i11, int i12, int i13) {
        this.f11525a = i10;
        this.f11526b = i11;
        this.f11527c = i12;
        this.d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f11525a, bVar2.f11525a), Math.max(bVar.f11526b, bVar2.f11526b), Math.max(bVar.f11527c, bVar2.f11527c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f11524e;
        }
        return new b(i10, i11, i12, i13);
    }

    public static b c(Insets insets) {
        return b(ga.a.b(insets), ga.a.d(insets), ga.a.f(insets), ga.a.h(insets));
    }

    public final Insets d() {
        return b2.c.i(this.f11525a, this.f11526b, this.f11527c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f11525a == bVar.f11525a && this.f11527c == bVar.f11527c && this.f11526b == bVar.f11526b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f11525a * 31) + this.f11526b) * 31) + this.f11527c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f11525a + ", top=" + this.f11526b + ", right=" + this.f11527c + ", bottom=" + this.d + '}';
    }
}
