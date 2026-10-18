package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import org.telegram.ui.web.z1;
public final class s1 implements v0 {
    public long f12585a;
    public long f12586b;
    public boolean f12587c;
    public final Object d;
    public Object e;

    public s1(z1 z1Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = z1Var;
    }

    @Override
    public long a() {
        long j10;
        long j11 = this.f12585a;
        if (this.f12587c) {
            ((e2.g0) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f12586b;
            b2.z0 z0Var = (b2.z0) this.e;
            if (z0Var.f4156a == 1.0f) {
                j10 = e2.m0.S(elapsedRealtime);
            } else {
                j10 = elapsedRealtime * z0Var.f4158c;
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
        this.f12585a = j10;
        if (this.f12587c) {
            ((e2.g0) this.d).getClass();
            this.f12586b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f12587c) {
            ((e2.g0) this.d).getClass();
            this.f12586b = SystemClock.elapsedRealtime();
            this.f12587c = true;
        }
    }

    @Override
    public void f(b2.z0 z0Var) {
        if (this.f12587c) {
            c(a());
        }
        this.e = z0Var;
    }

    @Override
    public b2.z0 h() {
        return (b2.z0) this.e;
    }

    public s1(e2.g0 g0Var) {
        this.d = g0Var;
        this.e = b2.z0.d;
    }
}
