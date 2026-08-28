package i3;

import h3.r2;
import j4.d0;
public final class g {
    public final String f10896a;
    public int f10897b;
    public long f10898c;
    public final d0 d;
    public boolean f10899e;
    public boolean f10900f;
    public final h f10901g;

    public g(h hVar, String str, int i9, d0 d0Var) {
        long j10;
        this.f10901g = hVar;
        this.f10896a = str;
        this.f10897b = i9;
        if (d0Var == null) {
            j10 = -1;
        } else {
            j10 = d0Var.d;
        }
        this.f10898c = j10;
        if (d0Var != null && d0Var.a()) {
            this.d = d0Var;
        }
    }

    public final boolean a(a aVar) {
        d0 d0Var = aVar.d;
        r2 r2Var = aVar.f10876b;
        if (d0Var == null) {
            if (this.f10897b != aVar.f10877c) {
                return true;
            }
            return false;
        }
        long j10 = this.f10898c;
        if (j10 != -1) {
            if (d0Var.d <= j10) {
                d0 d0Var2 = this.d;
                if (d0Var2 != null) {
                    int i9 = d0Var2.f13427b;
                    int b10 = r2Var.b(d0Var.f13426a);
                    int b11 = r2Var.b(d0Var2.f13426a);
                    if (d0Var.d >= d0Var2.d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (d0Var.a()) {
                                int i10 = d0Var.f13427b;
                                int i11 = d0Var.f13428c;
                                if (i10 <= i9) {
                                    if (i10 == i9 && i11 > d0Var2.f13428c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i12 = d0Var.f13429e;
                            if (i12 == -1 || i12 > i9) {
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

    public final boolean b(h3.r2 r7, h3.r2 r8) {
        throw new UnsupportedOperationException("Method not decompiled: i3.g.b(h3.r2, h3.r2):boolean");
    }
}
