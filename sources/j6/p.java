package j6;

import android.os.Looper;
import java.util.Locale;
public final class p {
    public static final Object f17297i = new Object();
    public final b f17298a;
    public final long f17299b;
    public final String f17300c;
    public n f17303g;
    public o h;
    public long f17301e = -1;
    public long f17302f = 0;
    public final com.google.android.gms.internal.cast.y d = new com.google.android.gms.internal.cast.y(Looper.getMainLooper(), 0);

    public p(long j3, String str) {
        this.f17299b = j3;
        this.f17300c = str;
        this.f17298a = new b("RequestTracker", str);
    }

    public final void a(long j3, n nVar) {
        n nVar2;
        long j10;
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f17297i;
        synchronized (obj) {
            nVar2 = this.f17303g;
            j10 = this.f17301e;
            j11 = this.f17302f;
            this.f17301e = j3;
            this.f17303g = nVar;
            this.f17302f = currentTimeMillis;
        }
        if (nVar2 != null) {
            nVar2.g(this.f17300c, j10, j11, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                o oVar = this.h;
                if (oVar != null) {
                    this.d.removeCallbacks(oVar);
                }
                o oVar2 = new o(this, 0);
                this.h = oVar2;
                this.d.postDelayed(oVar2, this.f17299b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j3, int i7, l lVar) {
        synchronized (f17297i) {
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
        synchronized (f17297i) {
            long j10 = this.f17301e;
            z10 = false;
            if (j10 != -1 && j10 == j3) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean d() {
        boolean z10;
        synchronized (f17297i) {
            if (this.f17301e != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void e(String str, int i7, Object obj) {
        this.f17298a.b(str, new Object[0]);
        Object obj2 = f17297i;
        synchronized (obj2) {
            try {
                if (this.f17303g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n nVar = this.f17303g;
                    q6.m.h(nVar);
                    nVar.j(this.f17300c, this.f17301e, i7, obj, this.f17302f, currentTimeMillis);
                }
                this.f17301e = -1L;
                this.f17303g = null;
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
        synchronized (f17297i) {
            try {
                if (d()) {
                    Locale locale = Locale.ROOT;
                    long j3 = this.f17301e;
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
