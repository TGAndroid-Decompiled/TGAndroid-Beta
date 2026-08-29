package n4;

import com.google.android.exoplayer2.upstream.q;
import j3.t0;
public abstract class k extends e {
    public final long f17152s;

    public k(com.google.android.exoplayer2.upstream.m mVar, q qVar, t0 t0Var, int i10, Object obj, long j10, long j11, long j12) {
        super(mVar, qVar, 1, t0Var, i10, obj, j10, j11);
        t0Var.getClass();
        this.f17152s = j12;
    }

    public long b() {
        long j10 = this.f17152s;
        if (j10 == -1) {
            return -1L;
        }
        return j10 + 1;
    }

    public abstract boolean c();
}
