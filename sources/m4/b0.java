package m4;

import h2.k0;
import h2.l0;
public final class b0 implements g0 {
    public final a0 f20550a;
    public final h2.x f20551b = new h2.x(32);
    public int f20552c;
    public int d;
    public boolean f20553e;
    public boolean f20554f;

    public b0(a0 a0Var) {
        this.f20550a = a0Var;
    }

    @Override
    public final void a(int i7, h2.x xVar) {
        boolean z10;
        int i10;
        boolean z11;
        if ((i7 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = xVar.f13837b + xVar.A();
        } else {
            i10 = -1;
        }
        if (this.f20554f) {
            if (z10) {
                this.f20554f = false;
                xVar.N(i10);
                this.d = 0;
            } else {
                return;
            }
        }
        while (xVar.a() > 0) {
            int i11 = this.d;
            h2.x xVar2 = this.f20551b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int A = xVar.A();
                    xVar.N(xVar.f13837b - 1);
                    if (A == 255) {
                        this.f20554f = true;
                        return;
                    }
                }
                int min = Math.min(xVar.a(), 3 - this.d);
                xVar.k(this.d, min, xVar2.f13836a);
                int i12 = this.d + min;
                this.d = i12;
                if (i12 == 3) {
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
                    this.f20553e = z11;
                    int i13 = (((A2 & 15) << 8) | A3) + 3;
                    this.f20552c = i13;
                    byte[] bArr = xVar2.f13836a;
                    if (bArr.length < i13) {
                        xVar2.c(Math.min(4098, Math.max(i13, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(xVar.a(), this.f20552c - this.d);
                xVar.k(this.d, min2, xVar2.f13836a);
                int i14 = this.d + min2;
                this.d = i14;
                int i15 = this.f20552c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.f20553e) {
                        if (l0.p(0, i15, -1, xVar2.f13836a) != 0) {
                            this.f20554f = true;
                            return;
                        }
                        xVar2.M(this.f20552c - 4);
                    } else {
                        xVar2.M(i15);
                    }
                    xVar2.N(0);
                    this.f20550a.c(xVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override
    public final void b(k0 k0Var, f3.q qVar, f0 f0Var) {
        this.f20550a.b(k0Var, qVar, f0Var);
        this.f20554f = true;
    }

    @Override
    public final void d() {
        this.f20554f = true;
    }
}
