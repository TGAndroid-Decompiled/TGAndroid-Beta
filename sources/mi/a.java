package mi;

import android.graphics.RectF;
import hg.k0;
import java.util.ArrayList;
public final class a {
    public final ArrayList f15071a = new ArrayList();
    public int f15072b;

    public final RectF a(float f7, float f10, float f11, float f12) {
        RectF rectF;
        int i10 = this.f15072b;
        ArrayList arrayList = this.f15071a;
        if (i10 < arrayList.size()) {
            rectF = (RectF) arrayList.get(this.f15072b);
            rectF.set(f7, f10, f11, f12);
        } else {
            rectF = new RectF(f7, f10, f11, f12);
            arrayList.add(rectF);
        }
        this.f15072b++;
        return rectF;
    }

    public final void b(float f7, float f10, float f11) {
        int i10 = 0;
        while (i10 < this.f15072b) {
            RectF rectF = (RectF) this.f15071a.get(i10);
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
        if (i10 >= 0 && i10 < this.f15072b) {
            return (RectF) this.f15071a.get(i10);
        }
        StringBuilder k10 = k0.k(i10, "index=", ", size=");
        k10.append(this.f15072b);
        throw new IndexOutOfBoundsException(k10.toString());
    }

    public final void d(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f15072b)) {
            int i12 = i11 - 1;
            ArrayList arrayList = this.f15071a;
            RectF rectF = (RectF) arrayList.get(i10);
            if (i10 != i12) {
                arrayList.set(i10, (RectF) arrayList.get(i12));
                arrayList.set(i12, rectF);
            }
            this.f15072b = i12;
            return;
        }
        StringBuilder k10 = k0.k(i10, "index=", ", size=");
        k10.append(this.f15072b);
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
        if (this.f15072b != aVar.f15072b) {
            return false;
        }
        for (int i10 = 0; i10 < this.f15072b; i10++) {
            if (!((RectF) this.f15071a.get(i10)).equals(aVar.f15071a.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f15072b; i11++) {
            i10 = (i10 * 31) + ((RectF) this.f15071a.get(i11)).hashCode();
        }
        return i10;
    }
}
