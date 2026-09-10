package og;

import android.graphics.RectF;
public final class k1 {
    public final l f14405a;
    public float f14406b;
    public float f14407c;
    public float d;
    public float e;
    public float f14408f;
    public float f14409g;
    public float h;
    public float f14410i;
    public float f14411j;
    public float f14412k;
    public boolean f14413l;

    public k1(l lVar) {
        this.f14405a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f14405a;
        if (lVar.o() == 4) {
            float f7 = this.f14406b;
            float f10 = this.f14412k;
            float f11 = this.f14407c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f14410i, this.f14411j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f14406b;
            float f13 = max * 1.42f;
            float f14 = this.f14407c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f14410i, this.f14411j);
            }
        }
        float f15 = (-this.f14408f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
