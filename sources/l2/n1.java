package l2;

import a8.la;
public final class n1 {
    public final b f19481a;
    public final int f19482b;
    public final b f19483c;
    public int d = 0;
    public boolean f19484e = false;
    public boolean f19485f = false;

    public n1(b bVar, b bVar2, int i7) {
        this.f19481a = bVar;
        this.f19482b = i7;
        this.f19483c = bVar2;
    }

    public static void b(b bVar) {
        boolean z10;
        int i7 = bVar.f19260n;
        if (i7 == 2) {
            if (i7 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.p(z10);
            bVar.f19260n = 1;
            bVar.t();
        }
    }

    public static boolean h(b bVar) {
        if (bVar.f19260n != 0) {
            return true;
        }
        return false;
    }

    public static void l(b bVar, long j3) {
        bVar.E = true;
        if (bVar instanceof z2.e) {
            z2.e eVar = (z2.e) bVar;
            la.p(eVar.E);
            eVar.f61349b0 = j3;
        }
    }

    public final void a(b bVar, i iVar) {
        boolean z10;
        boolean z11 = true;
        if (this.f19481a != bVar && this.f19483c != bVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        la.p(z10);
        if (!h(bVar)) {
            return;
        }
        if (bVar == ((b) iVar.f19410e)) {
            iVar.f19411f = null;
            iVar.f19410e = null;
            iVar.f19407a = true;
        }
        b(bVar);
        if (bVar.f19260n != 1) {
            z11 = false;
        }
        la.p(z11);
        bVar.f19257c.g0();
        bVar.f19260n = 0;
        bVar.f19261r = null;
        bVar.f19262s = null;
        bVar.E = false;
        bVar.n();
        bVar.H = null;
    }

    public final int c() {
        int i7;
        boolean h = h(this.f19481a);
        b bVar = this.f19483c;
        if (bVar != null && h(bVar)) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        return (h ? 1 : 0) + i7;
    }

    public final b d(u0 u0Var) {
        x2.d1 d1Var;
        if (u0Var != null && (d1Var = u0Var.f19553c[this.f19482b]) != null) {
            b bVar = this.f19481a;
            if (bVar.f19261r == d1Var) {
                return bVar;
            }
            b bVar2 = this.f19483c;
            if (bVar2 != null && bVar2.f19261r == d1Var) {
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
            b bVar = this.f19483c;
            bVar.getClass();
            if (bVar.f19260n != 0) {
                return true;
            }
            return false;
        }
        return h(this.f19481a);
    }

    public final void i(boolean z10) {
        boolean z11 = true;
        if (z10) {
            if (this.f19484e) {
                b bVar = this.f19481a;
                if (bVar.f19260n != 0) {
                    z11 = false;
                }
                la.p(z11);
                bVar.f19257c.g0();
                bVar.r();
                this.f19484e = false;
            }
        } else if (this.f19485f) {
            b bVar2 = this.f19483c;
            bVar2.getClass();
            if (bVar2.f19260n != 0) {
                z11 = false;
            }
            la.p(z11);
            bVar2.f19257c.g0();
            bVar2.r();
            this.f19485f = false;
        }
    }

    public final int j(b bVar, u0 u0Var, a3.y yVar, i iVar) {
        b bVar2;
        Object[] objArr;
        int i7;
        int i10;
        if (bVar == null || bVar.f19260n == 0 || (bVar == (bVar2 = this.f19481a) && ((i10 = this.d) == 2 || i10 == 4))) {
            return 1;
        }
        if (bVar == this.f19483c && this.d == 3) {
            return 1;
        }
        x2.d1 d1Var = bVar.f19261r;
        x2.d1[] d1VarArr = u0Var.f19553c;
        int i11 = this.f19482b;
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
                x2.d1 d1Var2 = u0Var.f19553c[i11];
                d1Var2.getClass();
                bVar.y(uVarArr, d1Var2, u0Var.e(), u0Var.f19564p, u0Var.f19556g.f19567a);
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
        if (!h(this.f19481a)) {
            i(true);
        }
        b bVar = this.f19483c;
        if (bVar == null || bVar.f19260n != 0) {
            return;
        }
        i(false);
    }

    public final void m() {
        int i7;
        b bVar = this.f19481a;
        int i10 = bVar.f19260n;
        boolean z10 = false;
        if (i10 == 1 && this.d != 4) {
            if (i10 == 1) {
                z10 = true;
            }
            la.p(z10);
            bVar.f19260n = 2;
            bVar.s();
            return;
        }
        b bVar2 = this.f19483c;
        if (bVar2 != null && (i7 = bVar2.f19260n) == 1 && this.d != 3) {
            if (i7 == 1) {
                z10 = true;
            }
            la.p(z10);
            bVar2.f19260n = 2;
            bVar2.s();
        }
    }
}
