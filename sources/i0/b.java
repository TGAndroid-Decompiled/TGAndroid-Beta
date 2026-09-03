package i0;

import android.graphics.Insets;
import com.google.firebase.messaging.p;
public final class b {
    public static final b e = new b(0, 0, 0, 0);
    public final int f7196a;
    public final int f7197b;
    public final int f7198c;
    public final int d;

    public b(int i10, int i11, int i12, int i13) {
        this.f7196a = i10;
        this.f7197b = i11;
        this.f7198c = i12;
        this.d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f7196a, bVar2.f7196a), Math.max(bVar.f7197b, bVar2.f7197b), Math.max(bVar.f7198c, bVar2.f7198c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return e;
        }
        return new b(i10, i11, i12, i13);
    }

    public static b c(Insets insets) {
        int i10;
        int i11;
        int i12;
        int i13;
        i10 = insets.left;
        i11 = insets.top;
        i12 = insets.right;
        i13 = insets.bottom;
        return b(i10, i11, i12, i13);
    }

    public final Insets d() {
        return p.d(this.f7196a, this.f7197b, this.f7198c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f7196a == bVar.f7196a && this.f7198c == bVar.f7198c && this.f7197b == bVar.f7197b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f7196a * 31) + this.f7197b) * 31) + this.f7198c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f7196a + ", top=" + this.f7197b + ", right=" + this.f7198c + ", bottom=" + this.d + '}';
    }
}
