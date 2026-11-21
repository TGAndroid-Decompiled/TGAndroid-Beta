package l2;

import android.os.SystemClock;
public final class q1 implements t0 {
    public long f19558a;
    public long f19559b;
    public boolean f19560c;
    public Object d;
    public Object f19561e;

    @Override
    public long a() {
        long j3;
        long j10 = this.f19558a;
        if (this.f19560c) {
            ((h2.g0) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f19559b;
            e2.w0 w0Var = (e2.w0) this.f19561e;
            if (w0Var.f10818a == 1.0f) {
                j3 = h2.l0.S(elapsedRealtime);
            } else {
                j3 = elapsedRealtime * w0Var.f10820c;
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
        this.f19558a = j3;
        if (this.f19560c) {
            ((h2.g0) this.d).getClass();
            this.f19559b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f19560c) {
            ((h2.g0) this.d).getClass();
            this.f19559b = SystemClock.elapsedRealtime();
            this.f19560c = true;
        }
    }

    @Override
    public void e(e2.w0 w0Var) {
        if (this.f19560c) {
            c(a());
        }
        this.f19561e = w0Var;
    }

    @Override
    public e2.w0 j() {
        return (e2.w0) this.f19561e;
    }
}
