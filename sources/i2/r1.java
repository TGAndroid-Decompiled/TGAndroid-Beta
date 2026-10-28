package i2;

import a8.yb;
public final class r1 {
    public final b f13721a;
    public final int f13722b;
    public final b f13723c;
    public int d = 0;
    public boolean e = false;
    public boolean f13724f = false;

    public r1(b bVar, b bVar2, int i10) {
        this.f13721a = bVar;
        this.f13722b = i10;
        this.f13723c = bVar2;
    }

    public static void b(b bVar) {
        boolean z10;
        int i10 = bVar.f13493n;
        if (i10 == 2) {
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            yb.p(z10);
            bVar.f13493n = 1;
            bVar.t();
        }
    }

    public static boolean h(b bVar) {
        if (bVar.f13493n != 0) {
            return true;
        }
        return false;
    }

    public static void l(b bVar, long j10) {
        bVar.f13498y = true;
        if (bVar instanceof w2.e) {
            w2.e eVar = (w2.e) bVar;
            yb.p(eVar.f13498y);
            eVar.f50714a0 = j10;
        }
    }

    public final void a(b bVar, j jVar) {
        boolean z10;
        boolean z11 = true;
        if (this.f13721a != bVar && this.f13723c != bVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        yb.p(z10);
        if (!h(bVar)) {
            return;
        }
        if (bVar == jVar.f13580c) {
            jVar.d = null;
            jVar.f13580c = null;
            jVar.e = true;
        }
        b(bVar);
        if (bVar.f13493n != 1) {
            z11 = false;
        }
        yb.p(z11);
        bVar.f13491c.d();
        bVar.f13493n = 0;
        bVar.f13494r = null;
        bVar.f13495s = null;
        bVar.f13498y = false;
        bVar.n();
        bVar.G = null;
    }

    public final int c() {
        int i10;
        boolean h = h(this.f13721a);
        b bVar = this.f13723c;
        if (bVar != null && h(bVar)) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return (h ? 1 : 0) + i10;
    }

    public final b d(y0 y0Var) {
        u2.d1 d1Var;
        if (y0Var != null && (d1Var = y0Var.f13791c[this.f13722b]) != null) {
            b bVar = this.f13721a;
            if (bVar.f13494r == d1Var) {
                return bVar;
            }
            b bVar2 = this.f13723c;
            if (bVar2 != null && bVar2.f13494r == d1Var) {
                return bVar2;
            }
        }
        return null;
    }

    public final boolean e(i2.y0 r8, i2.b r9) {
        throw new UnsupportedOperationException("Method not decompiled: i2.r1.e(i2.y0, i2.b):boolean");
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
            b bVar = this.f13723c;
            bVar.getClass();
            if (bVar.f13493n != 0) {
                return true;
            }
            return false;
        }
        return h(this.f13721a);
    }

    public final void i(boolean z10) {
        boolean z11 = true;
        if (z10) {
            if (this.e) {
                b bVar = this.f13721a;
                if (bVar.f13493n != 0) {
                    z11 = false;
                }
                yb.p(z11);
                bVar.f13491c.d();
                bVar.r();
                this.e = false;
            }
        } else if (this.f13724f) {
            b bVar2 = this.f13723c;
            bVar2.getClass();
            if (bVar2.f13493n != 0) {
                z11 = false;
            }
            yb.p(z11);
            bVar2.f13491c.d();
            bVar2.r();
            this.f13724f = false;
        }
    }

    public final int j(b bVar, y0 y0Var, x2.u uVar, j jVar) {
        b bVar2;
        Object[] objArr;
        int i10;
        int i11;
        if (bVar == null || bVar.f13493n == 0 || (bVar == (bVar2 = this.f13721a) && ((i11 = this.d) == 2 || i11 == 4))) {
            return 1;
        }
        if (bVar == this.f13723c && this.d == 3) {
            return 1;
        }
        u2.d1 d1Var = bVar.f13494r;
        u2.d1[] d1VarArr = y0Var.f13791c;
        int i12 = this.f13722b;
        boolean z10 = false;
        if (d1Var != d1VarArr[i12]) {
            objArr = 1;
        } else {
            objArr = null;
        }
        boolean b10 = uVar.b(i12);
        if (!b10 || objArr != null) {
            if (!bVar.f13498y) {
                x2.q qVar = uVar.f51421c[i12];
                if (qVar != null) {
                    i10 = qVar.length();
                } else {
                    i10 = 0;
                }
                b2.x[] xVarArr = new b2.x[i10];
                for (int i13 = 0; i13 < i10; i13++) {
                    qVar.getClass();
                    xVarArr[i13] = qVar.f(i13);
                }
                u2.d1 d1Var2 = y0Var.f13791c[i12];
                d1Var2.getClass();
                bVar.y(xVarArr, d1Var2, y0Var.e(), y0Var.f13801p, y0Var.f13793g.f13805a);
                return 3;
            } else if (!bVar.l()) {
                return 0;
            } else {
                a(bVar, jVar);
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
        if (!h(this.f13721a)) {
            i(true);
        }
        b bVar = this.f13723c;
        if (bVar == null || bVar.f13493n != 0) {
            return;
        }
        i(false);
    }

    public final void m() {
        int i10;
        b bVar = this.f13721a;
        int i11 = bVar.f13493n;
        boolean z10 = false;
        if (i11 == 1 && this.d != 4) {
            if (i11 == 1) {
                z10 = true;
            }
            yb.p(z10);
            bVar.f13493n = 2;
            bVar.s();
            return;
        }
        b bVar2 = this.f13723c;
        if (bVar2 != null && (i10 = bVar2.f13493n) == 1 && this.d != 3) {
            if (i10 == 1) {
                z10 = true;
            }
            yb.p(z10);
            bVar2.f13493n = 2;
            bVar2.s();
        }
    }
}
