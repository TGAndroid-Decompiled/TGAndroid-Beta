package o4;

import j3.m2;
import j3.n2;
import j3.o2;
public final class k extends h {
    public final int f16338c;

    public k(o2 o2Var, int i10) {
        super(o2Var);
        this.f16338c = i10;
    }

    @Override
    public int e(int i10, int i11, boolean z4) {
        switch (this.f16338c) {
            case 0:
                o2 o2Var = this.f16328b;
                int e = o2Var.e(i10, i11, z4);
                if (e == -1) {
                    return o2Var.a(z4);
                }
                return e;
            default:
                return super.e(i10, i11, z4);
        }
    }

    @Override
    public m2 f(int i10, m2 m2Var, boolean z4) {
        switch (this.f16338c) {
            case 1:
                super.f(i10, m2Var, z4);
                m2Var.f8687f = true;
                return m2Var;
            default:
                return super.f(i10, m2Var, z4);
        }
    }

    @Override
    public int k(int i10, int i11, boolean z4) {
        switch (this.f16338c) {
            case 0:
                o2 o2Var = this.f16328b;
                int k10 = o2Var.k(i10, i11, z4);
                if (k10 == -1) {
                    return o2Var.c(z4);
                }
                return k10;
            default:
                return super.k(i10, i11, z4);
        }
    }

    @Override
    public n2 m(int i10, n2 n2Var, long j10) {
        switch (this.f16338c) {
            case 1:
                super.m(i10, n2Var, j10);
                n2Var.f8738w = true;
                return n2Var;
            default:
                return super.m(i10, n2Var, j10);
        }
    }
}
