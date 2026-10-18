package j2;

import b2.o1;
import u2.f0;
public final class g {
    public final String f13947a;
    public int f13948b;
    public long f13949c;
    public final f0 d;
    public boolean e;
    public boolean f13950f;
    public final h f13951g;

    public g(h hVar, String str, int i10, f0 f0Var) {
        long j10;
        this.f13951g = hVar;
        this.f13947a = str;
        this.f13948b = i10;
        if (f0Var == null) {
            j10 = -1;
        } else {
            j10 = f0Var.d;
        }
        this.f13949c = j10;
        if (f0Var != null && f0Var.b()) {
            this.d = f0Var;
        }
    }

    public final boolean a(a aVar) {
        f0 f0Var = aVar.d;
        o1 o1Var = aVar.f13930b;
        if (f0Var == null) {
            if (this.f13948b != aVar.f13931c) {
                return true;
            }
            return false;
        }
        long j10 = this.f13949c;
        if (j10 != -1) {
            if (f0Var.d <= j10) {
                f0 f0Var2 = this.d;
                if (f0Var2 != null) {
                    int i10 = f0Var2.f47348b;
                    int b10 = o1Var.b(f0Var.f47347a);
                    int b11 = o1Var.b(f0Var2.f47347a);
                    if (f0Var.d >= f0Var2.d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (f0Var.b()) {
                                int i11 = f0Var.f47348b;
                                int i12 = f0Var.f47349c;
                                if (i11 <= i10) {
                                    if (i11 == i10 && i12 > f0Var2.f47349c) {
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

    public final boolean b(b2.o1 r7, b2.o1 r8) {
        throw new UnsupportedOperationException("Method not decompiled: j2.g.b(b2.o1, b2.o1):boolean");
    }
}
