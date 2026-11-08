package i0;

import ab.x;
import android.graphics.Insets;
import hi.x3;
public final class b {
    public static final b f15119e = new b(0, 0, 0, 0);
    public final int f15120a;
    public final int f15121b;
    public final int f15122c;
    public final int d;

    public b(int i7, int i10, int i11, int i12) {
        this.f15120a = i7;
        this.f15121b = i10;
        this.f15122c = i11;
        this.d = i12;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f15120a, bVar2.f15120a), Math.max(bVar.f15121b, bVar2.f15121b), Math.max(bVar.f15122c, bVar2.f15122c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i7, int i10, int i11, int i12) {
        if (i7 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return f15119e;
        }
        return new b(i7, i10, i11, i12);
    }

    public static b c(Insets insets) {
        return b(x3.d(insets), x3.l(insets), x3.m(insets), x3.n(insets));
    }

    public final Insets d() {
        return x.i(this.f15120a, this.f15121b, this.f15122c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f15120a == bVar.f15120a && this.f15122c == bVar.f15122c && this.f15121b == bVar.f15121b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f15120a * 31) + this.f15121b) * 31) + this.f15122c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f15120a + ", top=" + this.f15121b + ", right=" + this.f15122c + ", bottom=" + this.d + '}';
    }
}
