package i0;

import android.graphics.Insets;
import gi.i8;
public final class b {
    public static final b f14494e = new b(0, 0, 0, 0);
    public final int f14495a;
    public final int f14496b;
    public final int f14497c;
    public final int d;

    public b(int i3, int i10, int i11, int i12) {
        this.f14495a = i3;
        this.f14496b = i10;
        this.f14497c = i11;
        this.d = i12;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f14495a, bVar2.f14495a), Math.max(bVar.f14496b, bVar2.f14496b), Math.max(bVar.f14497c, bVar2.f14497c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i3, int i10, int i11, int i12) {
        if (i3 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return f14494e;
        }
        return new b(i3, i10, i11, i12);
    }

    public static b c(Insets insets) {
        return b(i8.b(insets), i8.e(insets), i8.f(insets), i8.g(insets));
    }

    public final Insets d() {
        return d2.d.i(this.f14495a, this.f14496b, this.f14497c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f14495a == bVar.f14495a && this.f14497c == bVar.f14497c && this.f14496b == bVar.f14496b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f14495a * 31) + this.f14496b) * 31) + this.f14497c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f14495a + ", top=" + this.f14496b + ", right=" + this.f14497c + ", bottom=" + this.d + '}';
    }
}
