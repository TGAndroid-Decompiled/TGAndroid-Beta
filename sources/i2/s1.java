package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import org.telegram.ui.web.a2;
public final class s1 implements v0 {
    public long f12583a;
    public long f12584b;
    public boolean f12585c;
    public final Object d;
    public Object e;

    public s1(a2 a2Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = a2Var;
    }

    @Override
    public long a() {
        long j10;
        long j11 = this.f12583a;
        if (this.f12585c) {
            ((e2.g0) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f12584b;
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
        this.f12583a = j10;
        if (this.f12585c) {
            ((e2.g0) this.d).getClass();
            this.f12584b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f12585c) {
            ((e2.g0) this.d).getClass();
            this.f12584b = SystemClock.elapsedRealtime();
            this.f12585c = true;
        }
    }

    @Override
    public void f(b2.z0 z0Var) {
        if (this.f12585c) {
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
