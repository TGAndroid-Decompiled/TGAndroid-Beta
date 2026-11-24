package defpackage;

import android.graphics.RectF;
public final class dba {
    public final t11 a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public boolean l;

    public dba(t11 t11Var) {
        this.a = t11Var;
    }

    public final void a(RectF rectF) {
        t11 t11Var = this.a;
        if (t11Var.n() == 4) {
            float f = this.b;
            float f2 = this.k;
            float f3 = this.c;
            rectF.set(f - f2, f3 - f2, f + f2, f3 + f2);
            rectF.union(this.d, this.e);
            rectF.union(this.i, this.j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f4 = this.b;
            float f5 = max * 1.42f;
            float f6 = this.c;
            rectF.set(f4 - f5, f6 - f5, f4 + f5, f6 + f5);
            if (t11Var.n() == 3) {
                rectF.union(this.i, this.j);
            }
        }
        float f7 = (-this.f) - 3.0f;
        rectF.inset(f7, f7);
    }
}
