package defpackage;
public final class bqa implements Runnable {
    public final byte a;
    public final hqa b;

    public bqa(hqa hqaVar, byte b) {
        this.a = b;
        this.b = hqaVar;
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
        hqa hqaVar = this.b;
        switch (b) {
            case 0:
                hqaVar.b();
                return;
            case 1:
                rqa rqaVar = hqaVar.a;
                if (!hqaVar.u) {
                    hqaVar.v = false;
                    if (hqaVar.o) {
                        boolean z15 = true;
                        hqaVar.u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min(((float) (currentTimeMillis - hqaVar.m)) / 1000.0f, 0.25f);
                        float f = hqaVar.n + min;
                        hqaVar.n = f;
                        dqa dqaVar = hqaVar.j;
                        if (f > gl.R1(0.1f, 1.0f, hqaVar.t)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        float f2 = dqaVar.f(z, min);
                        dqa dqaVar2 = hqaVar.k;
                        if (hqaVar.n > gl.R1(0.1f, 1.0f, hqaVar.t)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        float f3 = dqaVar2.f(z2, min);
                        float f4 = hqaVar.i.f(hqaVar.j.b(0.5f), min);
                        dqa dqaVar3 = hqaVar.h;
                        if (hqaVar.j.b(0.5f) && hqaVar.i.b(0.5f)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        float f5 = dqaVar3.f(z3, min);
                        hqaVar.m = currentTimeMillis;
                        if (hqaVar.j.c() && hqaVar.i.c() && hqaVar.h.c() && !hqaVar.p) {
                            hqaVar.p = true;
                            gl.c3(new bqa(hqaVar, (byte) 2));
                        }
                        if (hqaVar.j.c() && hqaVar.i.c() && hqaVar.h.b(0.25f) && !hqaVar.q) {
                            hqaVar.q = true;
                            gl.c3(new bqa(hqaVar, (byte) 3));
                        }
                        mqa mqaVar = hqaVar.b;
                        if (mqaVar != null) {
                            dqa dqaVar4 = hqaVar.h;
                            cqa cqaVar = dqaVar4.b;
                            float f6 = dqaVar4.e - f5;
                            float f7 = f6 - 1.0f;
                            cqa cqaVar2 = dqaVar4.i;
                            if (cqaVar == cqaVar2) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            cqa cqaVar3 = dqaVar4.c;
                            if (cqaVar3 == cqaVar2) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            cqa cqaVar4 = dqaVar4.d;
                            float f8 = f6 + 1.0f;
                            if (cqaVar4 == cqaVar2) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            mqaVar.a(cqaVar, f7, z12, cqaVar3, f6, z13, cqaVar4, f8, z14);
                        }
                        mqa mqaVar2 = hqaVar.c;
                        if (mqaVar2 != null) {
                            dqa dqaVar5 = hqaVar.i;
                            cqa cqaVar5 = dqaVar5.b;
                            float f9 = dqaVar5.e - f4;
                            float f10 = f9 - 1.0f;
                            cqa cqaVar6 = dqaVar5.i;
                            if (cqaVar5 == cqaVar6) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            cqa cqaVar7 = dqaVar5.c;
                            if (cqaVar7 == cqaVar6) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            cqa cqaVar8 = dqaVar5.d;
                            float f11 = f9 + 1.0f;
                            if (cqaVar8 == cqaVar6) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            mqaVar2.a(cqaVar5, f10, z9, cqaVar7, f9, z10, cqaVar8, f11, z11);
                        }
                        mqa mqaVar3 = hqaVar.d;
                        if (mqaVar3 != null) {
                            dqa dqaVar6 = hqaVar.k;
                            cqa cqaVar9 = dqaVar6.b;
                            float f12 = dqaVar6.e - f3;
                            float f13 = f12 - 1.0f;
                            cqa cqaVar10 = dqaVar6.i;
                            if (cqaVar9 == cqaVar10) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            cqa cqaVar11 = dqaVar6.c;
                            if (cqaVar11 == cqaVar10) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            cqa cqaVar12 = dqaVar6.d;
                            float f14 = f12 + 1.0f;
                            if (cqaVar12 == cqaVar10) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            mqaVar3.a(cqaVar9, f13, z6, cqaVar11, f12, z7, cqaVar12, f14, z8);
                        }
                        rqaVar.g(0, ((gqa) hqaVar.i.c).c, true);
                        kqa kqaVar = rqaVar.c;
                        dqa dqaVar7 = hqaVar.h;
                        cqa cqaVar13 = dqaVar7.b;
                        fqa fqaVar = (fqa) cqaVar13;
                        float f15 = dqaVar7.e - f5;
                        float f16 = f15 - 1.0f;
                        cqa cqaVar14 = dqaVar7.i;
                        if (cqaVar13 == cqaVar14) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        cqa cqaVar15 = dqaVar7.c;
                        fqa fqaVar2 = (fqa) cqaVar15;
                        if (cqaVar15 == cqaVar14) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        cqa cqaVar16 = dqaVar7.d;
                        fqa fqaVar3 = (fqa) cqaVar16;
                        float f17 = f15 + 1.0f;
                        if (cqaVar16 != cqaVar14) {
                            z15 = false;
                        }
                        dqa dqaVar8 = hqaVar.j;
                        float f18 = dqaVar8.e - f2;
                        kqaVar.a = fqaVar;
                        kqaVar.b = fqaVar2;
                        kqaVar.c = fqaVar3;
                        kqaVar.d = f16;
                        kqaVar.e = f15;
                        kqaVar.f = f17;
                        kqaVar.h = z4;
                        kqaVar.n = z5;
                        kqaVar.r = z15;
                        kqaVar.s = (eqa) dqaVar8.b;
                        kqaVar.w = (eqa) dqaVar8.c;
                        kqaVar.x = (eqa) dqaVar8.d;
                        kqaVar.y = f18 - 1.0f;
                        kqaVar.E = f18;
                        kqaVar.F = f18 + 1.0f;
                        kqaVar.invalidate();
                        hqaVar.u = false;
                        hqaVar.b();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                hqaVar.o = false;
                hqaVar.a.c.c();
                nna nnaVar = hqaVar.r;
                if (nnaVar != null) {
                    nnaVar.run();
                    return;
                }
                return;
            default:
                nna nnaVar2 = hqaVar.s;
                if (nnaVar2 != null) {
                    nnaVar2.run();
                    return;
                }
                return;
        }
    }
}
