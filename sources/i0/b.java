package i0;

import ab.y;
import android.graphics.Insets;
import hi.f9;
public final class b {
    public static final b f15888e = new b(0, 0, 0, 0);
    public final int f15889a;
    public final int f15890b;
    public final int f15891c;
    public final int d;

    public b(int i7, int i10, int i11, int i12) {
        this.f15889a = i7;
        this.f15890b = i10;
        this.f15891c = i11;
        this.d = i12;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f15889a, bVar2.f15889a), Math.max(bVar.f15890b, bVar2.f15890b), Math.max(bVar.f15891c, bVar2.f15891c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i7, int i10, int i11, int i12) {
        if (i7 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return f15888e;
        }
        return new b(i7, i10, i11, i12);
    }

    public static b c(Insets insets) {
        return b(f9.i(insets), f9.k(insets), f9.l(insets), f9.n(insets));
    }

    public final Insets d() {
        return y.i(this.f15889a, this.f15890b, this.f15891c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f15889a == bVar.f15889a && this.f15891c == bVar.f15891c && this.f15890b == bVar.f15890b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f15889a * 31) + this.f15890b) * 31) + this.f15891c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f15889a + ", top=" + this.f15890b + ", right=" + this.f15891c + ", bottom=" + this.d + '}';
    }
}
