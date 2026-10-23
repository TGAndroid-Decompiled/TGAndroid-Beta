package j2;

import b2.o1;
import u2.h0;
public final class f {
    public final String f13990a;
    public int f13991b;
    public long f13992c;
    public final h0 d;
    public boolean e;
    public boolean f13993f;
    public final g f13994g;

    public f(g gVar, String str, int i10, h0 h0Var) {
        long j10;
        this.f13994g = gVar;
        this.f13990a = str;
        this.f13991b = i10;
        if (h0Var == null) {
            j10 = -1;
        } else {
            j10 = h0Var.d;
        }
        this.f13992c = j10;
        if (h0Var != null && h0Var.b()) {
            this.d = h0Var;
        }
    }

    public final boolean a(a aVar) {
        h0 h0Var = aVar.d;
        o1 o1Var = aVar.f13974b;
        if (h0Var == null) {
            if (this.f13991b != aVar.f13975c) {
                return true;
            }
            return false;
        }
        long j10 = this.f13992c;
        if (j10 != -1) {
            if (h0Var.d <= j10) {
                h0 h0Var2 = this.d;
                if (h0Var2 != null) {
                    int i10 = h0Var2.f47768b;
                    int b10 = o1Var.b(h0Var.f47767a);
                    int b11 = o1Var.b(h0Var2.f47767a);
                    if (h0Var.d >= h0Var2.d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (h0Var.b()) {
                                int i11 = h0Var.f47768b;
                                int i12 = h0Var.f47769c;
                                if (i11 <= i10) {
                                    if (i11 == i10 && i12 > h0Var2.f47769c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i13 = h0Var.e;
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
        throw new UnsupportedOperationException("Method not decompiled: j2.f.b(b2.o1, b2.o1):boolean");
    }
}
