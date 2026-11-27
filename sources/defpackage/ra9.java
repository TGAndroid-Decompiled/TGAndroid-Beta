package defpackage;

import j$.util.Objects;
public final class ra9 {
    public final vg0 a;
    public final int b;
    public final vg0 c;
    public byte d = 0;
    public boolean e = false;
    public boolean f = false;

    public ra9(vg0 vg0Var, vg0 vg0Var2, int i) {
        this.a = vg0Var;
        this.b = i;
        this.c = vg0Var2;
    }

    public static void b(vg0 vg0Var) {
        boolean z;
        byte b = vg0Var.n;
        if (b == 2) {
            if (b == 2) {
                z = true;
            } else {
                z = false;
            }
            yve.p(z);
            vg0Var.n = (byte) 1;
            vg0Var.x();
        }
    }

    public static boolean k(vg0 vg0Var) {
        if (vg0Var.n != 0) {
            return true;
        }
        return false;
    }

    public static void o(vg0 vg0Var, long j) {
        vg0Var.E = true;
        if (vg0Var instanceof vlb) {
            vlb vlbVar = (vlb) vg0Var;
            yve.p(vlbVar.E);
            vlbVar.c0 = j;
        }
    }

    public final void a(vg0 vg0Var, fc3 fc3Var) {
        boolean z;
        boolean z2 = true;
        if (this.a != vg0Var && this.c != vg0Var) {
            z = false;
        } else {
            z = true;
        }
        yve.p(z);
        if (!k(vg0Var)) {
            return;
        }
        if (vg0Var == ((vg0) fc3Var.e)) {
            fc3Var.f = null;
            fc3Var.e = null;
            fc3Var.a = true;
        }
        b(vg0Var);
        if (vg0Var.n != 1) {
            z2 = false;
        }
        yve.p(z2);
        vg0Var.c.t();
        vg0Var.n = (byte) 0;
        vg0Var.r = null;
        vg0Var.s = null;
        vg0Var.E = false;
        vg0Var.q();
        vg0Var.H = null;
        vg0Var.I = -9223372036854775807L;
    }

    public final int c() {
        int i;
        boolean k = k(this.a);
        vg0 vg0Var = this.c;
        if (vg0Var != null && k(vg0Var)) {
            i = 1;
        } else {
            i = 0;
        }
        return (k ? 1 : 0) + i;
    }

    public final vg0 d(yt6 yt6Var) {
        at9 at9Var;
        if (yt6Var != null && (at9Var = yt6Var.c[this.b]) != null) {
            vg0 vg0Var = this.a;
            if (vg0Var.r == at9Var) {
                return vg0Var;
            }
            vg0 vg0Var2 = this.c;
            if (vg0Var2 != null && vg0Var2.r == at9Var) {
                return vg0Var2;
            }
            return null;
        }
        return null;
    }

    public final boolean e(yt6 yt6Var, vg0 vg0Var) {
        if (vg0Var != null) {
            at9[] at9VarArr = yt6Var.c;
            int i = this.b;
            at9 at9Var = at9VarArr[i];
            at9 at9Var2 = vg0Var.r;
            if (at9Var2 != null) {
                if (at9Var2 == at9Var) {
                    if (at9Var != null && !vg0Var.m()) {
                        yt6 yt6Var2 = yt6Var.m;
                        if (yt6Var.g.f && yt6Var2 != null && yt6Var2.e && ((vg0Var instanceof vlb) || (vg0Var instanceof zf7) || vg0Var.y >= yt6Var2.e())) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
                do {
                    yt6Var = yt6Var.m;
                    if (yt6Var == null) {
                        return false;
                    }
                } while (!Objects.equals(yt6Var.c[i], vg0Var.r));
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean f() {
        boolean z;
        vg0 vg0Var = this.a;
        if (k(vg0Var)) {
            z = vg0Var.n();
        } else {
            z = true;
        }
        vg0 vg0Var2 = this.c;
        if (vg0Var2 != null && vg0Var2.n != 0) {
            return z & vg0Var2.n();
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

    public final boolean h(yt6 yt6Var) {
        boolean z;
        boolean z2;
        byte b = this.d;
        if ((b == 2 || b == 5) && d(yt6Var) == this.a) {
            z = true;
        } else {
            z = false;
        }
        byte b2 = this.d;
        if ((b2 == 3 || b2 == 4) && d(yt6Var) == this.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    public final boolean i(yt6 yt6Var) {
        if (d(yt6Var) != null) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        byte b = this.d;
        if (b != 0 && b != 2 && b != 5) {
            vg0 vg0Var = this.c;
            vg0Var.getClass();
            if (vg0Var.n != 0) {
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
                vg0 vg0Var = this.a;
                if (vg0Var.n != 0) {
                    z2 = false;
                }
                yve.p(z2);
                vg0Var.c.t();
                vg0Var.v();
                this.e = false;
            }
        } else if (this.f) {
            vg0 vg0Var2 = this.c;
            vg0Var2.getClass();
            if (vg0Var2.n != 0) {
                z2 = false;
            }
            yve.p(z2);
            vg0Var2.c.t();
            vg0Var2.v();
            this.f = false;
        }
    }

    public final int m(vg0 vg0Var, yt6 yt6Var, d2c d2cVar, fc3 fc3Var) {
        vg0 vg0Var2;
        Object[] objArr;
        int i;
        byte b;
        byte b2;
        at9[] at9VarArr = yt6Var.c;
        if (vg0Var == null || vg0Var.n == 0 || (vg0Var == (vg0Var2 = this.a) && ((b2 = this.d) == 2 || b2 == 5))) {
            return 1;
        }
        if (vg0Var == this.c && ((b = this.d) == 3 || b == 4)) {
            return 1;
        }
        at9 at9Var = vg0Var.r;
        int i2 = this.b;
        boolean z = false;
        if (at9Var != at9VarArr[i2]) {
            objArr = 1;
        } else {
            objArr = null;
        }
        boolean q = d2cVar.q(i2);
        if (!q || objArr != null) {
            if (!vg0Var.E) {
                e74 e74Var = ((e74[]) d2cVar.d)[i2];
                if (e74Var != null) {
                    i = e74Var.length();
                } else {
                    i = 0;
                }
                ko4[] ko4VarArr = new ko4[i];
                for (int i3 = 0; i3 < i; i3++) {
                    e74Var.getClass();
                    ko4VarArr[i3] = e74Var.i(i3);
                }
                at9 at9Var2 = at9VarArr[i2];
                at9Var2.getClass();
                vg0Var.C(ko4VarArr, at9Var2, yt6Var.e(), yt6Var.p, yt6Var.g.a);
                return 3;
            } else if (!vg0Var.n()) {
                return 0;
            } else {
                a(vg0Var, fc3Var);
                if (!q || g()) {
                    if (vg0Var == vg0Var2) {
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
        vg0 vg0Var = this.c;
        if (vg0Var == null || vg0Var.n != 0) {
            return;
        }
        l(false);
    }

    public final void p() {
        byte b;
        vg0 vg0Var = this.a;
        byte b2 = vg0Var.n;
        boolean z = false;
        if (b2 == 1 && this.d != 5) {
            if (b2 == 1) {
                z = true;
            }
            yve.p(z);
            vg0Var.n = (byte) 2;
            vg0Var.w();
            return;
        }
        vg0 vg0Var2 = this.c;
        if (vg0Var2 != null && (b = vg0Var2.n) == 1 && this.d != 4) {
            if (b == 1) {
                z = true;
            }
            yve.p(z);
            vg0Var2.n = (byte) 2;
            vg0Var2.w();
        }
    }
}
