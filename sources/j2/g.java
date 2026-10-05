package j2;

import b2.k1;
import u2.f0;
public final class g {
    public final String f13660a;
    public int f13661b;
    public long f13662c;
    public final f0 d;
    public boolean f13663e;
    public boolean f13664f;
    public final h f13665g;

    public g(h hVar, String str, int i10, f0 f0Var) {
        long j3;
        this.f13665g = hVar;
        this.f13660a = str;
        this.f13661b = i10;
        if (f0Var == null) {
            j3 = -1;
        } else {
            j3 = f0Var.d;
        }
        this.f13662c = j3;
        if (f0Var != null && f0Var.b()) {
            this.d = f0Var;
        }
    }

    public final boolean a(a aVar) {
        f0 f0Var = aVar.d;
        k1 k1Var = aVar.f13641b;
        if (f0Var == null) {
            if (this.f13661b != aVar.f13642c) {
                return true;
            }
            return false;
        }
        long j3 = this.f13662c;
        if (j3 != -1) {
            if (f0Var.d <= j3) {
                f0 f0Var2 = this.d;
                if (f0Var2 != null) {
                    int i10 = f0Var2.f47271b;
                    int b10 = k1Var.b(f0Var.f47270a);
                    int b11 = k1Var.b(f0Var2.f47270a);
                    if (f0Var.d >= f0Var2.d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (f0Var.b()) {
                                int i11 = f0Var.f47271b;
                                int i12 = f0Var.f47272c;
                                if (i11 <= i10) {
                                    if (i11 == i10 && i12 > f0Var2.f47272c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i13 = f0Var.f47273e;
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
