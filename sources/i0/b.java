package i0;

import android.graphics.Insets;
import hg.o1;
public final class b {
    public static final b f11575e = new b(0, 0, 0, 0);
    public final int f11576a;
    public final int f11577b;
    public final int f11578c;
    public final int d;

    public b(int i10, int i11, int i12, int i13) {
        this.f11576a = i10;
        this.f11577b = i11;
        this.f11578c = i12;
        this.d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f11576a, bVar2.f11576a), Math.max(bVar.f11577b, bVar2.f11577b), Math.max(bVar.f11578c, bVar2.f11578c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f11575e;
        }
        return new b(i10, i11, i12, i13);
    }

    public static b c(Insets insets) {
        return b(o1.b(insets), o1.d(insets), o1.g(insets), o1.h(insets));
    }

    public final Insets d() {
        return b2.c.h(this.f11576a, this.f11577b, this.f11578c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f11576a == bVar.f11576a && this.f11578c == bVar.f11578c && this.f11577b == bVar.f11577b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f11576a * 31) + this.f11577b) * 31) + this.f11578c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f11576a + ", top=" + this.f11577b + ", right=" + this.f11578c + ", bottom=" + this.d + '}';
    }
}
