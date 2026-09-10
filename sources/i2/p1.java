package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
public final class p1 implements r0 {
    public long f10343a;
    public long f10344b;
    public boolean f10345c;
    public final Object d;
    public Object e;

    public p1(org.telegram.ui.Components.voip.x xVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = xVar;
    }

    @Override
    public long a() {
        long j3;
        long j10 = this.f10343a;
        if (this.f10345c) {
            ((e2.x) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f10344b;
            b2.v0 v0Var = (b2.v0) this.e;
            if (v0Var.f2029a == 1.0f) {
                j3 = e2.d0.Q(elapsedRealtime);
            } else {
                j3 = elapsedRealtime * v0Var.f2031c;
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
        this.f10343a = j3;
        if (this.f10345c) {
            ((e2.x) this.d).getClass();
            this.f10344b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f10345c) {
            ((e2.x) this.d).getClass();
            this.f10344b = SystemClock.elapsedRealtime();
            this.f10345c = true;
        }
    }

    @Override
    public void f(b2.v0 v0Var) {
        if (this.f10345c) {
            c(a());
        }
        this.e = v0Var;
    }

    @Override
    public b2.v0 h() {
        return (b2.v0) this.e;
    }

    public p1(e2.x xVar) {
        this.d = xVar;
        this.e = b2.v0.d;
    }
}
