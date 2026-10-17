package i2;

import v7.u6;
public final class p1 {
    public final b f12567a;
    public final int f12568b;
    public final b f12569c;
    public int d = 0;
    public boolean e = false;
    public boolean f12570f = false;

    public p1(b bVar, b bVar2, int i10) {
        this.f12567a = bVar;
        this.f12568b = i10;
        this.f12569c = bVar2;
    }

    public static void b(b bVar) {
        boolean z10;
        int i10 = bVar.f12317n;
        if (i10 == 2) {
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
            bVar.f12317n = 1;
            bVar.t();
        }
    }

    public static boolean h(b bVar) {
        if (bVar.f12317n != 0) {
            return true;
        }
        return false;
    }

    public static void l(b bVar, long j10) {
        bVar.f12322y = true;
        if (bVar instanceof w2.e) {
            w2.e eVar = (w2.e) bVar;
            u6.p(eVar.f12322y);
            eVar.f48483a0 = j10;
        }
    }

    public final void a(b bVar, i iVar) {
        boolean z10;
        boolean z11 = true;
        if (this.f12567a != bVar && this.f12569c != bVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        if (!h(bVar)) {
            return;
        }
        if (bVar == iVar.f12448c) {
            iVar.d = null;
            iVar.f12448c = null;
            iVar.e = true;
        }
        b(bVar);
        if (bVar.f12317n != 1) {
            z11 = false;
        }
        u6.p(z11);
        bVar.f12315c.z();
        bVar.f12317n = 0;
        bVar.f12318r = null;
        bVar.f12319s = null;
        bVar.f12322y = false;
        bVar.n();
        bVar.G = null;
    }

    public final int c() {
        int i10;
        boolean h = h(this.f12567a);
        b bVar = this.f12569c;
        if (bVar != null && h(bVar)) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return (h ? 1 : 0) + i10;
    }

    public final b d(v0 v0Var) {
        u2.d1 d1Var;
        if (v0Var != null && (d1Var = v0Var.f12603c[this.f12568b]) != null) {
            b bVar = this.f12567a;
            if (bVar.f12318r == d1Var) {
                return bVar;
            }
            b bVar2 = this.f12569c;
            if (bVar2 != null && bVar2.f12318r == d1Var) {
                return bVar2;
            }
        }
        return null;
    }

    public final boolean e(i2.v0 r8, i2.b r9) {
        throw new UnsupportedOperationException("Method not decompiled: i2.p1.e(i2.v0, i2.b):boolean");
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
            b bVar = this.f12569c;
            bVar.getClass();
            if (bVar.f12317n != 0) {
                return true;
            }
            return false;
        }
        return h(this.f12567a);
    }

    public final void i(boolean z10) {
        boolean z11 = true;
        if (z10) {
            if (this.e) {
                b bVar = this.f12567a;
                if (bVar.f12317n != 0) {
                    z11 = false;
                }
                u6.p(z11);
                bVar.f12315c.z();
                bVar.r();
                this.e = false;
            }
        } else if (this.f12570f) {
            b bVar2 = this.f12569c;
            bVar2.getClass();
            if (bVar2.f12317n != 0) {
                z11 = false;
            }
            u6.p(z11);
            bVar2.f12315c.z();
            bVar2.r();
            this.f12570f = false;
        }
    }

    public final int j(b bVar, v0 v0Var, x2.t tVar, i iVar) {
        b bVar2;
        Object[] objArr;
        int i10;
        int i11;
        if (bVar == null || bVar.f12317n == 0 || (bVar == (bVar2 = this.f12567a) && ((i11 = this.d) == 2 || i11 == 4))) {
            return 1;
        }
        if (bVar == this.f12569c && this.d == 3) {
            return 1;
        }
        u2.d1 d1Var = bVar.f12318r;
        u2.d1[] d1VarArr = v0Var.f12603c;
        int i12 = this.f12568b;
        boolean z10 = false;
        if (d1Var != d1VarArr[i12]) {
            objArr = 1;
        } else {
            objArr = null;
        }
        boolean b10 = tVar.b(i12);
        if (!b10 || objArr != null) {
            if (!bVar.f12322y) {
                x2.p pVar = tVar.f49202c[i12];
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
                u2.d1 d1Var2 = v0Var.f12603c[i12];
                d1Var2.getClass();
                bVar.y(wVarArr, d1Var2, v0Var.e(), v0Var.f12613p, v0Var.f12605g.f12616a);
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
        if (!h(this.f12567a)) {
            i(true);
        }
        b bVar = this.f12569c;
        if (bVar == null || bVar.f12317n != 0) {
            return;
        }
        i(false);
    }

    public final void m() {
        int i10;
        b bVar = this.f12567a;
        int i11 = bVar.f12317n;
        boolean z10 = false;
        if (i11 == 1 && this.d != 4) {
            if (i11 == 1) {
                z10 = true;
            }
            u6.p(z10);
            bVar.f12317n = 2;
            bVar.s();
            return;
        }
        b bVar2 = this.f12569c;
        if (bVar2 != null && (i10 = bVar2.f12317n) == 1 && this.d != 3) {
            if (i10 == 1) {
                z10 = true;
            }
            u6.p(z10);
            bVar2.f12317n = 2;
            bVar2.s();
        }
    }
}
