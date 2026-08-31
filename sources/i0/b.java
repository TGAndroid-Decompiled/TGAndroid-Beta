package i0;

import android.graphics.Insets;
import com.google.firebase.messaging.q;
public final class b {
    public static final b f7756e = new b(0, 0, 0, 0);
    public final int f7757a;
    public final int f7758b;
    public final int f7759c;
    public final int d;

    public b(int i10, int i11, int i12, int i13) {
        this.f7757a = i10;
        this.f7758b = i11;
        this.f7759c = i12;
        this.d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f7757a, bVar2.f7757a), Math.max(bVar.f7758b, bVar2.f7758b), Math.max(bVar.f7759c, bVar2.f7759c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f7756e;
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
        return q.d(this.f7757a, this.f7758b, this.f7759c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d == bVar.d && this.f7757a == bVar.f7757a && this.f7759c == bVar.f7759c && this.f7758b == bVar.f7758b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f7757a * 31) + this.f7758b) * 31) + this.f7759c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f7757a + ", top=" + this.f7758b + ", right=" + this.f7759c + ", bottom=" + this.d + '}';
    }
}
