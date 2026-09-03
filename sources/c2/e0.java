package c2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import j3.v1;
public final class e0 implements h5.n {
    public boolean f1960a;
    public long f1961b;
    public long f1962c;
    public final Object d;
    public Object e;

    public e0(ag.d dVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = dVar;
    }

    @Override
    public void a(v1 v1Var) {
        if (this.f1960a) {
            b(e());
        }
        this.e = v1Var;
    }

    public void b(long j10) {
        this.f1961b = j10;
        if (this.f1960a) {
            ((h5.y) this.d).getClass();
            this.f1962c = SystemClock.elapsedRealtime();
        }
    }

    public void c() {
        if (!this.f1960a) {
            ((h5.y) this.d).getClass();
            this.f1962c = SystemClock.elapsedRealtime();
            this.f1960a = true;
        }
    }

    @Override
    public v1 d() {
        return (v1) this.e;
    }

    @Override
    public long e() {
        long j10;
        long j11 = this.f1961b;
        if (this.f1960a) {
            ((h5.y) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f1962c;
            v1 v1Var = (v1) this.e;
            if (v1Var.f8838a == 1.0f) {
                j10 = h5.d0.G(elapsedRealtime);
            } else {
                j10 = elapsedRealtime * v1Var.f8840c;
            }
            return j10 + j11;
        }
        return j11;
    }

    public e0(h5.y yVar) {
        this.d = yVar;
        this.e = v1.d;
    }
}
