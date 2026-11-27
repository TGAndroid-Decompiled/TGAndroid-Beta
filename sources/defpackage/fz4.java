package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
public final class fz4 {
    public final ArrayList a = new ArrayList();
    public int b;

    public final RectF a(float f, float f2, float f3, float f4) {
        RectF rectF;
        int i = this.b;
        ArrayList arrayList = this.a;
        if (i < arrayList.size()) {
            rectF = (RectF) arrayList.get(this.b);
            rectF.set(f, f2, f3, f4);
        } else {
            rectF = new RectF(f, f2, f3, f4);
            arrayList.add(rectF);
        }
        this.b++;
        return rectF;
    }

    public final void b(float f, float f2, float f3) {
        int i = 0;
        while (i < this.b) {
            RectF rectF = (RectF) this.a.get(i);
            float f4 = rectF.right;
            if (f4 > 0.0f) {
                float f5 = rectF.bottom;
                if (f5 > f) {
                    float f6 = rectF.left;
                    if (f6 < f2) {
                        float f7 = rectF.top;
                        if (f7 < f3) {
                            if (f6 < 0.0f) {
                                rectF.left = 0.0f;
                            }
                            if (f7 < f) {
                                rectF.top = f;
                            }
                            if (f4 > f2) {
                                rectF.right = f2;
                            }
                            if (f5 > f3) {
                                rectF.bottom = f3;
                            }
                            i++;
                        }
                    }
                }
            }
            d(i);
        }
    }

    public final RectF c(int i) {
        if (i >= 0 && i < this.b) {
            return (RectF) this.a.get(i);
        }
        lq5.g(this.b, uh9.m(i, "index=", ", size="));
        return null;
    }

    public final void d(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.b)) {
            int i3 = i2 - 1;
            ArrayList arrayList = this.a;
            RectF rectF = (RectF) arrayList.get(i);
            if (i != i3) {
                arrayList.set(i, (RectF) arrayList.get(i3));
                arrayList.set(i3, rectF);
            }
            this.b = i3;
            return;
        }
        lq5.g(this.b, uh9.m(i, "index=", ", size="));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fz4) {
                fz4 fz4Var = (fz4) obj;
                if (this.b == fz4Var.b) {
                    for (int i = 0; i < this.b; i++) {
                        if (((RectF) this.a.get(i)).equals(fz4Var.a.get(i))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + ((RectF) this.a.get(i2)).hashCode();
        }
        return i;
    }
}
