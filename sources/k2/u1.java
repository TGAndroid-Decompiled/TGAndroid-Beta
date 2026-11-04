package k2;

import android.os.SystemClock;
public final class u1 implements w0 {
    public long f16747a;
    public long f16748b;
    public boolean f16749c;
    public Object d;
    public Object f16750e;

    @Override
    public long a() {
        long j10;
        long j11 = this.f16747a;
        if (this.f16749c) {
            ((g2.h0) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f16748b;
            d2.y0 y0Var = (d2.y0) this.f16750e;
            if (y0Var.f8517a == 1.0f) {
                j10 = g2.n0.S(elapsedRealtime);
            } else {
                j10 = elapsedRealtime * y0Var.f8519c;
            }
            return j10 + j11;
        }
        return j11;
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public void c(d2.y0 y0Var) {
        if (this.f16749c) {
            d(a());
        }
        this.f16750e = y0Var;
    }

    public void d(long j10) {
        this.f16747a = j10;
        if (this.f16749c) {
            ((g2.h0) this.d).getClass();
            this.f16748b = SystemClock.elapsedRealtime();
        }
    }

    public void e() {
        if (!this.f16749c) {
            ((g2.h0) this.d).getClass();
            this.f16748b = SystemClock.elapsedRealtime();
            this.f16749c = true;
        }
    }

    @Override
    public d2.y0 g() {
        return (d2.y0) this.f16750e;
    }
}
