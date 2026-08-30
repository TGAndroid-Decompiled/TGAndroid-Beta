package c2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import j3.v1;
public final class d0 implements h5.n {
    public boolean f1908a;
    public long f1909b;
    public long f1910c;
    public final Object d;
    public Object e;

    public d0(ag.d dVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = dVar;
    }

    public void a(long j10) {
        this.f1909b = j10;
        if (this.f1908a) {
            ((h5.y) this.d).getClass();
            this.f1910c = SystemClock.elapsedRealtime();
        }
    }

    public void b() {
        if (!this.f1908a) {
            ((h5.y) this.d).getClass();
            this.f1910c = SystemClock.elapsedRealtime();
            this.f1908a = true;
        }
    }

    @Override
    public void c(v1 v1Var) {
        if (this.f1908a) {
            a(e());
        }
        this.e = v1Var;
    }

    @Override
    public v1 d() {
        return (v1) this.e;
    }

    @Override
    public long e() {
        long j10;
        long j11 = this.f1909b;
        if (this.f1908a) {
            ((h5.y) this.d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f1910c;
            v1 v1Var = (v1) this.e;
            if (v1Var.f8856a == 1.0f) {
                j10 = h5.d0.G(elapsedRealtime);
            } else {
                j10 = elapsedRealtime * v1Var.f8858c;
            }
            return j10 + j11;
        }
        return j11;
    }

    public d0(h5.y yVar) {
        this.d = yVar;
        this.e = v1.d;
    }
}
