package j4;

import h3.p2;
import h3.q2;
import h3.r2;
public final class f extends o {
    public final long f13444c;
    public final long d;
    public final long f13445e;
    public final boolean f13446f;

    public f(r2 r2Var, long j10, long j11) {
        super(r2Var);
        long max;
        long j12;
        boolean z10 = false;
        if (r2Var.h() == 1) {
            q2 m10 = r2Var.m(0, new q2(), 0L);
            long max2 = Math.max(0L, j10);
            if (!m10.f9666w && max2 != 0 && !m10.f9663n) {
                throw new g(1);
            }
            if (j11 == Long.MIN_VALUE) {
                max = m10.f9668y;
            } else {
                max = Math.max(0L, j11);
            }
            long j13 = m10.f9668y;
            if (j13 != -9223372036854775807L) {
                max = max > j13 ? j13 : max;
                if (max2 > max) {
                    throw new g(2);
                }
            }
            this.f13444c = max2;
            this.d = max;
            int i9 = (max > (-9223372036854775807L) ? 1 : (max == (-9223372036854775807L) ? 0 : -1));
            if (i9 == 0) {
                j12 = -9223372036854775807L;
            } else {
                j12 = max - max2;
            }
            this.f13445e = j12;
            if (m10.f9664r && (i9 == 0 || (j13 != -9223372036854775807L && max == j13))) {
                z10 = true;
            }
            this.f13446f = z10;
            return;
        }
        throw new g(0);
    }

    @Override
    public final p2 f(int i9, p2 p2Var, boolean z10) {
        this.f13526b.f(0, p2Var, z10);
        long j10 = p2Var.f9640e - this.f13444c;
        long j11 = this.f13445e;
        long j12 = -9223372036854775807L;
        if (j11 != -9223372036854775807L) {
            j12 = j11 - j10;
        }
        p2Var.h(p2Var.f9637a, p2Var.f9638b, 0, j12, j10, k4.b.f14627f, false);
        return p2Var;
    }

    @Override
    public final q2 m(int i9, q2 q2Var, long j10) {
        this.f13526b.m(0, q2Var, 0L);
        long j11 = q2Var.C;
        long j12 = this.f13444c;
        q2Var.C = j11 + j12;
        q2Var.f9668y = this.f13445e;
        q2Var.f9664r = this.f13446f;
        long j13 = q2Var.f9667x;
        if (j13 != -9223372036854775807L) {
            long max = Math.max(j13, j12);
            q2Var.f9667x = max;
            long j14 = this.d;
            if (j14 != -9223372036854775807L) {
                max = Math.min(max, j14);
            }
            q2Var.f9667x = max - j12;
        }
        long S = d5.f0.S(j12);
        long j15 = q2Var.f9661e;
        if (j15 != -9223372036854775807L) {
            q2Var.f9661e = j15 + S;
        }
        long j16 = q2Var.f9662f;
        if (j16 != -9223372036854775807L) {
            q2Var.f9662f = j16 + S;
        }
        return q2Var;
    }
}
