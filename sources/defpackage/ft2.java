package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;
public final class ft2 extends ns2 {
    public int d;
    public fs e;
    public TimeUnit f;

    public final gt2 u(bt2 bt2Var) {
        boolean z;
        if (this.e == null) {
            long j = this.d;
            if (j >= 0 && j <= Long.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
            r(z, Long.valueOf(j));
        }
        if (this.f != null) {
            String s = s();
            fs fsVar = this.e;
            if (fsVar == null) {
                final long j2 = this.d;
                fsVar = new LongSupplier(j2) {
                    public final int a;

                    {
                        this.a = (int) j2;
                    }

                    @Override
                    public final long getAsLong() {
                        return this.a;
                    }
                };
            }
            gt2 gt2Var = new gt2(s, fsVar, this.f, this.a);
            q(bt2Var, gt2Var);
            return gt2Var;
        }
        throw new IllegalStateException("ConfigTime " + s() + " without a unit");
    }

    public final void v(long j) {
        this.d = (int) j;
        this.e = null;
    }
}
