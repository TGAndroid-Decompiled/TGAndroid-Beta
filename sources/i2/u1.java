package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
public final class u1 implements x0 {
    public long f13771a;
    public long f13772b;
    public boolean f13773c;
    public final Object d;
    public Object e;

    public u1(org.telegram.ui.web.h1 h1Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = h1Var;
    }

    @Override
    public long a() {
        long j10;
        long j11 = this.f13771a;
        if (this.f13773c) {
            ((e2.g0) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f13772b;
            b2.a1 a1Var = (b2.a1) this.e;
            if (a1Var.f3140a == 1.0f) {
                j10 = e2.n0.S(elapsedRealtime);
            } else {
                j10 = elapsedRealtime * a1Var.f3142c;
            }
            return j10 + j11;
        }
        return j11;
    }

    @Override
    public boolean b() {
        return false;
    }

    public void c(long j10) {
        this.f13771a = j10;
        if (this.f13773c) {
            ((e2.g0) this.d).getClass();
            this.f13772b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f13773c) {
            ((e2.g0) this.d).getClass();
            this.f13772b = SystemClock.elapsedRealtime();
            this.f13773c = true;
        }
    }

    @Override
    public void f(b2.a1 a1Var) {
        if (this.f13773c) {
            c(a());
        }
        this.e = a1Var;
    }

    @Override
    public b2.a1 h() {
        return (b2.a1) this.e;
    }

    public u1(e2.g0 g0Var) {
        this.d = g0Var;
        this.e = b2.a1.d;
    }
}
