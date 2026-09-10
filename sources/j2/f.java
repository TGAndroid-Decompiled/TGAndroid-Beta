package j2;

import b2.k1;
import u2.g0;
public final class f {
    public final String f11468a;
    public int f11469b;
    public long f11470c;
    public final g0 d;
    public boolean e;
    public boolean f11471f;
    public final g f11472g;

    public f(g gVar, String str, int i10, g0 g0Var) {
        long j3;
        this.f11472g = gVar;
        this.f11468a = str;
        this.f11469b = i10;
        if (g0Var == null) {
            j3 = -1;
        } else {
            j3 = g0Var.d;
        }
        this.f11470c = j3;
        if (g0Var != null && g0Var.b()) {
            this.d = g0Var;
        }
    }

    public final boolean a(a aVar) {
        g0 g0Var = aVar.d;
        k1 k1Var = aVar.f11452b;
        if (g0Var == null) {
            if (this.f11469b != aVar.f11453c) {
                return true;
            }
            return false;
        }
        long j3 = this.f11470c;
        if (j3 != -1) {
            if (g0Var.d <= j3) {
                g0 g0Var2 = this.d;
                if (g0Var2 != null) {
                    int i10 = g0Var2.f42325b;
                    int b10 = k1Var.b(g0Var.f42324a);
                    int b11 = k1Var.b(g0Var2.f42324a);
                    if (g0Var.d >= g0Var2.d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (g0Var.b()) {
                                int i11 = g0Var.f42325b;
                                int i12 = g0Var.f42326c;
                                if (i11 <= i10) {
                                    if (i11 == i10 && i12 > g0Var2.f42326c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i13 = g0Var.e;
                            if (i13 == -1 || i13 > i10) {
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

    public final boolean b(b2.k1 r7, b2.k1 r8) {
        throw new UnsupportedOperationException("Method not decompiled: j2.f.b(b2.k1, b2.k1):boolean");
    }
}
