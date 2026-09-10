package og;

import v7.a7;
public final class s1 extends t1 {
    public final k1 f14477f;
    public final float f14478g;
    public final float h;
    public final u1 f14479i;

    public s1(u1 u1Var, k1 k1Var, boolean z10, boolean z11) {
        float f7;
        this.f14479i = u1Var;
        this.f14488b = false;
        this.f14477f = k1Var;
        if (z10) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        this.f14478g = f7;
        this.h = z11 ? -1.0f : 1.0f;
        a();
    }

    @Override
    public final void a() {
        k1 k1Var = this.f14477f;
        if (k1Var != null) {
            float f7 = (this.f14478g * k1Var.d) + k1Var.f14406b;
            float f10 = k1Var.f14407c;
            u1 u1Var = this.f14479i;
            u1Var.c(f7, (this.h * k1Var.e) + f10, true);
            float[] fArr = u1Var.f14511p;
            float f11 = fArr[0];
            float f12 = fArr[1];
            this.d = f11;
            this.e = f12;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        this.d = f7;
        this.e = f10;
        k1 k1Var = this.f14477f;
        float f11 = ((-this.f14478g) * k1Var.d) + k1Var.f14406b;
        float f12 = ((-this.h) * k1Var.e) + k1Var.f14407c;
        u1 u1Var = this.f14479i;
        u1Var.c(f7, f10, false);
        u1Var.c(f11, f12, true);
        float[] fArr = u1Var.f14511p;
        float f13 = fArr[0];
        float f14 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f10 - f14, f7 - f13)) - k1Var.h;
        k1Var.d = ((float) Math.abs(Math.cos(atan2) * a7.a(f7, f10, f13, f14))) / 2.0f;
        k1Var.e = ((float) Math.abs(Math.sin(atan2) * a7.a(f7, f10, f13, f14))) / 2.0f;
        k1Var.f14406b = (f7 + f13) / 2.0f;
        k1Var.f14407c = (f10 + f14) / 2.0f;
        for (int i10 = 0; i10 < u1Var.f14508m.size(); i10++) {
            ((t1) u1Var.f14508m.get(i10)).a();
        }
    }
}
