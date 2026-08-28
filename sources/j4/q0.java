package j4;

import java.io.IOException;
public final class q0 implements b1 {
    public final int f13544a;
    public final s0 f13545b;

    public q0(s0 s0Var, int i9) {
        this.f13545b = s0Var;
        this.f13544a = i9;
    }

    @Override
    public final void a() {
        int i9 = this.f13544a;
        s0 s0Var = this.f13545b;
        s0Var.E[i9].w();
        com.google.android.exoplayer2.upstream.q0 q0Var = s0Var.v;
        int l32 = s0Var.d.l3(s0Var.N);
        IOException iOException = q0Var.f2595c;
        if (iOException == null) {
            com.google.android.exoplayer2.upstream.m0 m0Var = q0Var.f2594b;
            if (m0Var != null) {
                if (l32 == Integer.MIN_VALUE) {
                    l32 = m0Var.f2564a;
                }
                IOException iOException2 = m0Var.f2567e;
                if (iOException2 != null && m0Var.f2568f > l32) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final boolean f() {
        s0 s0Var = this.f13545b;
        if (!s0Var.D() && s0Var.E[this.f13544a].u(s0Var.W)) {
            return true;
        }
        return false;
    }

    @Override
    public final int j(long j10) {
        s0 s0Var = this.f13545b;
        if (s0Var.D()) {
            return 0;
        }
        int i9 = this.f13544a;
        s0Var.s(i9);
        a1 a1Var = s0Var.E[i9];
        int s10 = a1Var.s(j10, s0Var.W);
        a1Var.E(s10);
        if (s10 == 0) {
            s0Var.t(i9);
        }
        return s10;
    }

    @Override
    public final int l(h3.u0 u0Var, k3.i iVar, int i9) {
        s0 s0Var = this.f13545b;
        if (s0Var.D()) {
            return -3;
        }
        int i10 = this.f13544a;
        s0Var.s(i10);
        int z10 = s0Var.E[i10].z(u0Var, iVar, i9, s0Var.W);
        if (z10 == -3) {
            s0Var.t(i10);
        }
        return z10;
    }
}
