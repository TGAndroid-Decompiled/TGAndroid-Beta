package i2;
public final class m1 {
    public final f f10273a;
    public final int f10274b;
    public final f f10275c;
    public int d = 0;
    public boolean e = false;
    public boolean f10276f = false;

    public m1(f fVar, f fVar2, int i10) {
        this.f10273a = fVar;
        this.f10274b = i10;
        this.f10275c = fVar2;
    }

    public static void b(f fVar) {
        boolean z10;
        int i10 = fVar.f10177n;
        if (i10 == 2) {
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            fVar.f10177n = 1;
            fVar.u();
        }
    }

    public static boolean h(f fVar) {
        if (fVar.f10177n != 0) {
            return true;
        }
        return false;
    }

    public static void l(f fVar, long j3) {
        fVar.f10182y = true;
        if (fVar instanceof w2.e) {
            w2.e eVar = (w2.e) fVar;
            e2.d.g(eVar.f10182y);
            eVar.f43438a0 = j3;
        }
    }

    public final void a(f fVar, a3.q qVar) {
        boolean z10;
        boolean z11 = true;
        if (this.f10273a != fVar && this.f10275c != fVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        if (!h(fVar)) {
            return;
        }
        if (fVar == ((f) qVar.e)) {
            qVar.f181f = null;
            qVar.e = null;
            qVar.f178a = true;
        }
        b(fVar);
        if (fVar.f10177n != 1) {
            z11 = false;
        }
        e2.d.g(z11);
        fVar.f10175c.F();
        fVar.f10177n = 0;
        fVar.f10178r = null;
        fVar.f10179s = null;
        fVar.f10182y = false;
        fVar.o();
        fVar.G = null;
    }

    public final int c() {
        int i10;
        boolean h = h(this.f10273a);
        f fVar = this.f10275c;
        if (fVar != null && h(fVar)) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return (h ? 1 : 0) + i10;
    }

    public final f d(s0 s0Var) {
        u2.d1 d1Var;
        if (s0Var != null && (d1Var = s0Var.f10355c[this.f10274b]) != null) {
            f fVar = this.f10273a;
            if (fVar.f10178r == d1Var) {
                return fVar;
            }
            f fVar2 = this.f10275c;
            if (fVar2 != null && fVar2.f10178r == d1Var) {
                return fVar2;
            }
        }
        return null;
    }

    public final boolean e(i2.s0 r8, i2.f r9) {
        throw new UnsupportedOperationException("Method not decompiled: i2.m1.e(i2.s0, i2.f):boolean");
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
            f fVar = this.f10275c;
            fVar.getClass();
            if (fVar.f10177n != 0) {
                return true;
            }
            return false;
        }
        return h(this.f10273a);
    }

    public final void i(boolean z10) {
        boolean z11 = true;
        if (z10) {
            if (this.e) {
                f fVar = this.f10273a;
                if (fVar.f10177n != 0) {
                    z11 = false;
                }
                e2.d.g(z11);
                fVar.f10175c.F();
                fVar.s();
                this.e = false;
            }
        } else if (this.f10276f) {
            f fVar2 = this.f10275c;
            fVar2.getClass();
            if (fVar2.f10177n != 0) {
                z11 = false;
            }
            e2.d.g(z11);
            fVar2.f10175c.F();
            fVar2.s();
            this.f10276f = false;
        }
    }

    public final int j(f fVar, s0 s0Var, x2.v vVar, a3.q qVar) {
        f fVar2;
        boolean z10;
        int i10;
        int i11;
        if (fVar == null || fVar.f10177n == 0 || (fVar == (fVar2 = this.f10273a) && ((i11 = this.d) == 2 || i11 == 4))) {
            return 1;
        }
        if (fVar == this.f10275c && this.d == 3) {
            return 1;
        }
        u2.d1 d1Var = fVar.f10178r;
        u2.d1[] d1VarArr = s0Var.f10355c;
        int i12 = this.f10274b;
        boolean z11 = false;
        if (d1Var != d1VarArr[i12]) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean b10 = vVar.b(i12);
        if (!b10 || z10) {
            if (!fVar.f10182y) {
                x2.r rVar = vVar.f44560c[i12];
                if (rVar != null) {
                    i10 = rVar.length();
                } else {
                    i10 = 0;
                }
                b2.s[] sVarArr = new b2.s[i10];
                for (int i13 = 0; i13 < i10; i13++) {
                    rVar.getClass();
                    sVarArr[i13] = rVar.f(i13);
                }
                u2.d1 d1Var2 = s0Var.f10355c[i12];
                d1Var2.getClass();
                fVar.y(sVarArr, d1Var2, s0Var.e(), s0Var.f10365p, s0Var.f10357g.f10368a);
                return 3;
            } else if (!fVar.l()) {
                return 0;
            } else {
                a(fVar, qVar);
                if (!b10 || f()) {
                    if (fVar == fVar2) {
                        z11 = true;
                    }
                    i(z11);
                    return 1;
                }
            }
        }
        return 1;
    }

    public final void k() {
        if (!h(this.f10273a)) {
            i(true);
        }
        f fVar = this.f10275c;
        if (fVar == null || fVar.f10177n != 0) {
            return;
        }
        i(false);
    }

    public final void m() {
        int i10;
        f fVar = this.f10273a;
        int i11 = fVar.f10177n;
        boolean z10 = false;
        if (i11 == 1 && this.d != 4) {
            if (i11 == 1) {
                z10 = true;
            }
            e2.d.g(z10);
            fVar.f10177n = 2;
            fVar.t();
            return;
        }
        f fVar2 = this.f10275c;
        if (fVar2 != null && (i10 = fVar2.f10177n) == 1 && this.d != 3) {
            if (i10 == 1) {
                z10 = true;
            }
            e2.d.g(z10);
            fVar2.f10177n = 2;
            fVar2.t();
        }
    }
}
