package i2;

import android.os.SystemClock;
public final class w1 implements x0 {
    public long f8111a;
    public long f8112b;
    public boolean f8113c;
    public Object d;
    public Object e;

    @Override
    public long a() {
        long j10;
        long j11 = this.f8111a;
        if (this.f8113c) {
            ((e2.g0) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f8112b;
            b2.z0 z0Var = (b2.z0) this.e;
            if (z0Var.f2443a == 1.0f) {
                j10 = e2.l0.S(elapsedRealtime);
            } else {
                j10 = elapsedRealtime * z0Var.f2445c;
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
    public void c(b2.z0 z0Var) {
        if (this.f8113c) {
            d(a());
        }
        this.e = z0Var;
    }

    public void d(long j10) {
        this.f8111a = j10;
        if (this.f8113c) {
            ((e2.g0) this.d).getClass();
            this.f8112b = SystemClock.elapsedRealtime();
        }
    }

    public void e() {
        if (!this.f8113c) {
            ((e2.g0) this.d).getClass();
            this.f8112b = SystemClock.elapsedRealtime();
            this.f8113c = true;
        }
    }

    @Override
    public b2.z0 g() {
        return (b2.z0) this.e;
    }
}
