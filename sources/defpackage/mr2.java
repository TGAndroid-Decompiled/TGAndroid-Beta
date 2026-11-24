package defpackage;

import java.util.function.LongSupplier;
public final class mr2 extends cr2 {
    public long d;
    public long e;
    public long f;

    public final nr2 u(qr2 qr2Var) {
        boolean z;
        long j = this.d;
        if (j >= this.e && j <= this.f) {
            z = true;
        } else {
            z = false;
        }
        r(z, Long.valueOf(j));
        final long j2 = this.d;
        ?? wf6Var = new wf6(s(), new LongSupplier() {
            @Override
            public final long getAsLong() {
                return j2;
            }
        }, this.e, this.f, this.a);
        q(qr2Var, wf6Var);
        return wf6Var;
    }

    public final void v() {
        this.e = 0L;
        this.f = Long.MAX_VALUE;
    }
}
