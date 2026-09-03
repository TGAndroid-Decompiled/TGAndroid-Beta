package cg;

import k7.n6;
public final class c2 extends d2 {
    public final s1 f2310f;
    public final float f2311g;
    public final float h;
    public final e2 f2312i;

    public c2(e2 e2Var, s1 s1Var, boolean z4, boolean z10) {
        float f10;
        this.f2312i = e2Var;
        this.f2340b = false;
        this.f2310f = s1Var;
        if (z4) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        this.f2311g = f10;
        this.h = z10 ? -1.0f : 1.0f;
        a();
    }

    @Override
    public final void a() {
        s1 s1Var = this.f2310f;
        if (s1Var != null) {
            float f10 = (this.f2311g * s1Var.d) + s1Var.f2500b;
            float f11 = s1Var.f2501c;
            e2 e2Var = this.f2312i;
            e2Var.c(f10, (this.h * s1Var.e) + f11, true);
            float[] fArr = e2Var.f2363p;
            float f12 = fArr[0];
            float f13 = fArr[1];
            this.d = f12;
            this.e = f13;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        this.d = f10;
        this.e = f11;
        s1 s1Var = this.f2310f;
        float f12 = ((-this.f2311g) * s1Var.d) + s1Var.f2500b;
        float f13 = ((-this.h) * s1Var.e) + s1Var.f2501c;
        e2 e2Var = this.f2312i;
        e2Var.c(f10, f11, false);
        e2Var.c(f12, f13, true);
        float[] fArr = e2Var.f2363p;
        float f14 = fArr[0];
        float f15 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f11 - f15, f10 - f14)) - s1Var.h;
        s1Var.d = ((float) Math.abs(Math.cos(atan2) * n6.a(f10, f11, f14, f15))) / 2.0f;
        s1Var.e = ((float) Math.abs(Math.sin(atan2) * n6.a(f10, f11, f14, f15))) / 2.0f;
        s1Var.f2500b = (f10 + f14) / 2.0f;
        s1Var.f2501c = (f11 + f15) / 2.0f;
        for (int i10 = 0; i10 < e2Var.f2360m.size(); i10++) {
            ((d2) e2Var.f2360m.get(i10)).a();
        }
    }
}
