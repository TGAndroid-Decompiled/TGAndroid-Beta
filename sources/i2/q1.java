package i2;

import v7.u6;
public final class q1 {
    public final b f12537a;
    public final int f12538b;
    public final b f12539c;
    public int d = 0;
    public boolean e = false;
    public boolean f12540f = false;

    public q1(b bVar, b bVar2, int i10) {
        this.f12537a = bVar;
        this.f12538b = i10;
        this.f12539c = bVar2;
    }

    public static void b(b bVar) {
        boolean z10;
        int i10 = bVar.f12315n;
        if (i10 == 2) {
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
            bVar.f12315n = 1;
            bVar.t();
        }
    }

    public static boolean h(b bVar) {
        if (bVar.f12315n != 0) {
            return true;
        }
        return false;
    }

    public static void l(b bVar, long j10) {
        bVar.f12320y = true;
        if (bVar instanceof w2.e) {
            w2.e eVar = (w2.e) bVar;
            u6.p(eVar.f12320y);
            eVar.f48468a0 = j10;
        }
    }

    public final void a(b bVar, k kVar) {
        boolean z10;
        boolean z11 = true;
        if (this.f12537a != bVar && this.f12539c != bVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        if (!h(bVar)) {
            return;
        }
        if (bVar == kVar.f12468c) {
            kVar.d = null;
            kVar.f12468c = null;
            kVar.e = true;
        }
        b(bVar);
        if (bVar.f12315n != 1) {
            z11 = false;
        }
        u6.p(z11);
        bVar.f12313c.A();
        bVar.f12315n = 0;
        bVar.f12316r = null;
        bVar.f12317s = null;
        bVar.f12320y = false;
        bVar.n();
        bVar.G = null;
    }

    public final int c() {
        int i10;
        boolean h = h(this.f12537a);
        b bVar = this.f12539c;
        if (bVar != null && h(bVar)) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return (h ? 1 : 0) + i10;
    }

    public final b d(x0 x0Var) {
        u2.e1 e1Var;
        if (x0Var != null && (e1Var = x0Var.f12605c[this.f12538b]) != null) {
            b bVar = this.f12537a;
            if (bVar.f12316r == e1Var) {
                return bVar;
            }
            b bVar2 = this.f12539c;
            if (bVar2 != null && bVar2.f12316r == e1Var) {
                return bVar2;
            }
        }
        return null;
    }

    public final boolean e(i2.x0 r8, i2.b r9) {
        throw new UnsupportedOperationException("Method not decompiled: i2.q1.e(i2.x0, i2.b):boolean");
    }

    public final boolean f() {
        int i10 = this.d;
        if (i10 != 2 && i10 != 4 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        int i10 = this.d;
        if (i10 != 0 && i10 != 2 && i10 != 4) {
            b bVar = this.f12539c;
            bVar.getClass();
            if (bVar.f12315n != 0) {
                return true;
            }
            return false;
        }
        return h(this.f12537a);
    }

    public final void i(boolean z10) {
        boolean z11 = true;
        if (z10) {
            if (this.e) {
                b bVar = this.f12537a;
                if (bVar.f12315n != 0) {
                    z11 = false;
                }
                u6.p(z11);
                bVar.f12313c.A();
                bVar.r();
                this.e = false;
            }
        } else if (this.f12540f) {
            b bVar2 = this.f12539c;
            bVar2.getClass();
            if (bVar2.f12315n != 0) {
                z11 = false;
            }
            u6.p(z11);
            bVar2.f12313c.A();
            bVar2.r();
            this.f12540f = false;
        }
    }

    public final int j(b bVar, x0 x0Var, x2.t tVar, k kVar) {
        b bVar2;
        Object[] objArr;
        int i10;
        int i11;
        if (bVar == null || bVar.f12315n == 0 || (bVar == (bVar2 = this.f12537a) && ((i11 = this.d) == 2 || i11 == 4))) {
            return 1;
        }
        if (bVar == this.f12539c && this.d == 3) {
            return 1;
        }
        u2.e1 e1Var = bVar.f12316r;
        u2.e1[] e1VarArr = x0Var.f12605c;
        int i12 = this.f12538b;
        boolean z10 = false;
        if (e1Var != e1VarArr[i12]) {
            objArr = 1;
        } else {
            objArr = null;
        }
        boolean b10 = tVar.b(i12);
        if (!b10 || objArr != null) {
            if (!bVar.f12320y) {
                x2.p pVar = tVar.f49186c[i12];
                if (pVar != null) {
                    i10 = pVar.length();
                } else {
                    i10 = 0;
                }
                b2.w[] wVarArr = new b2.w[i10];
                for (int i13 = 0; i13 < i10; i13++) {
                    pVar.getClass();
                    wVarArr[i13] = pVar.f(i13);
                }
                u2.e1 e1Var2 = x0Var.f12605c[i12];
                e1Var2.getClass();
                bVar.y(wVarArr, e1Var2, x0Var.e(), x0Var.f12615p, x0Var.f12607g.f12618a);
                return 3;
            } else if (!bVar.l()) {
                return 0;
            } else {
                a(bVar, kVar);
                if (!b10 || f()) {
                    if (bVar == bVar2) {
                        z10 = true;
                    }
                    i(z10);
                    return 1;
                }
            }
        }
        return 1;
    }

    public final void k() {
        if (!h(this.f12537a)) {
            i(true);
        }
        b bVar = this.f12539c;
        if (bVar == null || bVar.f12315n != 0) {
            return;
        }
        i(false);
    }

    public final void m() {
        int i10;
        b bVar = this.f12537a;
        int i11 = bVar.f12315n;
        boolean z10 = false;
        if (i11 == 1 && this.d != 4) {
            if (i11 == 1) {
                z10 = true;
            }
            u6.p(z10);
            bVar.f12315n = 2;
            bVar.s();
            return;
        }
        b bVar2 = this.f12539c;
        if (bVar2 != null && (i10 = bVar2.f12315n) == 1 && this.d != 3) {
            if (i10 == 1) {
                z10 = true;
            }
            u6.p(z10);
            bVar2.f12315n = 2;
            bVar2.s();
        }
    }
}
