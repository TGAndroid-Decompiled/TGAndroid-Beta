package k3;

import j3.r2;
import l4.c0;
public final class g {
    public final String f13420a;
    public int f13421b;
    public long f13422c;
    public final c0 d;
    public boolean f13423e;
    public boolean f13424f;
    public final h f13425g;

    public g(h hVar, String str, int i10, c0 c0Var) {
        long j10;
        this.f13425g = hVar;
        this.f13420a = str;
        this.f13421b = i10;
        if (c0Var == null) {
            j10 = -1;
        } else {
            j10 = c0Var.d;
        }
        this.f13422c = j10;
        if (c0Var != null && c0Var.a()) {
            this.d = c0Var;
        }
    }

    public final boolean a(a aVar) {
        c0 c0Var = aVar.d;
        r2 r2Var = aVar.f13400b;
        if (c0Var == null) {
            if (this.f13421b != aVar.f13401c) {
                return true;
            }
            return false;
        }
        long j10 = this.f13422c;
        if (j10 != -1) {
            if (c0Var.d <= j10) {
                c0 c0Var2 = this.d;
                if (c0Var2 != null) {
                    int i10 = c0Var2.f14263b;
                    int b10 = r2Var.b(c0Var.f14262a);
                    int b11 = r2Var.b(c0Var2.f14262a);
                    if (c0Var.d >= c0Var2.d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (c0Var.a()) {
                                int i11 = c0Var.f14263b;
                                int i12 = c0Var.f14264c;
                                if (i11 <= i10) {
                                    if (i11 == i10 && i12 > c0Var2.f14264c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i13 = c0Var.f14265e;
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

    public final boolean b(j3.r2 r7, j3.r2 r8) {
        throw new UnsupportedOperationException("Method not decompiled: k3.g.b(j3.r2, j3.r2):boolean");
    }
}
