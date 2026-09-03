package cg;

import android.graphics.RectF;
public final class s1 {
    public final l f2499a;
    public float f2500b;
    public float f2501c;
    public float d;
    public float e;
    public float f2502f;
    public float f2503g;
    public float h;
    public float f2504i;
    public float f2505j;
    public float f2506k;
    public boolean f2507l;

    public s1(l lVar) {
        this.f2499a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f2499a;
        if (lVar.o() == 4) {
            float f10 = this.f2500b;
            float f11 = this.f2506k;
            float f12 = this.f2501c;
            rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
            rectF.union(this.d, this.e);
            rectF.union(this.f2504i, this.f2505j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f13 = this.f2500b;
            float f14 = max * 1.42f;
            float f15 = this.f2501c;
            rectF.set(f13 - f14, f15 - f14, f13 + f14, f15 + f14);
            if (lVar.o() == 3) {
                rectF.union(this.f2504i, this.f2505j);
            }
        }
        float f16 = (-this.f2502f) - 3.0f;
        rectF.inset(f16, f16);
    }
}
