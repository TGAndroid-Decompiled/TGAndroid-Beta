package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import org.telegram.ui.web.z1;
public final class s1 implements u0 {
    public long f12589a;
    public long f12590b;
    public boolean f12591c;
    public final Object d;
    public Object e;

    public s1(z1 z1Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = z1Var;
    }

    @Override
    public long a() {
        long j10;
        long j11 = this.f12589a;
        if (this.f12591c) {
            ((e2.g0) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f12590b;
            b2.z0 z0Var = (b2.z0) this.e;
            if (z0Var.f4155a == 1.0f) {
                j10 = e2.m0.S(elapsedRealtime);
            } else {
                j10 = elapsedRealtime * z0Var.f4157c;
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
        this.f12589a = j10;
        if (this.f12591c) {
            ((e2.g0) this.d).getClass();
            this.f12590b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f12591c) {
            ((e2.g0) this.d).getClass();
            this.f12590b = SystemClock.elapsedRealtime();
            this.f12591c = true;
        }
    }

    @Override
    public void f(b2.z0 z0Var) {
        if (this.f12591c) {
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
