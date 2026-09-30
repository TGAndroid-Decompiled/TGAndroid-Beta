package j2;

import b2.k1;
import u2.f0;
public final class g {
    public final String f12585a;
    public int f12586b;
    public long f12587c;
    public final f0 d;
    public boolean e;
    public boolean f12588f;
    public final h f12589g;

    public g(h hVar, String str, int i10, f0 f0Var) {
        long j3;
        this.f12589g = hVar;
        this.f12585a = str;
        this.f12586b = i10;
        if (f0Var == null) {
            j3 = -1;
        } else {
            j3 = f0Var.d;
        }
        this.f12587c = j3;
        if (f0Var != null && f0Var.b()) {
            this.d = f0Var;
        }
    }

    public final boolean a(a aVar) {
        f0 f0Var = aVar.d;
        k1 k1Var = aVar.f12568b;
        if (f0Var == null) {
            if (this.f12586b != aVar.f12569c) {
                return true;
            }
            return false;
        }
        long j3 = this.f12587c;
        if (j3 != -1) {
            if (f0Var.d <= j3) {
                f0 f0Var2 = this.d;
                if (f0Var2 != null) {
                    int i10 = f0Var2.f43750b;
                    int b10 = k1Var.b(f0Var.f43749a);
                    int b11 = k1Var.b(f0Var2.f43749a);
                    if (f0Var.d >= f0Var2.d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (f0Var.b()) {
                                int i11 = f0Var.f43750b;
                                int i12 = f0Var.f43751c;
                                if (i11 <= i10) {
                                    if (i11 == i10 && i12 > f0Var2.f43751c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i13 = f0Var.e;
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
