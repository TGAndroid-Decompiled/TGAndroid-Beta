package li;

import android.graphics.RectF;
import hg.k0;
import java.util.ArrayList;
public final class a {
    public final ArrayList f14123a = new ArrayList();
    public int f14124b;

    public final RectF a(float f7, float f10, float f11, float f12) {
        RectF rectF;
        int i10 = this.f14124b;
        ArrayList arrayList = this.f14123a;
        if (i10 < arrayList.size()) {
            rectF = (RectF) arrayList.get(this.f14124b);
            rectF.set(f7, f10, f11, f12);
        } else {
            rectF = new RectF(f7, f10, f11, f12);
            arrayList.add(rectF);
        }
        this.f14124b++;
        return rectF;
    }

    public final void b(float f7, float f10, float f11) {
        int i10 = 0;
        while (i10 < this.f14124b) {
            RectF rectF = (RectF) this.f14123a.get(i10);
            float f12 = rectF.right;
            if (f12 > 0.0f) {
                float f13 = rectF.bottom;
                if (f13 > f7) {
                    float f14 = rectF.left;
                    if (f14 < f10) {
                        float f15 = rectF.top;
                        if (f15 < f11) {
                            if (f14 < 0.0f) {
                                rectF.left = 0.0f;
                            }
                            if (f15 < f7) {
                                rectF.top = f7;
                            }
                            if (f12 > f10) {
                                rectF.right = f10;
                            }
                            if (f13 > f11) {
                                rectF.bottom = f11;
                            }
                            i10++;
                        }
                    }
                }
            }
            d(i10);
        }
    }

    public final RectF c(int i10) {
        if (i10 >= 0 && i10 < this.f14124b) {
            return (RectF) this.f14123a.get(i10);
        }
        StringBuilder l4 = k0.l(i10, "index=", ", size=");
        l4.append(this.f14124b);
        throw new IndexOutOfBoundsException(l4.toString());
    }

    public final void d(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f14124b)) {
            int i12 = i11 - 1;
            ArrayList arrayList = this.f14123a;
            RectF rectF = (RectF) arrayList.get(i10);
            if (i10 != i12) {
                arrayList.set(i10, (RectF) arrayList.get(i12));
                arrayList.set(i12, rectF);
            }
            this.f14124b = i12;
            return;
        }
        StringBuilder l4 = k0.l(i10, "index=", ", size=");
        l4.append(this.f14124b);
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
        if (this.f14124b != aVar.f14124b) {
            return false;
        }
        for (int i10 = 0; i10 < this.f14124b; i10++) {
            if (!((RectF) this.f14123a.get(i10)).equals(aVar.f14123a.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f14124b; i11++) {
            i10 = (i10 * 31) + ((RectF) this.f14123a.get(i11)).hashCode();
        }
        return i10;
    }
}
