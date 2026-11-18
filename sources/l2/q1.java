package l2;

import android.os.SystemClock;
public final class q1 implements t0 {
    public long f19533a;
    public long f19534b;
    public boolean f19535c;
    public Object d;
    public Object f19536e;

    @Override
    public long a() {
        long j3;
        long j10 = this.f19533a;
        if (this.f19535c) {
            ((h2.g0) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f19534b;
            e2.w0 w0Var = (e2.w0) this.f19536e;
            if (w0Var.f10792a == 1.0f) {
                j3 = h2.l0.S(elapsedRealtime);
            } else {
                j3 = elapsedRealtime * w0Var.f10794c;
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
        this.f19533a = j3;
        if (this.f19535c) {
            ((h2.g0) this.d).getClass();
            this.f19534b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f19535c) {
            ((h2.g0) this.d).getClass();
            this.f19534b = SystemClock.elapsedRealtime();
            this.f19535c = true;
        }
    }

    @Override
    public void e(e2.w0 w0Var) {
        if (this.f19535c) {
            c(a());
        }
        this.f19536e = w0Var;
    }

    @Override
    public e2.w0 j() {
        return (e2.w0) this.f19536e;
    }
}
