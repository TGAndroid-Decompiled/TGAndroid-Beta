package j4;

import h3.p2;
import h3.r2;
import h3.s2;

public final class q extends n {

    public final int f12643c;

    public q(s2 s2Var, int i10) {
        super(s2Var);
        this.f12643c = i10;
    }

    @Override
    public int e(int i10, int i11, boolean z10) {
        switch (this.f12643c) {
            case 0:
                s2 s2Var = this.f12623b;
                int iE = s2Var.e(i10, i11, z10);
                return iE == -1 ? s2Var.a(z10) : iE;
            default:
                return super.e(i10, i11, z10);
        }
    }

    @Override
    public p2 f(int i10, p2 p2Var, boolean z10) {
        switch (this.f12643c) {
            case 1:
                super.f(i10, p2Var, z10);
                p2Var.f8071f = true;
                return p2Var;
            default:
                return super.f(i10, p2Var, z10);
        }
    }

    @Override
    public int k(int i10, int i11, boolean z10) {
        switch (this.f12643c) {
            case 0:
                s2 s2Var = this.f12623b;
                int iK = s2Var.k(i10, i11, z10);
                return iK == -1 ? s2Var.c(z10) : iK;
            default:
                return super.k(i10, i11, z10);
        }
    }

    @Override
    public r2 m(int i10, r2 r2Var, long j10) {
        switch (this.f12643c) {
            case 1:
                super.m(i10, r2Var, j10);
                r2Var.f8120w = true;
                return r2Var;
            default:
                return super.m(i10, r2Var, j10);
        }
    }
}
