package l2;

import d2.n1;
import w2.g0;
public final class g {
    public final String f17701a;
    public int f17702b;
    public long f17703c;
    public final g0 d;
    public boolean f17704e;
    public boolean f17705f;
    public final h f17706g;

    public g(h hVar, String str, int i3, g0 g0Var) {
        long j10;
        this.f17706g = hVar;
        this.f17701a = str;
        this.f17702b = i3;
        if (g0Var == null) {
            j10 = -1;
        } else {
            j10 = g0Var.d;
        }
        this.f17703c = j10;
        if (g0Var != null && g0Var.b()) {
            this.d = g0Var;
        }
    }

    public final boolean a(a aVar) {
        g0 g0Var = aVar.d;
        n1 n1Var = aVar.f17680b;
        if (g0Var == null) {
            if (this.f17702b != aVar.f17681c) {
                return true;
            }
            return false;
        }
        long j10 = this.f17703c;
        if (j10 != -1) {
            if (g0Var.d <= j10) {
                g0 g0Var2 = this.d;
                if (g0Var2 != null) {
                    int i3 = g0Var2.f57082b;
                    int b10 = n1Var.b(g0Var.f57081a);
                    int b11 = n1Var.b(g0Var2.f57081a);
                    if (g0Var.d >= g0Var2.d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (g0Var.b()) {
                                int i10 = g0Var.f57082b;
                                int i11 = g0Var.f57083c;
                                if (i10 <= i3) {
                                    if (i10 == i3 && i11 > g0Var2.f57083c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i12 = g0Var.f57084e;
                            if (i12 == -1 || i12 > i3) {
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

    public final boolean b(d2.n1 r7, d2.n1 r8) {
        throw new UnsupportedOperationException("Method not decompiled: l2.g.b(d2.n1, d2.n1):boolean");
    }
}
