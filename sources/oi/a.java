package oi;

import android.graphics.RectF;
import i2.d;
import java.util.ArrayList;
public final class a {
    public final ArrayList f16661a = new ArrayList();
    public int f16662b;

    public final RectF a(float f7, float f10, float f11, float f12) {
        RectF rectF;
        int i10 = this.f16662b;
        ArrayList arrayList = this.f16661a;
        if (i10 < arrayList.size()) {
            rectF = (RectF) arrayList.get(this.f16662b);
            rectF.set(f7, f10, f11, f12);
        } else {
            rectF = new RectF(f7, f10, f11, f12);
            arrayList.add(rectF);
        }
        this.f16662b++;
        return rectF;
    }

    public final RectF b(int i10) {
        if (i10 >= 0 && i10 < this.f16662b) {
            return (RectF) this.f16661a.get(i10);
        }
        StringBuilder k10 = d.k(i10, "index=", ", size=");
        k10.append(this.f16662b);
        throw new IndexOutOfBoundsException(k10.toString());
    }

    public final void c(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f16662b)) {
            int i12 = i11 - 1;
            ArrayList arrayList = this.f16661a;
            RectF rectF = (RectF) arrayList.get(i10);
            if (i10 != i12) {
                arrayList.set(i10, (RectF) arrayList.get(i12));
                arrayList.set(i12, rectF);
            }
            this.f16662b = i12;
            return;
        }
        StringBuilder k10 = d.k(i10, "index=", ", size=");
        k10.append(this.f16662b);
        throw new IndexOutOfBoundsException(k10.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f16662b != aVar.f16662b) {
            return false;
        }
        for (int i10 = 0; i10 < this.f16662b; i10++) {
            if (!((RectF) this.f16661a.get(i10)).equals(aVar.f16661a.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f16662b; i11++) {
            i10 = (i10 * 31) + ((RectF) this.f16661a.get(i11)).hashCode();
        }
        return i10;
    }
}
