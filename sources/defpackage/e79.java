package defpackage;

import j$.util.Objects;
public final class e79 {
    public final ug0 a;
    public final int b;
    public final ug0 c;
    public byte d = 0;
    public boolean e = false;
    public boolean f = false;

    public e79(ug0 ug0Var, ug0 ug0Var2, int i) {
        this.a = ug0Var;
        this.b = i;
        this.c = ug0Var2;
    }

    public static void b(ug0 ug0Var) {
        boolean z;
        byte b = ug0Var.n;
        if (b == 2) {
            if (b == 2) {
                z = true;
            } else {
                z = false;
            }
            gre.p(z);
            ug0Var.n = (byte) 1;
            ug0Var.x();
        }
    }

    public static boolean k(ug0 ug0Var) {
        if (ug0Var.n != 0) {
            return true;
        }
        return false;
    }

    public static void o(ug0 ug0Var, long j) {
        ug0Var.E = true;
        if (ug0Var instanceof zhb) {
            zhb zhbVar = (zhb) ug0Var;
            gre.p(zhbVar.E);
            zhbVar.c0 = j;
        }
    }

    public final void a(ug0 ug0Var, mb3 mb3Var) {
        boolean z;
        boolean z2 = true;
        if (this.a != ug0Var && this.c != ug0Var) {
            z = false;
        } else {
            z = true;
        }
        gre.p(z);
        if (!k(ug0Var)) {
            return;
        }
        if (ug0Var == ((ug0) mb3Var.e)) {
            mb3Var.f = null;
            mb3Var.e = null;
            mb3Var.a = true;
        }
        b(ug0Var);
        if (ug0Var.n != 1) {
            z2 = false;
        }
        gre.p(z2);
        ug0Var.c.m();
        ug0Var.n = (byte) 0;
        ug0Var.r = null;
        ug0Var.s = null;
        ug0Var.E = false;
        ug0Var.q();
        ug0Var.H = null;
        ug0Var.I = -9223372036854775807L;
    }

    public final int c() {
        int i;
        boolean k = k(this.a);
        ug0 ug0Var = this.c;
        if (ug0Var != null && k(ug0Var)) {
            i = 1;
        } else {
            i = 0;
        }
        return (k ? 1 : 0) + i;
    }

    public final ug0 d(tr6 tr6Var) {
        ip9 ip9Var;
        if (tr6Var != null && (ip9Var = tr6Var.c[this.b]) != null) {
            ug0 ug0Var = this.a;
            if (ug0Var.r == ip9Var) {
                return ug0Var;
            }
            ug0 ug0Var2 = this.c;
            if (ug0Var2 != null && ug0Var2.r == ip9Var) {
                return ug0Var2;
            }
            return null;
        }
        return null;
    }

    public final boolean e(tr6 tr6Var, ug0 ug0Var) {
        if (ug0Var != null) {
            ip9[] ip9VarArr = tr6Var.c;
            int i = this.b;
            ip9 ip9Var = ip9VarArr[i];
            ip9 ip9Var2 = ug0Var.r;
            if (ip9Var2 != null) {
                if (ip9Var2 == ip9Var) {
                    if (ip9Var != null && !ug0Var.m()) {
                        tr6 tr6Var2 = tr6Var.m;
                        if (tr6Var.g.f && tr6Var2 != null && tr6Var2.e && ((ug0Var instanceof zhb) || (ug0Var instanceof qd7) || ug0Var.y >= tr6Var2.e())) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
                do {
                    tr6Var = tr6Var.m;
                    if (tr6Var == null) {
                        return false;
                    }
                } while (!Objects.equals(tr6Var.c[i], ug0Var.r));
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean f() {
        boolean z;
        ug0 ug0Var = this.a;
        if (k(ug0Var)) {
            z = ug0Var.n();
        } else {
            z = true;
        }
        ug0 ug0Var2 = this.c;
        if (ug0Var2 != null && ug0Var2.n != 0) {
            return z & ug0Var2.n();
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

    public final boolean h(tr6 tr6Var) {
        boolean z;
        boolean z2;
        byte b = this.d;
        if ((b == 2 || b == 5) && d(tr6Var) == this.a) {
            z = true;
        } else {
            z = false;
        }
        byte b2 = this.d;
        if ((b2 == 3 || b2 == 4) && d(tr6Var) == this.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    public final boolean i(tr6 tr6Var) {
        if (d(tr6Var) != null) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        byte b = this.d;
        if (b != 0 && b != 2 && b != 5) {
            ug0 ug0Var = this.c;
            ug0Var.getClass();
            if (ug0Var.n != 0) {
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
                ug0 ug0Var = this.a;
                if (ug0Var.n != 0) {
                    z2 = false;
                }
                gre.p(z2);
                ug0Var.c.m();
                ug0Var.v();
                this.e = false;
            }
        } else if (this.f) {
            ug0 ug0Var2 = this.c;
            ug0Var2.getClass();
            if (ug0Var2.n != 0) {
                z2 = false;
            }
            gre.p(z2);
            ug0Var2.c.m();
            ug0Var2.v();
            this.f = false;
        }
    }

    public final int m(ug0 ug0Var, tr6 tr6Var, cyb cybVar, mb3 mb3Var) {
        ug0 ug0Var2;
        Object[] objArr;
        int i;
        byte b;
        byte b2;
        ip9[] ip9VarArr = tr6Var.c;
        if (ug0Var == null || ug0Var.n == 0 || (ug0Var == (ug0Var2 = this.a) && ((b2 = this.d) == 2 || b2 == 5))) {
            return 1;
        }
        if (ug0Var == this.c && ((b = this.d) == 3 || b == 4)) {
            return 1;
        }
        ip9 ip9Var = ug0Var.r;
        int i2 = this.b;
        boolean z = false;
        if (ip9Var != ip9VarArr[i2]) {
            objArr = 1;
        } else {
            objArr = null;
        }
        boolean q = cybVar.q(i2);
        if (!q || objArr != null) {
            if (!ug0Var.E) {
                k64 k64Var = ((k64[]) cybVar.d)[i2];
                if (k64Var != null) {
                    i = k64Var.length();
                } else {
                    i = 0;
                }
                fm4[] fm4VarArr = new fm4[i];
                for (int i3 = 0; i3 < i; i3++) {
                    k64Var.getClass();
                    fm4VarArr[i3] = k64Var.i(i3);
                }
                ip9 ip9Var2 = ip9VarArr[i2];
                ip9Var2.getClass();
                ug0Var.C(fm4VarArr, ip9Var2, tr6Var.e(), tr6Var.p, tr6Var.g.a);
                return 3;
            } else if (!ug0Var.n()) {
                return 0;
            } else {
                a(ug0Var, mb3Var);
                if (!q || g()) {
                    if (ug0Var == ug0Var2) {
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
        ug0 ug0Var = this.c;
        if (ug0Var == null || ug0Var.n != 0) {
            return;
        }
        l(false);
    }

    public final void p() {
        byte b;
        ug0 ug0Var = this.a;
        byte b2 = ug0Var.n;
        boolean z = false;
        if (b2 == 1 && this.d != 5) {
            if (b2 == 1) {
                z = true;
            }
            gre.p(z);
            ug0Var.n = (byte) 2;
            ug0Var.w();
            return;
        }
        ug0 ug0Var2 = this.c;
        if (ug0Var2 != null && (b = ug0Var2.n) == 1 && this.d != 4) {
            if (b == 1) {
                z = true;
            }
            gre.p(z);
            ug0Var2.n = (byte) 2;
            ug0Var2.w();
        }
    }
}
