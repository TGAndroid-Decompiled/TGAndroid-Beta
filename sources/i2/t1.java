package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import org.telegram.ui.web.z1;
public final class t1 implements w0 {
    public long f12586a;
    public long f12587b;
    public boolean f12588c;
    public final Object d;
    public Object e;

    public t1(z1 z1Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = z1Var;
    }

    @Override
    public long a() {
        long j10;
        long j11 = this.f12586a;
        if (this.f12588c) {
            ((e2.g0) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f12587b;
            b2.z0 z0Var = (b2.z0) this.e;
            if (z0Var.f4152a == 1.0f) {
                j10 = e2.m0.S(elapsedRealtime);
            } else {
                j10 = elapsedRealtime * z0Var.f4154c;
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
        this.f12586a = j10;
        if (this.f12588c) {
            ((e2.g0) this.d).getClass();
            this.f12587b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f12588c) {
            ((e2.g0) this.d).getClass();
            this.f12587b = SystemClock.elapsedRealtime();
            this.f12588c = true;
        }
    }

    @Override
    public void f(b2.z0 z0Var) {
        if (this.f12588c) {
            c(a());
        }
        this.e = z0Var;
    }

    @Override
    public b2.z0 h() {
        return (b2.z0) this.e;
    }

    public t1(e2.g0 g0Var) {
        this.d = g0Var;
        this.e = b2.z0.d;
    }
}
