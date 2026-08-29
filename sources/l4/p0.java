package l4;

import java.io.IOException;
public final class p0 implements c1 {
    public final int f14400a;
    public final r0 f14401b;

    public p0(r0 r0Var, int i10) {
        this.f14401b = r0Var;
        this.f14400a = i10;
    }

    @Override
    public final void a() {
        int i10 = this.f14400a;
        r0 r0Var = this.f14401b;
        r0Var.E[i10].w();
        com.google.android.exoplayer2.upstream.q0 q0Var = r0Var.v;
        int B = r0Var.d.B(r0Var.N);
        IOException iOException = q0Var.f3609c;
        if (iOException == null) {
            com.google.android.exoplayer2.upstream.m0 m0Var = q0Var.f3608b;
            if (m0Var != null) {
                if (B == Integer.MIN_VALUE) {
                    B = m0Var.f3578a;
                }
                IOException iOException2 = m0Var.f3581e;
                if (iOException2 != null && m0Var.f3582f > B) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final int d(j3.u0 u0Var, m3.i iVar, int i10) {
        r0 r0Var = this.f14401b;
        if (r0Var.w()) {
            return -3;
        }
        int i11 = this.f14400a;
        r0Var.q(i11);
        int z10 = r0Var.E[i11].z(u0Var, iVar, i10, r0Var.W);
        if (z10 == -3) {
            r0Var.t(i11);
        }
        return z10;
    }

    @Override
    public final boolean e() {
        r0 r0Var = this.f14401b;
        if (!r0Var.w() && r0Var.E[this.f14400a].u(r0Var.W)) {
            return true;
        }
        return false;
    }

    @Override
    public final int i(long j10) {
        r0 r0Var = this.f14401b;
        if (r0Var.w()) {
            return 0;
        }
        int i10 = this.f14400a;
        r0Var.q(i10);
        b1 b1Var = r0Var.E[i10];
        int s10 = b1Var.s(j10, r0Var.W);
        b1Var.E(s10);
        if (s10 == 0) {
            r0Var.t(i10);
        }
        return s10;
    }
}
