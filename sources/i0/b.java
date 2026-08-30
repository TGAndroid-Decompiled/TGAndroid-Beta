package i0;

import android.graphics.Insets;
import com.google.firebase.messaging.p;
public final class b {
    public static final b e = new b(0, 0, 0, 0);
    public final int f7213a;
    public final int f7214b;
    public final int f7215c;
    public final int d;

    public b(int i10, int i11, int i12, int i13) {
        this.f7213a = i10;
        this.f7214b = i11;
        this.f7215c = i12;
        this.d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f7213a, bVar2.f7213a), Math.max(bVar.f7214b, bVar2.f7214b), Math.max(bVar.f7215c, bVar2.f7215c), Math.max(bVar.d, bVar2.d));
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
        return p.d(this.f7213a, this.f7214b, this.f7215c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f7213a == bVar.f7213a && this.f7215c == bVar.f7215c && this.f7214b == bVar.f7214b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f7213a * 31) + this.f7214b) * 31) + this.f7215c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f7213a + ", top=" + this.f7214b + ", right=" + this.f7215c + ", bottom=" + this.d + '}';
    }
}
