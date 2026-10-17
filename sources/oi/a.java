package oi;

import android.graphics.RectF;
import java.util.ArrayList;
public final class a {
    public final ArrayList f17748a = new ArrayList();
    public int f17749b;

    public final RectF a(float f7, float f10, float f11, float f12) {
        RectF rectF;
        int i10 = this.f17749b;
        ArrayList arrayList = this.f17748a;
        if (i10 < arrayList.size()) {
            rectF = (RectF) arrayList.get(this.f17749b);
            rectF.set(f7, f10, f11, f12);
        } else {
            rectF = new RectF(f7, f10, f11, f12);
            arrayList.add(rectF);
        }
        this.f17749b++;
        return rectF;
    }

    public final RectF b(int i10) {
        if (i10 >= 0 && i10 < this.f17749b) {
            return (RectF) this.f17748a.get(i10);
        }
        StringBuilder l4 = i0.a.l(i10, "index=", ", size=");
        l4.append(this.f17749b);
        throw new IndexOutOfBoundsException(l4.toString());
    }

    public final void c(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f17749b)) {
            int i12 = i11 - 1;
            ArrayList arrayList = this.f17748a;
            RectF rectF = (RectF) arrayList.get(i10);
            if (i10 != i12) {
                arrayList.set(i10, (RectF) arrayList.get(i12));
                arrayList.set(i12, rectF);
            }
            this.f17749b = i12;
            return;
        }
        StringBuilder l4 = i0.a.l(i10, "index=", ", size=");
        l4.append(this.f17749b);
        throw new IndexOutOfBoundsException(l4.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f17749b != aVar.f17749b) {
            return false;
        }
        for (int i10 = 0; i10 < this.f17749b; i10++) {
            if (!((RectF) this.f17748a.get(i10)).equals(aVar.f17748a.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f17749b; i11++) {
            i10 = (i10 * 31) + ((RectF) this.f17748a.get(i11)).hashCode();
        }
        return i10;
    }
}
