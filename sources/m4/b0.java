package m4;

import h2.k0;
import h2.m0;
public final class b0 implements h0 {
    public final a0 f19595a;
    public final h2.x f19596b = new h2.x(32);
    public int f19597c;
    public int d;
    public boolean f19598e;
    public boolean f19599f;

    public b0(a0 a0Var) {
        this.f19595a = a0Var;
    }

    @Override
    public final void a(int i7, h2.x xVar) {
        boolean z9;
        int i10;
        boolean z10;
        if ((i7 & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i10 = xVar.f14165b + xVar.A();
        } else {
            i10 = -1;
        }
        if (this.f19599f) {
            if (z9) {
                this.f19599f = false;
                xVar.N(i10);
                this.d = 0;
            } else {
                return;
            }
        }
        while (xVar.a() > 0) {
            int i11 = this.d;
            h2.x xVar2 = this.f19596b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int A = xVar.A();
                    xVar.N(xVar.f14165b - 1);
                    if (A == 255) {
                        this.f19599f = true;
                        return;
                    }
                }
                int min = Math.min(xVar.a(), 3 - this.d);
                xVar.k(this.d, min, xVar2.f14164a);
                int i12 = this.d + min;
                this.d = i12;
                if (i12 == 3) {
                    xVar2.N(0);
                    xVar2.M(3);
                    xVar2.O(1);
                    int A2 = xVar2.A();
                    int A3 = xVar2.A();
                    if ((A2 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f19598e = z10;
                    int i13 = (((A2 & 15) << 8) | A3) + 3;
                    this.f19597c = i13;
                    byte[] bArr = xVar2.f14164a;
                    if (bArr.length < i13) {
                        xVar2.c(Math.min(4098, Math.max(i13, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(xVar.a(), this.f19597c - this.d);
                xVar.k(this.d, min2, xVar2.f14164a);
                int i14 = this.d + min2;
                this.d = i14;
                int i15 = this.f19597c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.f19598e) {
                        if (m0.p(0, i15, -1, xVar2.f14164a) != 0) {
                            this.f19599f = true;
                            return;
                        }
                        xVar2.M(this.f19597c - 4);
                    } else {
                        xVar2.M(i15);
                    }
                    xVar2.N(0);
                    this.f19595a.c(xVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override
    public final void b(k0 k0Var, f3.q qVar, g0 g0Var) {
        this.f19595a.b(k0Var, qVar, g0Var);
        this.f19599f = true;
    }

    @Override
    public final void d() {
        this.f19599f = true;
    }
}
