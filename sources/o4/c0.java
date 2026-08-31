package o4;

import java.io.IOException;
public final class c0 implements l0 {
    public final int f16449a;
    public final e0 f16450b;

    public c0(e0 e0Var, int i10) {
        this.f16450b = e0Var;
        this.f16449a = i10;
    }

    @Override
    public final void a() {
        int i10 = this.f16449a;
        e0 e0Var = this.f16450b;
        e0Var.F[i10].w();
        g5.m0 m0Var = e0Var.v;
        int n32 = e0Var.d.n3(e0Var.O);
        IOException iOException = m0Var.f6877c;
        if (iOException == null) {
            g5.i0 i0Var = m0Var.f6876b;
            if (i0Var != null) {
                if (n32 == Integer.MIN_VALUE) {
                    n32 = i0Var.f6862a;
                }
                IOException iOException2 = i0Var.f6865e;
                if (iOException2 != null && i0Var.f6866f > n32) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final boolean h() {
        e0 e0Var = this.f16450b;
        if (!e0Var.B() && e0Var.F[this.f16449a].u(e0Var.X)) {
            return true;
        }
        return false;
    }

    @Override
    public final int l(long j10) {
        e0 e0Var = this.f16450b;
        if (e0Var.B()) {
            return 0;
        }
        int i10 = this.f16449a;
        e0Var.w(i10);
        k0 k0Var = e0Var.F[i10];
        int s6 = k0Var.s(j10, e0Var.X);
        k0Var.E(s6);
        if (s6 == 0) {
            e0Var.y(i10);
        }
        return s6;
    }

    @Override
    public final int p(f7.b bVar, n3.i iVar, int i10) {
        e0 e0Var = this.f16450b;
        if (e0Var.B()) {
            return -3;
        }
        int i11 = this.f16449a;
        e0Var.w(i11);
        int z4 = e0Var.F[i11].z(bVar, iVar, i10, e0Var.X);
        if (z4 == -3) {
            e0Var.y(i11);
        }
        return z4;
    }
}
