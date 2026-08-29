package ag;

import i7.z5;
public final class g2 extends h2 {
    public final w1 f504f;
    public final float f505g;
    public final float h;
    public final i2 f506i;

    public g2(i2 i2Var, w1 w1Var, boolean z10, boolean z11) {
        float f9;
        this.f506i = i2Var;
        this.f526b = false;
        this.f504f = w1Var;
        if (z10) {
            f9 = -1.0f;
        } else {
            f9 = 1.0f;
        }
        this.f505g = f9;
        this.h = z11 ? -1.0f : 1.0f;
        a();
    }

    @Override
    public final void a() {
        w1 w1Var = this.f504f;
        if (w1Var != null) {
            float f9 = (this.f505g * w1Var.d) + w1Var.f695b;
            float f10 = w1Var.f696c;
            i2 i2Var = this.f506i;
            i2Var.c(f9, (this.h * w1Var.f697e) + f10, true);
            float[] fArr = i2Var.f550p;
            float f11 = fArr[0];
            float f12 = fArr[1];
            this.d = f11;
            this.f528e = f12;
        }
    }

    @Override
    public final void b(float f9, float f10) {
        this.d = f9;
        this.f528e = f10;
        w1 w1Var = this.f504f;
        float f11 = ((-this.f505g) * w1Var.d) + w1Var.f695b;
        float f12 = ((-this.h) * w1Var.f697e) + w1Var.f696c;
        i2 i2Var = this.f506i;
        i2Var.c(f9, f10, false);
        i2Var.c(f11, f12, true);
        float[] fArr = i2Var.f550p;
        float f13 = fArr[0];
        float f14 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f10 - f14, f9 - f13)) - w1Var.h;
        w1Var.d = ((float) Math.abs(Math.cos(atan2) * z5.a(f9, f10, f13, f14))) / 2.0f;
        w1Var.f697e = ((float) Math.abs(Math.sin(atan2) * z5.a(f9, f10, f13, f14))) / 2.0f;
        w1Var.f695b = (f9 + f13) / 2.0f;
        w1Var.f696c = (f10 + f14) / 2.0f;
        for (int i10 = 0; i10 < i2Var.f547m.size(); i10++) {
            ((h2) i2Var.f547m.get(i10)).a();
        }
    }
}
