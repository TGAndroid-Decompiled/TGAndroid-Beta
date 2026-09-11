package i2;
public final class n1 {
    public final f f11648a;
    public final int f11649b;
    public final f f11650c;
    public int d = 0;
    public boolean f11651e = false;
    public boolean f11652f = false;

    public n1(f fVar, f fVar2, int i10) {
        this.f11648a = fVar;
        this.f11649b = i10;
        this.f11650c = fVar2;
    }

    public static void b(f fVar) {
        boolean z10;
        int i10 = fVar.f11499n;
        if (i10 == 2) {
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            fVar.f11499n = 1;
            fVar.t();
        }
    }

    public static boolean h(f fVar) {
        if (fVar.f11499n != 0) {
            return true;
        }
        return false;
    }

    public static void l(f fVar, long j3) {
        fVar.f11504y = true;
        if (fVar instanceof w2.e) {
            w2.e eVar = (w2.e) fVar;
            e2.d.g(eVar.f11504y);
            eVar.f47915a0 = j3;
        }
    }

    public final void a(f fVar, a3.p pVar) {
        boolean z10;
        boolean z11 = true;
        if (this.f11648a != fVar && this.f11650c != fVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        if (!h(fVar)) {
            return;
        }
        if (fVar == ((f) pVar.f172e)) {
            pVar.f173f = null;
            pVar.f172e = null;
            pVar.f169a = true;
        }
        b(fVar);
        if (fVar.f11499n != 1) {
            z11 = false;
        }
        e2.d.g(z11);
        fVar.f11496c.A();
        fVar.f11499n = 0;
        fVar.f11500r = null;
        fVar.f11501s = null;
        fVar.f11504y = false;
        fVar.n();
        fVar.G = null;
    }

    public final int c() {
        int i10;
        boolean h = h(this.f11648a);
        f fVar = this.f11650c;
        if (fVar != null && h(fVar)) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return (h ? 1 : 0) + i10;
    }

    public final f d(t0 t0Var) {
        u2.b1 b1Var;
        if (t0Var != null && (b1Var = t0Var.f11735c[this.f11649b]) != null) {
            f fVar = this.f11648a;
            if (fVar.f11500r == b1Var) {
                return fVar;
            }
            f fVar2 = this.f11650c;
            if (fVar2 != null && fVar2.f11500r == b1Var) {
                return fVar2;
            }
        }
        return null;
    }

    public final boolean e(i2.t0 r8, i2.f r9) {
        throw new UnsupportedOperationException("Method not decompiled: i2.n1.e(i2.t0, i2.f):boolean");
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
            f fVar = this.f11650c;
            fVar.getClass();
            if (fVar.f11499n != 0) {
                return true;
            }
            return false;
        }
        return h(this.f11648a);
    }

    public final void i(boolean z10) {
        boolean z11 = true;
        if (z10) {
            if (this.f11651e) {
                f fVar = this.f11648a;
                if (fVar.f11499n != 0) {
                    z11 = false;
                }
                e2.d.g(z11);
                fVar.f11496c.A();
                fVar.r();
                this.f11651e = false;
            }
        } else if (this.f11652f) {
            f fVar2 = this.f11650c;
            fVar2.getClass();
            if (fVar2.f11499n != 0) {
                z11 = false;
            }
            e2.d.g(z11);
            fVar2.f11496c.A();
            fVar2.r();
            this.f11652f = false;
        }
    }

    public final int j(f fVar, t0 t0Var, x2.v vVar, a3.p pVar) {
        f fVar2;
        boolean z10;
        int i10;
        int i11;
        if (fVar == null || fVar.f11499n == 0 || (fVar == (fVar2 = this.f11648a) && ((i11 = this.d) == 2 || i11 == 4))) {
            return 1;
        }
        if (fVar == this.f11650c && this.d == 3) {
            return 1;
        }
        u2.b1 b1Var = fVar.f11500r;
        u2.b1[] b1VarArr = t0Var.f11735c;
        int i12 = this.f11649b;
        boolean z11 = false;
        if (b1Var != b1VarArr[i12]) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean b10 = vVar.b(i12);
        if (!b10 || z10) {
            if (!fVar.f11504y) {
                x2.r rVar = vVar.f48771c[i12];
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
                u2.b1 b1Var2 = t0Var.f11735c[i12];
                b1Var2.getClass();
                fVar.x(sVarArr, b1Var2, t0Var.e(), t0Var.f11746p, t0Var.f11738g.f11749a);
                return 3;
            } else if (!fVar.l()) {
                return 0;
            } else {
                a(fVar, pVar);
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
        if (!h(this.f11648a)) {
            i(true);
        }
        f fVar = this.f11650c;
        if (fVar == null || fVar.f11499n != 0) {
            return;
        }
        i(false);
    }

    public final void m() {
        int i10;
        f fVar = this.f11648a;
        int i11 = fVar.f11499n;
        boolean z10 = false;
        if (i11 == 1 && this.d != 4) {
            if (i11 == 1) {
                z10 = true;
            }
            e2.d.g(z10);
            fVar.f11499n = 2;
            fVar.s();
            return;
        }
        f fVar2 = this.f11650c;
        if (fVar2 != null && (i10 = fVar2.f11499n) == 1 && this.d != 3) {
            if (i10 == 1) {
                z10 = true;
            }
            e2.d.g(z10);
            fVar2.f11499n = 2;
            fVar2.s();
        }
    }
}
