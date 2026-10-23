package j4;

import e2.k0;
import e2.m0;
public final class b0 implements g0 {
    public final a0 f14040a;
    public final e2.x f14041b = new e2.x(32);
    public int f14042c;
    public int d;
    public boolean e;
    public boolean f14043f;

    public b0(a0 a0Var) {
        this.f14040a = a0Var;
    }

    @Override
    public final void a(int i10, e2.x xVar) {
        boolean z10;
        int i11;
        boolean z11;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i11 = xVar.f8299b + xVar.A();
        } else {
            i11 = -1;
        }
        if (this.f14043f) {
            if (z10) {
                this.f14043f = false;
                xVar.N(i11);
                this.d = 0;
            } else {
                return;
            }
        }
        while (xVar.a() > 0) {
            int i12 = this.d;
            e2.x xVar2 = this.f14041b;
            if (i12 < 3) {
                if (i12 == 0) {
                    int A = xVar.A();
                    xVar.N(xVar.f8299b - 1);
                    if (A == 255) {
                        this.f14043f = true;
                        return;
                    }
                }
                int min = Math.min(xVar.a(), 3 - this.d);
                xVar.k(this.d, min, xVar2.f8298a);
                int i13 = this.d + min;
                this.d = i13;
                if (i13 == 3) {
                    xVar2.N(0);
                    xVar2.M(3);
                    xVar2.O(1);
                    int A2 = xVar2.A();
                    int A3 = xVar2.A();
                    if ((A2 & 128) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.e = z11;
                    int i14 = (((A2 & 15) << 8) | A3) + 3;
                    this.f14042c = i14;
                    byte[] bArr = xVar2.f8298a;
                    if (bArr.length < i14) {
                        xVar2.c(Math.min(4098, Math.max(i14, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(xVar.a(), this.f14042c - this.d);
                xVar.k(this.d, min2, xVar2.f8298a);
                int i15 = this.d + min2;
                this.d = i15;
                int i16 = this.f14042c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (this.e) {
                        if (m0.p(0, i16, -1, xVar2.f8298a) != 0) {
                            this.f14043f = true;
                            return;
                        }
                        xVar2.M(this.f14042c - 4);
                    } else {
                        xVar2.M(i16);
                    }
                    xVar2.N(0);
                    this.f14040a.a(xVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override
    public final void b(k0 k0Var, c3.s sVar, f0 f0Var) {
        this.f14040a.b(k0Var, sVar, f0Var);
        this.f14043f = true;
    }

    @Override
    public final void c() {
        this.f14043f = true;
    }
}
