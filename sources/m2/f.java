package m2;

import e2.l1;
import x2.f0;
public final class f {
    public final String f19540a;
    public int f19541b;
    public long f19542c;
    public final f0 d;
    public boolean f19543e;
    public boolean f19544f;
    public final g f19545g;

    public f(g gVar, String str, int i7, f0 f0Var) {
        long j3;
        this.f19545g = gVar;
        this.f19540a = str;
        this.f19541b = i7;
        if (f0Var == null) {
            j3 = -1;
        } else {
            j3 = f0Var.d;
        }
        this.f19542c = j3;
        if (f0Var != null && f0Var.b()) {
            this.d = f0Var;
        }
    }

    public final boolean a(a aVar) {
        f0 f0Var = aVar.d;
        l1 l1Var = aVar.f19524b;
        if (f0Var == null) {
            if (this.f19541b != aVar.f19525c) {
                return true;
            }
            return false;
        }
        long j3 = this.f19542c;
        if (j3 != -1) {
            if (f0Var.d <= j3) {
                f0 f0Var2 = this.d;
                if (f0Var2 != null) {
                    int i7 = f0Var2.f58343b;
                    int b10 = l1Var.b(f0Var.f58342a);
                    int b11 = l1Var.b(f0Var2.f58342a);
                    if (f0Var.d >= f0Var2.d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (f0Var.b()) {
                                int i10 = f0Var.f58343b;
                                int i11 = f0Var.f58344c;
                                if (i10 <= i7) {
                                    if (i10 == i7 && i11 > f0Var2.f58344c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i12 = f0Var.f58345e;
                            if (i12 == -1 || i12 > i7) {
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

    public final boolean b(e2.l1 r7, e2.l1 r8) {
        throw new UnsupportedOperationException("Method not decompiled: m2.f.b(e2.l1, e2.l1):boolean");
    }
}
