package i0;

import ab.y;
import android.graphics.Insets;
public final class c {
    public static final c f15573e = new c(0, 0, 0, 0);
    public final int f15574a;
    public final int f15575b;
    public final int f15576c;
    public final int d;

    public c(int i7, int i10, int i11, int i12) {
        this.f15574a = i7;
        this.f15575b = i10;
        this.f15576c = i11;
        this.d = i12;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f15574a, cVar2.f15574a), Math.max(cVar.f15575b, cVar2.f15575b), Math.max(cVar.f15576c, cVar2.f15576c), Math.max(cVar.d, cVar2.d));
    }

    public static c b(int i7, int i10, int i11, int i12) {
        if (i7 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return f15573e;
        }
        return new c(i7, i10, i11, i12);
    }

    public static c c(Insets insets) {
        return b(b.d(insets), b.k(insets), b.l(insets), b.m(insets));
    }

    public final Insets d() {
        return y.i(this.f15574a, this.f15575b, this.f15576c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.d == cVar.d && this.f15574a == cVar.f15574a && this.f15576c == cVar.f15576c && this.f15575b == cVar.f15575b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f15574a * 31) + this.f15575b) * 31) + this.f15576c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f15574a + ", top=" + this.f15575b + ", right=" + this.f15576c + ", bottom=" + this.d + '}';
    }
}
