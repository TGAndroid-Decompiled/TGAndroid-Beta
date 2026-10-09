package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
public final class r1 implements t0 {
    public long f11879a;
    public long f11880b;
    public boolean f11881c;
    public final Object d;
    public Object f11882e;

    public r1(org.telegram.ui.web.q0 q0Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.f11882e = q0Var;
    }

    @Override
    public long a() {
        long j3;
        long j10 = this.f11879a;
        if (this.f11881c) {
            ((e2.x) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f11880b;
            b2.v0 v0Var = (b2.v0) this.f11882e;
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
        this.f11879a = j3;
        if (this.f11881c) {
            ((e2.x) this.d).getClass();
            this.f11880b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f11881c) {
            ((e2.x) this.d).getClass();
            this.f11880b = SystemClock.elapsedRealtime();
            this.f11881c = true;
        }
    }

    @Override
    public void f(b2.v0 v0Var) {
        if (this.f11881c) {
            c(a());
        }
        this.f11882e = v0Var;
    }

    @Override
    public b2.v0 h() {
        return (b2.v0) this.f11882e;
    }

    public r1(e2.x xVar) {
        this.d = xVar;
        this.f11882e = b2.v0.d;
    }
}
