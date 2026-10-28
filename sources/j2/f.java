package j2;

import b2.p1;
import u2.g0;
public final class f {
    public final String f15202a;
    public int f15203b;
    public long f15204c;
    public final g0 d;
    public boolean e;
    public boolean f15205f;
    public final g f15206g;

    public f(g gVar, String str, int i10, g0 g0Var) {
        long j10;
        this.f15206g = gVar;
        this.f15202a = str;
        this.f15203b = i10;
        if (g0Var == null) {
            j10 = -1;
        } else {
            j10 = g0Var.d;
        }
        this.f15204c = j10;
        if (g0Var != null && g0Var.b()) {
            this.d = g0Var;
        }
    }

    public final boolean a(a aVar) {
        g0 g0Var = aVar.d;
        p1 p1Var = aVar.f15186b;
        if (g0Var == null) {
            if (this.f15203b != aVar.f15187c) {
                return true;
            }
            return false;
        }
        long j10 = this.f15204c;
        if (j10 != -1) {
            if (g0Var.d <= j10) {
                g0 g0Var2 = this.d;
                if (g0Var2 != null) {
                    int i10 = g0Var2.f49333b;
                    int b10 = p1Var.b(g0Var.f49332a);
                    int b11 = p1Var.b(g0Var2.f49332a);
                    if (g0Var.d >= g0Var2.d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (g0Var.b()) {
                                int i11 = g0Var.f49333b;
                                int i12 = g0Var.f49334c;
                                if (i11 <= i10) {
                                    if (i11 == i10 && i12 > g0Var2.f49334c) {
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
