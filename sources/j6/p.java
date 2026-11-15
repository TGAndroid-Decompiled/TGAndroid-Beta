package j6;

import android.os.Looper;
import java.util.Locale;
public final class p {
    public static final Object f16887i = new Object();
    public final b f16888a;
    public final long f16889b;
    public final String f16890c;
    public n f16893g;
    public o h;
    public long f16891e = -1;
    public long f16892f = 0;
    public final com.google.android.gms.internal.cast.y d = new com.google.android.gms.internal.cast.y(Looper.getMainLooper(), 0);

    public p(long j3, String str) {
        this.f16889b = j3;
        this.f16890c = str;
        this.f16888a = new b("RequestTracker", str);
    }

    public final void a(long j3, n nVar) {
        n nVar2;
        long j10;
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f16887i;
        synchronized (obj) {
            nVar2 = this.f16893g;
            j10 = this.f16891e;
            j11 = this.f16892f;
            this.f16891e = j3;
            this.f16893g = nVar;
            this.f16892f = currentTimeMillis;
        }
        if (nVar2 != null) {
            nVar2.h(this.f16890c, j10, j11, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                o oVar = this.h;
                if (oVar != null) {
                    this.d.removeCallbacks(oVar);
                }
                o oVar2 = new o(this, 0);
                this.h = oVar2;
                this.d.postDelayed(oVar2, this.f16889b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j3, int i7, l lVar) {
        synchronized (f16887i) {
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
        synchronized (f16887i) {
            long j10 = this.f16891e;
            z10 = false;
            if (j10 != -1 && j10 == j3) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean d() {
        boolean z10;
        synchronized (f16887i) {
            if (this.f16891e != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void e(String str, int i7, Object obj) {
        this.f16888a.b(str, new Object[0]);
        Object obj2 = f16887i;
        synchronized (obj2) {
            try {
                if (this.f16893g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n nVar = this.f16893g;
                    q6.m.g(nVar);
                    nVar.k(this.f16890c, this.f16891e, i7, obj, this.f16892f, currentTimeMillis);
                }
                this.f16891e = -1L;
                this.f16893g = null;
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
        synchronized (f16887i) {
            try {
                if (d()) {
                    Locale locale = Locale.ROOT;
                    long j3 = this.f16891e;
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
