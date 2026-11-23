package j6;

import android.os.Looper;
import java.util.Locale;
public final class p {
    public static final Object f17263i = new Object();
    public final b f17264a;
    public final long f17265b;
    public final String f17266c;
    public n f17269g;
    public o h;
    public long f17267e = -1;
    public long f17268f = 0;
    public final com.google.android.gms.internal.cast.y d = new com.google.android.gms.internal.cast.y(Looper.getMainLooper(), 0);

    public p(long j3, String str) {
        this.f17265b = j3;
        this.f17266c = str;
        this.f17264a = new b("RequestTracker", str);
    }

    public final void a(long j3, n nVar) {
        n nVar2;
        long j10;
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f17263i;
        synchronized (obj) {
            nVar2 = this.f17269g;
            j10 = this.f17267e;
            j11 = this.f17268f;
            this.f17267e = j3;
            this.f17269g = nVar;
            this.f17268f = currentTimeMillis;
        }
        if (nVar2 != null) {
            nVar2.g(this.f17266c, j10, j11, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                o oVar = this.h;
                if (oVar != null) {
                    this.d.removeCallbacks(oVar);
                }
                o oVar2 = new o(this, 0);
                this.h = oVar2;
                this.d.postDelayed(oVar2, this.f17265b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j3, int i7, l lVar) {
        synchronized (f17263i) {
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
        synchronized (f17263i) {
            long j10 = this.f17267e;
            z10 = false;
            if (j10 != -1 && j10 == j3) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean d() {
        boolean z10;
        synchronized (f17263i) {
            if (this.f17267e != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void e(String str, int i7, Object obj) {
        this.f17264a.b(str, new Object[0]);
        Object obj2 = f17263i;
        synchronized (obj2) {
            try {
                if (this.f17269g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n nVar = this.f17269g;
                    q6.m.h(nVar);
                    nVar.j(this.f17266c, this.f17267e, i7, obj, this.f17268f, currentTimeMillis);
                }
                this.f17267e = -1L;
                this.f17269g = null;
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
        synchronized (f17263i) {
            try {
                if (d()) {
                    Locale locale = Locale.ROOT;
                    long j3 = this.f17267e;
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
