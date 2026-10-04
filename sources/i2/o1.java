package i2;
public final class o1 {
    public final f f11759a;
    public final int f11760b;
    public final f f11761c;
    public int d = 0;
    public boolean f11762e = false;
    public boolean f11763f = false;

    public o1(f fVar, f fVar2, int i10) {
        this.f11759a = fVar;
        this.f11760b = i10;
        this.f11761c = fVar2;
    }

    public static void b(f fVar) {
        boolean z10;
        int i10 = fVar.f11598n;
        if (i10 == 2) {
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            fVar.f11598n = 1;
            fVar.u();
        }
    }

    public static boolean h(f fVar) {
        if (fVar.f11598n != 0) {
            return true;
        }
        return false;
    }

    public static void l(f fVar, long j3) {
        fVar.f11603y = true;
        if (fVar instanceof w2.e) {
            w2.e eVar = (w2.e) fVar;
            e2.d.g(eVar.f11603y);
            eVar.f48461a0 = j3;
        }
    }

    public final void a(f fVar, a3.q qVar) {
        boolean z10;
        boolean z11 = true;
        if (this.f11759a != fVar && this.f11761c != fVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        if (!h(fVar)) {
            return;
        }
        if (fVar == ((f) qVar.f198e)) {
            qVar.f199f = null;
            qVar.f198e = null;
            qVar.f195a = true;
        }
        b(fVar);
        if (fVar.f11598n != 1) {
            z11 = false;
        }
        e2.d.g(z11);
        fVar.f11595c.o();
        fVar.f11598n = 0;
        fVar.f11599r = null;
        fVar.f11600s = null;
        fVar.f11603y = false;
        fVar.o();
        fVar.G = null;
    }

    public final int c() {
        int i10;
        boolean h = h(this.f11759a);
        f fVar = this.f11761c;
        if (fVar != null && h(fVar)) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return (h ? 1 : 0) + i10;
    }

    public final f d(u0 u0Var) {
        u2.c1 c1Var;
        if (u0Var != null && (c1Var = u0Var.f11843c[this.f11760b]) != null) {
            f fVar = this.f11759a;
            if (fVar.f11599r == c1Var) {
                return fVar;
            }
            f fVar2 = this.f11761c;
            if (fVar2 != null && fVar2.f11599r == c1Var) {
                return fVar2;
            }
        }
        return null;
    }

    public final boolean e(i2.u0 r8, i2.f r9) {
        throw new UnsupportedOperationException("Method not decompiled: i2.o1.e(i2.u0, i2.f):boolean");
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
            f fVar = this.f11761c;
            fVar.getClass();
            if (fVar.f11598n != 0) {
                return true;
            }
            return false;
        }
        return h(this.f11759a);
    }

    public final void i(boolean z10) {
        boolean z11 = true;
        if (z10) {
            if (this.f11762e) {
                f fVar = this.f11759a;
                if (fVar.f11598n != 0) {
                    z11 = false;
                }
                e2.d.g(z11);
                fVar.f11595c.o();
                fVar.s();
                this.f11762e = false;
            }
        } else if (this.f11763f) {
            f fVar2 = this.f11761c;
            fVar2.getClass();
            if (fVar2.f11598n != 0) {
                z11 = false;
            }
            e2.d.g(z11);
            fVar2.f11595c.o();
            fVar2.s();
            this.f11763f = false;
        }
    }

    public final int j(f fVar, u0 u0Var, x2.v vVar, a3.q qVar) {
        f fVar2;
        boolean z10;
        int i10;
        int i11;
        if (fVar == null || fVar.f11598n == 0 || (fVar == (fVar2 = this.f11759a) && ((i11 = this.d) == 2 || i11 == 4))) {
            return 1;
        }
        if (fVar == this.f11761c && this.d == 3) {
            return 1;
        }
        u2.c1 c1Var = fVar.f11599r;
        u2.c1[] c1VarArr = u0Var.f11843c;
        int i12 = this.f11760b;
        boolean z11 = false;
        if (c1Var != c1VarArr[i12]) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean b10 = vVar.b(i12);
        if (!b10 || z10) {
            if (!fVar.f11603y) {
                x2.r rVar = vVar.f49252c[i12];
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
                u2.c1 c1Var2 = u0Var.f11843c[i12];
                c1Var2.getClass();
                fVar.y(sVarArr, c1Var2, u0Var.e(), u0Var.f11854p, u0Var.f11846g.f11857a);
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
        if (!h(this.f11759a)) {
            i(true);
        }
        f fVar = this.f11761c;
        if (fVar == null || fVar.f11598n != 0) {
            return;
        }
        i(false);
    }

    public final void m() {
        int i10;
        f fVar = this.f11759a;
        int i11 = fVar.f11598n;
        boolean z10 = false;
        if (i11 == 1 && this.d != 4) {
            if (i11 == 1) {
                z10 = true;
            }
            e2.d.g(z10);
            fVar.f11598n = 2;
            fVar.t();
            return;
        }
        f fVar2 = this.f11761c;
        if (fVar2 != null && (i10 = fVar2.f11598n) == 1 && this.d != 3) {
            if (i10 == 1) {
                z10 = true;
            }
            e2.d.g(z10);
            fVar2.f11598n = 2;
            fVar2.t();
        }
    }
}
