package i0;

import ab.x;
import android.graphics.Insets;
import hi.x3;
public final class b {
    public static final b f15121e = new b(0, 0, 0, 0);
    public final int f15122a;
    public final int f15123b;
    public final int f15124c;
    public final int d;

    public b(int i7, int i10, int i11, int i12) {
        this.f15122a = i7;
        this.f15123b = i10;
        this.f15124c = i11;
        this.d = i12;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f15122a, bVar2.f15122a), Math.max(bVar.f15123b, bVar2.f15123b), Math.max(bVar.f15124c, bVar2.f15124c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i7, int i10, int i11, int i12) {
        if (i7 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return f15121e;
        }
        return new b(i7, i10, i11, i12);
    }

    public static b c(Insets insets) {
        return b(x3.d(insets), x3.l(insets), x3.m(insets), x3.n(insets));
    }

    public final Insets d() {
        return x.i(this.f15122a, this.f15123b, this.f15124c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f15122a == bVar.f15122a && this.f15124c == bVar.f15124c && this.f15123b == bVar.f15123b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f15122a * 31) + this.f15123b) * 31) + this.f15124c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f15122a + ", top=" + this.f15123b + ", right=" + this.f15124c + ", bottom=" + this.d + '}';
    }
}
