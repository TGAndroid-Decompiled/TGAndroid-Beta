package l4;

import j3.p2;
import j3.q2;
import j3.r2;
public final class q extends n {
    public final int f14402c;

    public q(r2 r2Var, int i10) {
        super(r2Var);
        this.f14402c = i10;
    }

    @Override
    public int e(int i10, int i11, boolean z10) {
        switch (this.f14402c) {
            case 0:
                r2 r2Var = this.f14382b;
                int e10 = r2Var.e(i10, i11, z10);
                if (e10 == -1) {
                    return r2Var.a(z10);
                }
                return e10;
            default:
                return super.e(i10, i11, z10);
        }
    }

    @Override
    public p2 f(int i10, p2 p2Var, boolean z10) {
        switch (this.f14402c) {
            case 1:
                super.f(i10, p2Var, z10);
                p2Var.f10678f = true;
                return p2Var;
            default:
                return super.f(i10, p2Var, z10);
        }
    }

    @Override
    public int k(int i10, int i11, boolean z10) {
        switch (this.f14402c) {
            case 0:
                r2 r2Var = this.f14382b;
                int k9 = r2Var.k(i10, i11, z10);
                if (k9 == -1) {
                    return r2Var.c(z10);
                }
                return k9;
            default:
                return super.k(i10, i11, z10);
        }
    }

    @Override
    public q2 m(int i10, q2 q2Var, long j10) {
        switch (this.f14402c) {
            case 1:
                super.m(i10, q2Var, j10);
                q2Var.f10703w = true;
                return q2Var;
            default:
                return super.m(i10, q2Var, j10);
        }
    }
}
