package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
public final class r1 implements t0 {
    public long f10857a;
    public long f10858b;
    public boolean f10859c;
    public final Object d;
    public Object e;

    public r1(org.telegram.ui.web.q0 q0Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = q0Var;
    }

    @Override
    public long a() {
        long j3;
        long j10 = this.f10857a;
        if (this.f10859c) {
            ((e2.x) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f10858b;
            b2.v0 v0Var = (b2.v0) this.e;
            if (v0Var.f3328a == 1.0f) {
                j3 = e2.d0.Q(elapsedRealtime);
            } else {
                j3 = elapsedRealtime * v0Var.f3330c;
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
        this.f10857a = j3;
        if (this.f10859c) {
            ((e2.x) this.d).getClass();
            this.f10858b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f10859c) {
            ((e2.x) this.d).getClass();
            this.f10858b = SystemClock.elapsedRealtime();
            this.f10859c = true;
        }
    }

    @Override
    public void f(b2.v0 v0Var) {
        if (this.f10859c) {
            c(a());
        }
        this.e = v0Var;
    }

    @Override
    public b2.v0 h() {
        return (b2.v0) this.e;
    }

    public r1(e2.x xVar) {
        this.d = xVar;
        this.e = b2.v0.d;
    }
}
