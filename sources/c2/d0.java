package c2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import h3.x1;
public final class d0 implements d5.o {
    public boolean f2130a;
    public long f2131b;
    public long f2132c;
    public final Object d;
    public Object f2133e;

    public d0(af.e eVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.f2133e = eVar;
    }

    public void a(long j10) {
        this.f2131b = j10;
        if (this.f2130a) {
            ((d5.a0) this.d).getClass();
            this.f2132c = SystemClock.elapsedRealtime();
        }
    }

    public void b() {
        if (!this.f2130a) {
            ((d5.a0) this.d).getClass();
            this.f2132c = SystemClock.elapsedRealtime();
            this.f2130a = true;
        }
    }

    @Override
    public x1 getPlaybackParameters() {
        return (x1) this.f2133e;
    }

    @Override
    public long getPositionUs() {
        long j10;
        long j11 = this.f2131b;
        if (this.f2130a) {
            ((d5.a0) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f2132c;
            x1 x1Var = (x1) this.f2133e;
            if (x1Var.f9811a == 1.0f) {
                j10 = d5.f0.H(elapsedRealtime);
            } else {
                j10 = elapsedRealtime * x1Var.f9813c;
            }
            return j10 + j11;
        }
        return j11;
    }

    @Override
    public void setPlaybackParameters(x1 x1Var) {
        if (this.f2130a) {
            a(getPositionUs());
        }
        this.f2133e = x1Var;
    }

    public d0(d5.a0 a0Var) {
        this.d = a0Var;
        this.f2133e = x1.d;
    }
}
