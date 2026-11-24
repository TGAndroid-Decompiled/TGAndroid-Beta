package defpackage;

import j$.util.Objects;
public final class g99 {
    public final uh0 a;
    public final int b;
    public final uh0 c;
    public byte d = 0;
    public boolean e = false;
    public boolean f = false;

    public g99(uh0 uh0Var, uh0 uh0Var2, int i) {
        this.a = uh0Var;
        this.b = i;
        this.c = uh0Var2;
    }

    public static void b(uh0 uh0Var) {
        boolean z;
        byte b = uh0Var.n;
        if (b == 2) {
            if (b == 2) {
                z = true;
            } else {
                z = false;
            }
            jte.p(z);
            uh0Var.n = (byte) 1;
            uh0Var.x();
        }
    }

    public static boolean k(uh0 uh0Var) {
        if (uh0Var.n != 0) {
            return true;
        }
        return false;
    }

    public static void o(uh0 uh0Var, long j) {
        uh0Var.E = true;
        if (uh0Var instanceof bkb) {
            bkb bkbVar = (bkb) uh0Var;
            jte.p(bkbVar.E);
            bkbVar.c0 = j;
        }
    }

    public final void a(uh0 uh0Var, yc3 yc3Var) {
        boolean z;
        boolean z2 = true;
        if (this.a != uh0Var && this.c != uh0Var) {
            z = false;
        } else {
            z = true;
        }
        jte.p(z);
        if (!k(uh0Var)) {
            return;
        }
        if (uh0Var == ((uh0) yc3Var.e)) {
            yc3Var.f = null;
            yc3Var.e = null;
            yc3Var.a = true;
        }
        b(uh0Var);
        if (uh0Var.n != 1) {
            z2 = false;
        }
        jte.p(z2);
        uh0Var.c.i();
        uh0Var.n = (byte) 0;
        uh0Var.r = null;
        uh0Var.s = null;
        uh0Var.E = false;
        uh0Var.q();
        uh0Var.H = null;
        uh0Var.I = -9223372036854775807L;
    }

    public final int c() {
        int i;
        boolean k = k(this.a);
        uh0 uh0Var = this.c;
        if (uh0Var != null && k(uh0Var)) {
            i = 1;
        } else {
            i = 0;
        }
        return (k ? 1 : 0) + i;
    }

    public final uh0 d(ut6 ut6Var) {
        jr9 jr9Var;
        if (ut6Var != null && (jr9Var = ut6Var.c[this.b]) != null) {
            uh0 uh0Var = this.a;
            if (uh0Var.r == jr9Var) {
                return uh0Var;
            }
            uh0 uh0Var2 = this.c;
            if (uh0Var2 != null && uh0Var2.r == jr9Var) {
                return uh0Var2;
            }
            return null;
        }
        return null;
    }

    public final boolean e(ut6 ut6Var, uh0 uh0Var) {
        if (uh0Var != null) {
            jr9[] jr9VarArr = ut6Var.c;
            int i = this.b;
            jr9 jr9Var = jr9VarArr[i];
            jr9 jr9Var2 = uh0Var.r;
            if (jr9Var2 != null) {
                if (jr9Var2 == jr9Var) {
                    if (jr9Var != null && !uh0Var.m()) {
                        ut6 ut6Var2 = ut6Var.m;
                        if (ut6Var.g.f && ut6Var2 != null && ut6Var2.e && ((uh0Var instanceof bkb) || (uh0Var instanceof sf7) || uh0Var.y >= ut6Var2.e())) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
                do {
                    ut6Var = ut6Var.m;
                    if (ut6Var == null) {
                        return false;
                    }
                } while (!Objects.equals(ut6Var.c[i], uh0Var.r));
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean f() {
        boolean z;
        uh0 uh0Var = this.a;
        if (k(uh0Var)) {
            z = uh0Var.n();
        } else {
            z = true;
        }
        uh0 uh0Var2 = this.c;
        if (uh0Var2 != null && uh0Var2.n != 0) {
            return z & uh0Var2.n();
        }
        return z;
    }

    public final boolean g() {
        byte b = this.d;
        if (b != 2 && b != 5 && b != 3 && b != 4) {
            return false;
        }
        return true;
    }

    public final boolean h(ut6 ut6Var) {
        boolean z;
        boolean z2;
        byte b = this.d;
        if ((b == 2 || b == 5) && d(ut6Var) == this.a) {
            z = true;
        } else {
            z = false;
        }
        byte b2 = this.d;
        if ((b2 == 3 || b2 == 4) && d(ut6Var) == this.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    public final boolean i(ut6 ut6Var) {
        if (d(ut6Var) != null) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        byte b = this.d;
        if (b != 0 && b != 2 && b != 5) {
            uh0 uh0Var = this.c;
            uh0Var.getClass();
            if (uh0Var.n != 0) {
                return true;
            }
            return false;
        }
        return k(this.a);
    }

    public final void l(boolean z) {
        boolean z2 = true;
        if (z) {
            if (this.e) {
                uh0 uh0Var = this.a;
                if (uh0Var.n != 0) {
                    z2 = false;
                }
                jte.p(z2);
                uh0Var.c.i();
                uh0Var.v();
                this.e = false;
            }
        } else if (this.f) {
            uh0 uh0Var2 = this.c;
            uh0Var2.getClass();
            if (uh0Var2.n != 0) {
                z2 = false;
            }
            jte.p(z2);
            uh0Var2.c.i();
            uh0Var2.v();
            this.f = false;
        }
    }

    public final int m(uh0 uh0Var, ut6 ut6Var, e0c e0cVar, yc3 yc3Var) {
        uh0 uh0Var2;
        Object[] objArr;
        int i;
        byte b;
        byte b2;
        jr9[] jr9VarArr = ut6Var.c;
        if (uh0Var == null || uh0Var.n == 0 || (uh0Var == (uh0Var2 = this.a) && ((b2 = this.d) == 2 || b2 == 5))) {
            return 1;
        }
        if (uh0Var == this.c && ((b = this.d) == 3 || b == 4)) {
            return 1;
        }
        jr9 jr9Var = uh0Var.r;
        int i2 = this.b;
        boolean z = false;
        if (jr9Var != jr9VarArr[i2]) {
            objArr = 1;
        } else {
            objArr = null;
        }
        boolean q = e0cVar.q(i2);
        if (!q || objArr != null) {
            if (!uh0Var.E) {
                t74 t74Var = ((t74[]) e0cVar.d)[i2];
                if (t74Var != null) {
                    i = t74Var.length();
                } else {
                    i = 0;
                }
                go4[] go4VarArr = new go4[i];
                for (int i3 = 0; i3 < i; i3++) {
                    t74Var.getClass();
                    go4VarArr[i3] = t74Var.i(i3);
                }
                jr9 jr9Var2 = jr9VarArr[i2];
                jr9Var2.getClass();
                uh0Var.C(go4VarArr, jr9Var2, ut6Var.e(), ut6Var.p, ut6Var.g.a);
                return 3;
            } else if (!uh0Var.n()) {
                return 0;
            } else {
                a(uh0Var, yc3Var);
                if (!q || g()) {
                    if (uh0Var == uh0Var2) {
                        z = true;
                    }
                    l(z);
                    return 1;
                }
            }
        }
        return 1;
    }

    public final void n() {
        if (!k(this.a)) {
            l(true);
        }
        uh0 uh0Var = this.c;
        if (uh0Var == null || uh0Var.n != 0) {
            return;
        }
        l(false);
    }

    public final void p() {
        byte b;
        uh0 uh0Var = this.a;
        byte b2 = uh0Var.n;
        boolean z = false;
        if (b2 == 1 && this.d != 5) {
            if (b2 == 1) {
                z = true;
            }
            jte.p(z);
            uh0Var.n = (byte) 2;
            uh0Var.w();
            return;
        }
        uh0 uh0Var2 = this.c;
        if (uh0Var2 != null && (b = uh0Var2.n) == 1 && this.d != 4) {
            if (b == 1) {
                z = true;
            }
            jte.p(z);
            uh0Var2.n = (byte) 2;
            uh0Var2.w();
        }
    }
}
