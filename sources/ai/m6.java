package ai;

import org.telegram.messenger.AndroidUtilities;
public final class m6 implements Runnable {
    public final int f1817a;
    public final t6 f1818b;

    public m6(t6 t6Var, int i10) {
        this.f1817a = i10;
        this.f1818b = t6Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        switch (this.f1817a) {
            case 0:
                this.f1818b.b();
                return;
            case 1:
                t6 t6Var = this.f1818b;
                f7 f7Var = t6Var.f2196a;
                if (!t6Var.f2213u) {
                    t6Var.v = false;
                    if (t6Var.f2207o) {
                        t6Var.f2213u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min(((float) (currentTimeMillis - t6Var.f2205m)) / 1000.0f, 0.25f);
                        float f7 = t6Var.f2206n + min;
                        t6Var.f2206n = f7;
                        p6 p6Var = t6Var.f2202j;
                        if (f7 > AndroidUtilities.lerp(0.1f, 1.0f, t6Var.f2212t)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f10 = p6Var.f(min, z10);
                        p6 p6Var2 = t6Var.f2203k;
                        if (t6Var.f2206n > AndroidUtilities.lerp(0.1f, 1.0f, t6Var.f2212t)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f11 = p6Var2.f(min, z11);
                        float f12 = t6Var.f2201i.f(min, t6Var.f2202j.b(0.5f));
                        p6 p6Var3 = t6Var.h;
                        if (t6Var.f2202j.b(0.5f) && t6Var.f2201i.b(0.5f)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float f13 = p6Var3.f(min, z12);
                        t6Var.f2205m = currentTimeMillis;
                        if (t6Var.f2202j.c() && t6Var.f2201i.c() && t6Var.h.c() && !t6Var.f2208p) {
                            t6Var.f2208p = true;
                            AndroidUtilities.runOnUIThread(new m6(t6Var, 2));
                        }
                        if (t6Var.f2202j.c() && t6Var.f2201i.c() && t6Var.h.b(0.25f) && !t6Var.f2209q) {
                            t6Var.f2209q = true;
                            AndroidUtilities.runOnUIThread(new m6(t6Var, 3));
                        }
                        y6 y6Var = t6Var.f2197b;
                        if (y6Var != null) {
                            p6 p6Var4 = t6Var.h;
                            o6 o6Var = p6Var4.f2001b;
                            float f14 = p6Var4.e - f13;
                            float f15 = f14 - 1.0f;
                            o6 o6Var2 = p6Var4.f2005i;
                            if (o6Var == o6Var2) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            o6 o6Var3 = p6Var4.f2002c;
                            if (o6Var3 == o6Var2) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            o6 o6Var4 = p6Var4.d;
                            float f16 = f14 + 1.0f;
                            if (o6Var4 == o6Var2) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            y6Var.a(o6Var, f15, z22, o6Var3, f14, z23, o6Var4, f16, z24);
                        }
                        y6 y6Var2 = t6Var.f2198c;
                        if (y6Var2 != null) {
                            p6 p6Var5 = t6Var.f2201i;
                            o6 o6Var5 = p6Var5.f2001b;
                            float f17 = p6Var5.e - f12;
                            float f18 = f17 - 1.0f;
                            o6 o6Var6 = p6Var5.f2005i;
                            if (o6Var5 == o6Var6) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            o6 o6Var7 = p6Var5.f2002c;
                            if (o6Var7 == o6Var6) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            o6 o6Var8 = p6Var5.d;
                            float f19 = f17 + 1.0f;
                            if (o6Var8 == o6Var6) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            y6Var2.a(o6Var5, f18, z19, o6Var7, f17, z20, o6Var8, f19, z21);
                        }
                        y6 y6Var3 = t6Var.d;
                        if (y6Var3 != null) {
                            p6 p6Var6 = t6Var.f2203k;
                            o6 o6Var9 = p6Var6.f2001b;
                            float f20 = p6Var6.e - f11;
                            float f21 = f20 - 1.0f;
                            o6 o6Var10 = p6Var6.f2005i;
                            if (o6Var9 == o6Var10) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            o6 o6Var11 = p6Var6.f2002c;
                            if (o6Var11 == o6Var10) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            o6 o6Var12 = p6Var6.d;
                            float f22 = f20 + 1.0f;
                            if (o6Var12 == o6Var10) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            y6Var3.a(o6Var9, f21, z16, o6Var11, f20, z17, o6Var12, f22, z18);
                        }
                        f7Var.g(0, ((s6) t6Var.f2201i.f2002c).f2153c, true);
                        w6 w6Var = f7Var.f1265c;
                        p6 p6Var7 = t6Var.h;
                        o6 o6Var13 = p6Var7.f2001b;
                        r6 r6Var = (r6) o6Var13;
                        float f23 = p6Var7.e - f13;
                        float f24 = f23 - 1.0f;
                        o6 o6Var14 = p6Var7.f2005i;
                        if (o6Var13 == o6Var14) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        o6 o6Var15 = p6Var7.f2002c;
                        r6 r6Var2 = (r6) o6Var15;
                        if (o6Var15 == o6Var14) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        o6 o6Var16 = p6Var7.d;
                        r6 r6Var3 = (r6) o6Var16;
                        float f25 = f23 + 1.0f;
                        if (o6Var16 == o6Var14) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        p6 p6Var8 = t6Var.f2202j;
                        float f26 = p6Var8.e - f10;
                        w6Var.f2360a = r6Var;
                        w6Var.f2361b = r6Var2;
                        w6Var.f2362c = r6Var3;
                        w6Var.d = f24;
                        w6Var.e = f23;
                        w6Var.f2363f = f25;
                        w6Var.h = z13;
                        w6Var.f2364n = z14;
                        w6Var.f2365r = z15;
                        w6Var.f2366s = (q6) p6Var8.f2001b;
                        w6Var.v = (q6) p6Var8.f2002c;
                        w6Var.f2367w = (q6) p6Var8.d;
                        w6Var.f2368x = f26 - 1.0f;
                        w6Var.f2369y = f26;
                        w6Var.E = f26 + 1.0f;
                        w6Var.invalidate();
                        t6Var.f2213u = false;
                        t6Var.b();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                t6 t6Var2 = this.f1818b;
                t6Var2.f2207o = false;
                t6Var2.f2196a.f1265c.c();
                d2 d2Var = t6Var2.f2210r;
                if (d2Var != null) {
                    d2Var.run();
                    return;
                }
                return;
            default:
                d2 d2Var2 = this.f1818b.f2211s;
                if (d2Var2 != null) {
                    d2Var2.run();
                    return;
                }
                return;
        }
    }
}
