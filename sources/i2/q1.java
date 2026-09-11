package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
public final class q1 implements s0 {
    public long f11722a;
    public long f11723b;
    public boolean f11724c;
    public final Object d;
    public Object f11725e;

    public q1(org.telegram.ui.web.b bVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.f11725e = bVar;
    }

    @Override
    public long a() {
        long j3;
        long j10 = this.f11722a;
        if (this.f11724c) {
            ((e2.x) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f11723b;
            b2.v0 v0Var = (b2.v0) this.f11725e;
            if (v0Var.f2400a == 1.0f) {
                j3 = e2.d0.Q(elapsedRealtime);
            } else {
                j3 = elapsedRealtime * v0Var.f2402c;
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
        this.f11722a = j3;
        if (this.f11724c) {
            ((e2.x) this.d).getClass();
            this.f11723b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f11724c) {
            ((e2.x) this.d).getClass();
            this.f11723b = SystemClock.elapsedRealtime();
            this.f11724c = true;
        }
    }

    @Override
    public void f(b2.v0 v0Var) {
        if (this.f11724c) {
            c(a());
        }
        this.f11725e = v0Var;
    }

    @Override
    public b2.v0 h() {
        return (b2.v0) this.f11725e;
    }

    public q1(e2.x xVar) {
        this.d = xVar;
        this.f11725e = b2.v0.d;
    }
}
