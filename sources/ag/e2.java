package ag;

import i7.z5;
public final class e2 extends h2 {
    public final int f460f;
    public final i2 f461g;

    public e2(i2 i2Var, int i10) {
        this.f460f = i10;
        this.f461g = i2Var;
    }

    @Override
    public final void a() {
        switch (this.f460f) {
            case 0:
                i2 i2Var = this.f461g;
                w1 w1Var = i2Var.h;
                double atan2 = Math.atan2(w1Var.f696c - w1Var.f701j, w1Var.f695b - w1Var.f700i) + 3.141592653589793d;
                w1 w1Var2 = i2Var.h;
                double d = w1Var2.f702k / 5.5f;
                this.d = w1Var2.f695b + ((float) (Math.cos(atan2) * d));
                this.f528e = i2Var.h.f696c + ((float) (Math.sin(atan2) * d));
                return;
            case 1:
                w1 w1Var3 = this.f461g.h;
                float f9 = w1Var3.f696c;
                this.d = w1Var3.f695b + w1Var3.d;
                this.f528e = f9;
                return;
            case 2:
                i2 i2Var2 = this.f461g;
                w1 w1Var4 = i2Var2.h;
                float min = Math.min(w1Var4.d, w1Var4.f697e);
                float cos = (((float) Math.cos(-0.3141592653589793d)) * min) + i2Var2.h.f695b;
                float f10 = i2Var2.h.f696c;
                this.d = cos;
                this.f528e = (((float) Math.sin(-0.3141592653589793d)) * min) + f10;
                return;
            case 3:
                w1 w1Var5 = this.f461g.h;
                this.d = w1Var5.f695b;
                this.f528e = w1Var5.f696c - Math.abs(w1Var5.f697e);
                return;
            case 4:
                w1 w1Var6 = this.f461g.h;
                float f11 = w1Var6.f700i;
                float f12 = w1Var6.f701j;
                w1Var6.f700i = f11;
                w1Var6.f701j = f12;
                this.d = f11;
                this.f528e = f12;
                return;
            default:
                w1 w1Var7 = this.f461g.h;
                this.d = w1Var7.f695b;
                this.f528e = w1Var7.f696c;
                return;
        }
    }

    @Override
    public final void b(float f9, float f10) {
        switch (this.f460f) {
            case 0:
                i2 i2Var = this.f461g;
                w1 w1Var = i2Var.h;
                double atan2 = Math.atan2(w1Var.f696c - w1Var.f701j, w1Var.f695b - w1Var.f700i) + 1.5707963267948966d;
                w1 w1Var2 = i2Var.h;
                w1 w1Var3 = i2Var.h;
                float f11 = w1Var3.f695b;
                float f12 = w1Var3.f696c;
                i2Var.getClass();
                w1Var3.f702k = Math.min((z5.a(w1Var2.f695b, w1Var2.f696c, w1Var2.f700i, w1Var2.f701j) * 5.5f) / 2.0f, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f12 - f10)) - (Math.sin(atan2) * (f11 - f9))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f9;
                this.f528e = f10;
                w1 w1Var4 = this.f461g.h;
                float a2 = z5.a(w1Var4.f695b, w1Var4.f696c, f9, f10);
                w1Var4.f697e = a2;
                w1Var4.d = a2;
                return;
            case 2:
                i2 i2Var2 = this.f461g;
                w1 w1Var5 = i2Var2.h;
                float a10 = z5.a(w1Var5.f695b, w1Var5.f696c, f9, f10);
                w1Var5.f697e = a10;
                w1Var5.d = a10;
                w1 w1Var6 = i2Var2.h;
                w1Var6.h = (float) ((((float) Math.atan2(w1Var6.f696c - f10, f9 - w1Var6.f695b)) - 0.3141592653589793d) + w1Var6.h);
                a();
                return;
            case 3:
                i2 i2Var3 = this.f461g;
                w1 w1Var7 = i2Var3.h;
                w1Var7.h = (float) ((((float) Math.atan2(w1Var7.f696c - f10, f9 - w1Var7.f695b)) - 1.5707963267948966d) + w1Var7.h);
                for (int i10 = 0; i10 < i2Var3.f547m.size(); i10++) {
                    h2 h2Var = (h2) i2Var3.f547m.get(i10);
                    if (h2Var instanceof g2) {
                        h2Var.a();
                    }
                }
                return;
            case 4:
                w1 w1Var8 = this.f461g.h;
                w1Var8.f700i = f9;
                w1Var8.f701j = f10;
                this.d = f9;
                this.f528e = f10;
                float f13 = w1Var8.f696c;
                float f14 = w1Var8.f697e;
                float f15 = f13 - f14;
                int i11 = (f10 > f15 ? 1 : (f10 == f15 ? 0 : -1));
                if (i11 > 0 && f10 < f13 + f14) {
                    float f16 = w1Var8.f695b;
                    if (f9 <= f16) {
                        float f17 = f16 - w1Var8.d;
                        if (f9 > f17) {
                            this.d = f17;
                        }
                    }
                    if (f9 > f13) {
                        float f18 = f16 + w1Var8.d;
                        if (f9 < f18) {
                            this.d = f18;
                        }
                    }
                }
                float f19 = this.d;
                float f20 = w1Var8.f695b;
                float f21 = w1Var8.d;
                if (f19 > f20 - f21 && f19 < f20 + f21) {
                    if (f10 <= f13 && i11 > 0) {
                        this.f528e = f15;
                    } else if (f10 > f13) {
                        float f22 = f13 + f14;
                        if (f10 < f22) {
                            this.f528e = f22;
                        }
                    }
                }
                w1Var8.f700i = f19;
                w1Var8.f701j = this.f528e;
                return;
            default:
                int i12 = 0;
                while (true) {
                    i2 i2Var4 = this.f461g;
                    if (i12 < i2Var4.f547m.size()) {
                        h2 h2Var2 = (h2) i2Var4.f547m.get(i12);
                        if (h2Var2 != this) {
                            h2Var2.a();
                        }
                        i12++;
                    } else {
                        w1 w1Var9 = i2Var4.h;
                        w1Var9.f695b = f9;
                        w1Var9.f696c = f10;
                        this.d = f9;
                        this.f528e = f10;
                        return;
                    }
                }
        }
    }

    public e2(i2 i2Var, int i10, boolean z10) {
        super(0);
        this.f460f = i10;
        this.f461g = i2Var;
    }
}
