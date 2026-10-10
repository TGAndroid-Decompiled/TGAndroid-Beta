package j2;

import b2.k1;
import u2.f0;
public final class g {
    public final String f13697a;
    public int f13698b;
    public long f13699c;
    public final f0 d;
    public boolean f13700e;
    public boolean f13701f;
    public final h f13702g;

    public g(h hVar, String str, int i10, f0 f0Var) {
        long j3;
        this.f13702g = hVar;
        this.f13697a = str;
        this.f13698b = i10;
        if (f0Var == null) {
            j3 = -1;
        } else {
            j3 = f0Var.d;
        }
        this.f13699c = j3;
        if (f0Var != null && f0Var.b()) {
            this.d = f0Var;
        }
    }

    public final boolean a(a aVar) {
        f0 f0Var = aVar.d;
        k1 k1Var = aVar.f13678b;
        if (f0Var == null) {
            if (this.f13698b != aVar.f13679c) {
                return true;
            }
            return false;
        }
        long j3 = this.f13699c;
        if (j3 != -1) {
            if (f0Var.d <= j3) {
                f0 f0Var2 = this.d;
                if (f0Var2 != null) {
                    int i10 = f0Var2.f48617b;
                    int b10 = k1Var.b(f0Var.f48616a);
                    int b11 = k1Var.b(f0Var2.f48616a);
                    if (f0Var.d >= f0Var2.d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (f0Var.b()) {
                                int i11 = f0Var.f48617b;
                                int i12 = f0Var.f48618c;
                                if (i11 <= i10) {
                                    if (i11 == i10 && i12 > f0Var2.f48618c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i13 = f0Var.f48619e;
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

    public final boolean b(b2.k1 r7, b2.k1 r8) {
        throw new UnsupportedOperationException("Method not decompiled: j2.g.b(b2.k1, b2.k1):boolean");
    }
}
