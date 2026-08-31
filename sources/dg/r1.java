package dg;

import android.graphics.RectF;
public final class r1 {
    public final l f4651a;
    public float f4652b;
    public float f4653c;
    public float d;
    public float f4654e;
    public float f4655f;
    public float f4656g;
    public float h;
    public float f4657i;
    public float f4658j;
    public float f4659k;
    public boolean f4660l;

    public r1(l lVar) {
        this.f4651a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f4651a;
        if (lVar.o() == 4) {
            float f10 = this.f4652b;
            float f11 = this.f4659k;
            float f12 = this.f4653c;
            rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
            rectF.union(this.d, this.f4654e);
            rectF.union(this.f4657i, this.f4658j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f4654e));
            float f13 = this.f4652b;
            float f14 = max * 1.42f;
            float f15 = this.f4653c;
            rectF.set(f13 - f14, f15 - f14, f13 + f14, f15 + f14);
            if (lVar.o() == 3) {
                rectF.union(this.f4657i, this.f4658j);
            }
        }
        float f16 = (-this.f4655f) - 3.0f;
        rectF.inset(f16, f16);
    }
}
