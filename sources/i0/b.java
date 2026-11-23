package i0;

import ab.y;
import android.graphics.Insets;
import hi.e9;
public final class b {
    public static final b f15916e = new b(0, 0, 0, 0);
    public final int f15917a;
    public final int f15918b;
    public final int f15919c;
    public final int d;

    public b(int i7, int i10, int i11, int i12) {
        this.f15917a = i7;
        this.f15918b = i10;
        this.f15919c = i11;
        this.d = i12;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f15917a, bVar2.f15917a), Math.max(bVar.f15918b, bVar2.f15918b), Math.max(bVar.f15919c, bVar2.f15919c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i7, int i10, int i11, int i12) {
        if (i7 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return f15916e;
        }
        return new b(i7, i10, i11, i12);
    }

    public static b c(Insets insets) {
        return b(e9.g(insets), e9.k(insets), e9.l(insets), e9.n(insets));
    }

    public final Insets d() {
        return y.i(this.f15917a, this.f15918b, this.f15919c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f15917a == bVar.f15917a && this.f15919c == bVar.f15919c && this.f15918b == bVar.f15918b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f15917a * 31) + this.f15918b) * 31) + this.f15919c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f15917a + ", top=" + this.f15918b + ", right=" + this.f15919c + ", bottom=" + this.d + '}';
    }
}
