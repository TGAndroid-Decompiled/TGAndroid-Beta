package i2;

import v7.u6;
public final class r1 {
    public final b f11184a;
    public final int f11185b;
    public final b f11186c;
    public int d = 0;
    public boolean e = false;
    public boolean f11187f = false;

    public r1(b bVar, b bVar2, int i10) {
        this.f11184a = bVar;
        this.f11185b = i10;
        this.f11186c = bVar2;
    }

    public static void b(b bVar) {
        boolean z10;
        int i10 = bVar.f10923n;
        if (i10 == 2) {
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
            bVar.f10923n = 1;
            bVar.t();
        }
    }

    public static boolean h(b bVar) {
        if (bVar.f10923n != 0) {
            return true;
        }
        return false;
    }

    public static void l(b bVar, long j10) {
        bVar.f10928y = true;
        if (bVar instanceof w2.e) {
            w2.e eVar = (w2.e) bVar;
            u6.p(eVar.f10928y);
            eVar.f47076a0 = j10;
        }
    }

    public final void a(b bVar, j jVar) {
        boolean z10;
        boolean z11 = true;
        if (this.f11184a != bVar && this.f11186c != bVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        if (!h(bVar)) {
            return;
        }
        if (bVar == jVar.f11051c) {
            jVar.d = null;
            jVar.f11051c = null;
            jVar.e = true;
        }
        b(bVar);
        if (bVar.f10923n != 1) {
            z11 = false;
        }
        u6.p(z11);
        bVar.f10921c.x();
        bVar.f10923n = 0;
        bVar.f10924r = null;
        bVar.f10925s = null;
        bVar.f10928y = false;
        bVar.n();
        bVar.G = null;
    }

    public final int c() {
        int i10;
        boolean h = h(this.f11184a);
        b bVar = this.f11186c;
        if (bVar != null && h(bVar)) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return (h ? 1 : 0) + i10;
    }

    public final b d(x0 x0Var) {
        u2.d1 d1Var;
        if (x0Var != null && (d1Var = x0Var.f11219c[this.f11185b]) != null) {
            b bVar = this.f11184a;
            if (bVar.f10924r == d1Var) {
                return bVar;
            }
            b bVar2 = this.f11186c;
            if (bVar2 != null && bVar2.f10924r == d1Var) {
                return bVar2;
            }
        }
        return null;
    }

    public final boolean e(i2.x0 r8, i2.b r9) {
        throw new UnsupportedOperationException("Method not decompiled: i2.r1.e(i2.x0, i2.b):boolean");
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
            b bVar = this.f11186c;
            bVar.getClass();
            if (bVar.f10923n != 0) {
                return true;
            }
            return false;
        }
        return h(this.f11184a);
    }

    public final void i(boolean z10) {
        boolean z11 = true;
        if (z10) {
            if (this.e) {
                b bVar = this.f11184a;
                if (bVar.f10923n != 0) {
                    z11 = false;
                }
                u6.p(z11);
                bVar.f10921c.x();
                bVar.r();
                this.e = false;
            }
        } else if (this.f11187f) {
            b bVar2 = this.f11186c;
            bVar2.getClass();
            if (bVar2.f10923n != 0) {
                z11 = false;
            }
            u6.p(z11);
            bVar2.f10921c.x();
            bVar2.r();
            this.f11187f = false;
        }
    }

    public final int j(b bVar, x0 x0Var, x2.t tVar, j jVar) {
        b bVar2;
        Object[] objArr;
        int i10;
        int i11;
        if (bVar == null || bVar.f10923n == 0 || (bVar == (bVar2 = this.f11184a) && ((i11 = this.d) == 2 || i11 == 4))) {
            return 1;
        }
        if (bVar == this.f11186c && this.d == 3) {
            return 1;
        }
        u2.d1 d1Var = bVar.f10924r;
        u2.d1[] d1VarArr = x0Var.f11219c;
        int i12 = this.f11185b;
        boolean z10 = false;
        if (d1Var != d1VarArr[i12]) {
            objArr = 1;
        } else {
            objArr = null;
        }
        boolean b10 = tVar.b(i12);
        if (!b10 || objArr != null) {
            if (!bVar.f10928y) {
                x2.p pVar = tVar.f47793c[i12];
                if (pVar != null) {
                    i10 = pVar.length();
                } else {
                    i10 = 0;
                }
                b2.x[] xVarArr = new b2.x[i10];
                for (int i13 = 0; i13 < i10; i13++) {
                    pVar.getClass();
                    xVarArr[i13] = pVar.f(i13);
                }
                u2.d1 d1Var2 = x0Var.f11219c[i12];
                d1Var2.getClass();
                bVar.y(xVarArr, d1Var2, x0Var.e(), x0Var.f11229p, x0Var.f11221g.f11232a);
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
        if (!h(this.f11184a)) {
            i(true);
        }
        b bVar = this.f11186c;
        if (bVar == null || bVar.f10923n != 0) {
            return;
        }
        i(false);
    }

    public final void m() {
        int i10;
        b bVar = this.f11184a;
        int i11 = bVar.f10923n;
        boolean z10 = false;
        if (i11 == 1 && this.d != 4) {
            if (i11 == 1) {
                z10 = true;
            }
            u6.p(z10);
            bVar.f10923n = 2;
            bVar.s();
            return;
        }
        b bVar2 = this.f11186c;
        if (bVar2 != null && (i10 = bVar2.f10923n) == 1 && this.d != 3) {
            if (i10 == 1) {
                z10 = true;
            }
            u6.p(z10);
            bVar2.f10923n = 2;
            bVar2.s();
        }
    }
}
