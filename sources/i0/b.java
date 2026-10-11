package i0;

import android.graphics.Insets;
import hg.o1;
public final class b {
    public static final b f11574e = new b(0, 0, 0, 0);
    public final int f11575a;
    public final int f11576b;
    public final int f11577c;
    public final int d;

    public b(int i10, int i11, int i12, int i13) {
        this.f11575a = i10;
        this.f11576b = i11;
        this.f11577c = i12;
        this.d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f11575a, bVar2.f11575a), Math.max(bVar.f11576b, bVar2.f11576b), Math.max(bVar.f11577c, bVar2.f11577c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f11574e;
        }
        return new b(i10, i11, i12, i13);
    }

    public static b c(Insets insets) {
        return b(o1.b(insets), o1.d(insets), o1.g(insets), o1.h(insets));
    }

    public final Insets d() {
        return b2.c.h(this.f11575a, this.f11576b, this.f11577c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f11575a == bVar.f11575a && this.f11577c == bVar.f11577c && this.f11576b == bVar.f11576b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f11575a * 31) + this.f11576b) * 31) + this.f11577c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f11575a + ", top=" + this.f11576b + ", right=" + this.f11577c + ", bottom=" + this.d + '}';
    }
}
