package l2;

import android.os.SystemClock;
public final class q1 implements t0 {
    public long f19527a;
    public long f19528b;
    public boolean f19529c;
    public Object d;
    public Object f19530e;

    @Override
    public long a() {
        long j3;
        long j10 = this.f19527a;
        if (this.f19529c) {
            ((h2.g0) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f19528b;
            e2.w0 w0Var = (e2.w0) this.f19530e;
            if (w0Var.f10784a == 1.0f) {
                j3 = h2.l0.S(elapsedRealtime);
            } else {
                j3 = elapsedRealtime * w0Var.f10786c;
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
        this.f19527a = j3;
        if (this.f19529c) {
            ((h2.g0) this.d).getClass();
            this.f19528b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f19529c) {
            ((h2.g0) this.d).getClass();
            this.f19528b = SystemClock.elapsedRealtime();
            this.f19529c = true;
        }
    }

    @Override
    public void e(e2.w0 w0Var) {
        if (this.f19529c) {
            c(a());
        }
        this.f19530e = w0Var;
    }

    @Override
    public e2.w0 j() {
        return (e2.w0) this.f19530e;
    }
}
