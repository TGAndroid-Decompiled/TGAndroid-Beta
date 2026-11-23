package l2;

import android.os.SystemClock;
public final class q1 implements t0 {
    public long f19561a;
    public long f19562b;
    public boolean f19563c;
    public Object d;
    public Object f19564e;

    @Override
    public long a() {
        long j3;
        long j10 = this.f19561a;
        if (this.f19563c) {
            ((h2.g0) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f19562b;
            e2.w0 w0Var = (e2.w0) this.f19564e;
            if (w0Var.f10821a == 1.0f) {
                j3 = h2.l0.S(elapsedRealtime);
            } else {
                j3 = elapsedRealtime * w0Var.f10823c;
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
        this.f19561a = j3;
        if (this.f19563c) {
            ((h2.g0) this.d).getClass();
            this.f19562b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f19563c) {
            ((h2.g0) this.d).getClass();
            this.f19562b = SystemClock.elapsedRealtime();
            this.f19563c = true;
        }
    }

    @Override
    public void e(e2.w0 w0Var) {
        if (this.f19563c) {
            c(a());
        }
        this.f19564e = w0Var;
    }

    @Override
    public e2.w0 j() {
        return (e2.w0) this.f19564e;
    }
}
