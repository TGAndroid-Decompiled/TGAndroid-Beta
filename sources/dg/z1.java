package dg;

import k7.o6;
public final class z1 extends c2 {
    public final int f4742f;
    public final d2 f4743g;

    public z1(d2 d2Var, int i10) {
        this.f4742f = i10;
        this.f4743g = d2Var;
    }

    @Override
    public final void a() {
        switch (this.f4742f) {
            case 0:
                d2 d2Var = this.f4743g;
                r1 r1Var = d2Var.h;
                double atan2 = Math.atan2(r1Var.f4653c - r1Var.f4658j, r1Var.f4652b - r1Var.f4657i) + 3.141592653589793d;
                r1 r1Var2 = d2Var.h;
                double d = r1Var2.f4659k / 5.5f;
                this.d = r1Var2.f4652b + ((float) (Math.cos(atan2) * d));
                this.f4477e = d2Var.h.f4653c + ((float) (Math.sin(atan2) * d));
                return;
            case 1:
                r1 r1Var3 = this.f4743g.h;
                float f10 = r1Var3.f4653c;
                this.d = r1Var3.f4652b + r1Var3.d;
                this.f4477e = f10;
                return;
            case 2:
                d2 d2Var2 = this.f4743g;
                r1 r1Var4 = d2Var2.h;
                float min = Math.min(r1Var4.d, r1Var4.f4654e);
                float cos = (((float) Math.cos(-0.3141592653589793d)) * min) + d2Var2.h.f4652b;
                float f11 = d2Var2.h.f4653c;
                this.d = cos;
                this.f4477e = (((float) Math.sin(-0.3141592653589793d)) * min) + f11;
                return;
            case 3:
                r1 r1Var5 = this.f4743g.h;
                this.d = r1Var5.f4652b;
                this.f4477e = r1Var5.f4653c - Math.abs(r1Var5.f4654e);
                return;
            case 4:
                r1 r1Var6 = this.f4743g.h;
                float f12 = r1Var6.f4657i;
                float f13 = r1Var6.f4658j;
                r1Var6.f4657i = f12;
                r1Var6.f4658j = f13;
                this.d = f12;
                this.f4477e = f13;
                return;
            default:
                r1 r1Var7 = this.f4743g.h;
                this.d = r1Var7.f4652b;
                this.f4477e = r1Var7.f4653c;
                return;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        switch (this.f4742f) {
            case 0:
                d2 d2Var = this.f4743g;
                r1 r1Var = d2Var.h;
                double atan2 = Math.atan2(r1Var.f4653c - r1Var.f4658j, r1Var.f4652b - r1Var.f4657i) + 1.5707963267948966d;
                r1 r1Var2 = d2Var.h;
                r1 r1Var3 = d2Var.h;
                float f12 = r1Var3.f4652b;
                float f13 = r1Var3.f4653c;
                d2Var.getClass();
                r1Var3.f4659k = Math.min((o6.a(r1Var2.f4652b, r1Var2.f4653c, r1Var2.f4657i, r1Var2.f4658j) * 5.5f) / 2.0f, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f13 - f11)) - (Math.sin(atan2) * (f12 - f10))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f10;
                this.f4477e = f11;
                r1 r1Var4 = this.f4743g.h;
                float a2 = o6.a(r1Var4.f4652b, r1Var4.f4653c, f10, f11);
                r1Var4.f4654e = a2;
                r1Var4.d = a2;
                return;
            case 2:
                d2 d2Var2 = this.f4743g;
                r1 r1Var5 = d2Var2.h;
                float a10 = o6.a(r1Var5.f4652b, r1Var5.f4653c, f10, f11);
                r1Var5.f4654e = a10;
                r1Var5.d = a10;
                r1 r1Var6 = d2Var2.h;
                r1Var6.h = (float) ((((float) Math.atan2(r1Var6.f4653c - f11, f10 - r1Var6.f4652b)) - 0.3141592653589793d) + r1Var6.h);
                a();
                return;
            case 3:
                d2 d2Var3 = this.f4743g;
                r1 r1Var7 = d2Var3.h;
                r1Var7.h = (float) ((((float) Math.atan2(r1Var7.f4653c - f11, f10 - r1Var7.f4652b)) - 1.5707963267948966d) + r1Var7.h);
                for (int i10 = 0; i10 < d2Var3.f4497m.size(); i10++) {
                    c2 c2Var = (c2) d2Var3.f4497m.get(i10);
                    if (c2Var instanceof b2) {
                        c2Var.a();
                    }
                }
                return;
            case 4:
                r1 r1Var8 = this.f4743g.h;
                r1Var8.f4657i = f10;
                r1Var8.f4658j = f11;
                this.d = f10;
                this.f4477e = f11;
                float f14 = r1Var8.f4653c;
                float f15 = r1Var8.f4654e;
                float f16 = f14 - f15;
                int i11 = (f11 > f16 ? 1 : (f11 == f16 ? 0 : -1));
                if (i11 > 0 && f11 < f14 + f15) {
                    float f17 = r1Var8.f4652b;
                    if (f10 <= f17) {
                        float f18 = f17 - r1Var8.d;
                        if (f10 > f18) {
                            this.d = f18;
                        }
                    }
                    if (f10 > f14) {
                        float f19 = f17 + r1Var8.d;
                        if (f10 < f19) {
                            this.d = f19;
                        }
                    }
                }
                float f20 = this.d;
                float f21 = r1Var8.f4652b;
                float f22 = r1Var8.d;
                if (f20 > f21 - f22 && f20 < f21 + f22) {
                    if (f11 <= f14 && i11 > 0) {
                        this.f4477e = f16;
                    } else if (f11 > f14) {
                        float f23 = f14 + f15;
                        if (f11 < f23) {
                            this.f4477e = f23;
                        }
                    }
                }
                r1Var8.f4657i = f20;
                r1Var8.f4658j = this.f4477e;
                return;
            default:
                int i12 = 0;
                while (true) {
                    d2 d2Var4 = this.f4743g;
                    if (i12 < d2Var4.f4497m.size()) {
                        c2 c2Var2 = (c2) d2Var4.f4497m.get(i12);
                        if (c2Var2 != this) {
                            c2Var2.a();
                        }
                        i12++;
                    } else {
                        r1 r1Var9 = d2Var4.h;
                        r1Var9.f4652b = f10;
                        r1Var9.f4653c = f11;
                        this.d = f10;
                        this.f4477e = f11;
                        return;
                    }
                }
        }
    }

    public z1(d2 d2Var, int i10, boolean z4) {
        super(0);
        this.f4742f = i10;
        this.f4743g = d2Var;
    }
}
