package m2;

import e2.l1;
import x2.f0;
public final class f {
    public final String f20131a;
    public int f20132b;
    public long f20133c;
    public final f0 d;
    public boolean f20134e;
    public boolean f20135f;
    public final g f20136g;

    public f(g gVar, String str, int i7, f0 f0Var) {
        long j3;
        this.f20136g = gVar;
        this.f20131a = str;
        this.f20132b = i7;
        if (f0Var == null) {
            j3 = -1;
        } else {
            j3 = f0Var.d;
        }
        this.f20133c = j3;
        if (f0Var != null && f0Var.b()) {
            this.d = f0Var;
        }
    }

    public final boolean a(a aVar) {
        f0 f0Var = aVar.d;
        l1 l1Var = aVar.f20113b;
        if (f0Var == null) {
            if (this.f20132b != aVar.f20114c) {
                return true;
            }
            return false;
        }
        long j3 = this.f20133c;
        if (j3 != -1) {
            if (f0Var.d <= j3) {
                f0 f0Var2 = this.d;
                if (f0Var2 != null) {
                    int i7 = f0Var2.f59524b;
                    int b10 = l1Var.b(f0Var.f59523a);
                    int b11 = l1Var.b(f0Var2.f59523a);
                    if (f0Var.d >= f0Var2.d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (f0Var.b()) {
                                int i10 = f0Var.f59524b;
                                int i11 = f0Var.f59525c;
                                if (i10 <= i7) {
                                    if (i10 == i7 && i11 > f0Var2.f59525c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i12 = f0Var.f59526e;
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
