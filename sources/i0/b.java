package i0;

import ab.y;
import android.graphics.Insets;
import hi.e9;
public final class b {
    public static final b f15913e = new b(0, 0, 0, 0);
    public final int f15914a;
    public final int f15915b;
    public final int f15916c;
    public final int d;

    public b(int i7, int i10, int i11, int i12) {
        this.f15914a = i7;
        this.f15915b = i10;
        this.f15916c = i11;
        this.d = i12;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f15914a, bVar2.f15914a), Math.max(bVar.f15915b, bVar2.f15915b), Math.max(bVar.f15916c, bVar2.f15916c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i7, int i10, int i11, int i12) {
        if (i7 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return f15913e;
        }
        return new b(i7, i10, i11, i12);
    }

    public static b c(Insets insets) {
        return b(e9.g(insets), e9.k(insets), e9.l(insets), e9.n(insets));
    }

    public final Insets d() {
        return y.i(this.f15914a, this.f15915b, this.f15916c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f15914a == bVar.f15914a && this.f15916c == bVar.f15916c && this.f15915b == bVar.f15915b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f15914a * 31) + this.f15915b) * 31) + this.f15916c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f15914a + ", top=" + this.f15915b + ", right=" + this.f15916c + ", bottom=" + this.d + '}';
    }
}
