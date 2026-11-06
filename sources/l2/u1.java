package l2;

import android.os.SystemClock;
public final class u1 implements w0 {
    public long f18058a;
    public long f18059b;
    public boolean f18060c;
    public Object d;
    public Object f18061e;

    @Override
    public long a() {
        long j3;
        long j10 = this.f18058a;
        if (this.f18060c) {
            ((h2.g0) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f18059b;
            e2.w0 w0Var = (e2.w0) this.f18061e;
            if (w0Var.f10638a == 1.0f) {
                j3 = h2.m0.S(elapsedRealtime);
            } else {
                j3 = elapsedRealtime * w0Var.f10640c;
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
        this.f18058a = j3;
        if (this.f18060c) {
            ((h2.g0) this.d).getClass();
            this.f18059b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f18060c) {
            ((h2.g0) this.d).getClass();
            this.f18059b = SystemClock.elapsedRealtime();
            this.f18060c = true;
        }
    }

    @Override
    public void e(e2.w0 w0Var) {
        if (this.f18060c) {
            c(a());
        }
        this.f18061e = w0Var;
    }

    @Override
    public e2.w0 j() {
        return (e2.w0) this.f18061e;
    }
}
