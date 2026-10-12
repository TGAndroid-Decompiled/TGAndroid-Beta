package i0;

import android.graphics.Insets;
import hg.o1;
public final class b {
    public static final b f11573e = new b(0, 0, 0, 0);
    public final int f11574a;
    public final int f11575b;
    public final int f11576c;
    public final int d;

    public b(int i10, int i11, int i12, int i13) {
        this.f11574a = i10;
        this.f11575b = i11;
        this.f11576c = i12;
        this.d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f11574a, bVar2.f11574a), Math.max(bVar.f11575b, bVar2.f11575b), Math.max(bVar.f11576c, bVar2.f11576c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f11573e;
        }
        return new b(i10, i11, i12, i13);
    }

    public static b c(Insets insets) {
        return b(o1.b(insets), o1.d(insets), o1.g(insets), o1.h(insets));
    }

    public final Insets d() {
        return b2.c.h(this.f11574a, this.f11575b, this.f11576c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f11574a == bVar.f11574a && this.f11576c == bVar.f11576c && this.f11575b == bVar.f11575b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f11574a * 31) + this.f11575b) * 31) + this.f11576c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f11574a + ", top=" + this.f11575b + ", right=" + this.f11576c + ", bottom=" + this.d + '}';
    }
}
