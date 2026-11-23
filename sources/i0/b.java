package i0;

import ab.y;
import android.graphics.Insets;
import hi.z9;
public final class b {
    public static final b f15977e = new b(0, 0, 0, 0);
    public final int f15978a;
    public final int f15979b;
    public final int f15980c;
    public final int d;

    public b(int i7, int i10, int i11, int i12) {
        this.f15978a = i7;
        this.f15979b = i10;
        this.f15980c = i11;
        this.d = i12;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f15978a, bVar2.f15978a), Math.max(bVar.f15979b, bVar2.f15979b), Math.max(bVar.f15980c, bVar2.f15980c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i7, int i10, int i11, int i12) {
        if (i7 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return f15977e;
        }
        return new b(i7, i10, i11, i12);
    }

    public static b c(Insets insets) {
        return b(z9.e(insets), z9.l(insets), z9.m(insets), z9.n(insets));
    }

    public final Insets d() {
        return y.i(this.f15978a, this.f15979b, this.f15980c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f15978a == bVar.f15978a && this.f15980c == bVar.f15980c && this.f15979b == bVar.f15979b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f15978a * 31) + this.f15979b) * 31) + this.f15980c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f15978a + ", top=" + this.f15979b + ", right=" + this.f15980c + ", bottom=" + this.d + '}';
    }
}
