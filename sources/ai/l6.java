package ai;

import org.telegram.messenger.AndroidUtilities;
public final class l6 implements Runnable {
    public final int f1762a;
    public final s6 f1763b;

    public l6(s6 s6Var, int i10) {
        this.f1762a = i10;
        this.f1763b = s6Var;
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
        switch (this.f1762a) {
            case 0:
                this.f1763b.b();
                return;
            case 1:
                s6 s6Var = this.f1763b;
                e7 e7Var = s6Var.f2149a;
                if (!s6Var.f2166u) {
                    s6Var.v = false;
                    if (s6Var.f2160o) {
                        s6Var.f2166u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min(((float) (currentTimeMillis - s6Var.f2158m)) / 1000.0f, 0.25f);
                        float f7 = s6Var.f2159n + min;
                        s6Var.f2159n = f7;
                        o6 o6Var = s6Var.f2155j;
                        if (f7 > AndroidUtilities.lerp(0.1f, 1.0f, s6Var.f2165t)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f10 = o6Var.f(min, z10);
                        o6 o6Var2 = s6Var.f2156k;
                        if (s6Var.f2159n > AndroidUtilities.lerp(0.1f, 1.0f, s6Var.f2165t)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f11 = o6Var2.f(min, z11);
                        float f12 = s6Var.f2154i.f(min, s6Var.f2155j.b(0.5f));
                        o6 o6Var3 = s6Var.h;
                        if (s6Var.f2155j.b(0.5f) && s6Var.f2154i.b(0.5f)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float f13 = o6Var3.f(min, z12);
                        s6Var.f2158m = currentTimeMillis;
                        if (s6Var.f2155j.c() && s6Var.f2154i.c() && s6Var.h.c() && !s6Var.f2161p) {
                            s6Var.f2161p = true;
                            AndroidUtilities.runOnUIThread(new l6(s6Var, 2));
                        }
                        if (s6Var.f2155j.c() && s6Var.f2154i.c() && s6Var.h.b(0.25f) && !s6Var.f2162q) {
                            s6Var.f2162q = true;
                            AndroidUtilities.runOnUIThread(new l6(s6Var, 3));
                        }
                        x6 x6Var = s6Var.f2150b;
                        if (x6Var != null) {
                            o6 o6Var4 = s6Var.h;
                            n6 n6Var = o6Var4.f1940b;
                            float f14 = o6Var4.e - f13;
                            float f15 = f14 - 1.0f;
                            n6 n6Var2 = o6Var4.f1944i;
                            if (n6Var == n6Var2) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            n6 n6Var3 = o6Var4.f1941c;
                            if (n6Var3 == n6Var2) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            n6 n6Var4 = o6Var4.d;
                            float f16 = f14 + 1.0f;
                            if (n6Var4 == n6Var2) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            x6Var.a(n6Var, f15, z22, n6Var3, f14, z23, n6Var4, f16, z24);
                        }
                        x6 x6Var2 = s6Var.f2151c;
                        if (x6Var2 != null) {
                            o6 o6Var5 = s6Var.f2154i;
                            n6 n6Var5 = o6Var5.f1940b;
                            float f17 = o6Var5.e - f12;
                            float f18 = f17 - 1.0f;
                            n6 n6Var6 = o6Var5.f1944i;
                            if (n6Var5 == n6Var6) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            n6 n6Var7 = o6Var5.f1941c;
                            if (n6Var7 == n6Var6) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            n6 n6Var8 = o6Var5.d;
                            float f19 = f17 + 1.0f;
                            if (n6Var8 == n6Var6) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            x6Var2.a(n6Var5, f18, z19, n6Var7, f17, z20, n6Var8, f19, z21);
                        }
                        x6 x6Var3 = s6Var.d;
                        if (x6Var3 != null) {
                            o6 o6Var6 = s6Var.f2156k;
                            n6 n6Var9 = o6Var6.f1940b;
                            float f20 = o6Var6.e - f11;
                            float f21 = f20 - 1.0f;
                            n6 n6Var10 = o6Var6.f1944i;
                            if (n6Var9 == n6Var10) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            n6 n6Var11 = o6Var6.f1941c;
                            if (n6Var11 == n6Var10) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            n6 n6Var12 = o6Var6.d;
                            float f22 = f20 + 1.0f;
                            if (n6Var12 == n6Var10) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            x6Var3.a(n6Var9, f21, z16, n6Var11, f20, z17, n6Var12, f22, z18);
                        }
                        e7Var.g(0, ((r6) s6Var.f2154i.f1941c).f2108c, true);
                        v6 v6Var = e7Var.f1215c;
                        o6 o6Var7 = s6Var.h;
                        n6 n6Var13 = o6Var7.f1940b;
                        q6 q6Var = (q6) n6Var13;
                        float f23 = o6Var7.e - f13;
                        float f24 = f23 - 1.0f;
                        n6 n6Var14 = o6Var7.f1944i;
                        if (n6Var13 == n6Var14) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        n6 n6Var15 = o6Var7.f1941c;
                        q6 q6Var2 = (q6) n6Var15;
                        if (n6Var15 == n6Var14) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        n6 n6Var16 = o6Var7.d;
                        q6 q6Var3 = (q6) n6Var16;
                        float f25 = f23 + 1.0f;
                        if (n6Var16 == n6Var14) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        o6 o6Var8 = s6Var.f2155j;
                        float f26 = o6Var8.e - f10;
                        v6Var.f2306a = q6Var;
                        v6Var.f2307b = q6Var2;
                        v6Var.f2308c = q6Var3;
                        v6Var.d = f24;
                        v6Var.e = f23;
                        v6Var.f2309f = f25;
                        v6Var.h = z13;
                        v6Var.f2310n = z14;
                        v6Var.f2311r = z15;
                        v6Var.f2312s = (p6) o6Var8.f1940b;
                        v6Var.v = (p6) o6Var8.f1941c;
                        v6Var.f2313w = (p6) o6Var8.d;
                        v6Var.f2314x = f26 - 1.0f;
                        v6Var.f2315y = f26;
                        v6Var.E = f26 + 1.0f;
                        v6Var.invalidate();
                        s6Var.f2166u = false;
                        s6Var.b();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                s6 s6Var2 = this.f1763b;
                s6Var2.f2160o = false;
                s6Var2.f2149a.f1215c.c();
                d2 d2Var = s6Var2.f2163r;
                if (d2Var != null) {
                    d2Var.run();
                    return;
                }
                return;
            default:
                d2 d2Var2 = this.f1763b.f2164s;
                if (d2Var2 != null) {
                    d2Var2.run();
                    return;
                }
                return;
        }
    }
}
