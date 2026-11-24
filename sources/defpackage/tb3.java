package defpackage;
public final class tb3 {
    public final String a;
    public int b;
    public long c;
    public final rx6 d;
    public boolean e;
    public boolean f;
    public final ub3 g;

    public tb3(ub3 ub3Var, String str, int i, rx6 rx6Var) {
        long j;
        this.g = ub3Var;
        this.a = str;
        this.b = i;
        if (rx6Var == null) {
            j = -1;
        } else {
            j = rx6Var.d;
        }
        this.c = j;
        if (rx6Var != null && rx6Var.c()) {
            this.d = rx6Var;
        }
    }

    public final boolean a(tj tjVar) {
        rx6 rx6Var = tjVar.d;
        aob aobVar = tjVar.b;
        if (rx6Var == null) {
            if (this.b != tjVar.c) {
                return true;
            }
            return false;
        }
        long j = this.c;
        if (j != -1) {
            if (rx6Var.d <= j) {
                rx6 rx6Var2 = this.d;
                if (rx6Var2 != null) {
                    int i = rx6Var2.b;
                    int b = aobVar.b(rx6Var.a);
                    int b2 = aobVar.b(rx6Var2.a);
                    if (rx6Var.d >= rx6Var2.d && b >= b2) {
                        if (b <= b2) {
                            if (rx6Var.c()) {
                                int i2 = rx6Var.b;
                                int i3 = rx6Var.c;
                                if (i2 <= i) {
                                    if (i2 == i && i3 > rx6Var2.c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i4 = rx6Var.e;
                            if (i4 == -1 || i4 > i) {
                                return true;
                            }
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b(defpackage.aob r7, defpackage.aob r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb3.b(aob, aob):boolean");
    }
}
