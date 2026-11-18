package m2;

import e2.l1;
import x2.g0;
public final class e {
    public final String f20495a;
    public int f20496b;
    public long f20497c;
    public final g0 d;
    public boolean f20498e;
    public boolean f20499f;
    public final f f20500g;

    public e(f fVar, String str, int i7, g0 g0Var) {
        long j3;
        this.f20500g = fVar;
        this.f20495a = str;
        this.f20496b = i7;
        if (g0Var == null) {
            j3 = -1;
        } else {
            j3 = g0Var.d;
        }
        this.f20497c = j3;
        if (g0Var != null && g0Var.b()) {
            this.d = g0Var;
        }
    }

    public final boolean a(a aVar) {
        g0 g0Var = aVar.d;
        l1 l1Var = aVar.f20480b;
        if (g0Var == null) {
            if (this.f20496b != aVar.f20481c) {
                return true;
            }
            return false;
        }
        long j3 = this.f20497c;
        if (j3 != -1) {
            if (g0Var.d <= j3) {
                g0 g0Var2 = this.d;
                if (g0Var2 != null) {
                    int i7 = g0Var2.f60088b;
                    int b10 = l1Var.b(g0Var.f60087a);
                    int b11 = l1Var.b(g0Var2.f60087a);
                    if (g0Var.d >= g0Var2.d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (g0Var.b()) {
                                int i10 = g0Var.f60088b;
                                int i11 = g0Var.f60089c;
                                if (i10 <= i7) {
                                    if (i10 == i7 && i11 > g0Var2.f60089c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i12 = g0Var.f60090e;
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
