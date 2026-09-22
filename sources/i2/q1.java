package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
public final class q1 implements s0 {
    public long f10865a;
    public long f10866b;
    public boolean f10867c;
    public final Object d;
    public Object e;

    public q1(org.telegram.ui.web.u0 u0Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = u0Var;
    }

    @Override
    public long a() {
        long j3;
        long j10 = this.f10865a;
        if (this.f10867c) {
            ((e2.x) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f10866b;
            b2.v0 v0Var = (b2.v0) this.e;
            if (v0Var.f3333a == 1.0f) {
                j3 = e2.d0.Q(elapsedRealtime);
            } else {
                j3 = elapsedRealtime * v0Var.f3335c;
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
        this.f10865a = j3;
        if (this.f10867c) {
            ((e2.x) this.d).getClass();
            this.f10866b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f10867c) {
            ((e2.x) this.d).getClass();
            this.f10866b = SystemClock.elapsedRealtime();
            this.f10867c = true;
        }
    }

    @Override
    public void f(b2.v0 v0Var) {
        if (this.f10867c) {
            c(a());
        }
        this.e = v0Var;
    }

    @Override
    public b2.v0 h() {
        return (b2.v0) this.e;
    }

    public q1(e2.x xVar) {
        this.d = xVar;
        this.e = b2.v0.d;
    }
}
