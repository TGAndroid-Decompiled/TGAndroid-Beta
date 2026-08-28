package gh;

import org.telegram.messenger.AndroidUtilities;
public final class p4 implements Runnable {
    public final int f8711a;
    public final v4 f8712b;

    public p4(v4 v4Var, int i9) {
        this.f8711a = i9;
        this.f8712b = v4Var;
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
        switch (this.f8711a) {
            case 0:
                this.f8712b.b();
                return;
            case 1:
                v4 v4Var = this.f8712b;
                g5 g5Var = v4Var.f9016a;
                if (!v4Var.f9034u) {
                    v4Var.v = false;
                    if (v4Var.f9028o) {
                        v4Var.f9034u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min(((float) (currentTimeMillis - v4Var.f9026m)) / 1000.0f, 0.25f);
                        float f10 = v4Var.f9027n + min;
                        v4Var.f9027n = f10;
                        r4 r4Var = v4Var.f9023j;
                        if (f10 > AndroidUtilities.lerp(0.1f, 1.0f, v4Var.f9033t)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f11 = r4Var.f(min, z10);
                        r4 r4Var2 = v4Var.f9024k;
                        if (v4Var.f9027n > AndroidUtilities.lerp(0.1f, 1.0f, v4Var.f9033t)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f12 = r4Var2.f(min, z11);
                        float f13 = v4Var.f9022i.f(min, v4Var.f9023j.b(0.5f));
                        r4 r4Var3 = v4Var.h;
                        if (v4Var.f9023j.b(0.5f) && v4Var.f9022i.b(0.5f)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float f14 = r4Var3.f(min, z12);
                        v4Var.f9026m = currentTimeMillis;
                        if (v4Var.f9023j.c() && v4Var.f9022i.c() && v4Var.h.c() && !v4Var.f9029p) {
                            v4Var.f9029p = true;
                            AndroidUtilities.runOnUIThread(new p4(v4Var, 2));
                        }
                        if (v4Var.f9023j.c() && v4Var.f9022i.c() && v4Var.h.b(0.25f) && !v4Var.f9030q) {
                            v4Var.f9030q = true;
                            AndroidUtilities.runOnUIThread(new p4(v4Var, 3));
                        }
                        a5 a5Var = v4Var.f9017b;
                        if (a5Var != null) {
                            r4 r4Var4 = v4Var.h;
                            q4 q4Var = r4Var4.f8802b;
                            float f15 = r4Var4.f8804e - f14;
                            float f16 = f15 - 1.0f;
                            q4 q4Var2 = r4Var4.f8807i;
                            if (q4Var == q4Var2) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            q4 q4Var3 = r4Var4.f8803c;
                            if (q4Var3 == q4Var2) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            q4 q4Var4 = r4Var4.d;
                            float f17 = f15 + 1.0f;
                            if (q4Var4 == q4Var2) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            a5Var.a(q4Var, f16, z22, q4Var3, f15, z23, q4Var4, f17, z24);
                        }
                        a5 a5Var2 = v4Var.f9018c;
                        if (a5Var2 != null) {
                            r4 r4Var5 = v4Var.f9022i;
                            q4 q4Var5 = r4Var5.f8802b;
                            float f18 = r4Var5.f8804e - f13;
                            float f19 = f18 - 1.0f;
                            q4 q4Var6 = r4Var5.f8807i;
                            if (q4Var5 == q4Var6) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            q4 q4Var7 = r4Var5.f8803c;
                            if (q4Var7 == q4Var6) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            q4 q4Var8 = r4Var5.d;
                            float f20 = f18 + 1.0f;
                            if (q4Var8 == q4Var6) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            a5Var2.a(q4Var5, f19, z19, q4Var7, f18, z20, q4Var8, f20, z21);
                        }
                        a5 a5Var3 = v4Var.d;
                        if (a5Var3 != null) {
                            r4 r4Var6 = v4Var.f9024k;
                            q4 q4Var9 = r4Var6.f8802b;
                            float f21 = r4Var6.f8804e - f12;
                            float f22 = f21 - 1.0f;
                            q4 q4Var10 = r4Var6.f8807i;
                            if (q4Var9 == q4Var10) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            q4 q4Var11 = r4Var6.f8803c;
                            if (q4Var11 == q4Var10) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            q4 q4Var12 = r4Var6.d;
                            float f23 = f21 + 1.0f;
                            if (q4Var12 == q4Var10) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            a5Var3.a(q4Var9, f22, z16, q4Var11, f21, z17, q4Var12, f23, z18);
                        }
                        g5Var.g(0, ((u4) v4Var.f9022i.f8803c).f8951c, true);
                        y4 y4Var = g5Var.f8110c;
                        r4 r4Var7 = v4Var.h;
                        q4 q4Var13 = r4Var7.f8802b;
                        t4 t4Var = (t4) q4Var13;
                        float f24 = r4Var7.f8804e - f14;
                        float f25 = f24 - 1.0f;
                        q4 q4Var14 = r4Var7.f8807i;
                        if (q4Var13 == q4Var14) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        q4 q4Var15 = r4Var7.f8803c;
                        t4 t4Var2 = (t4) q4Var15;
                        if (q4Var15 == q4Var14) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        q4 q4Var16 = r4Var7.d;
                        t4 t4Var3 = (t4) q4Var16;
                        float f26 = f24 + 1.0f;
                        if (q4Var16 == q4Var14) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        r4 r4Var8 = v4Var.f9023j;
                        float f27 = r4Var8.f8804e - f11;
                        y4Var.f9211a = t4Var;
                        y4Var.f9212b = t4Var2;
                        y4Var.f9213c = t4Var3;
                        y4Var.d = f25;
                        y4Var.f9214e = f24;
                        y4Var.f9215f = f26;
                        y4Var.h = z13;
                        y4Var.f9216n = z14;
                        y4Var.f9217r = z15;
                        y4Var.f9218s = (s4) r4Var8.f8802b;
                        y4Var.v = (s4) r4Var8.f8803c;
                        y4Var.f9219w = (s4) r4Var8.d;
                        y4Var.f9220x = f27 - 1.0f;
                        y4Var.f9221y = f27;
                        y4Var.A = f27 + 1.0f;
                        y4Var.invalidate();
                        v4Var.f9034u = false;
                        v4Var.b();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                v4 v4Var2 = this.f8712b;
                v4Var2.f9028o = false;
                v4Var2.f9016a.f8110c.c();
                v1 v1Var = v4Var2.f9031r;
                if (v1Var != null) {
                    v1Var.run();
                    return;
                }
                return;
            default:
                v1 v1Var2 = this.f8712b.f9032s;
                if (v1Var2 != null) {
                    v1Var2.run();
                    return;
                }
                return;
        }
    }
}
