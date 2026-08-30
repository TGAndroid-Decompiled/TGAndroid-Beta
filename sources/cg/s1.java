package cg;

import android.graphics.RectF;
public final class s1 {
    public final l f2516a;
    public float f2517b;
    public float f2518c;
    public float d;
    public float e;
    public float f2519f;
    public float f2520g;
    public float h;
    public float f2521i;
    public float f2522j;
    public float f2523k;
    public boolean f2524l;

    public s1(l lVar) {
        this.f2516a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f2516a;
        if (lVar.o() == 4) {
            float f10 = this.f2517b;
            float f11 = this.f2523k;
            float f12 = this.f2518c;
            rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
            rectF.union(this.d, this.e);
            rectF.union(this.f2521i, this.f2522j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f13 = this.f2517b;
            float f14 = max * 1.42f;
            float f15 = this.f2518c;
            rectF.set(f13 - f14, f15 - f14, f13 + f14, f15 + f14);
            if (lVar.o() == 3) {
                rectF.union(this.f2521i, this.f2522j);
            }
        }
        float f16 = (-this.f2519f) - 3.0f;
        rectF.inset(f16, f16);
    }
}
