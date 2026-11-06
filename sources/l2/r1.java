package l2;

import a8.ia;
public final class r1 {
    public final b f18033a;
    public final int f18034b;
    public final b f18035c;
    public int d = 0;
    public boolean f18036e = false;
    public boolean f18037f = false;

    public r1(b bVar, b bVar2, int i7) {
        this.f18033a = bVar;
        this.f18034b = i7;
        this.f18035c = bVar2;
    }

    public static void b(b bVar) {
        boolean z9;
        int i7 = bVar.f17761n;
        if (i7 == 2) {
            if (i7 == 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.p(z9);
            bVar.f17761n = 1;
            bVar.t();
        }
    }

    public static boolean h(b bVar) {
        if (bVar.f17761n != 0) {
            return true;
        }
        return false;
    }

    public static void l(b bVar, long j3) {
        bVar.D = true;
        if (bVar instanceof z2.f) {
            z2.f fVar = (z2.f) bVar;
            ia.p(fVar.D);
            fVar.f59454a0 = j3;
        }
    }

    public final void a(b bVar, i iVar) {
        boolean z9;
        boolean z10 = true;
        if (this.f18033a != bVar && this.f18035c != bVar) {
            z9 = false;
        } else {
            z9 = true;
        }
        ia.p(z9);
        if (!h(bVar)) {
            return;
        }
        if (bVar == ((b) iVar.f17847e)) {
            iVar.f17848f = null;
            iVar.f17847e = null;
            iVar.f17844a = true;
        }
        b(bVar);
        if (bVar.f17761n != 1) {
            z10 = false;
        }
        ia.p(z10);
        bVar.f17758c.A();
        bVar.f17761n = 0;
        bVar.f17762r = null;
        bVar.f17763s = null;
        bVar.D = false;
        bVar.n();
        bVar.G = null;
    }

    public final int c() {
        int i7;
        boolean h = h(this.f18033a);
        b bVar = this.f18035c;
        if (bVar != null && h(bVar)) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        return (h ? 1 : 0) + i7;
    }

    public final b d(x0 x0Var) {
        x2.c1 c1Var;
        if (x0Var != null && (c1Var = x0Var.f18073c[this.f18034b]) != null) {
            b bVar = this.f18033a;
            if (bVar.f17762r == c1Var) {
                return bVar;
            }
            b bVar2 = this.f18035c;
            if (bVar2 != null && bVar2.f17762r == c1Var) {
                return bVar2;
            }
        }
        return null;
    }

    public final boolean e(l2.x0 r8, l2.b r9) {
        throw new UnsupportedOperationException("Method not decompiled: l2.r1.e(l2.x0, l2.b):boolean");
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
            b bVar = this.f18035c;
            bVar.getClass();
            if (bVar.f17761n != 0) {
                return true;
            }
            return false;
        }
        return h(this.f18033a);
    }

    public final void i(boolean z9) {
        boolean z10 = true;
        if (z9) {
            if (this.f18036e) {
                b bVar = this.f18033a;
                if (bVar.f17761n != 0) {
                    z10 = false;
                }
                ia.p(z10);
                bVar.f17758c.A();
                bVar.r();
                this.f18036e = false;
            }
        } else if (this.f18037f) {
            b bVar2 = this.f18035c;
            bVar2.getClass();
            if (bVar2.f17761n != 0) {
                z10 = false;
            }
            ia.p(z10);
            bVar2.f17758c.A();
            bVar2.r();
            this.f18037f = false;
        }
    }

    public final int j(b bVar, x0 x0Var, a3.y yVar, i iVar) {
        b bVar2;
        Object[] objArr;
        int i7;
        int i10;
        if (bVar == null || bVar.f17761n == 0 || (bVar == (bVar2 = this.f18033a) && ((i10 = this.d) == 2 || i10 == 4))) {
            return 1;
        }
        if (bVar == this.f18035c && this.d == 3) {
            return 1;
        }
        x2.c1 c1Var = bVar.f17762r;
        x2.c1[] c1VarArr = x0Var.f18073c;
        int i11 = this.f18034b;
        boolean z9 = false;
        if (c1Var != c1VarArr[i11]) {
            objArr = 1;
        } else {
            objArr = null;
        }
        boolean b10 = yVar.b(i11);
        if (!b10 || objArr != null) {
            if (!bVar.D) {
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
                x2.c1 c1Var2 = x0Var.f18073c[i11];
                c1Var2.getClass();
                bVar.y(uVarArr, c1Var2, x0Var.e(), x0Var.f18084p, x0Var.f18076g.f18087a);
                return 3;
            } else if (!bVar.l()) {
                return 0;
            } else {
                a(bVar, iVar);
                if (!b10 || f()) {
                    if (bVar == bVar2) {
                        z9 = true;
                    }
                    i(z9);
                    return 1;
                }
            }
        }
        return 1;
    }

    public final void k() {
        if (!h(this.f18033a)) {
            i(true);
        }
        b bVar = this.f18035c;
        if (bVar == null || bVar.f17761n != 0) {
            return;
        }
        i(false);
    }

    public final void m() {
        int i7;
        b bVar = this.f18033a;
        int i10 = bVar.f17761n;
        boolean z9 = false;
        if (i10 == 1 && this.d != 4) {
            if (i10 == 1) {
                z9 = true;
            }
            ia.p(z9);
            bVar.f17761n = 2;
            bVar.s();
            return;
        }
        b bVar2 = this.f18035c;
        if (bVar2 != null && (i7 = bVar2.f17761n) == 1 && this.d != 3) {
            if (i7 == 1) {
                z9 = true;
            }
            ia.p(z9);
            bVar2.f17761n = 2;
            bVar2.s();
        }
    }
}
