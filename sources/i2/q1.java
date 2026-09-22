package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
public final class q1 implements s0 {
    public long f10867a;
    public long f10868b;
    public boolean f10869c;
    public final Object d;
    public Object e;

    public q1(org.telegram.ui.web.r0 r0Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = r0Var;
    }

    @Override
    public long a() {
        long j3;
        long j10 = this.f10867a;
        if (this.f10869c) {
            ((e2.x) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f10868b;
            b2.v0 v0Var = (b2.v0) this.e;
            if (v0Var.f3335a == 1.0f) {
                j3 = e2.d0.Q(elapsedRealtime);
            } else {
                j3 = elapsedRealtime * v0Var.f3337c;
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
        this.f10867a = j3;
        if (this.f10869c) {
            ((e2.x) this.d).getClass();
            this.f10868b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f10869c) {
            ((e2.x) this.d).getClass();
            this.f10868b = SystemClock.elapsedRealtime();
            this.f10869c = true;
        }
    }

    @Override
    public void f(b2.v0 v0Var) {
        if (this.f10869c) {
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
