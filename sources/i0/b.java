package i0;

import android.graphics.Insets;
import com.google.firebase.messaging.q;
public final class b {
    public static final b f10847e = new b(0, 0, 0, 0);
    public final int f10848a;
    public final int f10849b;
    public final int f10850c;
    public final int d;

    public b(int i9, int i10, int i11, int i12) {
        this.f10848a = i9;
        this.f10849b = i10;
        this.f10850c = i11;
        this.d = i12;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f10848a, bVar2.f10848a), Math.max(bVar.f10849b, bVar2.f10849b), Math.max(bVar.f10850c, bVar2.f10850c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i9, int i10, int i11, int i12) {
        if (i9 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return f10847e;
        }
        return new b(i9, i10, i11, i12);
    }

    public static b c(Insets insets) {
        return b(h9.a.b(insets), h9.a.c(insets), h9.a.d(insets), h9.a.e(insets));
    }

    public final Insets d() {
        return q.d(this.f10848a, this.f10849b, this.f10850c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f10848a == bVar.f10848a && this.f10850c == bVar.f10850c && this.f10849b == bVar.f10849b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f10848a * 31) + this.f10849b) * 31) + this.f10850c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f10848a + ", top=" + this.f10849b + ", right=" + this.f10850c + ", bottom=" + this.d + '}';
    }
}
