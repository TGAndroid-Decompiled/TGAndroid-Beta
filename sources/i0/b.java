package i0;

import ab.y;
import android.graphics.Insets;
import hi.f9;
public final class b {
    public static final b f15882e = new b(0, 0, 0, 0);
    public final int f15883a;
    public final int f15884b;
    public final int f15885c;
    public final int d;

    public b(int i7, int i10, int i11, int i12) {
        this.f15883a = i7;
        this.f15884b = i10;
        this.f15885c = i11;
        this.d = i12;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f15883a, bVar2.f15883a), Math.max(bVar.f15884b, bVar2.f15884b), Math.max(bVar.f15885c, bVar2.f15885c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i7, int i10, int i11, int i12) {
        if (i7 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return f15882e;
        }
        return new b(i7, i10, i11, i12);
    }

    public static b c(Insets insets) {
        return b(f9.i(insets), f9.k(insets), f9.l(insets), f9.n(insets));
    }

    public final Insets d() {
        return y.i(this.f15883a, this.f15884b, this.f15885c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f15883a == bVar.f15883a && this.f15885c == bVar.f15885c && this.f15884b == bVar.f15884b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f15883a * 31) + this.f15884b) * 31) + this.f15885c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f15883a + ", top=" + this.f15884b + ", right=" + this.f15885c + ", bottom=" + this.d + '}';
    }
}
