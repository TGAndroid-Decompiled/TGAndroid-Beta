package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import org.telegram.ui.Components.voip.r2;
public final class u1 implements w0 {
    public long f11205a;
    public long f11206b;
    public boolean f11207c;
    public final Object d;
    public Object e;

    public u1(r2 r2Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = r2Var;
    }

    @Override
    public long a() {
        long j10;
        long j11 = this.f11205a;
        if (this.f11207c) {
            ((e2.g0) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f11206b;
            b2.a1 a1Var = (b2.a1) this.e;
            if (a1Var.f2077a == 1.0f) {
                j10 = e2.m0.S(elapsedRealtime);
            } else {
                j10 = elapsedRealtime * a1Var.f2079c;
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
        this.f11205a = j10;
        if (this.f11207c) {
            ((e2.g0) this.d).getClass();
            this.f11206b = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (!this.f11207c) {
            ((e2.g0) this.d).getClass();
            this.f11206b = SystemClock.elapsedRealtime();
            this.f11207c = true;
        }
    }

    @Override
    public void f(b2.a1 a1Var) {
        if (this.f11207c) {
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
