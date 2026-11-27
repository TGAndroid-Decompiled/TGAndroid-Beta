package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;
public final class ns2 extends vr2 {
    public int d;
    public gr e;
    public TimeUnit f;

    public final os2 u(js2 js2Var) {
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
            gr grVar = this.e;
            if (grVar == null) {
                final long j2 = this.d;
                grVar = new LongSupplier(j2) {
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
            os2 os2Var = new os2(s, grVar, this.f, this.a);
            q(js2Var, os2Var);
            return os2Var;
        }
        throw new IllegalStateException("ConfigTime " + s() + " without a unit");
    }

    public final void v(long j) {
        this.d = (int) j;
        this.e = null;
    }
}
