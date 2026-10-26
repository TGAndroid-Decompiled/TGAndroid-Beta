package j2;

import b2.p1;
import u2.g0;
public final class f {
    public final String f15203a;
    public int f15204b;
    public long f15205c;
    public final g0 d;
    public boolean e;
    public boolean f15206f;
    public final g f15207g;

    public f(g gVar, String str, int i10, g0 g0Var) {
        long j10;
        this.f15207g = gVar;
        this.f15203a = str;
        this.f15204b = i10;
        if (g0Var == null) {
            j10 = -1;
        } else {
            j10 = g0Var.d;
        }
        this.f15205c = j10;
        if (g0Var != null && g0Var.b()) {
            this.d = g0Var;
        }
    }

    public final boolean a(a aVar) {
        g0 g0Var = aVar.d;
        p1 p1Var = aVar.f15187b;
        if (g0Var == null) {
            if (this.f15204b != aVar.f15188c) {
                return true;
            }
            return false;
        }
        long j10 = this.f15205c;
        if (j10 != -1) {
            if (g0Var.d <= j10) {
                g0 g0Var2 = this.d;
                if (g0Var2 != null) {
                    int i10 = g0Var2.f49298b;
                    int b10 = p1Var.b(g0Var.f49297a);
                    int b11 = p1Var.b(g0Var2.f49297a);
                    if (g0Var.d >= g0Var2.d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (g0Var.b()) {
                                int i11 = g0Var.f49298b;
                                int i12 = g0Var.f49299c;
                                if (i11 <= i10) {
                                    if (i11 == i10 && i12 > g0Var2.f49299c) {
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
        throw new UnsupportedOperationException("Method not decompiled: j2.f.b(b2.p1, b2.p1):boolean");
    }
}
