package di;
public final class i5 implements Runnable {
    public final int f9039a;
    public final o5 f9040b;

    public i5(o5 o5Var, int i7) {
        this.f9039a = i7;
        this.f9040b = o5Var;
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
        switch (this.f9039a) {
            case 0:
                this.f9040b.b();
                return;
            case 1:
                o5 o5Var = this.f9040b;
                z5 z5Var = o5Var.f9461a;
                if (!o5Var.f9479u) {
                    o5Var.v = false;
                    if (o5Var.f9473o) {
                        o5Var.f9479u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min(((float) (currentTimeMillis - o5Var.f9471m)) / 1000.0f, 0.25f);
                        float f10 = o5Var.f9472n + min;
                        o5Var.f9472n = f10;
                        k5 k5Var = o5Var.f9468j;
                        if (f10 > org.telegram.messenger.g0.T1(0.1f, 1.0f, o5Var.f9478t)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f11 = k5Var.f(z10, min);
                        k5 k5Var2 = o5Var.f9469k;
                        if (o5Var.f9472n > org.telegram.messenger.g0.T1(0.1f, 1.0f, o5Var.f9478t)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f12 = k5Var2.f(z11, min);
                        float f13 = o5Var.f9467i.f(o5Var.f9468j.b(0.5f), min);
                        k5 k5Var3 = o5Var.h;
                        if (o5Var.f9468j.b(0.5f) && o5Var.f9467i.b(0.5f)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float f14 = k5Var3.f(z12, min);
                        o5Var.f9471m = currentTimeMillis;
                        if (o5Var.f9468j.c() && o5Var.f9467i.c() && o5Var.h.c() && !o5Var.f9474p) {
                            o5Var.f9474p = true;
                            org.telegram.messenger.g0.g3(new i5(o5Var, 2));
                        }
                        if (o5Var.f9468j.c() && o5Var.f9467i.c() && o5Var.h.b(0.25f) && !o5Var.f9475q) {
                            o5Var.f9475q = true;
                            org.telegram.messenger.g0.g3(new i5(o5Var, 3));
                        }
                        t5 t5Var = o5Var.f9462b;
                        if (t5Var != null) {
                            k5 k5Var4 = o5Var.h;
                            j5 j5Var = k5Var4.f9186b;
                            float f15 = k5Var4.f9188e - f14;
                            float f16 = f15 - 1.0f;
                            j5 j5Var2 = k5Var4.f9191i;
                            if (j5Var == j5Var2) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            j5 j5Var3 = k5Var4.f9187c;
                            if (j5Var3 == j5Var2) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            j5 j5Var4 = k5Var4.d;
                            float f17 = f15 + 1.0f;
                            if (j5Var4 == j5Var2) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            t5Var.a(j5Var, f16, z22, j5Var3, f15, z23, j5Var4, f17, z24);
                        }
                        t5 t5Var2 = o5Var.f9463c;
                        if (t5Var2 != null) {
                            k5 k5Var5 = o5Var.f9467i;
                            j5 j5Var5 = k5Var5.f9186b;
                            float f18 = k5Var5.f9188e - f13;
                            float f19 = f18 - 1.0f;
                            j5 j5Var6 = k5Var5.f9191i;
                            if (j5Var5 == j5Var6) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            j5 j5Var7 = k5Var5.f9187c;
                            if (j5Var7 == j5Var6) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            j5 j5Var8 = k5Var5.d;
                            float f20 = f18 + 1.0f;
                            if (j5Var8 == j5Var6) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            t5Var2.a(j5Var5, f19, z19, j5Var7, f18, z20, j5Var8, f20, z21);
                        }
                        t5 t5Var3 = o5Var.d;
                        if (t5Var3 != null) {
                            k5 k5Var6 = o5Var.f9469k;
                            j5 j5Var9 = k5Var6.f9186b;
                            float f21 = k5Var6.f9188e - f12;
                            float f22 = f21 - 1.0f;
                            j5 j5Var10 = k5Var6.f9191i;
                            if (j5Var9 == j5Var10) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            j5 j5Var11 = k5Var6.f9187c;
                            if (j5Var11 == j5Var10) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            j5 j5Var12 = k5Var6.d;
                            float f23 = f21 + 1.0f;
                            if (j5Var12 == j5Var10) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            t5Var3.a(j5Var9, f22, z16, j5Var11, f21, z17, j5Var12, f23, z18);
                        }
                        z5Var.g(0, ((n5) o5Var.f9467i.f9187c).f9398c, true);
                        r5 r5Var = z5Var.f10147c;
                        k5 k5Var7 = o5Var.h;
                        j5 j5Var13 = k5Var7.f9186b;
                        m5 m5Var = (m5) j5Var13;
                        float f24 = k5Var7.f9188e - f14;
                        float f25 = f24 - 1.0f;
                        j5 j5Var14 = k5Var7.f9191i;
                        if (j5Var13 == j5Var14) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        j5 j5Var15 = k5Var7.f9187c;
                        m5 m5Var2 = (m5) j5Var15;
                        if (j5Var15 == j5Var14) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        j5 j5Var16 = k5Var7.d;
                        m5 m5Var3 = (m5) j5Var16;
                        float f26 = f24 + 1.0f;
                        if (j5Var16 == j5Var14) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        k5 k5Var8 = o5Var.f9468j;
                        float f27 = k5Var8.f9188e - f11;
                        r5Var.f9672a = m5Var;
                        r5Var.f9673b = m5Var2;
                        r5Var.f9674c = m5Var3;
                        r5Var.d = f25;
                        r5Var.f9675e = f24;
                        r5Var.f9676f = f26;
                        r5Var.h = z13;
                        r5Var.f9677n = z14;
                        r5Var.f9678r = z15;
                        r5Var.f9679s = (l5) k5Var8.f9186b;
                        r5Var.f9680w = (l5) k5Var8.f9187c;
                        r5Var.f9681x = (l5) k5Var8.d;
                        r5Var.f9682y = f27 - 1.0f;
                        r5Var.E = f27;
                        r5Var.F = f27 + 1.0f;
                        r5Var.invalidate();
                        o5Var.f9479u = false;
                        o5Var.b();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                o5 o5Var2 = this.f9040b;
                o5Var2.f9473o = false;
                o5Var2.f9461a.f10147c.c();
                k1 k1Var = o5Var2.f9476r;
                if (k1Var != null) {
                    k1Var.run();
                    return;
                }
                return;
            default:
                k1 k1Var2 = this.f9040b.f9477s;
                if (k1Var2 != null) {
                    k1Var2.run();
                    return;
                }
                return;
        }
    }
}
