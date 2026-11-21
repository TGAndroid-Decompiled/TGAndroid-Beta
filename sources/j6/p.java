package j6;

import android.os.Looper;
import java.util.Locale;
public final class p {
    public static final Object f17294i = new Object();
    public final b f17295a;
    public final long f17296b;
    public final String f17297c;
    public n f17300g;
    public o h;
    public long f17298e = -1;
    public long f17299f = 0;
    public final com.google.android.gms.internal.cast.y d = new com.google.android.gms.internal.cast.y(Looper.getMainLooper(), 0);

    public p(long j3, String str) {
        this.f17296b = j3;
        this.f17297c = str;
        this.f17295a = new b("RequestTracker", str);
    }

    public final void a(long j3, n nVar) {
        n nVar2;
        long j10;
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f17294i;
        synchronized (obj) {
            nVar2 = this.f17300g;
            j10 = this.f17298e;
            j11 = this.f17299f;
            this.f17298e = j3;
            this.f17300g = nVar;
            this.f17299f = currentTimeMillis;
        }
        if (nVar2 != null) {
            nVar2.g(this.f17297c, j10, j11, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                o oVar = this.h;
                if (oVar != null) {
                    this.d.removeCallbacks(oVar);
                }
                o oVar2 = new o(this, 0);
                this.h = oVar2;
                this.d.postDelayed(oVar2, this.f17296b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j3, int i7, l lVar) {
        synchronized (f17294i) {
            try {
                if (c(j3)) {
                    Locale locale = Locale.ROOT;
                    e("request " + j3 + " completed", i7, lVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c(long j3) {
        boolean z10;
        synchronized (f17294i) {
            long j10 = this.f17298e;
            z10 = false;
            if (j10 != -1 && j10 == j3) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean d() {
        boolean z10;
        synchronized (f17294i) {
            if (this.f17298e != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void e(String str, int i7, Object obj) {
        this.f17295a.b(str, new Object[0]);
        Object obj2 = f17294i;
        synchronized (obj2) {
            try {
                if (this.f17300g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n nVar = this.f17300g;
                    q6.m.h(nVar);
                    nVar.j(this.f17297c, this.f17298e, i7, obj, this.f17299f, currentTimeMillis);
                }
                this.f17298e = -1L;
                this.f17300g = null;
                synchronized (obj2) {
                    o oVar = this.h;
                    if (oVar != null) {
                        this.d.removeCallbacks(oVar);
                        this.h = null;
                    }
                }
            } finally {
            }
        }
    }

    public final boolean f(int i7) {
        synchronized (f17294i) {
            try {
                if (d()) {
                    Locale locale = Locale.ROOT;
                    long j3 = this.f17298e;
                    e("clearing request " + j3, i7, null);
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
