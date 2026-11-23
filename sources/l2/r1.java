package l2;

import android.os.SystemClock;
public final class r1 implements u0 {
    public long f19631a;
    public long f19632b;
    public boolean f19633c;
    public Object d;
    public Object f19634e;

    @Override
    public long a() {
        long j3;
        long j10 = this.f19631a;
        if (this.f19633c) {
            ((h2.g0) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f19632b;
            e2.w0 w0Var = (e2.w0) this.f19634e;
            if (w0Var.f10782a == 1.0f) {
                j3 = h2.l0.S(elapsedRealtime);
            } else {
                j3 = elapsedRealtime * w0Var.f10784c;
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
        this.f19631a = j3;
        if (this.f19633c) {
            ((h2.g0) this.d).getClass();
            this.f19632b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f19633c) {
            ((h2.g0) this.d).getClass();
            this.f19632b = SystemClock.elapsedRealtime();
            this.f19633c = true;
        }
    }

    @Override
    public void e(e2.w0 w0Var) {
        if (this.f19633c) {
            c(a());
        }
        this.f19634e = w0Var;
    }

    @Override
    public e2.w0 l() {
        return (e2.w0) this.f19634e;
    }
}
