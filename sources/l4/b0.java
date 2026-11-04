package l4;

import g2.l0;
import g2.n0;
public final class b0 implements g0 {
    public final a0 f17756a;
    public final g2.y f17757b = new g2.y(32);
    public int f17758c;
    public int d;
    public boolean f17759e;
    public boolean f17760f;

    public b0(a0 a0Var) {
        this.f17756a = a0Var;
    }

    @Override
    public final void a() {
        this.f17760f = true;
    }

    @Override
    public final void b(l0 l0Var, e3.q qVar, f0 f0Var) {
        this.f17756a.b(l0Var, qVar, f0Var);
        this.f17760f = true;
    }

    @Override
    public final void c(int i3, g2.y yVar) {
        boolean z10;
        int i10;
        boolean z11;
        if ((i3 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = yVar.f11924b + yVar.A();
        } else {
            i10 = -1;
        }
        if (this.f17760f) {
            if (z10) {
                this.f17760f = false;
                yVar.N(i10);
                this.d = 0;
            } else {
                return;
            }
        }
        while (yVar.a() > 0) {
            int i11 = this.d;
            g2.y yVar2 = this.f17757b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int A = yVar.A();
                    yVar.N(yVar.f11924b - 1);
                    if (A == 255) {
                        this.f17760f = true;
                        return;
                    }
                }
                int min = Math.min(yVar.a(), 3 - this.d);
                yVar.k(this.d, min, yVar2.f11923a);
                int i12 = this.d + min;
                this.d = i12;
                if (i12 == 3) {
                    yVar2.N(0);
                    yVar2.M(3);
                    yVar2.O(1);
                    int A2 = yVar2.A();
                    int A3 = yVar2.A();
                    if ((A2 & 128) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f17759e = z11;
                    int i13 = (((A2 & 15) << 8) | A3) + 3;
                    this.f17758c = i13;
                    byte[] bArr = yVar2.f11923a;
                    if (bArr.length < i13) {
                        yVar2.c(Math.min(4098, Math.max(i13, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(yVar.a(), this.f17758c - this.d);
                yVar.k(this.d, min2, yVar2.f11923a);
                int i14 = this.d + min2;
                this.d = i14;
                int i15 = this.f17758c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.f17759e) {
                        if (n0.p(0, i15, -1, yVar2.f11923a) != 0) {
                            this.f17760f = true;
                            return;
                        }
                        yVar2.M(this.f17758c - 4);
                    } else {
                        yVar2.M(i15);
                    }
                    yVar2.N(0);
                    this.f17756a.c(yVar2);
                    this.d = 0;
                }
            }
        }
    }
}
