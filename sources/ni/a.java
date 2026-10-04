package ni;

import android.graphics.RectF;
import hg.c;
import java.util.ArrayList;
public final class a {
    public final ArrayList f16913a = new ArrayList();
    public int f16914b;

    public final RectF a(float f7, float f10, float f11, float f12) {
        RectF rectF;
        int i10 = this.f16914b;
        ArrayList arrayList = this.f16913a;
        if (i10 < arrayList.size()) {
            rectF = (RectF) arrayList.get(this.f16914b);
            rectF.set(f7, f10, f11, f12);
        } else {
            rectF = new RectF(f7, f10, f11, f12);
            arrayList.add(rectF);
        }
        this.f16914b++;
        return rectF;
    }

    public final void b(float f7, float f10, float f11) {
        int i10 = 0;
        while (i10 < this.f16914b) {
            RectF rectF = (RectF) this.f16913a.get(i10);
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
        if (i10 >= 0 && i10 < this.f16914b) {
            return (RectF) this.f16913a.get(i10);
        }
        StringBuilder j3 = c.j(i10, "index=", ", size=");
        j3.append(this.f16914b);
        throw new IndexOutOfBoundsException(j3.toString());
    }

    public final void d(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f16914b)) {
            int i12 = i11 - 1;
            ArrayList arrayList = this.f16913a;
            RectF rectF = (RectF) arrayList.get(i10);
            if (i10 != i12) {
                arrayList.set(i10, (RectF) arrayList.get(i12));
                arrayList.set(i12, rectF);
            }
            this.f16914b = i12;
            return;
        }
        StringBuilder j3 = c.j(i10, "index=", ", size=");
        j3.append(this.f16914b);
        throw new IndexOutOfBoundsException(j3.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f16914b != aVar.f16914b) {
            return false;
        }
        for (int i10 = 0; i10 < this.f16914b; i10++) {
            if (!((RectF) this.f16913a.get(i10)).equals(aVar.f16913a.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f16914b; i11++) {
            i10 = (i10 * 31) + ((RectF) this.f16913a.get(i11)).hashCode();
        }
        return i10;
    }
}
