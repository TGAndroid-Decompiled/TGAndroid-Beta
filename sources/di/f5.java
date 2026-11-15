package di;
public final class f5 implements Runnable {
    public final int f8538a;
    public final l5 f8539b;

    public f5(l5 l5Var, int i7) {
        this.f8538a = i7;
        this.f8539b = l5Var;
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
        switch (this.f8538a) {
            case 0:
                this.f8539b.b();
                return;
            case 1:
                l5 l5Var = this.f8539b;
                w5 w5Var = l5Var.f8960a;
                if (!l5Var.f8978u) {
                    l5Var.v = false;
                    if (l5Var.f8972o) {
                        l5Var.f8978u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min(((float) (currentTimeMillis - l5Var.f8970m)) / 1000.0f, 0.25f);
                        float f10 = l5Var.f8971n + min;
                        l5Var.f8971n = f10;
                        h5 h5Var = l5Var.f8967j;
                        if (f10 > org.telegram.messenger.g0.T1(0.1f, 1.0f, l5Var.f8977t)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f11 = h5Var.f(z10, min);
                        h5 h5Var2 = l5Var.f8968k;
                        if (l5Var.f8971n > org.telegram.messenger.g0.T1(0.1f, 1.0f, l5Var.f8977t)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f12 = h5Var2.f(z11, min);
                        float f13 = l5Var.f8966i.f(l5Var.f8967j.b(0.5f), min);
                        h5 h5Var3 = l5Var.h;
                        if (l5Var.f8967j.b(0.5f) && l5Var.f8966i.b(0.5f)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float f14 = h5Var3.f(z12, min);
                        l5Var.f8970m = currentTimeMillis;
                        if (l5Var.f8967j.c() && l5Var.f8966i.c() && l5Var.h.c() && !l5Var.f8973p) {
                            l5Var.f8973p = true;
                            org.telegram.messenger.g0.h3(new f5(l5Var, 2));
                        }
                        if (l5Var.f8967j.c() && l5Var.f8966i.c() && l5Var.h.b(0.25f) && !l5Var.f8974q) {
                            l5Var.f8974q = true;
                            org.telegram.messenger.g0.h3(new f5(l5Var, 3));
                        }
                        q5 q5Var = l5Var.f8961b;
                        if (q5Var != null) {
                            h5 h5Var4 = l5Var.h;
                            g5 g5Var = h5Var4.f8704b;
                            float f15 = h5Var4.f8706e - f14;
                            float f16 = f15 - 1.0f;
                            g5 g5Var2 = h5Var4.f8709i;
                            if (g5Var == g5Var2) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            g5 g5Var3 = h5Var4.f8705c;
                            if (g5Var3 == g5Var2) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            g5 g5Var4 = h5Var4.d;
                            float f17 = f15 + 1.0f;
                            if (g5Var4 == g5Var2) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            q5Var.a(g5Var, f16, z22, g5Var3, f15, z23, g5Var4, f17, z24);
                        }
                        q5 q5Var2 = l5Var.f8962c;
                        if (q5Var2 != null) {
                            h5 h5Var5 = l5Var.f8966i;
                            g5 g5Var5 = h5Var5.f8704b;
                            float f18 = h5Var5.f8706e - f13;
                            float f19 = f18 - 1.0f;
                            g5 g5Var6 = h5Var5.f8709i;
                            if (g5Var5 == g5Var6) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            g5 g5Var7 = h5Var5.f8705c;
                            if (g5Var7 == g5Var6) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            g5 g5Var8 = h5Var5.d;
                            float f20 = f18 + 1.0f;
                            if (g5Var8 == g5Var6) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            q5Var2.a(g5Var5, f19, z19, g5Var7, f18, z20, g5Var8, f20, z21);
                        }
                        q5 q5Var3 = l5Var.d;
                        if (q5Var3 != null) {
                            h5 h5Var6 = l5Var.f8968k;
                            g5 g5Var9 = h5Var6.f8704b;
                            float f21 = h5Var6.f8706e - f12;
                            float f22 = f21 - 1.0f;
                            g5 g5Var10 = h5Var6.f8709i;
                            if (g5Var9 == g5Var10) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            g5 g5Var11 = h5Var6.f8705c;
                            if (g5Var11 == g5Var10) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            g5 g5Var12 = h5Var6.d;
                            float f23 = f21 + 1.0f;
                            if (g5Var12 == g5Var10) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            q5Var3.a(g5Var9, f22, z16, g5Var11, f21, z17, g5Var12, f23, z18);
                        }
                        w5Var.g(0, ((k5) l5Var.f8966i.f8705c).f8911c, true);
                        o5 o5Var = w5Var.f9650c;
                        h5 h5Var7 = l5Var.h;
                        g5 g5Var13 = h5Var7.f8704b;
                        j5 j5Var = (j5) g5Var13;
                        float f24 = h5Var7.f8706e - f14;
                        float f25 = f24 - 1.0f;
                        g5 g5Var14 = h5Var7.f8709i;
                        if (g5Var13 == g5Var14) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        g5 g5Var15 = h5Var7.f8705c;
                        j5 j5Var2 = (j5) g5Var15;
                        if (g5Var15 == g5Var14) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        g5 g5Var16 = h5Var7.d;
                        j5 j5Var3 = (j5) g5Var16;
                        float f26 = f24 + 1.0f;
                        if (g5Var16 == g5Var14) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        h5 h5Var8 = l5Var.f8967j;
                        float f27 = h5Var8.f8706e - f11;
                        o5Var.f9146a = j5Var;
                        o5Var.f9147b = j5Var2;
                        o5Var.f9148c = j5Var3;
                        o5Var.d = f25;
                        o5Var.f9149e = f24;
                        o5Var.f9150f = f26;
                        o5Var.h = z13;
                        o5Var.f9151n = z14;
                        o5Var.f9152r = z15;
                        o5Var.f9153s = (i5) h5Var8.f8704b;
                        o5Var.f9154w = (i5) h5Var8.f8705c;
                        o5Var.f9155x = (i5) h5Var8.d;
                        o5Var.f9156y = f27 - 1.0f;
                        o5Var.E = f27;
                        o5Var.F = f27 + 1.0f;
                        o5Var.invalidate();
                        l5Var.f8978u = false;
                        l5Var.b();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                l5 l5Var2 = this.f8539b;
                l5Var2.f8972o = false;
                l5Var2.f8960a.f9650c.c();
                l1 l1Var = l5Var2.f8975r;
                if (l1Var != null) {
                    l1Var.run();
                    return;
                }
                return;
            default:
                l1 l1Var2 = this.f8539b.f8976s;
                if (l1Var2 != null) {
                    l1Var2.run();
                    return;
                }
                return;
        }
    }
}
