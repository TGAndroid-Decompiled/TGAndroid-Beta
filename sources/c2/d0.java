package c2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import j3.v1;
public final class d0 implements h5.n {
    public boolean f2072a;
    public long f2073b;
    public long f2074c;
    public final Object d;
    public Object f2075e;

    public d0(ag.e eVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.f2075e = eVar;
    }

    public void a(long j10) {
        this.f2073b = j10;
        if (this.f2072a) {
            ((h5.y) this.d).getClass();
            this.f2074c = SystemClock.elapsedRealtime();
        }
    }

    public void b() {
        if (!this.f2072a) {
            ((h5.y) this.d).getClass();
            this.f2074c = SystemClock.elapsedRealtime();
            this.f2072a = true;
        }
    }

    @Override
    public void c(v1 v1Var) {
        if (this.f2072a) {
            a(e());
        }
        this.f2075e = v1Var;
    }

    @Override
    public v1 d() {
        return (v1) this.f2075e;
    }

    @Override
    public long e() {
        long j10;
        long j11 = this.f2073b;
        if (this.f2072a) {
            ((h5.y) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f2074c;
            v1 v1Var = (v1) this.f2075e;
            if (v1Var.f9452a == 1.0f) {
                j10 = h5.d0.G(elapsedRealtime);
            } else {
                j10 = elapsedRealtime * v1Var.f9454c;
            }
            return j10 + j11;
        }
        return j11;
    }

    public d0(h5.y yVar) {
        this.d = yVar;
        this.f2075e = v1.d;
    }
}
