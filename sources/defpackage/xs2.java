package defpackage;

import java.util.function.LongSupplier;
public final class xs2 extends ns2 {
    public long d;
    public long e;
    public long f;

    public final ys2 u(bt2 bt2Var) {
        boolean z;
        long j = this.d;
        if (j >= this.e && j <= this.f) {
            z = true;
        } else {
            z = false;
        }
        r(z, Long.valueOf(j));
        final long j2 = this.d;
        ?? wh6Var = new wh6(s(), new LongSupplier() {
            @Override
            public final long getAsLong() {
                return j2;
            }
        }, this.e, this.f, this.a);
        q(bt2Var, wh6Var);
        return wh6Var;
    }

    public final void v() {
        this.e = 0L;
        this.f = Long.MAX_VALUE;
    }
}
