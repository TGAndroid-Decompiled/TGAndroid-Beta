package defpackage;
public final class fd3 {
    public final String a;
    public int b;
    public long c;
    public final rz6 d;
    public boolean e;
    public boolean f;
    public final gd3 g;

    public fd3(gd3 gd3Var, String str, int i, rz6 rz6Var) {
        long j;
        this.g = gd3Var;
        this.a = str;
        this.b = i;
        if (rz6Var == null) {
            j = -1;
        } else {
            j = rz6Var.d;
        }
        this.c = j;
        if (rz6Var != null && rz6Var.c()) {
            this.d = rz6Var;
        }
    }

    public final boolean a(tk tkVar) {
        rz6 rz6Var = tkVar.d;
        bqb bqbVar = tkVar.b;
        if (rz6Var == null) {
            if (this.b != tkVar.c) {
                return true;
            }
            return false;
        }
        long j = this.c;
        if (j != -1) {
            if (rz6Var.d <= j) {
                rz6 rz6Var2 = this.d;
                if (rz6Var2 != null) {
                    int i = rz6Var2.b;
                    int b = bqbVar.b(rz6Var.a);
                    int b2 = bqbVar.b(rz6Var2.a);
                    if (rz6Var.d >= rz6Var2.d && b >= b2) {
                        if (b <= b2) {
                            if (rz6Var.c()) {
                                int i2 = rz6Var.b;
                                int i3 = rz6Var.c;
                                if (i2 <= i) {
                                    if (i2 == i && i3 > rz6Var2.c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i4 = rz6Var.e;
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

    public final boolean b(defpackage.bqb r7, defpackage.bqb r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd3.b(bqb, bqb):boolean");
    }
}
