package jh;

import org.telegram.messenger.AndroidUtilities;
public final class m4 implements Runnable {
    public final int f12452a;
    public final s4 f12453b;

    public m4(s4 s4Var, int i10) {
        this.f12452a = i10;
        this.f12453b = s4Var;
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
        switch (this.f12452a) {
            case 0:
                this.f12453b.b();
                return;
            case 1:
                s4 s4Var = this.f12453b;
                d5 d5Var = s4Var.f12758a;
                if (!s4Var.f12776u) {
                    s4Var.v = false;
                    if (s4Var.f12770o) {
                        s4Var.f12776u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min(((float) (currentTimeMillis - s4Var.f12768m)) / 1000.0f, 0.25f);
                        float f9 = s4Var.f12769n + min;
                        s4Var.f12769n = f9;
                        o4 o4Var = s4Var.f12765j;
                        if (f9 > AndroidUtilities.lerp(0.1f, 1.0f, s4Var.f12775t)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f10 = o4Var.f(min, z10);
                        o4 o4Var2 = s4Var.f12766k;
                        if (s4Var.f12769n > AndroidUtilities.lerp(0.1f, 1.0f, s4Var.f12775t)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f11 = o4Var2.f(min, z11);
                        float f12 = s4Var.f12764i.f(min, s4Var.f12765j.b(0.5f));
                        o4 o4Var3 = s4Var.h;
                        if (s4Var.f12765j.b(0.5f) && s4Var.f12764i.b(0.5f)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float f13 = o4Var3.f(min, z12);
                        s4Var.f12768m = currentTimeMillis;
                        if (s4Var.f12765j.c() && s4Var.f12764i.c() && s4Var.h.c() && !s4Var.f12771p) {
                            s4Var.f12771p = true;
                            AndroidUtilities.runOnUIThread(new m4(s4Var, 2));
                        }
                        if (s4Var.f12765j.c() && s4Var.f12764i.c() && s4Var.h.b(0.25f) && !s4Var.f12772q) {
                            s4Var.f12772q = true;
                            AndroidUtilities.runOnUIThread(new m4(s4Var, 3));
                        }
                        x4 x4Var = s4Var.f12759b;
                        if (x4Var != null) {
                            o4 o4Var4 = s4Var.h;
                            n4 n4Var = o4Var4.f12543b;
                            float f14 = o4Var4.f12545e - f13;
                            float f15 = f14 - 1.0f;
                            n4 n4Var2 = o4Var4.f12548i;
                            if (n4Var == n4Var2) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            n4 n4Var3 = o4Var4.f12544c;
                            if (n4Var3 == n4Var2) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            n4 n4Var4 = o4Var4.d;
                            float f16 = f14 + 1.0f;
                            if (n4Var4 == n4Var2) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            x4Var.a(n4Var, f15, z22, n4Var3, f14, z23, n4Var4, f16, z24);
                        }
                        x4 x4Var2 = s4Var.f12760c;
                        if (x4Var2 != null) {
                            o4 o4Var5 = s4Var.f12764i;
                            n4 n4Var5 = o4Var5.f12543b;
                            float f17 = o4Var5.f12545e - f12;
                            float f18 = f17 - 1.0f;
                            n4 n4Var6 = o4Var5.f12548i;
                            if (n4Var5 == n4Var6) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            n4 n4Var7 = o4Var5.f12544c;
                            if (n4Var7 == n4Var6) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            n4 n4Var8 = o4Var5.d;
                            float f19 = f17 + 1.0f;
                            if (n4Var8 == n4Var6) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            x4Var2.a(n4Var5, f18, z19, n4Var7, f17, z20, n4Var8, f19, z21);
                        }
                        x4 x4Var3 = s4Var.d;
                        if (x4Var3 != null) {
                            o4 o4Var6 = s4Var.f12766k;
                            n4 n4Var9 = o4Var6.f12543b;
                            float f20 = o4Var6.f12545e - f11;
                            float f21 = f20 - 1.0f;
                            n4 n4Var10 = o4Var6.f12548i;
                            if (n4Var9 == n4Var10) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            n4 n4Var11 = o4Var6.f12544c;
                            if (n4Var11 == n4Var10) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            n4 n4Var12 = o4Var6.d;
                            float f22 = f20 + 1.0f;
                            if (n4Var12 == n4Var10) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            x4Var3.a(n4Var9, f21, z16, n4Var11, f20, z17, n4Var12, f22, z18);
                        }
                        d5Var.g(0, ((r4) s4Var.f12764i.f12544c).f12704c, true);
                        v4 v4Var = d5Var.f11909c;
                        o4 o4Var7 = s4Var.h;
                        n4 n4Var13 = o4Var7.f12543b;
                        q4 q4Var = (q4) n4Var13;
                        float f23 = o4Var7.f12545e - f13;
                        float f24 = f23 - 1.0f;
                        n4 n4Var14 = o4Var7.f12548i;
                        if (n4Var13 == n4Var14) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        n4 n4Var15 = o4Var7.f12544c;
                        q4 q4Var2 = (q4) n4Var15;
                        if (n4Var15 == n4Var14) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        n4 n4Var16 = o4Var7.d;
                        q4 q4Var3 = (q4) n4Var16;
                        float f25 = f23 + 1.0f;
                        if (n4Var16 == n4Var14) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        o4 o4Var8 = s4Var.f12765j;
                        float f26 = o4Var8.f12545e - f10;
                        v4Var.f12952a = q4Var;
                        v4Var.f12953b = q4Var2;
                        v4Var.f12954c = q4Var3;
                        v4Var.d = f24;
                        v4Var.f12955e = f23;
                        v4Var.f12956f = f25;
                        v4Var.h = z13;
                        v4Var.f12957n = z14;
                        v4Var.f12958r = z15;
                        v4Var.f12959s = (p4) o4Var8.f12543b;
                        v4Var.v = (p4) o4Var8.f12544c;
                        v4Var.f12960w = (p4) o4Var8.d;
                        v4Var.f12961x = f26 - 1.0f;
                        v4Var.f12962y = f26;
                        v4Var.A = f26 + 1.0f;
                        v4Var.invalidate();
                        s4Var.f12776u = false;
                        s4Var.b();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                s4 s4Var2 = this.f12453b;
                s4Var2.f12770o = false;
                s4Var2.f12758a.f11909c.c();
                t1 t1Var = s4Var2.f12773r;
                if (t1Var != null) {
                    t1Var.run();
                    return;
                }
                return;
            default:
                t1 t1Var2 = this.f12453b.f12774s;
                if (t1Var2 != null) {
                    t1Var2.run();
                    return;
                }
                return;
        }
    }
}
