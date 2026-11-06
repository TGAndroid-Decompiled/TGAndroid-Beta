package m2;

import e2.l1;
import x2.g0;
public final class f {
    public final String f19532a;
    public int f19533b;
    public long f19534c;
    public final g0 d;
    public boolean f19535e;
    public boolean f19536f;
    public final g f19537g;

    public f(g gVar, String str, int i7, g0 g0Var) {
        long j3;
        this.f19537g = gVar;
        this.f19532a = str;
        this.f19533b = i7;
        if (g0Var == null) {
            j3 = -1;
        } else {
            j3 = g0Var.d;
        }
        this.f19534c = j3;
        if (g0Var != null && g0Var.b()) {
            this.d = g0Var;
        }
    }

    public final boolean a(a aVar) {
        g0 g0Var = aVar.d;
        l1 l1Var = aVar.f19516b;
        if (g0Var == null) {
            if (this.f19533b != aVar.f19517c) {
                return true;
            }
            return false;
        }
        long j3 = this.f19534c;
        if (j3 != -1) {
            if (g0Var.d <= j3) {
                g0 g0Var2 = this.d;
                if (g0Var2 != null) {
                    int i7 = g0Var2.f58235b;
                    int b10 = l1Var.b(g0Var.f58234a);
                    int b11 = l1Var.b(g0Var2.f58234a);
                    if (g0Var.d >= g0Var2.d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (g0Var.b()) {
                                int i10 = g0Var.f58235b;
                                int i11 = g0Var.f58236c;
                                if (i10 <= i7) {
                                    if (i10 == i7 && i11 > g0Var2.f58236c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i12 = g0Var.f58237e;
                            if (i12 == -1 || i12 > i7) {
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

    public final boolean b(e2.l1 r7, e2.l1 r8) {
        throw new UnsupportedOperationException("Method not decompiled: m2.f.b(e2.l1, e2.l1):boolean");
    }
}
