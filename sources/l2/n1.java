package l2;

import a8.la;
public final class n1 {
    public final b f19506a;
    public final int f19507b;
    public final b f19508c;
    public int d = 0;
    public boolean f19509e = false;
    public boolean f19510f = false;

    public n1(b bVar, b bVar2, int i7) {
        this.f19506a = bVar;
        this.f19507b = i7;
        this.f19508c = bVar2;
    }

    public static void b(b bVar) {
        boolean z10;
        int i7 = bVar.f19285n;
        if (i7 == 2) {
            if (i7 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.p(z10);
            bVar.f19285n = 1;
            bVar.t();
        }
    }

    public static boolean h(b bVar) {
        if (bVar.f19285n != 0) {
            return true;
        }
        return false;
    }

    public static void l(b bVar, long j3) {
        bVar.E = true;
        if (bVar instanceof z2.e) {
            z2.e eVar = (z2.e) bVar;
            la.p(eVar.E);
            eVar.f61391b0 = j3;
        }
    }

    public final void a(b bVar, i iVar) {
        boolean z10;
        boolean z11 = true;
        if (this.f19506a != bVar && this.f19508c != bVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        la.p(z10);
        if (!h(bVar)) {
            return;
        }
        if (bVar == ((b) iVar.f19435e)) {
            iVar.f19436f = null;
            iVar.f19435e = null;
            iVar.f19432a = true;
        }
        b(bVar);
        if (bVar.f19285n != 1) {
            z11 = false;
        }
        la.p(z11);
        bVar.f19282c.g0();
        bVar.f19285n = 0;
        bVar.f19286r = null;
        bVar.f19287s = null;
        bVar.E = false;
        bVar.n();
        bVar.H = null;
    }

    public final int c() {
        int i7;
        boolean h = h(this.f19506a);
        b bVar = this.f19508c;
        if (bVar != null && h(bVar)) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        return (h ? 1 : 0) + i7;
    }

    public final b d(u0 u0Var) {
        x2.d1 d1Var;
        if (u0Var != null && (d1Var = u0Var.f19578c[this.f19507b]) != null) {
            b bVar = this.f19506a;
            if (bVar.f19286r == d1Var) {
                return bVar;
            }
            b bVar2 = this.f19508c;
            if (bVar2 != null && bVar2.f19286r == d1Var) {
                return bVar2;
            }
        }
        return null;
    }

    public final boolean e(l2.u0 r8, l2.b r9) {
        throw new UnsupportedOperationException("Method not decompiled: l2.n1.e(l2.u0, l2.b):boolean");
    }

    public final boolean f() {
        int i7 = this.d;
        if (i7 != 2 && i7 != 4 && i7 != 3) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        int i7 = this.d;
        if (i7 != 0 && i7 != 2 && i7 != 4) {
            b bVar = this.f19508c;
            bVar.getClass();
            if (bVar.f19285n != 0) {
                return true;
            }
            return false;
        }
        return h(this.f19506a);
    }

    public final void i(boolean z10) {
        boolean z11 = true;
        if (z10) {
            if (this.f19509e) {
                b bVar = this.f19506a;
                if (bVar.f19285n != 0) {
                    z11 = false;
                }
                la.p(z11);
                bVar.f19282c.g0();
                bVar.r();
                this.f19509e = false;
            }
        } else if (this.f19510f) {
            b bVar2 = this.f19508c;
            bVar2.getClass();
            if (bVar2.f19285n != 0) {
                z11 = false;
            }
            la.p(z11);
            bVar2.f19282c.g0();
            bVar2.r();
            this.f19510f = false;
        }
    }

    public final int j(b bVar, u0 u0Var, a3.y yVar, i iVar) {
        b bVar2;
        Object[] objArr;
        int i7;
        int i10;
        if (bVar == null || bVar.f19285n == 0 || (bVar == (bVar2 = this.f19506a) && ((i10 = this.d) == 2 || i10 == 4))) {
            return 1;
        }
        if (bVar == this.f19508c && this.d == 3) {
            return 1;
        }
        x2.d1 d1Var = bVar.f19286r;
        x2.d1[] d1VarArr = u0Var.f19578c;
        int i11 = this.f19507b;
        boolean z10 = false;
        if (d1Var != d1VarArr[i11]) {
            objArr = 1;
        } else {
            objArr = null;
        }
        boolean b10 = yVar.b(i11);
        if (!b10 || objArr != null) {
            if (!bVar.E) {
                a3.u uVar = yVar.f145c[i11];
                if (uVar != null) {
                    i7 = uVar.length();
                } else {
                    i7 = 0;
                }
                e2.u[] uVarArr = new e2.u[i7];
                for (int i12 = 0; i12 < i7; i12++) {
                    uVar.getClass();
                    uVarArr[i12] = uVar.g(i12);
                }
                x2.d1 d1Var2 = u0Var.f19578c[i11];
                d1Var2.getClass();
                bVar.y(uVarArr, d1Var2, u0Var.e(), u0Var.f19589p, u0Var.f19581g.f19592a);
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
        if (!h(this.f19506a)) {
            i(true);
        }
        b bVar = this.f19508c;
        if (bVar == null || bVar.f19285n != 0) {
            return;
        }
        i(false);
    }

    public final void m() {
        int i7;
        b bVar = this.f19506a;
        int i10 = bVar.f19285n;
        boolean z10 = false;
        if (i10 == 1 && this.d != 4) {
            if (i10 == 1) {
                z10 = true;
            }
            la.p(z10);
            bVar.f19285n = 2;
            bVar.s();
            return;
        }
        b bVar2 = this.f19508c;
        if (bVar2 != null && (i7 = bVar2.f19285n) == 1 && this.d != 3) {
            if (i7 == 1) {
                z10 = true;
            }
            la.p(z10);
            bVar2.f19285n = 2;
            bVar2.s();
        }
    }
}
