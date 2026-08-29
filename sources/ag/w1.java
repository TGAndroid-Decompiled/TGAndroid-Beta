package ag;

import android.graphics.RectF;
public final class w1 {
    public final l f694a;
    public float f695b;
    public float f696c;
    public float d;
    public float f697e;
    public float f698f;
    public float f699g;
    public float h;
    public float f700i;
    public float f701j;
    public float f702k;
    public boolean f703l;

    public w1(l lVar) {
        this.f694a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f694a;
        if (lVar.o() == 4) {
            float f9 = this.f695b;
            float f10 = this.f702k;
            float f11 = this.f696c;
            rectF.set(f9 - f10, f11 - f10, f9 + f10, f11 + f10);
            rectF.union(this.d, this.f697e);
            rectF.union(this.f700i, this.f701j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f697e));
            float f12 = this.f695b;
            float f13 = max * 1.42f;
            float f14 = this.f696c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f700i, this.f701j);
            }
        }
        float f15 = (-this.f698f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
