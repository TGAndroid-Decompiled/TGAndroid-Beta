package i0;

import android.graphics.Insets;
import com.google.firebase.messaging.q;

public final class c {

    public static final c f10488e = new c(0, 0, 0, 0);

    public final int f10489a;

    public final int f10490b;

    public final int f10491c;
    public final int d;

    public c(int i10, int i11, int i12, int i13) {
        this.f10489a = i10;
        this.f10490b = i11;
        this.f10491c = i12;
        this.d = i13;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f10489a, cVar2.f10489a), Math.max(cVar.f10490b, cVar2.f10490b), Math.max(cVar.f10491c, cVar2.f10491c), Math.max(cVar.d, cVar2.d));
    }

    public static c b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f10488e : new c(i10, i11, i12, i13);
    }

    public static c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return q.d(this.f10489a, this.f10490b, this.f10491c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.d == cVar.d && this.f10489a == cVar.f10489a && this.f10491c == cVar.f10491c && this.f10490b == cVar.f10490b;
    }

    public final int hashCode() {
        return (((((this.f10489a * 31) + this.f10490b) * 31) + this.f10491c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f10489a + ", top=" + this.f10490b + ", right=" + this.f10491c + ", bottom=" + this.d + '}';
    }
}
