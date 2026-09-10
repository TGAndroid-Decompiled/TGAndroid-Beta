package og;

import v7.a7;
public final class q1 extends t1 {
    public final int f14464f;
    public final u1 f14465g;

    public q1(u1 u1Var, int i10) {
        this.f14464f = i10;
        this.f14465g = u1Var;
    }

    @Override
    public final void a() {
        switch (this.f14464f) {
            case 0:
                u1 u1Var = this.f14465g;
                k1 k1Var = u1Var.h;
                double atan2 = Math.atan2(k1Var.f14407c - k1Var.f14411j, k1Var.f14406b - k1Var.f14410i) + 3.141592653589793d;
                k1 k1Var2 = u1Var.h;
                double d = k1Var2.f14412k / 5.5f;
                this.d = k1Var2.f14406b + ((float) (Math.cos(atan2) * d));
                this.e = u1Var.h.f14407c + ((float) (Math.sin(atan2) * d));
                return;
            case 1:
                k1 k1Var3 = this.f14465g.h;
                float f7 = k1Var3.f14407c;
                this.d = k1Var3.f14406b + k1Var3.d;
                this.e = f7;
                return;
            case 2:
                u1 u1Var2 = this.f14465g;
                k1 k1Var4 = u1Var2.h;
                float min = Math.min(k1Var4.d, k1Var4.e);
                float cos = (((float) Math.cos(-0.3141592653589793d)) * min) + u1Var2.h.f14406b;
                float f10 = u1Var2.h.f14407c;
                this.d = cos;
                this.e = (((float) Math.sin(-0.3141592653589793d)) * min) + f10;
                return;
            case 3:
                k1 k1Var5 = this.f14465g.h;
                this.d = k1Var5.f14406b;
                this.e = k1Var5.f14407c - Math.abs(k1Var5.e);
                return;
            case 4:
                k1 k1Var6 = this.f14465g.h;
                float f11 = k1Var6.f14410i;
                float f12 = k1Var6.f14411j;
                k1Var6.f14410i = f11;
                k1Var6.f14411j = f12;
                this.d = f11;
                this.e = f12;
                return;
            default:
                k1 k1Var7 = this.f14465g.h;
                this.d = k1Var7.f14406b;
                this.e = k1Var7.f14407c;
                return;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        switch (this.f14464f) {
            case 0:
                u1 u1Var = this.f14465g;
                k1 k1Var = u1Var.h;
                double atan2 = Math.atan2(k1Var.f14407c - k1Var.f14411j, k1Var.f14406b - k1Var.f14410i) + 1.5707963267948966d;
                k1 k1Var2 = u1Var.h;
                k1 k1Var3 = u1Var.h;
                float f11 = k1Var3.f14406b;
                float f12 = k1Var3.f14407c;
                u1Var.getClass();
                k1Var3.f14412k = Math.min((a7.a(k1Var2.f14406b, k1Var2.f14407c, k1Var2.f14410i, k1Var2.f14411j) * 5.5f) / 2.0f, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f12 - f10)) - (Math.sin(atan2) * (f11 - f7))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f7;
                this.e = f10;
                k1 k1Var4 = this.f14465g.h;
                float a2 = a7.a(k1Var4.f14406b, k1Var4.f14407c, f7, f10);
                k1Var4.e = a2;
                k1Var4.d = a2;
                return;
            case 2:
                u1 u1Var2 = this.f14465g;
                k1 k1Var5 = u1Var2.h;
                float a10 = a7.a(k1Var5.f14406b, k1Var5.f14407c, f7, f10);
                k1Var5.e = a10;
                k1Var5.d = a10;
                k1 k1Var6 = u1Var2.h;
                k1Var6.h = (float) ((((float) Math.atan2(k1Var6.f14407c - f10, f7 - k1Var6.f14406b)) - 0.3141592653589793d) + k1Var6.h);
                a();
                return;
            case 3:
                u1 u1Var3 = this.f14465g;
                k1 k1Var7 = u1Var3.h;
                k1Var7.h = (float) ((((float) Math.atan2(k1Var7.f14407c - f10, f7 - k1Var7.f14406b)) - 1.5707963267948966d) + k1Var7.h);
                for (int i10 = 0; i10 < u1Var3.f14508m.size(); i10++) {
                    t1 t1Var = (t1) u1Var3.f14508m.get(i10);
                    if (t1Var instanceof s1) {
                        t1Var.a();
                    }
                }
                return;
            case 4:
                k1 k1Var8 = this.f14465g.h;
                k1Var8.f14410i = f7;
                k1Var8.f14411j = f10;
                this.d = f7;
                this.e = f10;
                float f13 = k1Var8.f14407c;
                float f14 = k1Var8.e;
                float f15 = f13 - f14;
                int i11 = (f10 > f15 ? 1 : (f10 == f15 ? 0 : -1));
                if (i11 > 0 && f10 < f13 + f14) {
                    float f16 = k1Var8.f14406b;
                    if (f7 <= f16) {
                        float f17 = f16 - k1Var8.d;
                        if (f7 > f17) {
                            this.d = f17;
                        }
                    }
                    if (f7 > f13) {
                        float f18 = f16 + k1Var8.d;
                        if (f7 < f18) {
                            this.d = f18;
                        }
                    }
                }
                float f19 = this.d;
                float f20 = k1Var8.f14406b;
                float f21 = k1Var8.d;
                if (f19 > f20 - f21 && f19 < f20 + f21) {
                    if (f10 <= f13 && i11 > 0) {
                        this.e = f15;
                    } else if (f10 > f13) {
                        float f22 = f13 + f14;
                        if (f10 < f22) {
                            this.e = f22;
                        }
                    }
                }
                k1Var8.f14410i = f19;
                k1Var8.f14411j = this.e;
                return;
            default:
                int i12 = 0;
                while (true) {
                    u1 u1Var4 = this.f14465g;
                    if (i12 < u1Var4.f14508m.size()) {
                        t1 t1Var2 = (t1) u1Var4.f14508m.get(i12);
                        if (t1Var2 != this) {
                            t1Var2.a();
                        }
                        i12++;
                    } else {
                        k1 k1Var9 = u1Var4.h;
                        k1Var9.f14406b = f7;
                        k1Var9.f14407c = f10;
                        this.d = f7;
                        this.e = f10;
                        return;
                    }
                }
        }
    }

    public q1(u1 u1Var, int i10, boolean z10) {
        super(0);
        this.f14464f = i10;
        this.f14465g = u1Var;
    }
}
