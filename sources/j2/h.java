package j2;

import b2.o1;
import u2.g0;
public final class h {
    public final String f9357a;
    public int f9358b;
    public long f9359c;
    public final g0 d;
    public boolean e;
    public boolean f9360f;
    public final i f9361g;

    public h(i iVar, String str, int i10, g0 g0Var) {
        long j10;
        this.f9361g = iVar;
        this.f9357a = str;
        this.f9358b = i10;
        if (g0Var == null) {
            j10 = -1;
        } else {
            j10 = g0Var.d;
        }
        this.f9359c = j10;
        if (g0Var != null && g0Var.b()) {
            this.d = g0Var;
        }
    }

    public final boolean a(a aVar) {
        g0 g0Var = aVar.d;
        o1 o1Var = aVar.f9336b;
        if (g0Var == null) {
            if (this.f9358b != aVar.f9337c) {
                return true;
            }
            return false;
        }
        long j10 = this.f9359c;
        if (j10 != -1) {
            if (g0Var.d <= j10) {
                g0 g0Var2 = this.d;
                if (g0Var2 != null) {
                    int i10 = g0Var2.f49876b;
                    int b10 = o1Var.b(g0Var.f49875a);
                    int b11 = o1Var.b(g0Var2.f49875a);
                    if (g0Var.d >= g0Var2.d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (g0Var.b()) {
                                int i11 = g0Var.f49876b;
                                int i12 = g0Var.f49877c;
                                if (i11 <= i10) {
                                    if (i11 == i10 && i12 > g0Var2.f49877c) {
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
        throw new UnsupportedOperationException("Method not decompiled: j2.h.b(b2.o1, b2.o1):boolean");
    }
}
