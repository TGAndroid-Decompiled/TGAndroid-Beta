package ci;
public final class o5 implements Runnable {
    public final int f5684a;
    public final u5 f5685b;

    public o5(u5 u5Var, int i3) {
        this.f5684a = i3;
        this.f5685b = u5Var;
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
        switch (this.f5684a) {
            case 0:
                this.f5685b.b();
                return;
            case 1:
                u5 u5Var = this.f5685b;
                f6 f6Var = u5Var.f6087a;
                if (!u5Var.f6105u) {
                    u5Var.v = false;
                    if (u5Var.f6099o) {
                        u5Var.f6105u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min(((float) (currentTimeMillis - u5Var.f6097m)) / 1000.0f, 0.25f);
                        float f10 = u5Var.f6098n + min;
                        u5Var.f6098n = f10;
                        q5 q5Var = u5Var.f6094j;
                        if (f10 > org.telegram.messenger.g0.T1(0.1f, 1.0f, u5Var.f6104t)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f11 = q5Var.f(z10, min);
                        q5 q5Var2 = u5Var.f6095k;
                        if (u5Var.f6098n > org.telegram.messenger.g0.T1(0.1f, 1.0f, u5Var.f6104t)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f12 = q5Var2.f(z11, min);
                        float f13 = u5Var.f6093i.f(u5Var.f6094j.b(0.5f), min);
                        q5 q5Var3 = u5Var.h;
                        if (u5Var.f6094j.b(0.5f) && u5Var.f6093i.b(0.5f)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float f14 = q5Var3.f(z12, min);
                        u5Var.f6097m = currentTimeMillis;
                        if (u5Var.f6094j.c() && u5Var.f6093i.c() && u5Var.h.c() && !u5Var.f6100p) {
                            u5Var.f6100p = true;
                            org.telegram.messenger.g0.h3(new o5(u5Var, 2));
                        }
                        if (u5Var.f6094j.c() && u5Var.f6093i.c() && u5Var.h.b(0.25f) && !u5Var.f6101q) {
                            u5Var.f6101q = true;
                            org.telegram.messenger.g0.h3(new o5(u5Var, 3));
                        }
                        z5 z5Var = u5Var.f6088b;
                        if (z5Var != null) {
                            q5 q5Var4 = u5Var.h;
                            p5 p5Var = q5Var4.f5821b;
                            float f15 = q5Var4.f5823e - f14;
                            float f16 = f15 - 1.0f;
                            p5 p5Var2 = q5Var4.f5826i;
                            if (p5Var == p5Var2) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            p5 p5Var3 = q5Var4.f5822c;
                            if (p5Var3 == p5Var2) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            p5 p5Var4 = q5Var4.d;
                            float f17 = f15 + 1.0f;
                            if (p5Var4 == p5Var2) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            z5Var.a(p5Var, f16, z22, p5Var3, f15, z23, p5Var4, f17, z24);
                        }
                        z5 z5Var2 = u5Var.f6089c;
                        if (z5Var2 != null) {
                            q5 q5Var5 = u5Var.f6093i;
                            p5 p5Var5 = q5Var5.f5821b;
                            float f18 = q5Var5.f5823e - f13;
                            float f19 = f18 - 1.0f;
                            p5 p5Var6 = q5Var5.f5826i;
                            if (p5Var5 == p5Var6) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            p5 p5Var7 = q5Var5.f5822c;
                            if (p5Var7 == p5Var6) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            p5 p5Var8 = q5Var5.d;
                            float f20 = f18 + 1.0f;
                            if (p5Var8 == p5Var6) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            z5Var2.a(p5Var5, f19, z19, p5Var7, f18, z20, p5Var8, f20, z21);
                        }
                        z5 z5Var3 = u5Var.d;
                        if (z5Var3 != null) {
                            q5 q5Var6 = u5Var.f6095k;
                            p5 p5Var9 = q5Var6.f5821b;
                            float f21 = q5Var6.f5823e - f12;
                            float f22 = f21 - 1.0f;
                            p5 p5Var10 = q5Var6.f5826i;
                            if (p5Var9 == p5Var10) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            p5 p5Var11 = q5Var6.f5822c;
                            if (p5Var11 == p5Var10) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            p5 p5Var12 = q5Var6.d;
                            float f23 = f21 + 1.0f;
                            if (p5Var12 == p5Var10) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z5Var3.a(p5Var9, f22, z16, p5Var11, f21, z17, p5Var12, f23, z18);
                        }
                        f6Var.g(0, ((t5) u5Var.f6093i.f5822c).f6026c, true);
                        x5 x5Var = f6Var.f5087c;
                        q5 q5Var7 = u5Var.h;
                        p5 p5Var13 = q5Var7.f5821b;
                        s5 s5Var = (s5) p5Var13;
                        float f24 = q5Var7.f5823e - f14;
                        float f25 = f24 - 1.0f;
                        p5 p5Var14 = q5Var7.f5826i;
                        if (p5Var13 == p5Var14) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        p5 p5Var15 = q5Var7.f5822c;
                        s5 s5Var2 = (s5) p5Var15;
                        if (p5Var15 == p5Var14) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        p5 p5Var16 = q5Var7.d;
                        s5 s5Var3 = (s5) p5Var16;
                        float f26 = f24 + 1.0f;
                        if (p5Var16 == p5Var14) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        q5 q5Var8 = u5Var.f6094j;
                        float f27 = q5Var8.f5823e - f11;
                        x5Var.f6342a = s5Var;
                        x5Var.f6343b = s5Var2;
                        x5Var.f6344c = s5Var3;
                        x5Var.d = f25;
                        x5Var.f6345e = f24;
                        x5Var.f6346f = f26;
                        x5Var.h = z13;
                        x5Var.f6347n = z14;
                        x5Var.f6348r = z15;
                        x5Var.f6349s = (r5) q5Var8.f5821b;
                        x5Var.f6350w = (r5) q5Var8.f5822c;
                        x5Var.f6351x = (r5) q5Var8.d;
                        x5Var.f6352y = f27 - 1.0f;
                        x5Var.E = f27;
                        x5Var.F = f27 + 1.0f;
                        x5Var.invalidate();
                        u5Var.f6105u = false;
                        u5Var.b();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                u5 u5Var2 = this.f5685b;
                u5Var2.f6099o = false;
                u5Var2.f6087a.f5087c.c();
                s1 s1Var = u5Var2.f6102r;
                if (s1Var != null) {
                    s1Var.run();
                    return;
                }
                return;
            default:
                s1 s1Var2 = this.f5685b.f6103s;
                if (s1Var2 != null) {
                    s1Var2.run();
                    return;
                }
                return;
        }
    }
}
