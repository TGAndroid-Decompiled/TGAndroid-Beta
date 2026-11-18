package j6;

import android.os.Looper;
import java.util.Locale;
public final class p {
    public static final Object f17269i = new Object();
    public final b f17270a;
    public final long f17271b;
    public final String f17272c;
    public n f17275g;
    public o h;
    public long f17273e = -1;
    public long f17274f = 0;
    public final com.google.android.gms.internal.cast.y d = new com.google.android.gms.internal.cast.y(Looper.getMainLooper(), 0);

    public p(long j3, String str) {
        this.f17271b = j3;
        this.f17272c = str;
        this.f17270a = new b("RequestTracker", str);
    }

    public final void a(long j3, n nVar) {
        n nVar2;
        long j10;
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f17269i;
        synchronized (obj) {
            nVar2 = this.f17275g;
            j10 = this.f17273e;
            j11 = this.f17274f;
            this.f17273e = j3;
            this.f17275g = nVar;
            this.f17274f = currentTimeMillis;
        }
        if (nVar2 != null) {
            nVar2.g(this.f17272c, j10, j11, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                o oVar = this.h;
                if (oVar != null) {
                    this.d.removeCallbacks(oVar);
                }
                o oVar2 = new o(this, 0);
                this.h = oVar2;
                this.d.postDelayed(oVar2, this.f17271b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j3, int i7, l lVar) {
        synchronized (f17269i) {
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
        synchronized (f17269i) {
            long j10 = this.f17273e;
            z10 = false;
            if (j10 != -1 && j10 == j3) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean d() {
        boolean z10;
        synchronized (f17269i) {
            if (this.f17273e != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void e(String str, int i7, Object obj) {
        this.f17270a.b(str, new Object[0]);
        Object obj2 = f17269i;
        synchronized (obj2) {
            try {
                if (this.f17275g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n nVar = this.f17275g;
                    q6.m.h(nVar);
                    nVar.j(this.f17272c, this.f17273e, i7, obj, this.f17274f, currentTimeMillis);
                }
                this.f17273e = -1L;
                this.f17275g = null;
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
        synchronized (f17269i) {
            try {
                if (d()) {
                    Locale locale = Locale.ROOT;
                    long j3 = this.f17273e;
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
