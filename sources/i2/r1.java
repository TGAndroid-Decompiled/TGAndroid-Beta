package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
public final class r1 implements t0 {
    public long f11878a;
    public long f11879b;
    public boolean f11880c;
    public final Object d;
    public Object f11881e;

    public r1(org.telegram.ui.web.t0 t0Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.f11881e = t0Var;
    }

    @Override
    public long a() {
        long j3;
        long j10 = this.f11878a;
        if (this.f11880c) {
            ((e2.x) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f11879b;
            b2.v0 v0Var = (b2.v0) this.f11881e;
            if (v0Var.f3673a == 1.0f) {
                j3 = e2.d0.P(elapsedRealtime);
            } else {
                j3 = elapsedRealtime * v0Var.f3675c;
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
        this.f11878a = j3;
        if (this.f11880c) {
            ((e2.x) this.d).getClass();
            this.f11879b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f11880c) {
            ((e2.x) this.d).getClass();
            this.f11879b = SystemClock.elapsedRealtime();
            this.f11880c = true;
        }
    }

    @Override
    public void f(b2.v0 v0Var) {
        if (this.f11880c) {
            c(a());
        }
        this.f11881e = v0Var;
    }

    @Override
    public b2.v0 h() {
        return (b2.v0) this.f11881e;
    }

    public r1(e2.x xVar) {
        this.d = xVar;
        this.f11881e = b2.v0.d;
    }
}
