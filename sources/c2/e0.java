package c2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import j3.x1;
public final class e0 implements f5.n {
    public boolean f2827a;
    public long f2828b;
    public long f2829c;
    public final Object d;
    public Object f2830e;

    public e0(a4.g gVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.f2830e = gVar;
    }

    public void a(long j10) {
        this.f2828b = j10;
        if (this.f2827a) {
            ((f5.y) this.d).getClass();
            this.f2829c = SystemClock.elapsedRealtime();
        }
    }

    public void b() {
        if (!this.f2827a) {
            ((f5.y) this.d).getClass();
            this.f2829c = SystemClock.elapsedRealtime();
            this.f2827a = true;
        }
    }

    @Override
    public x1 getPlaybackParameters() {
        return (x1) this.f2830e;
    }

    @Override
    public long getPositionUs() {
        long j10;
        long j11 = this.f2828b;
        if (this.f2827a) {
            ((f5.y) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f2829c;
            x1 x1Var = (x1) this.f2830e;
            if (x1Var.f10848a == 1.0f) {
                j10 = f5.d0.H(elapsedRealtime);
            } else {
                j10 = elapsedRealtime * x1Var.f10850c;
            }
            return j10 + j11;
        }
        return j11;
    }

    @Override
    public void setPlaybackParameters(x1 x1Var) {
        if (this.f2827a) {
            a(getPositionUs());
        }
        this.f2830e = x1Var;
    }

    public e0(f5.y yVar) {
        this.d = yVar;
        this.f2830e = x1.d;
    }
}
