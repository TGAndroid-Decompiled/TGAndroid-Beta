package defpackage;

import java.util.function.LongSupplier;
public final class fs2 extends vr2 {
    public long d;
    public long e;
    public long f;

    public final gs2 u(js2 js2Var) {
        boolean z;
        long j = this.d;
        if (j >= this.e && j <= this.f) {
            z = true;
        } else {
            z = false;
        }
        r(z, Long.valueOf(j));
        final long j2 = this.d;
        ?? ai6Var = new ai6(s(), new LongSupplier() {
            @Override
            public final long getAsLong() {
                return j2;
            }
        }, this.e, this.f, this.a);
        q(js2Var, ai6Var);
        return ai6Var;
    }

    public final void v() {
        this.e = 0L;
        this.f = Long.MAX_VALUE;
    }
}
