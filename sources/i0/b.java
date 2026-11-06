package i0;

import ab.x;
import android.graphics.Insets;
import hi.x3;
public final class b {
    public static final b f15116e = new b(0, 0, 0, 0);
    public final int f15117a;
    public final int f15118b;
    public final int f15119c;
    public final int d;

    public b(int i7, int i10, int i11, int i12) {
        this.f15117a = i7;
        this.f15118b = i10;
        this.f15119c = i11;
        this.d = i12;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f15117a, bVar2.f15117a), Math.max(bVar.f15118b, bVar2.f15118b), Math.max(bVar.f15119c, bVar2.f15119c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i7, int i10, int i11, int i12) {
        if (i7 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return f15116e;
        }
        return new b(i7, i10, i11, i12);
    }

    public static b c(Insets insets) {
        return b(x3.d(insets), x3.l(insets), x3.m(insets), x3.n(insets));
    }

    public final Insets d() {
        return x.i(this.f15117a, this.f15118b, this.f15119c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f15117a == bVar.f15117a && this.f15119c == bVar.f15119c && this.f15118b == bVar.f15118b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f15117a * 31) + this.f15118b) * 31) + this.f15119c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f15117a + ", top=" + this.f15118b + ", right=" + this.f15119c + ", bottom=" + this.d + '}';
    }
}
