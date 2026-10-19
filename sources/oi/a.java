package oi;

import android.graphics.RectF;
import i2.e;
import java.util.ArrayList;
public final class a {
    public final ArrayList f17754a = new ArrayList();
    public int f17755b;

    public final RectF a(float f7, float f10, float f11, float f12) {
        RectF rectF;
        int i10 = this.f17755b;
        ArrayList arrayList = this.f17754a;
        if (i10 < arrayList.size()) {
            rectF = (RectF) arrayList.get(this.f17755b);
            rectF.set(f7, f10, f11, f12);
        } else {
            rectF = new RectF(f7, f10, f11, f12);
            arrayList.add(rectF);
        }
        this.f17755b++;
        return rectF;
    }

    public final RectF b(int i10) {
        if (i10 >= 0 && i10 < this.f17755b) {
            return (RectF) this.f17754a.get(i10);
        }
        StringBuilder l4 = e.l(i10, "index=", ", size=");
        l4.append(this.f17755b);
        throw new IndexOutOfBoundsException(l4.toString());
    }

    public final void c(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f17755b)) {
            int i12 = i11 - 1;
            ArrayList arrayList = this.f17754a;
            RectF rectF = (RectF) arrayList.get(i10);
            if (i10 != i12) {
                arrayList.set(i10, (RectF) arrayList.get(i12));
                arrayList.set(i12, rectF);
            }
            this.f17755b = i12;
            return;
        }
        StringBuilder l4 = e.l(i10, "index=", ", size=");
        l4.append(this.f17755b);
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
        if (this.f17755b != aVar.f17755b) {
            return false;
        }
        for (int i10 = 0; i10 < this.f17755b; i10++) {
            if (!((RectF) this.f17754a.get(i10)).equals(aVar.f17754a.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f17755b; i11++) {
            i10 = (i10 * 31) + ((RectF) this.f17754a.get(i11)).hashCode();
        }
        return i10;
    }
}
