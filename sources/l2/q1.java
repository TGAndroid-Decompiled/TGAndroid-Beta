package l2;

import android.os.SystemClock;
public final class q1 implements t0 {
    public long f19530a;
    public long f19531b;
    public boolean f19532c;
    public Object d;
    public Object f19533e;

    @Override
    public long a() {
        long j3;
        long j10 = this.f19530a;
        if (this.f19532c) {
            ((h2.g0) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f19531b;
            e2.w0 w0Var = (e2.w0) this.f19533e;
            if (w0Var.f10789a == 1.0f) {
                j3 = h2.l0.S(elapsedRealtime);
            } else {
                j3 = elapsedRealtime * w0Var.f10791c;
            }
            return j3 + j10;
        }
        return j10;
    }

    @Override
    public boolean b() {
        return false;
    }

    public void c(long j3) {
        this.f19530a = j3;
        if (this.f19532c) {
            ((h2.g0) this.d).getClass();
            this.f19531b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f19532c) {
            ((h2.g0) this.d).getClass();
            this.f19531b = SystemClock.elapsedRealtime();
            this.f19532c = true;
        }
    }

    @Override
    public void e(e2.w0 w0Var) {
        if (this.f19532c) {
            c(a());
        }
        this.f19533e = w0Var;
    }

    @Override
    public e2.w0 j() {
        return (e2.w0) this.f19533e;
    }
}
