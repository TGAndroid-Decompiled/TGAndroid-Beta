package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import org.telegram.ui.web.a2;
public final class t1 implements v0 {
    public long f12620a;
    public long f12621b;
    public boolean f12622c;
    public final Object d;
    public Object e;

    public t1(a2 a2Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = a2Var;
    }

    @Override
    public long a() {
        long j10;
        long j11 = this.f12620a;
        if (this.f12622c) {
            ((e2.g0) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f12621b;
            b2.z0 z0Var = (b2.z0) this.e;
            if (z0Var.f4159a == 1.0f) {
                j10 = e2.m0.S(elapsedRealtime);
            } else {
                j10 = elapsedRealtime * z0Var.f4161c;
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
        this.f12620a = j10;
        if (this.f12622c) {
            ((e2.g0) this.d).getClass();
            this.f12621b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f12622c) {
            ((e2.g0) this.d).getClass();
            this.f12621b = SystemClock.elapsedRealtime();
            this.f12622c = true;
        }
    }

    @Override
    public void f(b2.z0 z0Var) {
        if (this.f12622c) {
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
