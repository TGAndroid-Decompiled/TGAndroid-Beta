package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
public final class r1 implements t0 {
    public long f11828a;
    public long f11829b;
    public boolean f11830c;
    public final Object d;
    public Object f11831e;

    public r1(org.telegram.ui.web.u0 u0Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.f11831e = u0Var;
    }

    @Override
    public long a() {
        long j3;
        long j10 = this.f11828a;
        if (this.f11830c) {
            ((e2.x) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f11829b;
            b2.v0 v0Var = (b2.v0) this.f11831e;
            if (v0Var.f3594a == 1.0f) {
                j3 = e2.d0.Q(elapsedRealtime);
            } else {
                j3 = elapsedRealtime * v0Var.f3596c;
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
        this.f11828a = j3;
        if (this.f11830c) {
            ((e2.x) this.d).getClass();
            this.f11829b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f11830c) {
            ((e2.x) this.d).getClass();
            this.f11829b = SystemClock.elapsedRealtime();
            this.f11830c = true;
        }
    }

    @Override
    public void f(b2.v0 v0Var) {
        if (this.f11830c) {
            c(a());
        }
        this.f11831e = v0Var;
    }

    @Override
    public b2.v0 h() {
        return (b2.v0) this.f11831e;
    }

    public r1(e2.x xVar) {
        this.d = xVar;
        this.f11831e = b2.v0.d;
    }
}
