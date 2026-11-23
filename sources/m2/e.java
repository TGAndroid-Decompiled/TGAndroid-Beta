package m2;

import e2.l1;
import x2.g0;
public final class e {
    public final String f20585a;
    public int f20586b;
    public long f20587c;
    public final g0 d;
    public boolean f20588e;
    public boolean f20589f;
    public final f f20590g;

    public e(f fVar, String str, int i7, g0 g0Var) {
        long j3;
        this.f20590g = fVar;
        this.f20585a = str;
        this.f20586b = i7;
        if (g0Var == null) {
            j3 = -1;
        } else {
            j3 = g0Var.d;
        }
        this.f20587c = j3;
        if (g0Var != null && g0Var.b()) {
            this.d = g0Var;
        }
    }

    public final boolean a(a aVar) {
        g0 g0Var = aVar.d;
        l1 l1Var = aVar.f20570b;
        if (g0Var == null) {
            if (this.f20586b != aVar.f20571c) {
                return true;
            }
            return false;
        }
        long j3 = this.f20587c;
        if (j3 != -1) {
            if (g0Var.d <= j3) {
                g0 g0Var2 = this.d;
                if (g0Var2 != null) {
                    int i7 = g0Var2.f60217b;
                    int b10 = l1Var.b(g0Var.f60216a);
                    int b11 = l1Var.b(g0Var2.f60216a);
                    if (g0Var.d >= g0Var2.d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (g0Var.b()) {
                                int i10 = g0Var.f60217b;
                                int i11 = g0Var.f60218c;
                                if (i10 <= i7) {
                                    if (i10 == i7 && i11 > g0Var2.f60218c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i12 = g0Var.f60219e;
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
        throw new UnsupportedOperationException("Method not decompiled: m2.e.b(e2.l1, e2.l1):boolean");
    }
}
