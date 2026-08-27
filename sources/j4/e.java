package j4;

import h3.p2;
import h3.r2;
import h3.s2;

public final class e extends n {

    public final long f12538c;
    public final long d;

    public final long f12539e;

    public final boolean f12540f;

    public e(s2 s2Var, long j10, long j11) throws f {
        super(s2Var);
        boolean z10 = false;
        if (s2Var.h() != 1) {
            throw new f(0);
        }
        r2 r2VarM = s2Var.m(0, new r2(), 0L);
        long jMax = Math.max(0L, j10);
        if (!r2VarM.f8120w && jMax != 0 && !r2VarM.f8117n) {
            throw new f(1);
        }
        long jMax2 = j11 == Long.MIN_VALUE ? r2VarM.f8122y : Math.max(0L, j11);
        long j12 = r2VarM.f8122y;
        if (j12 != -9223372036854775807L) {
            jMax2 = jMax2 > j12 ? j12 : jMax2;
            if (jMax > jMax2) {
                throw new f(2);
            }
        }
        this.f12538c = jMax;
        this.d = jMax2;
        this.f12539e = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
        if (r2VarM.f8118r && (jMax2 == -9223372036854775807L || (j12 != -9223372036854775807L && jMax2 == j12))) {
            z10 = true;
        }
        this.f12540f = z10;
    }

    @Override
    public final p2 f(int i10, p2 p2Var, boolean z10) {
        this.f12623b.f(0, p2Var, z10);
        long j10 = p2Var.f8070e - this.f12538c;
        long j11 = this.f12539e;
        p2Var.h(p2Var.f8067a, p2Var.f8068b, 0, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, j10, k4.b.f14448f, false);
        return p2Var;
    }

    @Override
    public final r2 m(int i10, r2 r2Var, long j10) {
        this.f12623b.m(0, r2Var, 0L);
        long j11 = r2Var.C;
        long j12 = this.f12538c;
        r2Var.C = j11 + j12;
        r2Var.f8122y = this.f12539e;
        r2Var.f8118r = this.f12540f;
        long j13 = r2Var.f8121x;
        if (j13 != -9223372036854775807L) {
            long jMax = Math.max(j13, j12);
            r2Var.f8121x = jMax;
            long j14 = this.d;
            if (j14 != -9223372036854775807L) {
                jMax = Math.min(jMax, j14);
            }
            r2Var.f8121x = jMax - j12;
        }
        long jS = d5.g0.S(j12);
        long j15 = r2Var.f8115e;
        if (j15 != -9223372036854775807L) {
            r2Var.f8115e = j15 + jS;
        }
        long j16 = r2Var.f8116f;
        if (j16 != -9223372036854775807L) {
            r2Var.f8116f = j16 + jS;
        }
        return r2Var;
    }
}
