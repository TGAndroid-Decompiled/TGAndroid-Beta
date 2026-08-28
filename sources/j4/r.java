package j4;

import h3.p2;
import h3.q2;
import h3.r2;
public final class r extends o {
    public final int f13546c;

    public r(r2 r2Var, int i9) {
        super(r2Var);
        this.f13546c = i9;
    }

    @Override
    public int e(int i9, int i10, boolean z10) {
        switch (this.f13546c) {
            case 0:
                r2 r2Var = this.f13526b;
                int e10 = r2Var.e(i9, i10, z10);
                if (e10 == -1) {
                    return r2Var.a(z10);
                }
                return e10;
            default:
                return super.e(i9, i10, z10);
        }
    }

    @Override
    public p2 f(int i9, p2 p2Var, boolean z10) {
        switch (this.f13546c) {
            case 1:
                super.f(i9, p2Var, z10);
                p2Var.f9641f = true;
                return p2Var;
            default:
                return super.f(i9, p2Var, z10);
        }
    }

    @Override
    public int k(int i9, int i10, boolean z10) {
        switch (this.f13546c) {
            case 0:
                r2 r2Var = this.f13526b;
                int k10 = r2Var.k(i9, i10, z10);
                if (k10 == -1) {
                    return r2Var.c(z10);
                }
                return k10;
            default:
                return super.k(i9, i10, z10);
        }
    }

    @Override
    public q2 m(int i9, q2 q2Var, long j10) {
        switch (this.f13546c) {
            case 1:
                super.m(i9, q2Var, j10);
                q2Var.f9666w = true;
                return q2Var;
            default:
                return super.m(i9, q2Var, j10);
        }
    }
}
