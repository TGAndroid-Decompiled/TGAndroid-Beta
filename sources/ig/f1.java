package ig;

import android.graphics.RectF;
public final class f1 {
    public final g f8300a;
    public float f8301b;
    public float f8302c;
    public float d;
    public float e;
    public float f8303f;
    public float f8304g;
    public float h;
    public float f8305i;
    public float f8306j;
    public float f8307k;
    public boolean f8308l;

    public f1(g gVar) {
        this.f8300a = gVar;
    }

    public final void a(RectF rectF) {
        g gVar = this.f8300a;
        if (gVar.o() == 4) {
            float f7 = this.f8301b;
            float f10 = this.f8307k;
            float f11 = this.f8302c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f8305i, this.f8306j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f8301b;
            float f13 = max * 1.42f;
            float f14 = this.f8302c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (gVar.o() == 3) {
                rectF.union(this.f8305i, this.f8306j);
            }
        }
        float f15 = (-this.f8303f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
