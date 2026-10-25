package bi;

import org.telegram.messenger.AndroidUtilities;
public final class h6 implements Runnable {
    public final int f4725a;
    public final o6 f4726b;

    public h6(o6 o6Var, int i10) {
        this.f4725a = i10;
        this.f4726b = o6Var;
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
        switch (this.f4725a) {
            case 0:
                this.f4726b.b();
                return;
            case 1:
                o6 o6Var = this.f4726b;
                b7 b7Var = o6Var.f5178a;
                if (!o6Var.f5195u) {
                    o6Var.v = false;
                    if (o6Var.f5189o) {
                        o6Var.f5195u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min(((float) (currentTimeMillis - o6Var.f5187m)) / 1000.0f, 0.25f);
                        float f7 = o6Var.f5188n + min;
                        o6Var.f5188n = f7;
                        k6 k6Var = o6Var.f5184j;
                        if (f7 > AndroidUtilities.lerp(0.1f, 1.0f, o6Var.f5194t)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f10 = k6Var.f(min, z10);
                        k6 k6Var2 = o6Var.f5185k;
                        if (o6Var.f5188n > AndroidUtilities.lerp(0.1f, 1.0f, o6Var.f5194t)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f11 = k6Var2.f(min, z11);
                        float f12 = o6Var.f5183i.f(min, o6Var.f5184j.b(0.5f));
                        k6 k6Var3 = o6Var.h;
                        if (o6Var.f5184j.b(0.5f) && o6Var.f5183i.b(0.5f)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float f13 = k6Var3.f(min, z12);
                        o6Var.f5187m = currentTimeMillis;
                        if (o6Var.f5184j.c() && o6Var.f5183i.c() && o6Var.h.c() && !o6Var.f5190p) {
                            o6Var.f5190p = true;
                            AndroidUtilities.runOnUIThread(new h6(o6Var, 2));
                        }
                        if (o6Var.f5184j.c() && o6Var.f5183i.c() && o6Var.h.b(0.25f) && !o6Var.f5191q) {
                            o6Var.f5191q = true;
                            AndroidUtilities.runOnUIThread(new h6(o6Var, 3));
                        }
                        t6 t6Var = o6Var.f5179b;
                        if (t6Var != null) {
                            k6 k6Var4 = o6Var.h;
                            j6 j6Var = k6Var4.f4956b;
                            float f14 = k6Var4.e - f13;
                            float f15 = f14 - 1.0f;
                            j6 j6Var2 = k6Var4.f4960i;
                            if (j6Var == j6Var2) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            j6 j6Var3 = k6Var4.f4957c;
                            if (j6Var3 == j6Var2) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            j6 j6Var4 = k6Var4.d;
                            float f16 = f14 + 1.0f;
                            if (j6Var4 == j6Var2) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            t6Var.a(j6Var, f15, z22, j6Var3, f14, z23, j6Var4, f16, z24);
                        }
                        t6 t6Var2 = o6Var.f5180c;
                        if (t6Var2 != null) {
                            k6 k6Var5 = o6Var.f5183i;
                            j6 j6Var5 = k6Var5.f4956b;
                            float f17 = k6Var5.e - f12;
                            float f18 = f17 - 1.0f;
                            j6 j6Var6 = k6Var5.f4960i;
                            if (j6Var5 == j6Var6) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            j6 j6Var7 = k6Var5.f4957c;
                            if (j6Var7 == j6Var6) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            j6 j6Var8 = k6Var5.d;
                            float f19 = f17 + 1.0f;
                            if (j6Var8 == j6Var6) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            t6Var2.a(j6Var5, f18, z19, j6Var7, f17, z20, j6Var8, f19, z21);
                        }
                        t6 t6Var3 = o6Var.d;
                        if (t6Var3 != null) {
                            k6 k6Var6 = o6Var.f5185k;
                            j6 j6Var9 = k6Var6.f4956b;
                            float f20 = k6Var6.e - f11;
                            float f21 = f20 - 1.0f;
                            j6 j6Var10 = k6Var6.f4960i;
                            if (j6Var9 == j6Var10) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            j6 j6Var11 = k6Var6.f4957c;
                            if (j6Var11 == j6Var10) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            j6 j6Var12 = k6Var6.d;
                            float f22 = f20 + 1.0f;
                            if (j6Var12 == j6Var10) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            t6Var3.a(j6Var9, f21, z16, j6Var11, f20, z17, j6Var12, f22, z18);
                        }
                        b7Var.g(0, ((n6) o6Var.f5183i.f4957c).f5131c, true);
                        r6 r6Var = b7Var.f4347c;
                        k6 k6Var7 = o6Var.h;
                        j6 j6Var13 = k6Var7.f4956b;
                        m6 m6Var = (m6) j6Var13;
                        float f23 = k6Var7.e - f13;
                        float f24 = f23 - 1.0f;
                        j6 j6Var14 = k6Var7.f4960i;
                        if (j6Var13 == j6Var14) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        j6 j6Var15 = k6Var7.f4957c;
                        m6 m6Var2 = (m6) j6Var15;
                        if (j6Var15 == j6Var14) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        j6 j6Var16 = k6Var7.d;
                        m6 m6Var3 = (m6) j6Var16;
                        float f25 = f23 + 1.0f;
                        if (j6Var16 == j6Var14) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        k6 k6Var8 = o6Var.f5184j;
                        float f26 = k6Var8.e - f10;
                        r6Var.f5336a = m6Var;
                        r6Var.f5337b = m6Var2;
                        r6Var.f5338c = m6Var3;
                        r6Var.d = f24;
                        r6Var.e = f23;
                        r6Var.f5339f = f25;
                        r6Var.h = z13;
                        r6Var.f5340n = z14;
                        r6Var.f5341r = z15;
                        r6Var.f5342s = (l6) k6Var8.f4956b;
                        r6Var.v = (l6) k6Var8.f4957c;
                        r6Var.f5343w = (l6) k6Var8.d;
                        r6Var.f5344x = f26 - 1.0f;
                        r6Var.f5345y = f26;
                        r6Var.E = f26 + 1.0f;
                        r6Var.invalidate();
                        o6Var.f5195u = false;
                        o6Var.b();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                o6 o6Var2 = this.f4726b;
                o6Var2.f5189o = false;
                o6Var2.f5178a.f4347c.c();
                a2 a2Var = o6Var2.f5192r;
                if (a2Var != null) {
                    a2Var.run();
                    return;
                }
                return;
            default:
                a2 a2Var2 = this.f4726b.f5193s;
                if (a2Var2 != null) {
                    a2Var2.run();
                    return;
                }
                return;
        }
    }
}
