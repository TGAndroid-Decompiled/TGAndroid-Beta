package j4;

import e2.k0;
import e2.l0;
public final class c0 implements h0 {
    public final b0 f9418a;
    public final e2.x f9419b = new e2.x(32);
    public int f9420c;
    public int d;
    public boolean e;
    public boolean f9421f;

    public c0(b0 b0Var) {
        this.f9418a = b0Var;
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
            i11 = xVar.f6208b + xVar.A();
        } else {
            i11 = -1;
        }
        if (this.f9421f) {
            if (z10) {
                this.f9421f = false;
                xVar.N(i11);
                this.d = 0;
            } else {
                return;
            }
        }
        while (xVar.a() > 0) {
            int i12 = this.d;
            e2.x xVar2 = this.f9419b;
            if (i12 < 3) {
                if (i12 == 0) {
                    int A = xVar.A();
                    xVar.N(xVar.f6208b - 1);
                    if (A == 255) {
                        this.f9421f = true;
                        return;
                    }
                }
                int min = Math.min(xVar.a(), 3 - this.d);
                xVar.k(this.d, min, xVar2.f6207a);
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
                    this.f9420c = i14;
                    byte[] bArr = xVar2.f6207a;
                    if (bArr.length < i14) {
                        xVar2.c(Math.min(4098, Math.max(i14, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(xVar.a(), this.f9420c - this.d);
                xVar.k(this.d, min2, xVar2.f6207a);
                int i15 = this.d + min2;
                this.d = i15;
                int i16 = this.f9420c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (this.e) {
                        if (l0.p(0, i16, -1, xVar2.f6207a) != 0) {
                            this.f9421f = true;
                            return;
                        }
                        xVar2.M(this.f9420c - 4);
                    } else {
                        xVar2.M(i16);
                    }
                    xVar2.N(0);
                    this.f9418a.c(xVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override
    public final void d(k0 k0Var, c3.q qVar, g0 g0Var) {
        this.f9418a.d(k0Var, qVar, g0Var);
        this.f9421f = true;
    }

    @Override
    public final void e() {
        this.f9421f = true;
    }
}
