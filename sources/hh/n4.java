package hh;

import org.telegram.messenger.AndroidUtilities;

public final class n4 implements Runnable {

    public final int f9781a;

    public final t4 f9782b;

    public n4(t4 t4Var, int i10) {
        this.f9781a = i10;
        this.f9782b = t4Var;
    }

    @Override
    public final void run() {
        switch (this.f9781a) {
            case 0:
                this.f9782b.b();
                break;
            case 1:
                t4 t4Var = this.f9782b;
                e5 e5Var = t4Var.f10056a;
                if (!t4Var.f10074u) {
                    t4Var.v = false;
                    if (t4Var.f10068o) {
                        t4Var.f10074u = true;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        float fMin = Math.min((jCurrentTimeMillis - t4Var.f10066m) / 1000.0f, 0.25f);
                        float f10 = t4Var.f10067n + fMin;
                        t4Var.f10067n = f10;
                        float f11 = t4Var.f10063j.f(fMin, f10 > AndroidUtilities.lerp(0.1f, 1.0f, t4Var.f10073t));
                        float f12 = t4Var.f10064k.f(fMin, t4Var.f10067n > AndroidUtilities.lerp(0.1f, 1.0f, t4Var.f10073t));
                        float f13 = t4Var.f10062i.f(fMin, t4Var.f10063j.b(0.5f));
                        float f14 = t4Var.h.f(fMin, t4Var.f10063j.b(0.5f) && t4Var.f10062i.b(0.5f));
                        t4Var.f10066m = jCurrentTimeMillis;
                        if (t4Var.f10063j.c() && t4Var.f10062i.c() && t4Var.h.c() && !t4Var.f10069p) {
                            t4Var.f10069p = true;
                            AndroidUtilities.runOnUIThread(new n4(t4Var, 2));
                        }
                        if (t4Var.f10063j.c() && t4Var.f10062i.c() && t4Var.h.b(0.25f) && !t4Var.f10070q) {
                            t4Var.f10070q = true;
                            AndroidUtilities.runOnUIThread(new n4(t4Var, 3));
                        }
                        y4 y4Var = t4Var.f10057b;
                        if (y4Var != null) {
                            p4 p4Var = t4Var.h;
                            o4 o4Var = p4Var.f9862b;
                            float f15 = p4Var.f9864e - f14;
                            float f16 = f15 - 1.0f;
                            o4 o4Var2 = p4Var.f9867i;
                            boolean z10 = o4Var == o4Var2;
                            o4 o4Var3 = p4Var.f9863c;
                            boolean z11 = o4Var3 == o4Var2;
                            o4 o4Var4 = p4Var.d;
                            y4Var.a(o4Var, f16, z10, o4Var3, f15, z11, o4Var4, f15 + 1.0f, o4Var4 == o4Var2);
                        }
                        y4 y4Var2 = t4Var.f10058c;
                        if (y4Var2 != null) {
                            p4 p4Var2 = t4Var.f10062i;
                            o4 o4Var5 = p4Var2.f9862b;
                            float f17 = p4Var2.f9864e - f13;
                            float f18 = f17 - 1.0f;
                            o4 o4Var6 = p4Var2.f9867i;
                            boolean z12 = o4Var5 == o4Var6;
                            o4 o4Var7 = p4Var2.f9863c;
                            boolean z13 = o4Var7 == o4Var6;
                            o4 o4Var8 = p4Var2.d;
                            y4Var2.a(o4Var5, f18, z12, o4Var7, f17, z13, o4Var8, f17 + 1.0f, o4Var8 == o4Var6);
                        }
                        y4 y4Var3 = t4Var.d;
                        if (y4Var3 != null) {
                            p4 p4Var3 = t4Var.f10064k;
                            o4 o4Var9 = p4Var3.f9862b;
                            float f19 = p4Var3.f9864e - f12;
                            float f20 = f19 - 1.0f;
                            o4 o4Var10 = p4Var3.f9867i;
                            boolean z14 = o4Var9 == o4Var10;
                            o4 o4Var11 = p4Var3.f9863c;
                            boolean z15 = o4Var11 == o4Var10;
                            o4 o4Var12 = p4Var3.d;
                            y4Var3.a(o4Var9, f20, z14, o4Var11, f19, z15, o4Var12, f19 + 1.0f, o4Var12 == o4Var10);
                        }
                        e5Var.g(0, ((s4) t4Var.f10062i.f9863c).f10018c, true);
                        w4 w4Var = e5Var.f9176c;
                        p4 p4Var4 = t4Var.h;
                        o4 o4Var13 = p4Var4.f9862b;
                        r4 r4Var = (r4) o4Var13;
                        float f21 = p4Var4.f9864e - f14;
                        float f22 = f21 - 1.0f;
                        o4 o4Var14 = p4Var4.f9867i;
                        boolean z16 = o4Var13 == o4Var14;
                        o4 o4Var15 = p4Var4.f9863c;
                        r4 r4Var2 = (r4) o4Var15;
                        boolean z17 = o4Var15 == o4Var14;
                        o4 o4Var16 = p4Var4.d;
                        r4 r4Var3 = (r4) o4Var16;
                        float f23 = f21 + 1.0f;
                        boolean z18 = o4Var16 == o4Var14;
                        p4 p4Var5 = t4Var.f10063j;
                        q4 q4Var = (q4) p4Var5.f9862b;
                        float f24 = p4Var5.f9864e - f11;
                        q4 q4Var2 = (q4) p4Var5.f9863c;
                        q4 q4Var3 = (q4) p4Var5.d;
                        w4Var.f10274a = r4Var;
                        w4Var.f10275b = r4Var2;
                        w4Var.f10276c = r4Var3;
                        w4Var.d = f22;
                        w4Var.f10277e = f21;
                        w4Var.f10278f = f23;
                        w4Var.h = z16;
                        w4Var.f10279n = z17;
                        w4Var.f10280r = z18;
                        w4Var.f10281s = q4Var;
                        w4Var.v = q4Var2;
                        w4Var.f10282w = q4Var3;
                        w4Var.f10283x = f24 - 1.0f;
                        w4Var.f10284y = f24;
                        w4Var.A = f24 + 1.0f;
                        w4Var.invalidate();
                        t4Var.f10074u = false;
                        t4Var.b();
                        break;
                    }
                }
                break;
            case 2:
                t4 t4Var2 = this.f9782b;
                t4Var2.f10068o = false;
                t4Var2.f10056a.f9176c.c();
                v1 v1Var = t4Var2.f10071r;
                if (v1Var != null) {
                    v1Var.run();
                }
                break;
            default:
                v1 v1Var2 = this.f9782b.f10072s;
                if (v1Var2 != null) {
                    v1Var2.run();
                }
                break;
        }
    }
}
