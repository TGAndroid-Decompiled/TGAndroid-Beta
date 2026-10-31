package ig;

import android.graphics.RectF;
public final class f1 {
    public final g f8299a;
    public float f8300b;
    public float f8301c;
    public float d;
    public float e;
    public float f8302f;
    public float f8303g;
    public float h;
    public float f8304i;
    public float f8305j;
    public float f8306k;
    public boolean f8307l;

    public f1(g gVar) {
        this.f8299a = gVar;
    }

    public final void a(RectF rectF) {
        g gVar = this.f8299a;
        if (gVar.o() == 4) {
            float f7 = this.f8300b;
            float f10 = this.f8306k;
            float f11 = this.f8301c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f8304i, this.f8305j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f8300b;
            float f13 = max * 1.42f;
            float f14 = this.f8301c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (gVar.o() == 3) {
                rectF.union(this.f8304i, this.f8305j);
            }
        }
        float f15 = (-this.f8302f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
