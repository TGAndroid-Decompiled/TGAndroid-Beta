package j6;

import android.os.Looper;
import java.util.Locale;
public final class p {
    public static final Object f17272i = new Object();
    public final b f17273a;
    public final long f17274b;
    public final String f17275c;
    public n f17278g;
    public o h;
    public long f17276e = -1;
    public long f17277f = 0;
    public final com.google.android.gms.internal.cast.y d = new com.google.android.gms.internal.cast.y(Looper.getMainLooper(), 0);

    public p(long j3, String str) {
        this.f17274b = j3;
        this.f17275c = str;
        this.f17273a = new b("RequestTracker", str);
    }

    public final void a(long j3, n nVar) {
        n nVar2;
        long j10;
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f17272i;
        synchronized (obj) {
            nVar2 = this.f17278g;
            j10 = this.f17276e;
            j11 = this.f17277f;
            this.f17276e = j3;
            this.f17278g = nVar;
            this.f17277f = currentTimeMillis;
        }
        if (nVar2 != null) {
            nVar2.g(this.f17275c, j10, j11, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                o oVar = this.h;
                if (oVar != null) {
                    this.d.removeCallbacks(oVar);
                }
                o oVar2 = new o(this, 0);
                this.h = oVar2;
                this.d.postDelayed(oVar2, this.f17274b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j3, int i7, l lVar) {
        synchronized (f17272i) {
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
        synchronized (f17272i) {
            long j10 = this.f17276e;
            z10 = false;
            if (j10 != -1 && j10 == j3) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean d() {
        boolean z10;
        synchronized (f17272i) {
            if (this.f17276e != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void e(String str, int i7, Object obj) {
        this.f17273a.b(str, new Object[0]);
        Object obj2 = f17272i;
        synchronized (obj2) {
            try {
                if (this.f17278g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n nVar = this.f17278g;
                    q6.m.h(nVar);
                    nVar.j(this.f17275c, this.f17276e, i7, obj, this.f17277f, currentTimeMillis);
                }
                this.f17276e = -1L;
                this.f17278g = null;
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
        synchronized (f17272i) {
            try {
                if (d()) {
                    Locale locale = Locale.ROOT;
                    long j3 = this.f17276e;
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
