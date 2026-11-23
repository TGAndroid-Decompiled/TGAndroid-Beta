package m2;

import e2.l1;
import x2.g0;
public final class e {
    public final String f20523a;
    public int f20524b;
    public long f20525c;
    public final g0 d;
    public boolean f20526e;
    public boolean f20527f;
    public final f f20528g;

    public e(f fVar, String str, int i7, g0 g0Var) {
        long j3;
        this.f20528g = fVar;
        this.f20523a = str;
        this.f20524b = i7;
        if (g0Var == null) {
            j3 = -1;
        } else {
            j3 = g0Var.d;
        }
        this.f20525c = j3;
        if (g0Var != null && g0Var.b()) {
            this.d = g0Var;
        }
    }

    public final boolean a(a aVar) {
        g0 g0Var = aVar.d;
        l1 l1Var = aVar.f20508b;
        if (g0Var == null) {
            if (this.f20524b != aVar.f20509c) {
                return true;
            }
            return false;
        }
        long j3 = this.f20525c;
        if (j3 != -1) {
            if (g0Var.d <= j3) {
                g0 g0Var2 = this.d;
                if (g0Var2 != null) {
                    int i7 = g0Var2.f60134b;
                    int b10 = l1Var.b(g0Var.f60133a);
                    int b11 = l1Var.b(g0Var2.f60133a);
                    if (g0Var.d >= g0Var2.d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (g0Var.b()) {
                                int i10 = g0Var.f60134b;
                                int i11 = g0Var.f60135c;
                                if (i10 <= i7) {
                                    if (i10 == i7 && i11 > g0Var2.f60135c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i12 = g0Var.f60136e;
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
