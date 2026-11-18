package i0;

import ab.y;
import android.graphics.Insets;
import hi.f9;
public final class b {
    public static final b f15891e = new b(0, 0, 0, 0);
    public final int f15892a;
    public final int f15893b;
    public final int f15894c;
    public final int d;

    public b(int i7, int i10, int i11, int i12) {
        this.f15892a = i7;
        this.f15893b = i10;
        this.f15894c = i11;
        this.d = i12;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f15892a, bVar2.f15892a), Math.max(bVar.f15893b, bVar2.f15893b), Math.max(bVar.f15894c, bVar2.f15894c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i7, int i10, int i11, int i12) {
        if (i7 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return f15891e;
        }
        return new b(i7, i10, i11, i12);
    }

    public static b c(Insets insets) {
        return b(f9.i(insets), f9.k(insets), f9.l(insets), f9.n(insets));
    }

    public final Insets d() {
        return y.i(this.f15892a, this.f15893b, this.f15894c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f15892a == bVar.f15892a && this.f15894c == bVar.f15894c && this.f15893b == bVar.f15893b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f15892a * 31) + this.f15893b) * 31) + this.f15894c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f15892a + ", top=" + this.f15893b + ", right=" + this.f15894c + ", bottom=" + this.d + '}';
    }
}
