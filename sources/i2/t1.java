package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import org.telegram.ui.web.z1;
public final class t1 implements w0 {
    public long f12588a;
    public long f12589b;
    public boolean f12590c;
    public final Object d;
    public Object e;

    public t1(z1 z1Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = z1Var;
    }

    @Override
    public long a() {
        long j10;
        long j11 = this.f12588a;
        if (this.f12590c) {
            ((e2.g0) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f12589b;
            b2.z0 z0Var = (b2.z0) this.e;
            if (z0Var.f4154a == 1.0f) {
                j10 = e2.m0.S(elapsedRealtime);
            } else {
                j10 = elapsedRealtime * z0Var.f4156c;
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
        this.f12588a = j10;
        if (this.f12590c) {
            ((e2.g0) this.d).getClass();
            this.f12589b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f12590c) {
            ((e2.g0) this.d).getClass();
            this.f12589b = SystemClock.elapsedRealtime();
            this.f12590c = true;
        }
    }

    @Override
    public void f(b2.z0 z0Var) {
        if (this.f12590c) {
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
