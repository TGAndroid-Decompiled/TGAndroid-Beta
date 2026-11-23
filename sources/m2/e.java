package m2;

import e2.l1;
import x2.g0;
public final class e {
    public final String f20489a;
    public int f20490b;
    public long f20491c;
    public final g0 d;
    public boolean f20492e;
    public boolean f20493f;
    public final f f20494g;

    public e(f fVar, String str, int i7, g0 g0Var) {
        long j3;
        this.f20494g = fVar;
        this.f20489a = str;
        this.f20490b = i7;
        if (g0Var == null) {
            j3 = -1;
        } else {
            j3 = g0Var.d;
        }
        this.f20491c = j3;
        if (g0Var != null && g0Var.b()) {
            this.d = g0Var;
        }
    }

    public final boolean a(a aVar) {
        g0 g0Var = aVar.d;
        l1 l1Var = aVar.f20474b;
        if (g0Var == null) {
            if (this.f20490b != aVar.f20475c) {
                return true;
            }
            return false;
        }
        long j3 = this.f20491c;
        if (j3 != -1) {
            if (g0Var.d <= j3) {
                g0 g0Var2 = this.d;
                if (g0Var2 != null) {
                    int i7 = g0Var2.f60099b;
                    int b10 = l1Var.b(g0Var.f60098a);
                    int b11 = l1Var.b(g0Var2.f60098a);
                    if (g0Var.d >= g0Var2.d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (g0Var.b()) {
                                int i10 = g0Var.f60099b;
                                int i11 = g0Var.f60100c;
                                if (i10 <= i7) {
                                    if (i10 == i7 && i11 > g0Var2.f60100c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i12 = g0Var.f60101e;
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
