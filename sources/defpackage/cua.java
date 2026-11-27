package defpackage;
public final class cua implements Runnable {
    public final byte a;
    public final iua b;

    public cua(iua iuaVar, byte b) {
        this.a = b;
        this.b = iuaVar;
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
        iua iuaVar = this.b;
        switch (b) {
            case 0:
                iuaVar.b();
                return;
            case 1:
                sua suaVar = iuaVar.a;
                if (!iuaVar.u) {
                    iuaVar.v = false;
                    if (iuaVar.o) {
                        boolean z15 = true;
                        iuaVar.u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min(((float) (currentTimeMillis - iuaVar.m)) / 1000.0f, 0.25f);
                        float f = iuaVar.n + min;
                        iuaVar.n = f;
                        eua euaVar = iuaVar.j;
                        if (f > hl.R1(0.1f, 1.0f, iuaVar.t)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        float f2 = euaVar.f(z, min);
                        eua euaVar2 = iuaVar.k;
                        if (iuaVar.n > hl.R1(0.1f, 1.0f, iuaVar.t)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        float f3 = euaVar2.f(z2, min);
                        float f4 = iuaVar.i.f(iuaVar.j.b(0.5f), min);
                        eua euaVar3 = iuaVar.h;
                        if (iuaVar.j.b(0.5f) && iuaVar.i.b(0.5f)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        float f5 = euaVar3.f(z3, min);
                        iuaVar.m = currentTimeMillis;
                        if (iuaVar.j.c() && iuaVar.i.c() && iuaVar.h.c() && !iuaVar.p) {
                            iuaVar.p = true;
                            hl.c3(new cua(iuaVar, (byte) 2));
                        }
                        if (iuaVar.j.c() && iuaVar.i.c() && iuaVar.h.b(0.25f) && !iuaVar.q) {
                            iuaVar.q = true;
                            hl.c3(new cua(iuaVar, (byte) 3));
                        }
                        nua nuaVar = iuaVar.b;
                        if (nuaVar != null) {
                            eua euaVar4 = iuaVar.h;
                            dua duaVar = euaVar4.b;
                            float f6 = euaVar4.e - f5;
                            float f7 = f6 - 1.0f;
                            dua duaVar2 = euaVar4.i;
                            if (duaVar == duaVar2) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            dua duaVar3 = euaVar4.c;
                            if (duaVar3 == duaVar2) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            dua duaVar4 = euaVar4.d;
                            float f8 = f6 + 1.0f;
                            if (duaVar4 == duaVar2) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            nuaVar.a(duaVar, f7, z12, duaVar3, f6, z13, duaVar4, f8, z14);
                        }
                        nua nuaVar2 = iuaVar.c;
                        if (nuaVar2 != null) {
                            eua euaVar5 = iuaVar.i;
                            dua duaVar5 = euaVar5.b;
                            float f9 = euaVar5.e - f4;
                            float f10 = f9 - 1.0f;
                            dua duaVar6 = euaVar5.i;
                            if (duaVar5 == duaVar6) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            dua duaVar7 = euaVar5.c;
                            if (duaVar7 == duaVar6) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            dua duaVar8 = euaVar5.d;
                            float f11 = f9 + 1.0f;
                            if (duaVar8 == duaVar6) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            nuaVar2.a(duaVar5, f10, z9, duaVar7, f9, z10, duaVar8, f11, z11);
                        }
                        nua nuaVar3 = iuaVar.d;
                        if (nuaVar3 != null) {
                            eua euaVar6 = iuaVar.k;
                            dua duaVar9 = euaVar6.b;
                            float f12 = euaVar6.e - f3;
                            float f13 = f12 - 1.0f;
                            dua duaVar10 = euaVar6.i;
                            if (duaVar9 == duaVar10) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            dua duaVar11 = euaVar6.c;
                            if (duaVar11 == duaVar10) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            dua duaVar12 = euaVar6.d;
                            float f14 = f12 + 1.0f;
                            if (duaVar12 == duaVar10) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            nuaVar3.a(duaVar9, f13, z6, duaVar11, f12, z7, duaVar12, f14, z8);
                        }
                        suaVar.g(0, ((hua) iuaVar.i.c).c, true);
                        lua luaVar = suaVar.c;
                        eua euaVar7 = iuaVar.h;
                        dua duaVar13 = euaVar7.b;
                        gua guaVar = (gua) duaVar13;
                        float f15 = euaVar7.e - f5;
                        float f16 = f15 - 1.0f;
                        dua duaVar14 = euaVar7.i;
                        if (duaVar13 == duaVar14) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        dua duaVar15 = euaVar7.c;
                        gua guaVar2 = (gua) duaVar15;
                        if (duaVar15 == duaVar14) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        dua duaVar16 = euaVar7.d;
                        gua guaVar3 = (gua) duaVar16;
                        float f17 = f15 + 1.0f;
                        if (duaVar16 != duaVar14) {
                            z15 = false;
                        }
                        eua euaVar8 = iuaVar.j;
                        float f18 = euaVar8.e - f2;
                        luaVar.a = guaVar;
                        luaVar.b = guaVar2;
                        luaVar.c = guaVar3;
                        luaVar.d = f16;
                        luaVar.e = f15;
                        luaVar.f = f17;
                        luaVar.h = z4;
                        luaVar.n = z5;
                        luaVar.r = z15;
                        luaVar.s = (fua) euaVar8.b;
                        luaVar.w = (fua) euaVar8.c;
                        luaVar.x = (fua) euaVar8.d;
                        luaVar.y = f18 - 1.0f;
                        luaVar.E = f18;
                        luaVar.F = f18 + 1.0f;
                        luaVar.invalidate();
                        iuaVar.u = false;
                        iuaVar.b();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                iuaVar.o = false;
                iuaVar.a.c.c();
                jra jraVar = iuaVar.r;
                if (jraVar != null) {
                    jraVar.run();
                    return;
                }
                return;
            default:
                jra jraVar2 = iuaVar.s;
                if (jraVar2 != null) {
                    jraVar2.run();
                    return;
                }
                return;
        }
    }
}
