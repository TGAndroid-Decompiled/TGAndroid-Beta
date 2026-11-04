package k2;

import b8.zb;
public final class r1 {
    public final b f16721a;
    public final int f16722b;
    public final b f16723c;
    public int d = 0;
    public boolean f16724e = false;
    public boolean f16725f = false;

    public r1(b bVar, b bVar2, int i3) {
        this.f16721a = bVar;
        this.f16722b = i3;
        this.f16723c = bVar2;
    }

    public static void b(b bVar) {
        boolean z10;
        int i3 = bVar.f16448n;
        if (i3 == 2) {
            if (i3 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            zb.p(z10);
            bVar.f16448n = 1;
            bVar.t();
        }
    }

    public static boolean h(b bVar) {
        if (bVar.f16448n != 0) {
            return true;
        }
        return false;
    }

    public static void l(b bVar, long j10) {
        bVar.E = true;
        if (bVar instanceof y2.e) {
            y2.e eVar = (y2.e) bVar;
            zb.p(eVar.E);
            eVar.f58901b0 = j10;
        }
    }

    public final void a(b bVar, i iVar) {
        boolean z10;
        boolean z11 = true;
        if (this.f16721a != bVar && this.f16723c != bVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        zb.p(z10);
        if (!h(bVar)) {
            return;
        }
        if (bVar == iVar.f16537c) {
            iVar.d = null;
            iVar.f16537c = null;
            iVar.f16538e = true;
        }
        b(bVar);
        if (bVar.f16448n != 1) {
            z11 = false;
        }
        zb.p(z11);
        bVar.f16445c.q();
        bVar.f16448n = 0;
        bVar.f16449r = null;
        bVar.f16450s = null;
        bVar.E = false;
        bVar.n();
        bVar.H = null;
    }

    public final int c() {
        int i3;
        boolean h = h(this.f16721a);
        b bVar = this.f16723c;
        if (bVar != null && h(bVar)) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        return (h ? 1 : 0) + i3;
    }

    public final b d(x0 x0Var) {
        w2.d1 d1Var;
        if (x0Var != null && (d1Var = x0Var.f16762c[this.f16722b]) != null) {
            b bVar = this.f16721a;
            if (bVar.f16449r == d1Var) {
                return bVar;
            }
            b bVar2 = this.f16723c;
            if (bVar2 != null && bVar2.f16449r == d1Var) {
                return bVar2;
            }
        }
        return null;
    }

    public final boolean e(k2.x0 r8, k2.b r9) {
        throw new UnsupportedOperationException("Method not decompiled: k2.r1.e(k2.x0, k2.b):boolean");
    }

    public final boolean f() {
        int i3 = this.d;
        if (i3 != 2 && i3 != 4 && i3 != 3) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        int i3 = this.d;
        if (i3 != 0 && i3 != 2 && i3 != 4) {
            b bVar = this.f16723c;
            bVar.getClass();
            if (bVar.f16448n != 0) {
                return true;
            }
            return false;
        }
        return h(this.f16721a);
    }

    public final void i(boolean z10) {
        boolean z11 = true;
        if (z10) {
            if (this.f16724e) {
                b bVar = this.f16721a;
                if (bVar.f16448n != 0) {
                    z11 = false;
                }
                zb.p(z11);
                bVar.f16445c.q();
                bVar.r();
                this.f16724e = false;
            }
        } else if (this.f16725f) {
            b bVar2 = this.f16723c;
            bVar2.getClass();
            if (bVar2.f16448n != 0) {
                z11 = false;
            }
            zb.p(z11);
            bVar2.f16445c.q();
            bVar2.r();
            this.f16725f = false;
        }
    }

    public final int j(b bVar, x0 x0Var, z2.t tVar, i iVar) {
        b bVar2;
        Object[] objArr;
        int i3;
        int i10;
        if (bVar == null || bVar.f16448n == 0 || (bVar == (bVar2 = this.f16721a) && ((i10 = this.d) == 2 || i10 == 4))) {
            return 1;
        }
        if (bVar == this.f16723c && this.d == 3) {
            return 1;
        }
        w2.d1 d1Var = bVar.f16449r;
        w2.d1[] d1VarArr = x0Var.f16762c;
        int i11 = this.f16722b;
        boolean z10 = false;
        if (d1Var != d1VarArr[i11]) {
            objArr = 1;
        } else {
            objArr = null;
        }
        boolean b10 = tVar.b(i11);
        if (!b10 || objArr != null) {
            if (!bVar.E) {
                z2.p pVar = tVar.f59648c[i11];
                if (pVar != null) {
                    i3 = pVar.length();
                } else {
                    i3 = 0;
                }
                d2.v[] vVarArr = new d2.v[i3];
                for (int i12 = 0; i12 < i3; i12++) {
                    pVar.getClass();
                    vVarArr[i12] = pVar.g(i12);
                }
                w2.d1 d1Var2 = x0Var.f16762c[i11];
                d1Var2.getClass();
                bVar.y(vVarArr, d1Var2, x0Var.e(), x0Var.f16773p, x0Var.f16765g.f16777a);
                return 3;
            } else if (!bVar.l()) {
                return 0;
            } else {
                a(bVar, iVar);
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
        if (!h(this.f16721a)) {
            i(true);
        }
        b bVar = this.f16723c;
        if (bVar == null || bVar.f16448n != 0) {
            return;
        }
        i(false);
    }

    public final void m() {
        int i3;
        b bVar = this.f16721a;
        int i10 = bVar.f16448n;
        boolean z10 = false;
        if (i10 == 1 && this.d != 4) {
            if (i10 == 1) {
                z10 = true;
            }
            zb.p(z10);
            bVar.f16448n = 2;
            bVar.s();
            return;
        }
        b bVar2 = this.f16723c;
        if (bVar2 != null && (i3 = bVar2.f16448n) == 1 && this.d != 3) {
            if (i3 == 1) {
                z10 = true;
            }
            zb.p(z10);
            bVar2.f16448n = 2;
            bVar2.s();
        }
    }
}
