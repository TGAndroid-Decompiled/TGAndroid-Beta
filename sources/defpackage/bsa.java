package defpackage;
public final class bsa implements Runnable {
    public final byte a;
    public final hsa b;

    public bsa(hsa hsaVar, byte b) {
        this.a = b;
        this.b = hsaVar;
    }

    @Override
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        byte b = this.a;
        hsa hsaVar = this.b;
        switch (b) {
            case 0:
                hsaVar.b();
                return;
            case 1:
                ssa ssaVar = hsaVar.a;
                if (!hsaVar.u) {
                    hsaVar.v = false;
                    if (hsaVar.o) {
                        boolean z15 = true;
                        hsaVar.u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min(((float) (currentTimeMillis - hsaVar.m)) / 1000.0f, 0.25f);
                        float f = hsaVar.n + min;
                        hsaVar.n = f;
                        dsa dsaVar = hsaVar.j;
                        if (f > gm.R1(0.1f, 1.0f, hsaVar.t)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        float f2 = dsaVar.f(z, min);
                        dsa dsaVar2 = hsaVar.k;
                        if (hsaVar.n > gm.R1(0.1f, 1.0f, hsaVar.t)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        float f3 = dsaVar2.f(z2, min);
                        float f4 = hsaVar.i.f(hsaVar.j.b(0.5f), min);
                        dsa dsaVar3 = hsaVar.h;
                        if (hsaVar.j.b(0.5f) && hsaVar.i.b(0.5f)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        float f5 = dsaVar3.f(z3, min);
                        hsaVar.m = currentTimeMillis;
                        if (hsaVar.j.c() && hsaVar.i.c() && hsaVar.h.c() && !hsaVar.p) {
                            hsaVar.p = true;
                            gm.c3(new bsa(hsaVar, (byte) 2));
                        }
                        if (hsaVar.j.c() && hsaVar.i.c() && hsaVar.h.b(0.25f) && !hsaVar.q) {
                            hsaVar.q = true;
                            gm.c3(new bsa(hsaVar, (byte) 3));
                        }
                        msa msaVar = hsaVar.b;
                        if (msaVar != null) {
                            dsa dsaVar4 = hsaVar.h;
                            csa csaVar = dsaVar4.b;
                            float f6 = dsaVar4.e - f5;
                            float f7 = f6 - 1.0f;
                            csa csaVar2 = dsaVar4.i;
                            if (csaVar == csaVar2) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            csa csaVar3 = dsaVar4.c;
                            if (csaVar3 == csaVar2) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            csa csaVar4 = dsaVar4.d;
                            float f8 = f6 + 1.0f;
                            if (csaVar4 == csaVar2) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            msaVar.a(csaVar, f7, z12, csaVar3, f6, z13, csaVar4, f8, z14);
                        }
                        msa msaVar2 = hsaVar.c;
                        if (msaVar2 != null) {
                            dsa dsaVar5 = hsaVar.i;
                            csa csaVar5 = dsaVar5.b;
                            float f9 = dsaVar5.e - f4;
                            float f10 = f9 - 1.0f;
                            csa csaVar6 = dsaVar5.i;
                            if (csaVar5 == csaVar6) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            csa csaVar7 = dsaVar5.c;
                            if (csaVar7 == csaVar6) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            csa csaVar8 = dsaVar5.d;
                            float f11 = f9 + 1.0f;
                            if (csaVar8 == csaVar6) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            msaVar2.a(csaVar5, f10, z9, csaVar7, f9, z10, csaVar8, f11, z11);
                        }
                        msa msaVar3 = hsaVar.d;
                        if (msaVar3 != null) {
                            dsa dsaVar6 = hsaVar.k;
                            csa csaVar9 = dsaVar6.b;
                            float f12 = dsaVar6.e - f3;
                            float f13 = f12 - 1.0f;
                            csa csaVar10 = dsaVar6.i;
                            if (csaVar9 == csaVar10) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            csa csaVar11 = dsaVar6.c;
                            if (csaVar11 == csaVar10) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            csa csaVar12 = dsaVar6.d;
                            float f14 = f12 + 1.0f;
                            if (csaVar12 == csaVar10) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            msaVar3.a(csaVar9, f13, z6, csaVar11, f12, z7, csaVar12, f14, z8);
                        }
                        ssaVar.g(0, ((gsa) hsaVar.i.c).c, true);
                        ksa ksaVar = ssaVar.c;
                        dsa dsaVar7 = hsaVar.h;
                        csa csaVar13 = dsaVar7.b;
                        fsa fsaVar = (fsa) csaVar13;
                        float f15 = dsaVar7.e - f5;
                        float f16 = f15 - 1.0f;
                        csa csaVar14 = dsaVar7.i;
                        if (csaVar13 == csaVar14) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        csa csaVar15 = dsaVar7.c;
                        fsa fsaVar2 = (fsa) csaVar15;
                        if (csaVar15 == csaVar14) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        csa csaVar16 = dsaVar7.d;
                        fsa fsaVar3 = (fsa) csaVar16;
                        float f17 = f15 + 1.0f;
                        if (csaVar16 != csaVar14) {
                            z15 = false;
                        }
                        dsa dsaVar8 = hsaVar.j;
                        float f18 = dsaVar8.e - f2;
                        ksaVar.a = fsaVar;
                        ksaVar.b = fsaVar2;
                        ksaVar.c = fsaVar3;
                        ksaVar.d = f16;
                        ksaVar.e = f15;
                        ksaVar.f = f17;
                        ksaVar.h = z4;
                        ksaVar.n = z5;
                        ksaVar.r = z15;
                        ksaVar.s = (esa) dsaVar8.b;
                        ksaVar.w = (esa) dsaVar8.c;
                        ksaVar.x = (esa) dsaVar8.d;
                        ksaVar.y = f18 - 1.0f;
                        ksaVar.E = f18;
                        ksaVar.F = f18 + 1.0f;
                        ksaVar.invalidate();
                        hsaVar.u = false;
                        hsaVar.b();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                hsaVar.o = false;
                hsaVar.a.c.c();
                npa npaVar = hsaVar.r;
                if (npaVar != null) {
                    npaVar.run();
                    return;
                }
                return;
            default:
                npa npaVar2 = hsaVar.s;
                if (npaVar2 != null) {
                    npaVar2.run();
                    return;
                }
                return;
        }
    }
}
