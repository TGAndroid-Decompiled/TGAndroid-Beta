package j2;

import b2.p1;
import u2.g0;
public final class g {
    public final String f12531a;
    public int f12532b;
    public long f12533c;
    public final g0 d;
    public boolean e;
    public boolean f12534f;
    public final h f12535g;

    public g(h hVar, String str, int i10, g0 g0Var) {
        long j10;
        this.f12535g = hVar;
        this.f12531a = str;
        this.f12532b = i10;
        if (g0Var == null) {
            j10 = -1;
        } else {
            j10 = g0Var.d;
        }
        this.f12533c = j10;
        if (g0Var != null && g0Var.b()) {
            this.d = g0Var;
        }
    }

    public final boolean a(a aVar) {
        g0 g0Var = aVar.d;
        p1 p1Var = aVar.f12514b;
        if (g0Var == null) {
            if (this.f12532b != aVar.f12515c) {
                return true;
            }
            return false;
        }
        long j10 = this.f12533c;
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
