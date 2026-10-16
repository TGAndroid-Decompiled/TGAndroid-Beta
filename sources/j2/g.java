package j2;

import b2.p1;
import u2.g0;
public final class g {
    public final String f12535a;
    public int f12536b;
    public long f12537c;
    public final g0 d;
    public boolean e;
    public boolean f12538f;
    public final h f12539g;

    public g(h hVar, String str, int i10, g0 g0Var) {
        long j10;
        this.f12539g = hVar;
        this.f12535a = str;
        this.f12536b = i10;
        if (g0Var == null) {
            j10 = -1;
        } else {
            j10 = g0Var.d;
        }
        this.f12537c = j10;
        if (g0Var != null && g0Var.b()) {
            this.d = g0Var;
        }
    }

    public final boolean a(a aVar) {
        g0 g0Var = aVar.d;
        p1 p1Var = aVar.f12518b;
        if (g0Var == null) {
            if (this.f12536b != aVar.f12519c) {
                return true;
            }
            return false;
        }
        long j10 = this.f12537c;
        if (j10 != -1) {
            if (g0Var.d <= j10) {
                g0 g0Var2 = this.d;
                if (g0Var2 != null) {
                    int i10 = g0Var2.f45921b;
                    int b10 = p1Var.b(g0Var.f45920a);
                    int b11 = p1Var.b(g0Var2.f45920a);
                    if (g0Var.d >= g0Var2.d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (g0Var.b()) {
                                int i11 = g0Var.f45921b;
                                int i12 = g0Var.f45922c;
                                if (i11 <= i10) {
                                    if (i11 == i10 && i12 > g0Var2.f45922c) {
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

    public final boolean b(b2.p1 r7, b2.p1 r8) {
        throw new UnsupportedOperationException("Method not decompiled: j2.g.b(b2.p1, b2.p1):boolean");
    }
}
