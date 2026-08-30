package lh;

import org.telegram.messenger.AndroidUtilities;
public final class l4 implements Runnable {
    public final int f12749a;
    public final r4 f12750b;

    public l4(r4 r4Var, int i10) {
        this.f12749a = i10;
        this.f12750b = r4Var;
    }

    @Override
    public final void run() {
        boolean z4;
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
        switch (this.f12749a) {
            case 0:
                this.f12750b.b();
                return;
            case 1:
                r4 r4Var = this.f12750b;
                c5 c5Var = r4Var.f13007a;
                if (!r4Var.f13024u) {
                    r4Var.v = false;
                    if (r4Var.f13018o) {
                        r4Var.f13024u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min(((float) (currentTimeMillis - r4Var.f13016m)) / 1000.0f, 0.25f);
                        float f10 = r4Var.f13017n + min;
                        r4Var.f13017n = f10;
                        n4 n4Var = r4Var.f13013j;
                        if (f10 > AndroidUtilities.lerp(0.1f, 1.0f, r4Var.f13023t)) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        float f11 = n4Var.f(min, z4);
                        n4 n4Var2 = r4Var.f13014k;
                        if (r4Var.f13017n > AndroidUtilities.lerp(0.1f, 1.0f, r4Var.f13023t)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f12 = n4Var2.f(min, z10);
                        float f13 = r4Var.f13012i.f(min, r4Var.f13013j.b(0.5f));
                        n4 n4Var3 = r4Var.h;
                        if (r4Var.f13013j.b(0.5f) && r4Var.f13012i.b(0.5f)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f14 = n4Var3.f(min, z11);
                        r4Var.f13016m = currentTimeMillis;
                        if (r4Var.f13013j.c() && r4Var.f13012i.c() && r4Var.h.c() && !r4Var.f13019p) {
                            r4Var.f13019p = true;
                            AndroidUtilities.runOnUIThread(new l4(r4Var, 2));
                        }
                        if (r4Var.f13013j.c() && r4Var.f13012i.c() && r4Var.h.b(0.25f) && !r4Var.f13020q) {
                            r4Var.f13020q = true;
                            AndroidUtilities.runOnUIThread(new l4(r4Var, 3));
                        }
                        w4 w4Var = r4Var.f13008b;
                        if (w4Var != null) {
                            n4 n4Var4 = r4Var.h;
                            m4 m4Var = n4Var4.f12837b;
                            float f15 = n4Var4.e - f14;
                            float f16 = f15 - 1.0f;
                            m4 m4Var2 = n4Var4.f12841i;
                            if (m4Var == m4Var2) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            m4 m4Var3 = n4Var4.f12838c;
                            if (m4Var3 == m4Var2) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            m4 m4Var4 = n4Var4.d;
                            float f17 = f15 + 1.0f;
                            if (m4Var4 == m4Var2) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            w4Var.a(m4Var, f16, z21, m4Var3, f15, z22, m4Var4, f17, z23);
                        }
                        w4 w4Var2 = r4Var.f13009c;
                        if (w4Var2 != null) {
                            n4 n4Var5 = r4Var.f13012i;
                            m4 m4Var5 = n4Var5.f12837b;
                            float f18 = n4Var5.e - f13;
                            float f19 = f18 - 1.0f;
                            m4 m4Var6 = n4Var5.f12841i;
                            if (m4Var5 == m4Var6) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            m4 m4Var7 = n4Var5.f12838c;
                            if (m4Var7 == m4Var6) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            m4 m4Var8 = n4Var5.d;
                            float f20 = f18 + 1.0f;
                            if (m4Var8 == m4Var6) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            w4Var2.a(m4Var5, f19, z18, m4Var7, f18, z19, m4Var8, f20, z20);
                        }
                        w4 w4Var3 = r4Var.d;
                        if (w4Var3 != null) {
                            n4 n4Var6 = r4Var.f13014k;
                            m4 m4Var9 = n4Var6.f12837b;
                            float f21 = n4Var6.e - f12;
                            float f22 = f21 - 1.0f;
                            m4 m4Var10 = n4Var6.f12841i;
                            if (m4Var9 == m4Var10) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            m4 m4Var11 = n4Var6.f12838c;
                            if (m4Var11 == m4Var10) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            m4 m4Var12 = n4Var6.d;
                            float f23 = f21 + 1.0f;
                            if (m4Var12 == m4Var10) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            w4Var3.a(m4Var9, f22, z15, m4Var11, f21, z16, m4Var12, f23, z17);
                        }
                        c5Var.g(0, ((q4) r4Var.f13012i.f12838c).f12979c, true);
                        u4 u4Var = c5Var.f12217c;
                        n4 n4Var7 = r4Var.h;
                        m4 m4Var13 = n4Var7.f12837b;
                        p4 p4Var = (p4) m4Var13;
                        float f24 = n4Var7.e - f14;
                        float f25 = f24 - 1.0f;
                        m4 m4Var14 = n4Var7.f12841i;
                        if (m4Var13 == m4Var14) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        m4 m4Var15 = n4Var7.f12838c;
                        p4 p4Var2 = (p4) m4Var15;
                        if (m4Var15 == m4Var14) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        m4 m4Var16 = n4Var7.d;
                        p4 p4Var3 = (p4) m4Var16;
                        float f26 = f24 + 1.0f;
                        if (m4Var16 == m4Var14) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        n4 n4Var8 = r4Var.f13013j;
                        float f27 = n4Var8.e - f11;
                        u4Var.f13199a = p4Var;
                        u4Var.f13200b = p4Var2;
                        u4Var.f13201c = p4Var3;
                        u4Var.d = f25;
                        u4Var.e = f24;
                        u4Var.f13202f = f26;
                        u4Var.h = z12;
                        u4Var.f13203n = z13;
                        u4Var.f13204r = z14;
                        u4Var.f13205s = (o4) n4Var8.f12837b;
                        u4Var.v = (o4) n4Var8.f12838c;
                        u4Var.f13206w = (o4) n4Var8.d;
                        u4Var.f13207x = f27 - 1.0f;
                        u4Var.f13208y = f27;
                        u4Var.B = f27 + 1.0f;
                        u4Var.invalidate();
                        r4Var.f13024u = false;
                        r4Var.b();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                r4 r4Var2 = this.f12750b;
                r4Var2.f13018o = false;
                r4Var2.f13007a.f12217c.c();
                t1 t1Var = r4Var2.f13021r;
                if (t1Var != null) {
                    t1Var.run();
                    return;
                }
                return;
            default:
                t1 t1Var2 = this.f12750b.f13022s;
                if (t1Var2 != null) {
                    t1Var2.run();
                    return;
                }
                return;
        }
    }
}
