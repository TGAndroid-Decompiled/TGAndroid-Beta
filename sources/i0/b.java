package i0;

import android.graphics.Insets;
public final class b {
    public static final b e = new b(0, 0, 0, 0);
    public final int f13449a;
    public final int f13450b;
    public final int f13451c;
    public final int d;

    public b(int i10, int i11, int i12, int i13) {
        this.f13449a = i10;
        this.f13450b = i11;
        this.f13451c = i12;
        this.d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f13449a, bVar2.f13449a), Math.max(bVar.f13450b, bVar2.f13450b), Math.max(bVar.f13451c, bVar2.f13451c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return e;
        }
        return new b(i10, i11, i12, i13);
    }

    public static b c(Insets insets) {
        return b(gh.a.a(insets), gh.a.c(insets), gh.a.e(insets), gh.a.f(insets));
    }

    public final Insets d() {
        return b2.d.h(this.f13449a, this.f13450b, this.f13451c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f13449a == bVar.f13449a && this.f13451c == bVar.f13451c && this.f13450b == bVar.f13450b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f13449a * 31) + this.f13450b) * 31) + this.f13451c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f13449a + ", top=" + this.f13450b + ", right=" + this.f13451c + ", bottom=" + this.d + '}';
    }
}
