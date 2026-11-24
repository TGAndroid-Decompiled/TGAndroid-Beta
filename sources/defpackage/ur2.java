package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;
public final class ur2 extends cr2 {
    public int d;
    public fr e;
    public TimeUnit f;

    public final vr2 u(qr2 qr2Var) {
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
            fr frVar = this.e;
            if (frVar == null) {
                final long j2 = this.d;
                frVar = new LongSupplier(j2) {
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
            vr2 vr2Var = new vr2(s, frVar, this.f, this.a);
            q(qr2Var, vr2Var);
            return vr2Var;
        }
        throw new IllegalStateException("ConfigTime " + s() + " without a unit");
    }

    public final void v(long j) {
        this.d = (int) j;
        this.e = null;
    }
}
