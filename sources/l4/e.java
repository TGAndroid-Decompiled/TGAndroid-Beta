package l4;

import j3.p2;
import j3.q2;
import j3.r2;
public final class e extends n {
    public final long f14297c;
    public final long d;
    public final long f14298e;
    public final boolean f14299f;

    public e(r2 r2Var, long j10, long j11) {
        super(r2Var);
        long max;
        long j12;
        boolean z10 = false;
        if (r2Var.h() == 1) {
            q2 m10 = r2Var.m(0, new q2(), 0L);
            long max2 = Math.max(0L, j10);
            if (!m10.f10703w && max2 != 0 && !m10.f10700n) {
                throw new f(1);
            }
            if (j11 == Long.MIN_VALUE) {
                max = m10.f10705y;
            } else {
                max = Math.max(0L, j11);
            }
            long j13 = m10.f10705y;
            if (j13 != -9223372036854775807L) {
                max = max > j13 ? j13 : max;
                if (max2 > max) {
                    throw new f(2);
                }
            }
            this.f14297c = max2;
            this.d = max;
            int i10 = (max > (-9223372036854775807L) ? 1 : (max == (-9223372036854775807L) ? 0 : -1));
            if (i10 == 0) {
                j12 = -9223372036854775807L;
            } else {
                j12 = max - max2;
            }
            this.f14298e = j12;
            if (m10.f10701r && (i10 == 0 || (j13 != -9223372036854775807L && max == j13))) {
                z10 = true;
            }
            this.f14299f = z10;
            return;
        }
        throw new f(0);
    }

    @Override
    public final p2 f(int i10, p2 p2Var, boolean z10) {
        this.f14382b.f(0, p2Var, z10);
        long j10 = p2Var.f10677e - this.f14297c;
        long j11 = this.f14298e;
        long j12 = -9223372036854775807L;
        if (j11 != -9223372036854775807L) {
            j12 = j11 - j10;
        }
        p2Var.h(p2Var.f10674a, p2Var.f10675b, 0, j12, j10, m4.c.f16848f, false);
        return p2Var;
    }

    @Override
    public final q2 m(int i10, q2 q2Var, long j10) {
        this.f14382b.m(0, q2Var, 0L);
        long j11 = q2Var.C;
        long j12 = this.f14297c;
        q2Var.C = j11 + j12;
        q2Var.f10705y = this.f14298e;
        q2Var.f10701r = this.f14299f;
        long j13 = q2Var.f10704x;
        if (j13 != -9223372036854775807L) {
            long max = Math.max(j13, j12);
            q2Var.f10704x = max;
            long j14 = this.d;
            if (j14 != -9223372036854775807L) {
                max = Math.min(max, j14);
            }
            q2Var.f10704x = max - j12;
        }
        long S = f5.d0.S(j12);
        long j15 = q2Var.f10698e;
        if (j15 != -9223372036854775807L) {
            q2Var.f10698e = j15 + S;
        }
        long j16 = q2Var.f10699f;
        if (j16 != -9223372036854775807L) {
            q2Var.f10699f = j16 + S;
        }
        return q2Var;
    }
}
