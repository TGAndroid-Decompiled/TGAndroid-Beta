package j2;

import b2.o1;
import u2.g0;
public final class g {
    public final String f13945a;
    public int f13946b;
    public long f13947c;
    public final g0 d;
    public boolean e;
    public boolean f13948f;
    public final h f13949g;

    public g(h hVar, String str, int i10, g0 g0Var) {
        long j10;
        this.f13949g = hVar;
        this.f13945a = str;
        this.f13946b = i10;
        if (g0Var == null) {
            j10 = -1;
        } else {
            j10 = g0Var.d;
        }
        this.f13947c = j10;
        if (g0Var != null && g0Var.b()) {
            this.d = g0Var;
        }
    }

    public final boolean a(a aVar) {
        g0 g0Var = aVar.d;
        o1 o1Var = aVar.f13928b;
        if (g0Var == null) {
            if (this.f13946b != aVar.f13929c) {
                return true;
            }
            return false;
        }
        long j10 = this.f13947c;
        if (j10 != -1) {
            if (g0Var.d <= j10) {
                g0 g0Var2 = this.d;
                if (g0Var2 != null) {
                    int i10 = g0Var2.f47319b;
                    int b10 = o1Var.b(g0Var.f47318a);
                    int b11 = o1Var.b(g0Var2.f47318a);
                    if (g0Var.d >= g0Var2.d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (g0Var.b()) {
                                int i11 = g0Var.f47319b;
                                int i12 = g0Var.f47320c;
                                if (i11 <= i10) {
                                    if (i11 == i10 && i12 > g0Var2.f47320c) {
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

    public final boolean b(b2.o1 r7, b2.o1 r8) {
        throw new UnsupportedOperationException("Method not decompiled: j2.g.b(b2.o1, b2.o1):boolean");
    }
}
