package bi;
public final class l6 implements Runnable {
    public final int f4267a;
    public final s6 f4268b;

    public l6(s6 s6Var, int i7) {
        this.f4267a = i7;
        this.f4268b = s6Var;
    }

    @Override
    public final void run() {
        boolean z9;
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
        switch (this.f4267a) {
            case 0:
                this.f4268b.b();
                return;
            case 1:
                s6 s6Var = this.f4268b;
                e7 e7Var = s6Var.f4673a;
                if (!s6Var.f4691u) {
                    s6Var.v = false;
                    if (s6Var.f4685o) {
                        s6Var.f4691u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min(((float) (currentTimeMillis - s6Var.f4683m)) / 1000.0f, 0.25f);
                        float f10 = s6Var.f4684n + min;
                        s6Var.f4684n = f10;
                        o6 o6Var = s6Var.f4680j;
                        if (f10 > org.telegram.messenger.g0.T1(0.1f, 1.0f, s6Var.f4690t)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        float f11 = o6Var.f(z9, min);
                        o6 o6Var2 = s6Var.f4681k;
                        if (s6Var.f4684n > org.telegram.messenger.g0.T1(0.1f, 1.0f, s6Var.f4690t)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f12 = o6Var2.f(z10, min);
                        float f13 = s6Var.f4679i.f(s6Var.f4680j.b(0.5f), min);
                        o6 o6Var3 = s6Var.h;
                        if (s6Var.f4680j.b(0.5f) && s6Var.f4679i.b(0.5f)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f14 = o6Var3.f(z11, min);
                        s6Var.f4683m = currentTimeMillis;
                        if (s6Var.f4680j.c() && s6Var.f4679i.c() && s6Var.h.c() && !s6Var.f4686p) {
                            s6Var.f4686p = true;
                            org.telegram.messenger.g0.h3(new l6(s6Var, 2));
                        }
                        if (s6Var.f4680j.c() && s6Var.f4679i.c() && s6Var.h.b(0.25f) && !s6Var.f4687q) {
                            s6Var.f4687q = true;
                            org.telegram.messenger.g0.h3(new l6(s6Var, 3));
                        }
                        x6 x6Var = s6Var.f4674b;
                        if (x6Var != null) {
                            o6 o6Var4 = s6Var.h;
                            n6 n6Var = o6Var4.f4462b;
                            float f15 = o6Var4.f4464e - f14;
                            float f16 = f15 - 1.0f;
                            n6 n6Var2 = o6Var4.f4467i;
                            if (n6Var == n6Var2) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            n6 n6Var3 = o6Var4.f4463c;
                            if (n6Var3 == n6Var2) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            n6 n6Var4 = o6Var4.d;
                            float f17 = f15 + 1.0f;
                            if (n6Var4 == n6Var2) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            x6Var.a(n6Var, f16, z21, n6Var3, f15, z22, n6Var4, f17, z23);
                        }
                        x6 x6Var2 = s6Var.f4675c;
                        if (x6Var2 != null) {
                            o6 o6Var5 = s6Var.f4679i;
                            n6 n6Var5 = o6Var5.f4462b;
                            float f18 = o6Var5.f4464e - f13;
                            float f19 = f18 - 1.0f;
                            n6 n6Var6 = o6Var5.f4467i;
                            if (n6Var5 == n6Var6) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            n6 n6Var7 = o6Var5.f4463c;
                            if (n6Var7 == n6Var6) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            n6 n6Var8 = o6Var5.d;
                            float f20 = f18 + 1.0f;
                            if (n6Var8 == n6Var6) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            x6Var2.a(n6Var5, f19, z18, n6Var7, f18, z19, n6Var8, f20, z20);
                        }
                        x6 x6Var3 = s6Var.d;
                        if (x6Var3 != null) {
                            o6 o6Var6 = s6Var.f4681k;
                            n6 n6Var9 = o6Var6.f4462b;
                            float f21 = o6Var6.f4464e - f12;
                            float f22 = f21 - 1.0f;
                            n6 n6Var10 = o6Var6.f4467i;
                            if (n6Var9 == n6Var10) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            n6 n6Var11 = o6Var6.f4463c;
                            if (n6Var11 == n6Var10) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            n6 n6Var12 = o6Var6.d;
                            float f23 = f21 + 1.0f;
                            if (n6Var12 == n6Var10) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            x6Var3.a(n6Var9, f22, z15, n6Var11, f21, z16, n6Var12, f23, z17);
                        }
                        e7Var.g(0, ((r6) s6Var.f4679i.f4463c).f4622c, true);
                        v6 v6Var = e7Var.f3769c;
                        o6 o6Var7 = s6Var.h;
                        n6 n6Var13 = o6Var7.f4462b;
                        q6 q6Var = (q6) n6Var13;
                        float f24 = o6Var7.f4464e - f14;
                        float f25 = f24 - 1.0f;
                        n6 n6Var14 = o6Var7.f4467i;
                        if (n6Var13 == n6Var14) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        n6 n6Var15 = o6Var7.f4463c;
                        q6 q6Var2 = (q6) n6Var15;
                        if (n6Var15 == n6Var14) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        n6 n6Var16 = o6Var7.d;
                        q6 q6Var3 = (q6) n6Var16;
                        float f26 = f24 + 1.0f;
                        if (n6Var16 == n6Var14) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        o6 o6Var8 = s6Var.f4680j;
                        float f27 = o6Var8.f4464e - f11;
                        v6Var.f4881a = q6Var;
                        v6Var.f4882b = q6Var2;
                        v6Var.f4883c = q6Var3;
                        v6Var.d = f25;
                        v6Var.f4884e = f24;
                        v6Var.f4885f = f26;
                        v6Var.h = z12;
                        v6Var.f4886n = z13;
                        v6Var.f4887r = z14;
                        v6Var.f4888s = (p6) o6Var8.f4462b;
                        v6Var.f4889w = (p6) o6Var8.f4463c;
                        v6Var.f4890x = (p6) o6Var8.d;
                        v6Var.f4891y = f27 - 1.0f;
                        v6Var.D = f27;
                        v6Var.E = f27 + 1.0f;
                        v6Var.invalidate();
                        s6Var.f4691u = false;
                        s6Var.b();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                s6 s6Var2 = this.f4268b;
                s6Var2.f4685o = false;
                s6Var2.f4673a.f3769c.c();
                z1 z1Var = s6Var2.f4688r;
                if (z1Var != null) {
                    z1Var.run();
                    return;
                }
                return;
            default:
                z1 z1Var2 = this.f4268b.f4689s;
                if (z1Var2 != null) {
                    z1Var2.run();
                    return;
                }
                return;
        }
    }
}
