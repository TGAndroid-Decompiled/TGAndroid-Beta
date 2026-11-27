package defpackage;
public final class mc3 {
    public final String a;
    public int b;
    public long c;
    public final vz6 d;
    public boolean e;
    public boolean f;
    public final nc3 g;

    public mc3(nc3 nc3Var, String str, int i, vz6 vz6Var) {
        long j;
        this.g = nc3Var;
        this.a = str;
        this.b = i;
        if (vz6Var == null) {
            j = -1;
        } else {
            j = vz6Var.d;
        }
        this.c = j;
        if (vz6Var != null && vz6Var.c()) {
            this.d = vz6Var;
        }
    }

    public final boolean a(uj ujVar) {
        vz6 vz6Var = ujVar.d;
        asb asbVar = ujVar.b;
        if (vz6Var == null) {
            if (this.b != ujVar.c) {
                return true;
            }
            return false;
        }
        long j = this.c;
        if (j != -1) {
            if (vz6Var.d <= j) {
                vz6 vz6Var2 = this.d;
                if (vz6Var2 != null) {
                    int i = vz6Var2.b;
                    int b = asbVar.b(vz6Var.a);
                    int b2 = asbVar.b(vz6Var2.a);
                    if (vz6Var.d >= vz6Var2.d && b >= b2) {
                        if (b <= b2) {
                            if (vz6Var.c()) {
                                int i2 = vz6Var.b;
                                int i3 = vz6Var.c;
                                if (i2 <= i) {
                                    if (i2 == i && i3 > vz6Var2.c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i4 = vz6Var.e;
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

    public final boolean b(defpackage.asb r7, defpackage.asb r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mc3.b(asb, asb):boolean");
    }
}
