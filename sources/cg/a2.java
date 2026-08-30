package cg;

import k7.n6;
public final class a2 extends d2 {
    public final int f2310f;
    public final e2 f2311g;

    public a2(e2 e2Var, int i10) {
        this.f2310f = i10;
        this.f2311g = e2Var;
    }

    @Override
    public final void a() {
        switch (this.f2310f) {
            case 0:
                e2 e2Var = this.f2311g;
                s1 s1Var = e2Var.h;
                double atan2 = Math.atan2(s1Var.f2518c - s1Var.f2522j, s1Var.f2517b - s1Var.f2521i) + 3.141592653589793d;
                s1 s1Var2 = e2Var.h;
                double d = s1Var2.f2523k / 5.5f;
                this.d = s1Var2.f2517b + ((float) (Math.cos(atan2) * d));
                this.e = e2Var.h.f2518c + ((float) (Math.sin(atan2) * d));
                return;
            case 1:
                s1 s1Var3 = this.f2311g.h;
                float f10 = s1Var3.f2518c;
                this.d = s1Var3.f2517b + s1Var3.d;
                this.e = f10;
                return;
            case 2:
                e2 e2Var2 = this.f2311g;
                s1 s1Var4 = e2Var2.h;
                float min = Math.min(s1Var4.d, s1Var4.e);
                float cos = (((float) Math.cos(-0.3141592653589793d)) * min) + e2Var2.h.f2517b;
                float f11 = e2Var2.h.f2518c;
                this.d = cos;
                this.e = (((float) Math.sin(-0.3141592653589793d)) * min) + f11;
                return;
            case 3:
                s1 s1Var5 = this.f2311g.h;
                this.d = s1Var5.f2517b;
                this.e = s1Var5.f2518c - Math.abs(s1Var5.e);
                return;
            case 4:
                s1 s1Var6 = this.f2311g.h;
                float f12 = s1Var6.f2521i;
                float f13 = s1Var6.f2522j;
                s1Var6.f2521i = f12;
                s1Var6.f2522j = f13;
                this.d = f12;
                this.e = f13;
                return;
            default:
                s1 s1Var7 = this.f2311g.h;
                this.d = s1Var7.f2517b;
                this.e = s1Var7.f2518c;
                return;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        switch (this.f2310f) {
            case 0:
                e2 e2Var = this.f2311g;
                s1 s1Var = e2Var.h;
                double atan2 = Math.atan2(s1Var.f2518c - s1Var.f2522j, s1Var.f2517b - s1Var.f2521i) + 1.5707963267948966d;
                s1 s1Var2 = e2Var.h;
                s1 s1Var3 = e2Var.h;
                float f12 = s1Var3.f2517b;
                float f13 = s1Var3.f2518c;
                e2Var.getClass();
                s1Var3.f2523k = Math.min((n6.a(s1Var2.f2517b, s1Var2.f2518c, s1Var2.f2521i, s1Var2.f2522j) * 5.5f) / 2.0f, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f13 - f11)) - (Math.sin(atan2) * (f12 - f10))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f10;
                this.e = f11;
                s1 s1Var4 = this.f2311g.h;
                float a2 = n6.a(s1Var4.f2517b, s1Var4.f2518c, f10, f11);
                s1Var4.e = a2;
                s1Var4.d = a2;
                return;
            case 2:
                e2 e2Var2 = this.f2311g;
                s1 s1Var5 = e2Var2.h;
                float a10 = n6.a(s1Var5.f2517b, s1Var5.f2518c, f10, f11);
                s1Var5.e = a10;
                s1Var5.d = a10;
                s1 s1Var6 = e2Var2.h;
                s1Var6.h = (float) ((((float) Math.atan2(s1Var6.f2518c - f11, f10 - s1Var6.f2517b)) - 0.3141592653589793d) + s1Var6.h);
                a();
                return;
            case 3:
                e2 e2Var3 = this.f2311g;
                s1 s1Var7 = e2Var3.h;
                s1Var7.h = (float) ((((float) Math.atan2(s1Var7.f2518c - f11, f10 - s1Var7.f2517b)) - 1.5707963267948966d) + s1Var7.h);
                for (int i10 = 0; i10 < e2Var3.f2377m.size(); i10++) {
                    d2 d2Var = (d2) e2Var3.f2377m.get(i10);
                    if (d2Var instanceof c2) {
                        d2Var.a();
                    }
                }
                return;
            case 4:
                s1 s1Var8 = this.f2311g.h;
                s1Var8.f2521i = f10;
                s1Var8.f2522j = f11;
                this.d = f10;
                this.e = f11;
                float f14 = s1Var8.f2518c;
                float f15 = s1Var8.e;
                float f16 = f14 - f15;
                int i11 = (f11 > f16 ? 1 : (f11 == f16 ? 0 : -1));
                if (i11 > 0 && f11 < f14 + f15) {
                    float f17 = s1Var8.f2517b;
                    if (f10 <= f17) {
                        float f18 = f17 - s1Var8.d;
                        if (f10 > f18) {
                            this.d = f18;
                        }
                    }
                    if (f10 > f14) {
                        float f19 = f17 + s1Var8.d;
                        if (f10 < f19) {
                            this.d = f19;
                        }
                    }
                }
                float f20 = this.d;
                float f21 = s1Var8.f2517b;
                float f22 = s1Var8.d;
                if (f20 > f21 - f22 && f20 < f21 + f22) {
                    if (f11 <= f14 && i11 > 0) {
                        this.e = f16;
                    } else if (f11 > f14) {
                        float f23 = f14 + f15;
                        if (f11 < f23) {
                            this.e = f23;
                        }
                    }
                }
                s1Var8.f2521i = f20;
                s1Var8.f2522j = this.e;
                return;
            default:
                int i12 = 0;
                while (true) {
                    e2 e2Var4 = this.f2311g;
                    if (i12 < e2Var4.f2377m.size()) {
                        d2 d2Var2 = (d2) e2Var4.f2377m.get(i12);
                        if (d2Var2 != this) {
                            d2Var2.a();
                        }
                        i12++;
                    } else {
                        s1 s1Var9 = e2Var4.h;
                        s1Var9.f2517b = f10;
                        s1Var9.f2518c = f11;
                        this.d = f10;
                        this.e = f11;
                        return;
                    }
                }
        }
    }

    public a2(e2 e2Var, int i10, boolean z4) {
        super(0);
        this.f2310f = i10;
        this.f2311g = e2Var;
    }
}
