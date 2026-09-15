package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
public final class q1 implements s0 {
    public long f10863a;
    public long f10864b;
    public boolean f10865c;
    public final Object d;
    public Object e;

    public q1(org.telegram.ui.web.u0 u0Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = u0Var;
    }

    @Override
    public long a() {
        long j3;
        long j10 = this.f10863a;
        if (this.f10865c) {
            ((e2.x) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f10864b;
            b2.v0 v0Var = (b2.v0) this.e;
            if (v0Var.f3331a == 1.0f) {
                j3 = e2.d0.Q(elapsedRealtime);
            } else {
                j3 = elapsedRealtime * v0Var.f3333c;
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
        this.f10863a = j3;
        if (this.f10865c) {
            ((e2.x) this.d).getClass();
            this.f10864b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f10865c) {
            ((e2.x) this.d).getClass();
            this.f10864b = SystemClock.elapsedRealtime();
            this.f10865c = true;
        }
    }

    @Override
    public void f(b2.v0 v0Var) {
        if (this.f10865c) {
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
