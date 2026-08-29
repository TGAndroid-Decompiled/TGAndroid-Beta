package i0;

import android.graphics.Insets;
import com.google.firebase.messaging.p;
public final class b {
    public static final b f8185e = new b(0, 0, 0, 0);
    public final int f8186a;
    public final int f8187b;
    public final int f8188c;
    public final int d;

    public b(int i10, int i11, int i12, int i13) {
        this.f8186a = i10;
        this.f8187b = i11;
        this.f8188c = i12;
        this.d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f8186a, bVar2.f8186a), Math.max(bVar.f8187b, bVar2.f8187b), Math.max(bVar.f8188c, bVar2.f8188c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f8185e;
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
        return p.d(this.f8186a, this.f8187b, this.f8188c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f8186a == bVar.f8186a && this.f8188c == bVar.f8188c && this.f8187b == bVar.f8187b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f8186a * 31) + this.f8187b) * 31) + this.f8188c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f8186a + ", top=" + this.f8187b + ", right=" + this.f8188c + ", bottom=" + this.d + '}';
    }
}
