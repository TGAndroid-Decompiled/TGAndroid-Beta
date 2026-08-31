package dg;

import k7.o6;
public final class b2 extends c2 {
    public final r1 f4443f;
    public final float f4444g;
    public final float h;
    public final d2 f4445i;

    public b2(d2 d2Var, r1 r1Var, boolean z4, boolean z10) {
        float f10;
        this.f4445i = d2Var;
        this.f4475b = false;
        this.f4443f = r1Var;
        if (z4) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        this.f4444g = f10;
        this.h = z10 ? -1.0f : 1.0f;
        a();
    }

    @Override
    public final void a() {
        r1 r1Var = this.f4443f;
        if (r1Var != null) {
            float f10 = (this.f4444g * r1Var.d) + r1Var.f4652b;
            float f11 = r1Var.f4653c;
            d2 d2Var = this.f4445i;
            d2Var.c(f10, (this.h * r1Var.f4654e) + f11, true);
            float[] fArr = d2Var.f4500p;
            float f12 = fArr[0];
            float f13 = fArr[1];
            this.d = f12;
            this.f4477e = f13;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        this.d = f10;
        this.f4477e = f11;
        r1 r1Var = this.f4443f;
        float f12 = ((-this.f4444g) * r1Var.d) + r1Var.f4652b;
        float f13 = ((-this.h) * r1Var.f4654e) + r1Var.f4653c;
        d2 d2Var = this.f4445i;
        d2Var.c(f10, f11, false);
        d2Var.c(f12, f13, true);
        float[] fArr = d2Var.f4500p;
        float f14 = fArr[0];
        float f15 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f11 - f15, f10 - f14)) - r1Var.h;
        r1Var.d = ((float) Math.abs(Math.cos(atan2) * o6.a(f10, f11, f14, f15))) / 2.0f;
        r1Var.f4654e = ((float) Math.abs(Math.sin(atan2) * o6.a(f10, f11, f14, f15))) / 2.0f;
        r1Var.f4652b = (f10 + f14) / 2.0f;
        r1Var.f4653c = (f11 + f15) / 2.0f;
        for (int i10 = 0; i10 < d2Var.f4497m.size(); i10++) {
            ((c2) d2Var.f4497m.get(i10)).a();
        }
    }
}
