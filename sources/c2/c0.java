package c2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import h3.x1;

public final class c0 implements d5.o {

    public boolean f2243a;

    public long f2244b;

    public long f2245c;
    public final Object d;

    public Object f2246e;

    public c0(af.e eVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.f2246e = eVar;
    }

    public void a(long j10) {
        this.f2244b = j10;
        if (this.f2243a) {
            ((d5.b0) this.d).getClass();
            this.f2245c = SystemClock.elapsedRealtime();
        }
    }

    public void b() {
        if (this.f2243a) {
            return;
        }
        ((d5.b0) this.d).getClass();
        this.f2245c = SystemClock.elapsedRealtime();
        this.f2243a = true;
    }

    @Override
    public x1 getPlaybackParameters() {
        return (x1) this.f2246e;
    }

    @Override
    public long getPositionUs() {
        long j10 = this.f2244b;
        if (!this.f2243a) {
            return j10;
        }
        ((d5.b0) this.d).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f2245c;
        x1 x1Var = (x1) this.f2246e;
        return (x1Var.f8242a == 1.0f ? d5.g0.H(jElapsedRealtime) : jElapsedRealtime * ((long) x1Var.f8244c)) + j10;
    }

    @Override
    public void setPlaybackParameters(x1 x1Var) {
        if (this.f2243a) {
            a(getPositionUs());
        }
        this.f2246e = x1Var;
    }

    public c0(d5.b0 b0Var) {
        this.d = b0Var;
        this.f2246e = x1.d;
    }
}
